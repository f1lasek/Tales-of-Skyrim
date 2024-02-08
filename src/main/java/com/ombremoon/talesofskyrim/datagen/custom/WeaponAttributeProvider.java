package com.ombremoon.talesofskyrim.datagen.custom;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.ombremoon.talesofskyrim.common.init.item.ItemInit;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.tags.TagBuilder;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import javax.json.JsonObject;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class WeaponAttributeProvider<T extends WeaponAttributeBuilder> implements DataProvider {
    public final Map<ResourceLocation, T> generatedAttributes = new HashMap<>();
    protected final PackOutput packOutput;
    protected final String modId;
    protected final String folder;
    protected final Function<ResourceLocation, T> factory;
    protected final ExistingFileHelper existingFileHelper;
    public static final String ATTRIBUTE_FOLDER = "weapon_attributes";
    protected static final ExistingFileHelper.ResourceType ATTRIBUTE = new ExistingFileHelper.ResourceType(PackType.SERVER_DATA, ".json", "weapon_attributes");

    protected abstract void addWeaponAttributes();

    public WeaponAttributeProvider(PackOutput packOutput, String modId, String folder, Function<ResourceLocation, T> factory, ExistingFileHelper existingFileHelper) {
        Preconditions.checkNotNull(packOutput);
        this.packOutput = packOutput;
        Preconditions.checkNotNull(modId);
        this.modId = modId;
        Preconditions.checkNotNull(folder);
        this.folder = folder;
        Preconditions.checkNotNull(factory);
        this.factory = factory;
        Preconditions.checkNotNull(existingFileHelper);
        this.existingFileHelper = existingFileHelper;
    }

    public WeaponAttributeProvider(PackOutput packOutput, String modId, String folder, BiFunction<ResourceLocation, ExistingFileHelper, T> builderFromModId, ExistingFileHelper existingFileHelper) {
        this(packOutput, modId, folder, loc->builderFromModId.apply(loc, existingFileHelper), existingFileHelper);
    }

    public T getBuilder(String path) {
        Preconditions.checkNotNull(path, "Path must not be null");
        var outputLocation = extendWithFolder(path.contains(":") ? new ResourceLocation(path) : new ResourceLocation(modId, path));
        this.existingFileHelper.trackGenerated(outputLocation, ATTRIBUTE);
        return generatedAttributes.computeIfAbsent(outputLocation, factory);
    }

    private ResourceLocation extendWithFolder(ResourceLocation resourceLocation) {
        if (resourceLocation.getPath().contains("/")) {
            return resourceLocation;
        }
        return new ResourceLocation(resourceLocation.getNamespace(), folder + "/" + resourceLocation.getPath());
    }

    protected void clear() {
        generatedAttributes.clear();
    }

    @Override
    public CompletableFuture<?> run(CachedOutput pOutput) {
        clear();
        addWeaponAttributes();
        return generateAll(pOutput);
    }

    protected CompletableFuture<?> generateAll(CachedOutput cache) {
        CompletableFuture<?>[] futures = new CompletableFuture<?>[this.generatedAttributes.size()];
        int i = 0;

        for (T attribute : this.generatedAttributes.values()) {
            Path target = getPath(attribute);
            futures[i++] = DataProvider.saveStable(cache, attribute.toJson(), target);
        }

        return CompletableFuture.allOf(futures);
    }

    protected Path getPath(T attribute) {
        var loc = attribute.getLocation();
        return this.packOutput.getOutputFolder(PackOutput.Target.DATA_PACK).resolve(loc.getNamespace()).resolve("weapon_attributes").resolve(loc.getPath() + ".json");
    }
}
