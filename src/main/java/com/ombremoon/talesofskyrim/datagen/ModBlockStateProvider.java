package com.ombremoon.talesofskyrim.datagen;

import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.common.init.block.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Constants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(BlockInit.AMETHYST_BLOCK);
        blockWithItem(BlockInit.AMETHYST_ORE);
        blockWithItem(BlockInit.DEEPSLATE_AMETHYST_ORE);
        blockWithItem(BlockInit.GARNET_BLOCK);
        blockWithItem(BlockInit.GARNET_ORE);
        blockWithItem(BlockInit.DEEPSLATE_GARNET_ORE);
        blockWithItem(BlockInit.RUBY_BLOCK);
        blockWithItem(BlockInit.RUBY_ORE);
        blockWithItem(BlockInit.DEEPSLATE_RUBY_ORE);
        blockWithItem(BlockInit.SAPPHIRE_BLOCK);
        blockWithItem(BlockInit.SAPPHIRE_ORE);
        blockWithItem(BlockInit.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(BlockInit.SILVER_BLOCK);
        blockWithItem(BlockInit.SILVER_ORE);
        blockWithItem(BlockInit.DEEPSLATE_SILVER_ORE);
        blockWithItem(BlockInit.STEEL_BLOCK);
        blockWithItem(BlockInit.ORICHALCUM_BLOCK);
        blockWithItem(BlockInit.ORICHALCUM_ORE);
        blockWithItem(BlockInit.DEEPSLATE_ORICHALCUM_ORE);
        blockWithItem(BlockInit.MOONSTONE_BLOCK);
        blockWithItem(BlockInit.MOONSTONE_ORE);
        blockWithItem(BlockInit.DEEPSLATE_MOONSTONE_ORE);
        blockWithItem(BlockInit.MALACHITE_BLOCK);
        blockWithItem(BlockInit.MALACHITE_ORE);
        blockWithItem(BlockInit.DEEPSLATE_MALACHITE_ORE);
        blockWithItem(BlockInit.EBONY_BLOCK);
        blockWithItem(BlockInit.EBONY_ORE);
        blockWithItem(BlockInit.DEEPSLATE_EBONY_ORE);
        blockWithItem(BlockInit.DWARVEN_BLOCK);
        blockWithItem(BlockInit.CORUNDUM_ORE);
        blockWithItem(BlockInit.DEEPSLATE_CORUNDUM_ORE);


    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("talesofskyrim:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    protected BlockModelBuilder blockCubeTopModel(Block block) {
        String name = getName(block);
        return models().cubeBottomTop(name, modLoc("block/" + name + "_side"), modLoc("block/" + name + "_bottom"), modLoc("block/" + name + "_top"));
    }

    protected String getName(Block item) {
        return ForgeRegistries.BLOCKS.getKey(item).getPath();
    }

}
