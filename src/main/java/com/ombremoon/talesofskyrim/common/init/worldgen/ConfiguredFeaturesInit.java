package com.ombremoon.talesofskyrim.common.init.worldgen;

import com.ombremoon.talesofskyrim.CommonClass;
import com.ombremoon.talesofskyrim.common.init.block.BlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ConfiguredFeaturesInit {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CORUNDUM_ORE_KEY = registerKey("corundum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORICHALCUM_ORE_KEY = registerKey("orichalcum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MOONSTONE_ORE_KEY = registerKey("moonstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MALACHITE_ORE_KEY = registerKey("malachite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EBONY_ORE_KEY = registerKey("ebony_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceabeles = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceabeles = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldSilverOre = List.of(OreConfiguration.target(stoneReplaceables,
                        BlockInit.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, BlockInit.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCorundumOre = List.of(OreConfiguration.target(stoneReplaceables,
                        BlockInit.CORUNDUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, BlockInit.DEEPSLATE_CORUNDUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldOrichalcumOre = List.of(OreConfiguration.target(stoneReplaceables,
                        BlockInit.ORICHALCUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, BlockInit.DEEPSLATE_ORICHALCUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldMoonstoneOre = List.of(OreConfiguration.target(stoneReplaceables,
                        BlockInit.MOONSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, BlockInit.DEEPSLATE_MOONSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldMalachiteOre = List.of(OreConfiguration.target(stoneReplaceables,
                        BlockInit.MALACHITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, BlockInit.DEEPSLATE_MALACHITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldEbonyOre = List.of(OreConfiguration.target(stoneReplaceables,
                        BlockInit.EBONY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, BlockInit.DEEPSLATE_EBONY_ORE.get().defaultBlockState()));


        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOre, 9));
        register(context, OVERWORLD_CORUNDUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCorundumOre, 9));
        register(context, OVERWORLD_ORICHALCUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOrichalcumOre, 9));
        register(context, OVERWORLD_MOONSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMoonstoneOre, 9));
        register(context, OVERWORLD_MALACHITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMalachiteOre, 9));
        register(context, OVERWORLD_EBONY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldEbonyOre, 9));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, CommonClass.customLocation(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}