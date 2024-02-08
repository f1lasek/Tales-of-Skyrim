package com.ombremoon.talesofskyrim.datagen;

import com.ombremoon.talesofskyrim.common.init.block.BlockInit;
import com.ombremoon.talesofskyrim.common.init.item.ItemInit;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.add(BlockInit.EBONY_ORE.get(),
                block -> createOreDrop(BlockInit.EBONY_ORE.get(), ItemInit.EBONY_INGOT.get()));


    }

  /*  @Override
    protected Stream<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get);
    }*/

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> block instanceof DoorBlock).collect(Collectors.toSet());
    }

    protected boolean shouldDropSelf(Block block) {
        return shouldGenerateLoot(block);
    }

    protected boolean shouldGenerateLoot(Block block) {
        return block.asItem() != Items.AIR && !(block instanceof DropExperienceBlock);
    }
}