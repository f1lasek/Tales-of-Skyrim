package net.f1la.talesofskyrim.item;

import net.f1la.talesofskyrim.TalesOfSkyrimMod;
import net.f1la.talesofskyrim.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(2, 450, 6.5f, 2f, 10,
                    ModTags.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "steel"), List.of(), List.of());
    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 224, 7.5f, 2f, 20,
                    ModTags.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
            new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "silver"), List.of(), List.of());
    public static final Tier MOONSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 320, 7f, 2f, 16,
                    ModTags.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ModItems.MOONSTONE_INGOT.get())),
            new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "moonstone"), List.of(), List.of());
    public static final Tier DWARVEN = TierSortingRegistry.registerTier(
            new ForgeTier(2, 1022, 6.5f, 2f, 1,
                    ModTags.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ModItems.DWARVEN_INGOT.get())),
            new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "dwarven"), List.of(), List.of());
    public static final Tier ORICHALCUM = TierSortingRegistry.registerTier(
            new ForgeTier(2, 895, 6f, 3f, 5,
                    ModTags.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get())),
            new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "orichalcum"), List.of(), List.of());
    public static final Tier MALACHITE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 703, 7.5f, 2.5f, 18,
                    ModTags.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ModItems.MALACHITE_INGOT.get())),
            new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "malachite"), List.of(), List.of());
    public static final Tier EBONY  = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1600, 8f, 3.5f, 14,
                    ModTags.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ModItems.EBONY_INGOT.get())),
            new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "ebony"), List.of(), List.of());
    public static final Tier DAEDRIC = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1790, 8.5f, 4f, 12,
                    ModTags.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ModItems.EBONY_INGOT.get())),
            new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "daedric"), List.of(), List.of());
    public static final Tier DRAGON = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1915, 8f, 4.5f, 20,
                    ModTags.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ModItems.DRAGON_BONE.get())),
            new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "dragon"), List.of(), List.of());

}
