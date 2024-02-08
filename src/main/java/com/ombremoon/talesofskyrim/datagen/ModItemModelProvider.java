package com.ombremoon.talesofskyrim.datagen;

import com.ombremoon.talesofskyrim.CommonClass;
import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.common.init.item.ItemInit;
import com.ombremoon.talesofskyrim.common.init.item.EquipmentInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ItemInit.SIMPLE_ITEM_LIST.stream().map(Supplier::get).forEach(this::simpleGeneratedModel);
        /*simpleItem(ItemInit.SPIDER_EGG);
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
        simpleItem(ItemInit.RAW_EBONY);*/

        /*simpleItem(ModEquipment.STEEL_BOOTS);
        simpleItem(ModEquipment.STEEL_LEGGINGS);
        simpleItem(ModEquipment.STEEL_CHESTPLATE);
        simpleItem(ModEquipment.STEEL_HELMET);
        simpleItem(ModEquipment.SILVER_BOOTS);
        simpleItem(ModEquipment.SILVER_LEGGINGS);
        simpleItem(ModEquipment.SILVER_CHESTPLATE);
        simpleItem(ModEquipment.SILVER_HELMET);
        simpleItem(ModEquipment.MOONSTONE_BOOTS);
        simpleItem(ModEquipment.MOONSTONE_LEGGINGS);
        simpleItem(ModEquipment.MOONSTONE_CHESTPLATE);
        simpleItem(ModEquipment.MOONSTONE_HELMET);
        simpleItem(ModEquipment.DWARVEN_BOOTS);
        simpleItem(ModEquipment.DWARVEN_LEGGINGS);
        simpleItem(ModEquipment.DWARVEN_CHESTPLATE);
        simpleItem(ModEquipment.DWARVEN_HELMET);
        simpleItem(ModEquipment.ORICHALCUM_BOOTS);
        simpleItem(ModEquipment.ORICHALCUM_LEGGINGS);
        simpleItem(ModEquipment.ORICHALCUM_CHESTPLATE);
        simpleItem(ModEquipment.ORICHALCUM_HELMET);
        simpleItem(ModEquipment.MALACHITE_BOOTS);
        simpleItem(ModEquipment.MALACHITE_LEGGINGS);
        simpleItem(ModEquipment.MALACHITE_CHESTPLATE);
        simpleItem(ModEquipment.MALACHITE_HELMET);
        simpleItem(ModEquipment.EBONY_BOOTS);
        simpleItem(ModEquipment.EBONY_LEGGINGS);
        simpleItem(ModEquipment.EBONY_CHESTPLATE);
        simpleItem(ModEquipment.EBONY_HELMET);
        simpleItem(ModEquipment.DAEDRIC_BOOTS);
        simpleItem(ModEquipment.DAEDRIC_LEGGINGS);
        simpleItem(ModEquipment.DAEDRIC_CHESTPLATE);
        simpleItem(ModEquipment.DAEDRIC_HELMET);
        simpleItem(ModEquipment.DRAGON_BOOTS);
        simpleItem(ModEquipment.DRAGON_LEGGINGS);
        simpleItem(ModEquipment.DRAGON_CHESTPLATE);
        simpleItem(ModEquipment.DRAGON_HELMET);*/

        ItemInit.HANDHELD_LIST.stream().map(Supplier::get).forEach(this::simpleGeneratedModel);
        /*handheldItem(ModEquipment.STEEL_SWORD);
        handheldItem(ModEquipment.STEEL_DAGGER);
        handheldItem(ModEquipment.STEEL_MACE);
        handheldItem(ModEquipment.SILVER_SWORD);
        handheldItem(ModEquipment.SILVER_DAGGER);
        handheldItem(ModEquipment.SILVER_MACE);
        handheldItem(ModEquipment.MOONSTONE_SWORD);
        handheldItem(ModEquipment.MOONSTONE_DAGGER);
        handheldItem(ModEquipment.MOONSTONE_MACE);
        handheldItem(ModEquipment.DWARVEN_SWORD);
        handheldItem(ModEquipment.DWARVEN_DAGGER);
        handheldItem(ModEquipment.DWARVEN_MACE);
        handheldItem(ModEquipment.ORICHALCUM_SWORD);
        handheldItem(ModEquipment.ORICHALCUM_DAGGER);
        handheldItem(ModEquipment.ORICHALCUM_MACE);
        handheldItem(ModEquipment.MALACHITE_SWORD);
        handheldItem(ModEquipment.MALACHITE_DAGGER);
        handheldItem(ModEquipment.MALACHITE_MACE);
        handheldItem(ModEquipment.EBONY_SWORD);
        handheldItem(ModEquipment.EBONY_DAGGER);
        handheldItem(ModEquipment.EBONY_MACE);
        handheldItem(ModEquipment.DAEDRIC_SWORD);
        handheldItem(ModEquipment.DAEDRIC_DAGGER);
        handheldItem(ModEquipment.DAEDRIC_MACE);
        handheldItem(ModEquipment.DRAGON_SWORD);
        handheldItem(ModEquipment.DRAGON_DAGGER);
        handheldItem(ModEquipment.DRAGON_MACE);*/

        handheldItem(EquipmentInit.STEEL_SHOVEL);
        handheldItem(EquipmentInit.STEEL_PICKAXE);
        handheldItem(EquipmentInit.STEEL_AXE);
        handheldItem(EquipmentInit.STEEL_HOE);
        handheldItem(EquipmentInit.SILVER_SHOVEL);
        handheldItem(EquipmentInit.SILVER_PICKAXE);
        handheldItem(EquipmentInit.SILVER_AXE);
        handheldItem(EquipmentInit.SILVER_HOE);
        handheldItem(EquipmentInit.MOONSTONE_SHOVEL);
        handheldItem(EquipmentInit.MOONSTONE_PICKAXE);
        handheldItem(EquipmentInit.MOONSTONE_AXE);
        handheldItem(EquipmentInit.MOONSTONE_HOE);
        handheldItem(EquipmentInit.DWARVEN_SHOVEL);
        handheldItem(EquipmentInit.DWARVEN_PICKAXE);
        handheldItem(EquipmentInit.DWARVEN_AXE);
        handheldItem(EquipmentInit.DWARVEN_HOE);
        handheldItem(EquipmentInit.ORICHALCUM_SHOVEL);
        handheldItem(EquipmentInit.ORICHALCUM_PICKAXE);
        handheldItem(EquipmentInit.ORICHALCUM_AXE);
        handheldItem(EquipmentInit.ORICHALCUM_HOE);
        handheldItem(EquipmentInit.MALACHITE_SHOVEL);
        handheldItem(EquipmentInit.MALACHITE_PICKAXE);
        handheldItem(EquipmentInit.MALACHITE_AXE);
        handheldItem(EquipmentInit.MALACHITE_HOE);
        handheldItem(EquipmentInit.EBONY_SHOVEL);
        handheldItem(EquipmentInit.EBONY_PICKAXE);
        handheldItem(EquipmentInit.EBONY_AXE);
        handheldItem(EquipmentInit.EBONY_HOE);
        handheldItem(EquipmentInit.DAEDRIC_SHOVEL);
        handheldItem(EquipmentInit.DAEDRIC_PICKAXE);
        handheldItem(EquipmentInit.DAEDRIC_AXE);
        handheldItem(EquipmentInit.DAEDRIC_HOE);
        handheldItem(EquipmentInit.DRAGON_SHOVEL);
        handheldItem(EquipmentInit.DRAGON_PICKAXE);
        handheldItem(EquipmentInit.DRAGON_AXE);
        handheldItem(EquipmentInit.DRAGON_HOE);
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
