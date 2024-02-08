package com.ombremoon.talesofskyrim.datagen.custom;

import com.google.common.base.Preconditions;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

public class WeaponAttributeBuilder extends ModelFile {
    protected ModelFile parent;
    protected final ExistingFileHelper existingFileHelper;

    protected WeaponAttributeBuilder(ResourceLocation resourceLocation, ExistingFileHelper existingFileHelper) {
        super(resourceLocation);
        this.existingFileHelper = existingFileHelper;
    }

    private WeaponAttributeBuilder self() {
        return (WeaponAttributeBuilder) this;
    }

    @Override
    protected boolean exists() {
        return true;
    }

    public WeaponAttributeBuilder parent(ModelFile parent) {
        Preconditions.checkNotNull(parent, "Parent must not be null");
        parent.assertExistence();
        this.parent = parent;
        return self();
    }

    public JsonObject toJson() {
        JsonObject root = new JsonObject();

        if (this.parent != null) {
            root.addProperty("parent", this.parent.getLocation().toString());
        }

        return root;
    }
}
