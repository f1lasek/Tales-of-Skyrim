package com.ombremoon.talesofskyrim.common.init.worldgen;

import com.ombremoon.talesofskyrim.CommonClass;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> CORUNDUM_ORE_PLACED_KEY = registerKey("corundum_ore_placed");
    public static final ResourceKey<PlacedFeature> ORICHALCUM_ORE_PLACED_KEY = registerKey("orichalcum_ore_placed");
    public static final ResourceKey<PlacedFeature> MOONSTONE_ORE_PLACED_KEY = registerKey("moonstone_ore_placed");
    public static final ResourceKey<PlacedFeature> MALACHITE_ORE_PLACED_KEY = registerKey("malachite_ore_placed");
    public static final ResourceKey<PlacedFeature> EBONY_ORE_PLACED_KEY = registerKey("ebony_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.OVERWORLD_SILVER_ORE_KEY),
                OrePlacementInit.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, CORUNDUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.OVERWORLD_CORUNDUM_ORE_KEY),
                OrePlacementInit.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, ORICHALCUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.OVERWORLD_ORICHALCUM_ORE_KEY),
                OrePlacementInit.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, MOONSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.OVERWORLD_MOONSTONE_ORE_KEY),
                OrePlacementInit.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, MALACHITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.OVERWORLD_MALACHITE_ORE_KEY),
                OrePlacementInit.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, EBONY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.OVERWORLD_EBONY_ORE_KEY),
                OrePlacementInit.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));




    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, CommonClass.customLocation(name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}