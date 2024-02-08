package com.ombremoon.talesofskyrim.datagen;

import com.ombremoon.talesofskyrim.CommonClass;
import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.common.init.block.BlockInit;
import com.ombremoon.talesofskyrim.common.init.item.ItemInit;
import com.ombremoon.talesofskyrim.common.init.item.EquipmentInit;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SILVER_SMELTABLES = List.of(BlockInit.SILVER_ORE.get(), BlockInit.DEEPSLATE_SILVER_ORE.get(), ItemInit.RAW_SILVER.get());
    private static final List<ItemLike> CORUNDUM_SMELTABLES = List.of(BlockInit.CORUNDUM_ORE.get(), BlockInit.DEEPSLATE_CORUNDUM_ORE.get(), ItemInit.RAW_CORUNDUM.get());
    private static final List<ItemLike> ORICHALCUM_SMELTABLES = List.of(BlockInit.ORICHALCUM_ORE.get(), BlockInit.DEEPSLATE_ORICHALCUM_ORE.get(), ItemInit.RAW_ORICHALCUM.get());
    private static final List<ItemLike> MOONSTONE_SMELTABLES = List.of(BlockInit.MOONSTONE_ORE.get(), BlockInit.DEEPSLATE_MOONSTONE_ORE.get(), ItemInit.RAW_MOONSTONE.get());
    private static final List<ItemLike> MALACHITE_SMELTABLES = List.of(BlockInit.MALACHITE_ORE.get(), BlockInit.DEEPSLATE_MALACHITE_ORE.get(), ItemInit.RAW_MALACHITE.get());
    private static final List<ItemLike> EBONY_SMELTABLES = List.of(BlockInit.EBONY_ORE.get(), BlockInit.DEEPSLATE_EBONY_ORE.get(), ItemInit.RAW_EBONY.get());
    private static final List<ItemLike> AMETHYST_SMELTABLES = List.of(BlockInit.AMETHYST_ORE.get(), BlockInit.DEEPSLATE_AMETHYST_ORE.get());
    private static final List<ItemLike> GARNET_SMELTABLES = List.of(BlockInit.GARNET_ORE.get(), BlockInit.DEEPSLATE_GARNET_ORE.get());
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(BlockInit.RUBY_ORE.get(), BlockInit.DEEPSLATE_RUBY_ORE.get());
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(BlockInit.SAPPHIRE_ORE.get(), BlockInit.DEEPSLATE_SAPPHIRE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.SILVER_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ItemInit.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.SILVER_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ItemInit.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.SILVER_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ItemInit.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.SILVER_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ItemInit.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.SILVER_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.SILVER_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.SILVER_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ItemInit.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.SILVER_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ItemInit.SILVER_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SILVER_INGOT.get()).build()))
                .save(pWriter);

        /*ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);*/

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.SILVER_INGOT.get(), 9)
                .requires(BlockInit.SILVER_BLOCK.get())
                .unlockedBy("has_silver_block", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.SILVER_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.SILVER_INGOT.get(), 1)
                .requires(ItemInit.SILVER_NUGGET.get(), 9)
                .unlockedBy("has_silver_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.SILVER_BLOCK.get()).build()))
                .save(pWriter, CommonClass.customLocation("silver_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.SILVER_BLOCK.get(), 1)
                .requires(ItemInit.SILVER_INGOT.get(), 9)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ItemInit.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ItemInit.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ItemInit.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ItemInit.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ItemInit.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ItemInit.STEEL_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ItemInit.STEEL_INGOT.get())
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ItemInit.STEEL_INGOT.get())
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.STEEL_INGOT.get())
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.STEEL_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.STEEL_INGOT.get())
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.STEEL_INGOT.get(), 9)
                .requires(BlockInit.STEEL_BLOCK.get())
                .unlockedBy("has_steel_block", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.STEEL_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.STEEL_INGOT.get(), 1)
                .requires(ItemInit.STEEL_NUGGET.get(), 9)
                .unlockedBy("has_steel_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.STEEL_BLOCK.get()).build()))
                .save(pWriter, CommonClass.customLocation("steel_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.STEEL_BLOCK.get(), 1)
                .requires(ItemInit.STEEL_INGOT.get(), 9)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MOONSTONE_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.MOONSTONE_INGOT.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.MOONSTONE_INGOT.get(), 9)
                .requires(BlockInit.MOONSTONE_BLOCK.get())
                .unlockedBy("has_moonstone_block", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.MOONSTONE_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.MOONSTONE_INGOT.get(), 1)
                .requires(ItemInit.MOONSTONE_NUGGET.get(), 9)
                .unlockedBy("has_moonstone_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.MOONSTONE_BLOCK.get()).build()))
                .save(pWriter, CommonClass.customLocation("moonstone_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.MOONSTONE_BLOCK.get(), 1)
                .requires(ItemInit.MOONSTONE_INGOT.get(), 9)
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .define('#', ItemInit.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .define('#', ItemInit.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .define('#', ItemInit.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .define('#', ItemInit.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .define('#', ItemInit.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .define('#', ItemInit.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .define('#', ItemInit.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DWARVEN_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.DWARVEN_INGOT.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.DWARVEN_INGOT.get(), 9)
                .requires(BlockInit.DWARVEN_BLOCK.get())
                .unlockedBy("has_dwarven_metal_block", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.DWARVEN_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.DWARVEN_INGOT.get(), 1)
                .requires(ItemInit.DWARVEN_NUGGET.get(), 9)
                .unlockedBy("has_dwarven_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.DWARVEN_BLOCK.get()).build()))
                .save(pWriter, CommonClass.customLocation("dwarven_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.DWARVEN_BLOCK.get(), 1)
                .requires(ItemInit.DWARVEN_INGOT.get(), 9)
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .define('#', ItemInit.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .define('#', ItemInit.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .define('#', ItemInit.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .define('#', ItemInit.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .define('#', ItemInit.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .define('#', ItemInit.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .define('#', ItemInit.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.ORICHALCUM_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.ORICHALCUM_INGOT.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.ORICHALCUM_INGOT.get(), 9)
                .requires(BlockInit.ORICHALCUM_BLOCK.get())
                .unlockedBy("has_orichalcum_block", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.ORICHALCUM_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.ORICHALCUM_INGOT.get(), 1)
                .requires(ItemInit.ORICHALCUM_NUGGET.get(), 9)
                .unlockedBy("has_orichalcum_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.ORICHALCUM_BLOCK.get()).build()))
                .save(pWriter, CommonClass.customLocation("orichalcum_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.ORICHALCUM_BLOCK.get(), 1)
                .requires(ItemInit.ORICHALCUM_INGOT.get(), 9)
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .define('#', ItemInit.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.MALACHITE_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.MALACHITE_INGOT.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.MALACHITE_INGOT.get(), 9)
                .requires(BlockInit.MALACHITE_BLOCK.get())
                .unlockedBy("has_malachite_block", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.MALACHITE_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.MALACHITE_INGOT.get(), 1)
                .requires(ItemInit.MALACHITE_NUGGET.get(), 9)
                .unlockedBy("has_malachite_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.MALACHITE_BLOCK.get()).build()))
                .save(pWriter, CommonClass.customLocation("malachite_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.MALACHITE_BLOCK.get(), 1)
                .requires(ItemInit.MALACHITE_INGOT.get(), 9)
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ItemInit.EBONY_INGOT.get())
                .define('#', ItemInit.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ItemInit.EBONY_INGOT.get())
                .define('#', ItemInit.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ItemInit.EBONY_INGOT.get())
                .define('#', ItemInit.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ItemInit.EBONY_INGOT.get())
                .define('#', ItemInit.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.EBONY_INGOT.get())
                .define('#', ItemInit.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.EBONY_INGOT.get())
                .define('#', ItemInit.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ItemInit.EBONY_INGOT.get())
                .define('#', ItemInit.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ItemInit.EBONY_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ItemInit.EBONY_INGOT.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ItemInit.EBONY_INGOT.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.EBONY_INGOT.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.EBONY_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.EBONY_INGOT.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.EBONY_INGOT.get(), 9)
                .requires(BlockInit.EBONY_BLOCK.get())
                .unlockedBy("has_ebony_block", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.EBONY_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.EBONY_INGOT.get(), 1)
                .requires(ItemInit.EBONY_NUGGET.get(), 9)
                .unlockedBy("has_ebony_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.EBONY_BLOCK.get()).build()))
                .save(pWriter, CommonClass.customLocation("ebony_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockInit.EBONY_BLOCK.get(), 1)
                .requires(ItemInit.EBONY_INGOT.get(), 9)
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ItemInit.DRAGON_BONE.get())
                .define('#', ItemInit.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ItemInit.DRAGON_BONE.get())
                .define('#', ItemInit.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ItemInit.DRAGON_BONE.get())
                .define('#', ItemInit.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ItemInit.DRAGON_BONE.get())
                .define('#', ItemInit.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.DRAGON_BONE.get())
                .define('#', ItemInit.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ItemInit.DRAGON_BONE.get())
                .define('#', ItemInit.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ItemInit.DRAGON_BONE.get())
                .define('#', ItemInit.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ItemInit.DRAGON_BONE.get())
                .define('#', Items.STRING)
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ItemInit.DRAGON_SCALES.get())
                .unlockedBy("has_dragon_scales", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ItemInit.DRAGON_SCALES.get())
                .unlockedBy("has_dragon_scales", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.DRAGON_SCALES.get())
                .unlockedBy("has_dragon_scales", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, EquipmentInit.DRAGON_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ItemInit.DRAGON_SCALES.get())
                .unlockedBy("has_scales", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DRAGON_BONE.get()).build()))
                .save(pWriter);


        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ItemInit.SILVER_INGOT.get(), 0.25f, 200, "silver");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ItemInit.SILVER_INGOT.get(), 0.25f, 100, "silver");
        oreSmelting(pWriter, CORUNDUM_SMELTABLES, RecipeCategory.MISC, ItemInit.CORUNDUM_INGOT.get(), 0.25f, 200, "corundum");
        oreBlasting(pWriter, CORUNDUM_SMELTABLES, RecipeCategory.MISC, ItemInit.CORUNDUM_INGOT.get(), 0.25f, 100, "corundum");
        oreSmelting(pWriter, ORICHALCUM_SMELTABLES, RecipeCategory.MISC, ItemInit.ORICHALCUM_INGOT.get(), 0.25f, 200, "orichalcum");
        oreBlasting(pWriter, ORICHALCUM_SMELTABLES, RecipeCategory.MISC, ItemInit.ORICHALCUM_INGOT.get(), 0.25f, 100, "orichalcum");
        oreSmelting(pWriter, MOONSTONE_SMELTABLES, RecipeCategory.MISC, ItemInit.MOONSTONE_INGOT.get(), 0.25f, 200, "moonstone");
        oreBlasting(pWriter, MOONSTONE_SMELTABLES, RecipeCategory.MISC, ItemInit.MOONSTONE_INGOT.get(), 0.25f, 100, "moonstone");
        oreSmelting(pWriter, MALACHITE_SMELTABLES, RecipeCategory.MISC, ItemInit.MALACHITE_INGOT.get(), 0.25f, 200, "malachite");
        oreBlasting(pWriter, MALACHITE_SMELTABLES, RecipeCategory.MISC, ItemInit.MALACHITE_INGOT.get(), 0.25f, 100, "malachite");
        oreSmelting(pWriter, EBONY_SMELTABLES, RecipeCategory.MISC, ItemInit.EBONY_INGOT.get(), 0.25f, 200, "ebony");
        oreBlasting(pWriter, EBONY_SMELTABLES, RecipeCategory.MISC, ItemInit.EBONY_INGOT.get(), 0.25f, 100, "ebony");
        oreSmelting(pWriter, AMETHYST_SMELTABLES, RecipeCategory.MISC, ItemInit.AMETHYST.get(), 0.25f, 200, "amethyst");
        oreBlasting(pWriter, AMETHYST_SMELTABLES, RecipeCategory.MISC, ItemInit.AMETHYST.get(), 0.25f, 100, "amethyst");
        oreSmelting(pWriter, GARNET_SMELTABLES, RecipeCategory.MISC, ItemInit.GARNET.get(), 0.25f, 200, "garnet");
        oreBlasting(pWriter, GARNET_SMELTABLES, RecipeCategory.MISC, ItemInit.GARNET.get(), 0.25f, 100, "garnet");
        oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ItemInit.RUBY.get(), 0.25f, 200, "ruby");
        oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ItemInit.RUBY.get(), 0.25f, 100, "ruby");
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ItemInit.SAPPHIRE.get(), 0.25f, 200, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ItemInit.SAPPHIRE.get(), 0.25f, 100, "sapphire");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Constants.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
