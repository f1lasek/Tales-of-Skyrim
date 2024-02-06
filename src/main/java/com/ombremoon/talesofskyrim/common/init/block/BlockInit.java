package com.ombremoon.talesofskyrim.common.init.block;

import com.ombremoon.talesofskyrim.common.init.item.ItemInit;
import com.ombremoon.talesofskyrim.Constants;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

    /*ORES & BLOCK VARIANTS*/
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> AMETHYST_ORE = registerOreBlock("amethyst_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_AMETHYST_ORE = registerOreBlock("deepslate_amethyst_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> GARNET_BLOCK = registerBlock("garnet_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> GARNET_ORE = registerOreBlock("garnet_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_GARNET_ORE = registerOreBlock("deepslate_garnet_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> RUBY_ORE = registerOreBlock("ruby_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerOreBlock("deepslate_ruby_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> SAPPHIRE_ORE = registerOreBlock("sapphire_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerOreBlock("deepslate_sapphire_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> SILVER_ORE = registerOreBlock("silver_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerOreBlock("deepslate_silver_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> ORICHALCUM_ORE = registerOreBlock("orichalcum_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_ORICHALCUM_ORE = registerOreBlock("deepslate_orichalcum_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> MOONSTONE_ORE = registerOreBlock("moonstone_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_MOONSTONE_ORE = registerOreBlock("deepslate_moonstone_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> MALACHITE_BLOCK = registerBlock("malachite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> MALACHITE_ORE = registerOreBlock("malachite_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_MALACHITE_ORE = registerOreBlock("deepslate_malachite_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> EBONY_BLOCK = registerBlock("ebony_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> EBONY_ORE = registerOreBlock("ebony_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_EBONY_ORE = registerOreBlock("deepslate_ebony_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> CORUNDUM_ORE = registerOreBlock("corundum_ore", Blocks.STONE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DEEPSLATE_CORUNDUM_ORE = registerOreBlock("deepslate_corundum_ore", Blocks.DEEPSLATE, 3.0F, 3.0F);
    public static final RegistryObject<Block> DWARVEN_BLOCK = registerBlock("dwarven_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F)));


    private static RegistryObject<Block> registerOreBlock(String name, Block blockToCopy, float blockStrength, float explosionResistance) {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.copy(blockToCopy).requiresCorrectToolForDrops().strength(blockStrength, explosionResistance)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        var toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
