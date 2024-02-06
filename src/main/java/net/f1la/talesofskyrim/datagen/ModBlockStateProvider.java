package net.f1la.talesofskyrim.datagen;

import net.f1la.talesofskyrim.TalesOfSkyrimMod;
import net.f1la.talesofskyrim.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TalesOfSkyrimMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AMETHYST_BLOCK);
        blockWithItem(ModBlocks.AMETHYST_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_AMETHYST_ORE);
        blockWithItem(ModBlocks.GARNET_BLOCK);
        blockWithItem(ModBlocks.GARNET_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_GARNET_ORE);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.ORICHALCUM_BLOCK);
        blockWithItem(ModBlocks.ORICHALCUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ORICHALCUM_ORE);
        blockWithItem(ModBlocks.MOONSTONE_BLOCK);
        blockWithItem(ModBlocks.MOONSTONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MOONSTONE_ORE);
        blockWithItem(ModBlocks.MALACHITE_BLOCK);
        blockWithItem(ModBlocks.MALACHITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MALACHITE_ORE);
        blockWithItem(ModBlocks.EBONY_BLOCK);
        blockWithItem(ModBlocks.EBONY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_EBONY_ORE);
        blockWithItem(ModBlocks.DWARVEN_BLOCK);
        blockWithItem(ModBlocks.CORUNDUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CORUNDUM_ORE);


    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("talesofskyrim:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
