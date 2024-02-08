package com.ombremoon.talesofskyrim.datagen;

import com.google.common.collect.ImmutableMap;
import com.ombremoon.talesofskyrim.common.init.SpellInit;
import com.ombremoon.talesofskyrim.common.init.block.BlockInit;
import com.ombremoon.talesofskyrim.common.init.item.ItemInit;
import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.common.object.custom.spell.SpellType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ModLangProvider extends LanguageProvider {
    protected static final Map<String, String> REPLACE_LIST = ImmutableMap.of(
            "tnt", "TNT",
            "sus", ""
    );

    public ModLangProvider(PackOutput gen) {
        super(gen, Constants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        ItemInit.ITEMS.getEntries().forEach(this::itemLang);
        BlockInit.BLOCKS.getEntries().forEach(this::blockLang);
        SpellInit.SPELL_TYPE.getEntries().forEach(this::spellLang);
        tabLang();
    }

    protected void itemLang(RegistryObject<Item> entry) {
        if (!(entry.get() instanceof BlockItem) || entry.get() instanceof ItemNameBlockItem) {
            addItem(entry, checkReplace(entry));
        }
    }

    protected void blockLang(RegistryObject<Block> entry) {
        addBlock(entry, checkReplace(entry));
    }

    protected void entityLang(RegistryObject<EntityType<?>> entry) {
        addEntityType(entry, checkReplace(entry));
    }

    protected void spellLang(RegistryObject<SpellType<?>> entry) {
        add(entry.get().getSupplier().getDescriptionId(), checkReplace(entry));
    }

    protected void tabLang() {
        add("itemGroup." + Constants.MOD_ID + ".tab", Constants.MOD_NAME);
        add("itemGroup.blocks.tab" , Constants.MOD_NAME + " Blocks");
        add("itemGroup.smithing.tab" , Constants.MOD_NAME + " Smithing");
        add("itemGroup.potions_and_ingredients.tab" , Constants.ABBR_NAME + " Potions & Ingredients");
        add("itemGroup.food.tab" , Constants.MOD_NAME + " Food");
        add("itemGroup.magic.tab" , Constants.MOD_NAME + " Magic");
    }

    protected String checkReplace(RegistryObject<?> registryObject) {
        return Arrays.stream(registryObject.getId().getPath().split("_"))
                .map(this::checkReplace)
                .filter(s -> !s.isBlank())
                .collect(Collectors.joining(" "))
                .trim();
    }

    protected String checkReplace(String string) {
        return REPLACE_LIST.containsKey(string) ? REPLACE_LIST.get(string) : StringUtils.capitalize(string);
    }
}
