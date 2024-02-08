package com.ombremoon.talesofskyrim.common.init.item;

import com.ombremoon.talesofskyrim.CommonClass;
import com.ombremoon.talesofskyrim.common.init.TagsInit;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ToolTiersInit {
    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(2, 450, 6.5f, 2f, 10,
                    TagsInit.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
            CommonClass.customLocation("steel"), List.of(), List.of());
    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 224, 7.5f, 2f, 20,
                    TagsInit.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ItemInit.SILVER_INGOT.get())),
            CommonClass.customLocation("silver"), List.of(), List.of());
    public static final Tier MOONSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 320, 7f, 2f, 16,
                    TagsInit.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ItemInit.MOONSTONE_INGOT.get())),
            CommonClass.customLocation("moonstone"), List.of(), List.of());
    public static final Tier DWARVEN = TierSortingRegistry.registerTier(
            new ForgeTier(2, 1022, 6.5f, 2f, 1,
                    TagsInit.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ItemInit.DWARVEN_INGOT.get())),
            CommonClass.customLocation("dwarven"), List.of(), List.of());
    public static final Tier ORICHALCUM = TierSortingRegistry.registerTier(
            new ForgeTier(2, 895, 6f, 3f, 5,
                    TagsInit.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ItemInit.ORICHALCUM_INGOT.get())),
            CommonClass.customLocation("orichalcum"), List.of(), List.of());
    public static final Tier MALACHITE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 703, 7.5f, 2.5f, 18,
                    TagsInit.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ItemInit.MALACHITE_INGOT.get())),
            CommonClass.customLocation("malachite"), List.of(), List.of());
    public static final Tier EBONY  = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1600, 8f, 3.5f, 14,
                    TagsInit.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ItemInit.EBONY_INGOT.get())),
            CommonClass.customLocation("ebony"), List.of(), List.of());
    public static final Tier DAEDRIC = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1790, 8.5f, 4f, 12,
                    TagsInit.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ItemInit.EBONY_INGOT.get())),
            CommonClass.customLocation("daedric"), List.of(), List.of());
    public static final Tier DRAGON = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1915, 8f, 4.5f, 20,
                    TagsInit.Blocks.NEEDS_MOD_TOOL, () -> Ingredient.of(ItemInit.DRAGON_BONE.get())),
            CommonClass.customLocation("dragon"), List.of(), List.of());

}
