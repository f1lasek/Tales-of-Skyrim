package com.ombremoon.talesofskyrim.datagen;

import com.ombremoon.talesofskyrim.CommonClass;
import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.common.init.item.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.DAEDRA_HEART);
        simpleItem(ItemInit.DRAGON_BONE);
        simpleItem(ItemInit.DRAGON_SCALES);
        simpleItem(ItemInit.SILVER_INGOT);
        simpleItem(ItemInit.SILVER_NUGGET);
        simpleItem(ItemInit.STEEL_INGOT);
        simpleItem(ItemInit.STEEL_NUGGET);
        simpleItem(ItemInit.MOONSTONE_INGOT);
        simpleItem(ItemInit.MOONSTONE_NUGGET);
        simpleItem(ItemInit.CORUNDUM_INGOT);
        simpleItem(ItemInit.CORUNDUM_NUGGET);
        simpleItem(ItemInit.DWARVEN_INGOT);
        simpleItem(ItemInit.DWARVEN_NUGGET);
        simpleItem(ItemInit.ORICHALCUM_INGOT);
        simpleItem(ItemInit.ORICHALCUM_NUGGET);
        simpleItem(ItemInit.MALACHITE_INGOT);
        simpleItem(ItemInit.MALACHITE_NUGGET);
        simpleItem(ItemInit.EBONY_INGOT);
        simpleItem(ItemInit.EBONY_NUGGET);
        simpleItem(ItemInit.AMETHYST);
        simpleItem(ItemInit.GARNET);
        simpleItem(ItemInit.RUBY);
        simpleItem(ItemInit.SAPPHIRE);
        simpleItem(ItemInit.RAW_SILVER);
        simpleItem(ItemInit.RAW_CORUNDUM);
        simpleItem(ItemInit.RAW_ORICHALCUM);
        simpleItem(ItemInit.RAW_MOONSTONE);
        simpleItem(ItemInit.RAW_MALACHITE);
        simpleItem(ItemInit.RAW_EBONY);


        simpleItem(ItemInit.STEEL_BOOTS);
        simpleItem(ItemInit.STEEL_LEGGINGS);
        simpleItem(ItemInit.STEEL_CHESTPLATE);
        simpleItem(ItemInit.STEEL_HELMET);
        simpleItem(ItemInit.SILVER_BOOTS);
        simpleItem(ItemInit.SILVER_LEGGINGS);
        simpleItem(ItemInit.SILVER_CHESTPLATE);
        simpleItem(ItemInit.SILVER_HELMET);
        simpleItem(ItemInit.MOONSTONE_BOOTS);
        simpleItem(ItemInit.MOONSTONE_LEGGINGS);
        simpleItem(ItemInit.MOONSTONE_CHESTPLATE);
        simpleItem(ItemInit.MOONSTONE_HELMET);
        simpleItem(ItemInit.DWARVEN_BOOTS);
        simpleItem(ItemInit.DWARVEN_LEGGINGS);
        simpleItem(ItemInit.DWARVEN_CHESTPLATE);
        simpleItem(ItemInit.DWARVEN_HELMET);
        simpleItem(ItemInit.ORICHALCUM_BOOTS);
        simpleItem(ItemInit.ORICHALCUM_LEGGINGS);
        simpleItem(ItemInit.ORICHALCUM_CHESTPLATE);
        simpleItem(ItemInit.ORICHALCUM_HELMET);
        simpleItem(ItemInit.MALACHITE_BOOTS);
        simpleItem(ItemInit.MALACHITE_LEGGINGS);
        simpleItem(ItemInit.MALACHITE_CHESTPLATE);
        simpleItem(ItemInit.MALACHITE_HELMET);
        simpleItem(ItemInit.EBONY_BOOTS);
        simpleItem(ItemInit.EBONY_LEGGINGS);
        simpleItem(ItemInit.EBONY_CHESTPLATE);
        simpleItem(ItemInit.EBONY_HELMET);
        simpleItem(ItemInit.DAEDRIC_BOOTS);
        simpleItem(ItemInit.DAEDRIC_LEGGINGS);
        simpleItem(ItemInit.DAEDRIC_CHESTPLATE);
        simpleItem(ItemInit.DAEDRIC_HELMET);
        simpleItem(ItemInit.DRAGON_BOOTS);
        simpleItem(ItemInit.DRAGON_LEGGINGS);
        simpleItem(ItemInit.DRAGON_CHESTPLATE);
        simpleItem(ItemInit.DRAGON_HELMET);
        handheldItem(ItemInit.STEEL_SHOVEL);
        handheldItem(ItemInit.STEEL_PICKAXE);
        handheldItem(ItemInit.STEEL_AXE);
        handheldItem(ItemInit.STEEL_HOE);
        handheldItem(ItemInit.STEEL_SWORD);
        handheldItem(ItemInit.STEEL_DAGGER);
        handheldItem(ItemInit.STEEL_MACE);
        handheldItem(ItemInit.SILVER_SHOVEL);
        handheldItem(ItemInit.SILVER_PICKAXE);
        handheldItem(ItemInit.SILVER_AXE);
        handheldItem(ItemInit.SILVER_HOE);
        handheldItem(ItemInit.SILVER_SWORD);
        handheldItem(ItemInit.SILVER_DAGGER);
        handheldItem(ItemInit.SILVER_MACE);
        handheldItem(ItemInit.MOONSTONE_SHOVEL);
        handheldItem(ItemInit.MOONSTONE_PICKAXE);
        handheldItem(ItemInit.MOONSTONE_AXE);
        handheldItem(ItemInit.MOONSTONE_HOE);
        handheldItem(ItemInit.MOONSTONE_SWORD);
        handheldItem(ItemInit.MOONSTONE_DAGGER);
        handheldItem(ItemInit.MOONSTONE_MACE);
        handheldItem(ItemInit.DWARVEN_SHOVEL);
        handheldItem(ItemInit.DWARVEN_PICKAXE);
        handheldItem(ItemInit.DWARVEN_AXE);
        handheldItem(ItemInit.DWARVEN_HOE);
        handheldItem(ItemInit.DWARVEN_SWORD);
        handheldItem(ItemInit.DWARVEN_DAGGER);
        handheldItem(ItemInit.DWARVEN_MACE);
        handheldItem(ItemInit.ORICHALCUM_SHOVEL);
        handheldItem(ItemInit.ORICHALCUM_PICKAXE);
        handheldItem(ItemInit.ORICHALCUM_AXE);
        handheldItem(ItemInit.ORICHALCUM_HOE);
        handheldItem(ItemInit.ORICHALCUM_SWORD);
        handheldItem(ItemInit.ORICHALCUM_DAGGER);
        handheldItem(ItemInit.ORICHALCUM_MACE);
        handheldItem(ItemInit.MALACHITE_SHOVEL);
        handheldItem(ItemInit.MALACHITE_PICKAXE);
        handheldItem(ItemInit.MALACHITE_AXE);
        handheldItem(ItemInit.MALACHITE_HOE);
        handheldItem(ItemInit.MALACHITE_SWORD);
        handheldItem(ItemInit.MALACHITE_DAGGER);
        handheldItem(ItemInit.MALACHITE_MACE);
        handheldItem(ItemInit.EBONY_SHOVEL);
        handheldItem(ItemInit.EBONY_PICKAXE);
        handheldItem(ItemInit.EBONY_AXE);
        handheldItem(ItemInit.EBONY_HOE);
        handheldItem(ItemInit.EBONY_SWORD);
        handheldItem(ItemInit.EBONY_DAGGER);
        handheldItem(ItemInit.EBONY_MACE);
        handheldItem(ItemInit.DAEDRIC_SHOVEL);
        handheldItem(ItemInit.DAEDRIC_PICKAXE);
        handheldItem(ItemInit.DAEDRIC_AXE);
        handheldItem(ItemInit.DAEDRIC_HOE);
        handheldItem(ItemInit.DAEDRIC_SWORD);
        handheldItem(ItemInit.DAEDRIC_DAGGER);
        handheldItem(ItemInit.DAEDRIC_MACE);
        handheldItem(ItemInit.DRAGON_SHOVEL);
        handheldItem(ItemInit.DRAGON_PICKAXE);
        handheldItem(ItemInit.DRAGON_AXE);
        handheldItem(ItemInit.DRAGON_HOE);
        handheldItem(ItemInit.DRAGON_SWORD);
        handheldItem(ItemInit.DRAGON_DAGGER);
        handheldItem(ItemInit.DRAGON_MACE);
    }

    protected ItemModelBuilder simpleBlockItemModel(Block block) {
        String name = getName(block);
        return withExistingParent(name, modLoc("block/" + name));
    }

    protected ItemModelBuilder simpleGeneratedModel(Item item) {
        return simpleModel(item, mcLoc("item/generated"));
    }

    protected ItemModelBuilder simpleHandHeldModel(Item item) {
        return simpleModel(item, mcLoc("item/handheld"));
    }

    protected ItemModelBuilder simpleModel(Item item, ResourceLocation parent) {
        String name = getName(item);
        return singleTexture(name, parent, "layer0", modLoc("item/" + name));
    }

    protected ItemModelBuilder tempItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                CommonClass.customLocation("item/" + "temp_texture"));
    }

    protected String getName(Item item) {
        return ForgeRegistries.ITEMS.getKey(item).getPath();
    }

    protected String getName(Block item) {
        return ForgeRegistries.BLOCKS.getKey(item).getPath();
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                CommonClass.customLocation("item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                CommonClass.customLocation("item/" + item.getId().getPath()));
    }
}
