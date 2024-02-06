package net.f1la.talesofskyrim.datagen;

import net.f1la.talesofskyrim.TalesOfSkyrimMod;
import net.f1la.talesofskyrim.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TalesOfSkyrimMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.DAEDRA_HEART);
        simpleItem(ModItems.DRAGON_BONE);
        simpleItem(ModItems.DRAGON_SCALES);
        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.SILVER_NUGGET);
        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.STEEL_NUGGET);
        simpleItem(ModItems.MOONSTONE_INGOT);
        simpleItem(ModItems.MOONSTONE_NUGGET);
        simpleItem(ModItems.CORUNDUM_INGOT);
        simpleItem(ModItems.CORUNDUM_NUGGET);
        simpleItem(ModItems.DWARVEN_INGOT);
        simpleItem(ModItems.DWARVEN_NUGGET);
        simpleItem(ModItems.ORICHALCUM_INGOT);
        simpleItem(ModItems.ORICHALCUM_NUGGET);
        simpleItem(ModItems.MALACHITE_INGOT);
        simpleItem(ModItems.MALACHITE_NUGGET);
        simpleItem(ModItems.EBONY_INGOT);
        simpleItem(ModItems.EBONY_NUGGET);
        simpleItem(ModItems.AMETHYST);
        simpleItem(ModItems.GARNET);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.RAW_CORUNDUM);
        simpleItem(ModItems.RAW_ORICHALCUM);
        simpleItem(ModItems.RAW_MOONSTONE);
        simpleItem(ModItems.RAW_MALACHITE);
        simpleItem(ModItems.RAW_EBONY);


        simpleItem(ModItems.STEEL_BOOTS);
        simpleItem(ModItems.STEEL_LEGGINGS);
        simpleItem(ModItems.STEEL_CHESTPLATE);
        simpleItem(ModItems.STEEL_HELMET);
        simpleItem(ModItems.SILVER_BOOTS);
        simpleItem(ModItems.SILVER_LEGGINGS);
        simpleItem(ModItems.SILVER_CHESTPLATE);
        simpleItem(ModItems.SILVER_HELMET);
        simpleItem(ModItems.MOONSTONE_BOOTS);
        simpleItem(ModItems.MOONSTONE_LEGGINGS);
        simpleItem(ModItems.MOONSTONE_CHESTPLATE);
        simpleItem(ModItems.MOONSTONE_HELMET);
        simpleItem(ModItems.DWARVEN_BOOTS);
        simpleItem(ModItems.DWARVEN_LEGGINGS);
        simpleItem(ModItems.DWARVEN_CHESTPLATE);
        simpleItem(ModItems.DWARVEN_HELMET);
        simpleItem(ModItems.ORICHALCUM_BOOTS);
        simpleItem(ModItems.ORICHALCUM_LEGGINGS);
        simpleItem(ModItems.ORICHALCUM_CHESTPLATE);
        simpleItem(ModItems.ORICHALCUM_HELMET);
        simpleItem(ModItems.MALACHITE_BOOTS);
        simpleItem(ModItems.MALACHITE_LEGGINGS);
        simpleItem(ModItems.MALACHITE_CHESTPLATE);
        simpleItem(ModItems.MALACHITE_HELMET);
        simpleItem(ModItems.EBONY_BOOTS);
        simpleItem(ModItems.EBONY_LEGGINGS);
        simpleItem(ModItems.EBONY_CHESTPLATE);
        simpleItem(ModItems.EBONY_HELMET);
        simpleItem(ModItems.DAEDRIC_BOOTS);
        simpleItem(ModItems.DAEDRIC_LEGGINGS);
        simpleItem(ModItems.DAEDRIC_CHESTPLATE);
        simpleItem(ModItems.DAEDRIC_HELMET);
        simpleItem(ModItems.DRAGON_BOOTS);
        simpleItem(ModItems.DRAGON_LEGGINGS);
        simpleItem(ModItems.DRAGON_CHESTPLATE);
        simpleItem(ModItems.DRAGON_HELMET);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_HOE);
        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_DAGGER);
        handheldItem(ModItems.STEEL_MACE);
        handheldItem(ModItems.SILVER_SHOVEL);
        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_AXE);
        handheldItem(ModItems.SILVER_HOE);
        handheldItem(ModItems.SILVER_SWORD);
        handheldItem(ModItems.SILVER_DAGGER);
        handheldItem(ModItems.SILVER_MACE);
        handheldItem(ModItems.MOONSTONE_SHOVEL);
        handheldItem(ModItems.MOONSTONE_PICKAXE);
        handheldItem(ModItems.MOONSTONE_AXE);
        handheldItem(ModItems.MOONSTONE_HOE);
        handheldItem(ModItems.MOONSTONE_SWORD);
        handheldItem(ModItems.MOONSTONE_DAGGER);
        handheldItem(ModItems.MOONSTONE_MACE);
        handheldItem(ModItems.DWARVEN_SHOVEL);
        handheldItem(ModItems.DWARVEN_PICKAXE);
        handheldItem(ModItems.DWARVEN_AXE);
        handheldItem(ModItems.DWARVEN_HOE);
        handheldItem(ModItems.DWARVEN_SWORD);
        handheldItem(ModItems.DWARVEN_DAGGER);
        handheldItem(ModItems.DWARVEN_MACE);
        handheldItem(ModItems.ORICHALCUM_SHOVEL);
        handheldItem(ModItems.ORICHALCUM_PICKAXE);
        handheldItem(ModItems.ORICHALCUM_AXE);
        handheldItem(ModItems.ORICHALCUM_HOE);
        handheldItem(ModItems.ORICHALCUM_SWORD);
        handheldItem(ModItems.ORICHALCUM_DAGGER);
        handheldItem(ModItems.ORICHALCUM_MACE);
        handheldItem(ModItems.MALACHITE_SHOVEL);
        handheldItem(ModItems.MALACHITE_PICKAXE);
        handheldItem(ModItems.MALACHITE_AXE);
        handheldItem(ModItems.MALACHITE_HOE);
        handheldItem(ModItems.MALACHITE_SWORD);
        handheldItem(ModItems.MALACHITE_DAGGER);
        handheldItem(ModItems.MALACHITE_MACE);
        handheldItem(ModItems.EBONY_SHOVEL);
        handheldItem(ModItems.EBONY_PICKAXE);
        handheldItem(ModItems.EBONY_AXE);
        handheldItem(ModItems.EBONY_HOE);
        handheldItem(ModItems.EBONY_SWORD);
        handheldItem(ModItems.EBONY_DAGGER);
        handheldItem(ModItems.EBONY_MACE);
        handheldItem(ModItems.DAEDRIC_SHOVEL);
        handheldItem(ModItems.DAEDRIC_PICKAXE);
        handheldItem(ModItems.DAEDRIC_AXE);
        handheldItem(ModItems.DAEDRIC_HOE);
        handheldItem(ModItems.DAEDRIC_SWORD);
        handheldItem(ModItems.DAEDRIC_DAGGER);
        handheldItem(ModItems.DAEDRIC_MACE);
        handheldItem(ModItems.DRAGON_SHOVEL);
        handheldItem(ModItems.DRAGON_PICKAXE);
        handheldItem(ModItems.DRAGON_AXE);
        handheldItem(ModItems.DRAGON_HOE);
        handheldItem(ModItems.DRAGON_SWORD);
        handheldItem(ModItems.DRAGON_DAGGER);
        handheldItem(ModItems.DRAGON_MACE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TalesOfSkyrimMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(TalesOfSkyrimMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
