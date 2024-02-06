package net.f1la.talesofskyrim.datagen;

import net.f1la.talesofskyrim.TalesOfSkyrimMod;
import net.f1la.talesofskyrim.block.ModBlocks;
import net.f1la.talesofskyrim.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SILVER_SMELTABLES = List.of(ModBlocks.SILVER_ORE.get(),ModBlocks.DEEPSLATE_SILVER_ORE.get(),ModItems.RAW_SILVER.get());
    private static final List<ItemLike> CORUNDUM_SMELTABLES = List.of(ModBlocks.CORUNDUM_ORE.get(),ModBlocks.DEEPSLATE_CORUNDUM_ORE.get(),ModItems.RAW_CORUNDUM.get());
    private static final List<ItemLike> ORICHALCUM_SMELTABLES = List.of(ModBlocks.ORICHALCUM_ORE.get(),ModBlocks.DEEPSLATE_ORICHALCUM_ORE.get(),ModItems.RAW_ORICHALCUM.get());
    private static final List<ItemLike> MOONSTONE_SMELTABLES = List.of(ModBlocks.MOONSTONE_ORE.get(),ModBlocks.DEEPSLATE_MOONSTONE_ORE.get(),ModItems.RAW_MOONSTONE.get());
    private static final List<ItemLike> MALACHITE_SMELTABLES = List.of(ModBlocks.MALACHITE_ORE.get(),ModBlocks.DEEPSLATE_MALACHITE_ORE.get(),ModItems.RAW_MALACHITE.get());
    private static final List<ItemLike> EBONY_SMELTABLES = List.of(ModBlocks.EBONY_ORE.get(),ModBlocks.DEEPSLATE_EBONY_ORE.get(),ModItems.RAW_EBONY.get());
    private static final List<ItemLike> AMETHYST_SMELTABLES = List.of(ModBlocks.AMETHYST_ORE.get(),ModBlocks.DEEPSLATE_AMETHYST_ORE.get());
    private static final List<ItemLike> GARNET_SMELTABLES = List.of(ModBlocks.GARNET_ORE.get(),ModBlocks.DEEPSLATE_GARNET_ORE.get());
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE.get(),ModBlocks.DEEPSLATE_RUBY_ORE.get());
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE.get(),ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ModItems.SILVER_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                .requires(ModBlocks.SILVER_BLOCK.get())
                .unlockedBy("has_silver_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 1)
                .requires(ModItems.SILVER_NUGGET.get(), 9)
                .unlockedBy("has_silver_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.SILVER_BLOCK.get()).build()))
                .save(pWriter, new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "silver_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get(), 1)
                .requires(ModItems.SILVER_INGOT.get(), 9)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.SILVER_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ModItems.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ModItems.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ModItems.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ModItems.STEEL_INGOT.get())
                .define('#', Items.STICK)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ModItems.STEEL_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.STEEL_INGOT.get())
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy("has_steel_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STEEL_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 1)
                .requires(ModItems.STEEL_NUGGET.get(), 9)
                .unlockedBy("has_steel_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.STEEL_BLOCK.get()).build()))
                .save(pWriter, new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "steel_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get(), 1)
                .requires(ModItems.STEEL_INGOT.get(), 9)
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.STEEL_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.MOONSTONE_INGOT.get())
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MOONSTONE_INGOT.get(), 9)
                .requires(ModBlocks.MOONSTONE_BLOCK.get())
                .unlockedBy("has_moonstone_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MOONSTONE_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MOONSTONE_INGOT.get(), 1)
                .requires(ModItems.MOONSTONE_NUGGET.get(), 9)
                .unlockedBy("has_moonstone_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MOONSTONE_BLOCK.get()).build()))
                .save(pWriter, new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "moonstone_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MOONSTONE_BLOCK.get(), 1)
                .requires(ModItems.MOONSTONE_INGOT.get(), 9)
                .unlockedBy("has_moonstone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MOONSTONE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .define('#', ModItems.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .define('#', ModItems.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .define('#', ModItems.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .define('#', ModItems.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .define('#', ModItems.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .define('#', ModItems.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .define('#', ModItems.DWARVEN_NUGGET.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DWARVEN_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.DWARVEN_INGOT.get())
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DWARVEN_INGOT.get(), 9)
                .requires(ModBlocks.DWARVEN_BLOCK.get())
                .unlockedBy("has_dwarven_metal_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DWARVEN_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DWARVEN_INGOT.get(), 1)
                .requires(ModItems.DWARVEN_NUGGET.get(), 9)
                .unlockedBy("has_dwarven_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DWARVEN_BLOCK.get()).build()))
                .save(pWriter, new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "dwarven_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.DWARVEN_BLOCK.get(), 1)
                .requires(ModItems.DWARVEN_INGOT.get(), 9)
                .unlockedBy("has_dwarven_metal", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DWARVEN_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .define('#', ModItems.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .define('#', ModItems.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .define('#', ModItems.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .define('#', ModItems.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .define('#', ModItems.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .define('#', ModItems.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .define('#', ModItems.ORICHALCUM_NUGGET.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORICHALCUM_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.ORICHALCUM_INGOT.get())
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ORICHALCUM_INGOT.get(), 9)
                .requires(ModBlocks.ORICHALCUM_BLOCK.get())
                .unlockedBy("has_orichalcum_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORICHALCUM_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ORICHALCUM_INGOT.get(), 1)
                .requires(ModItems.ORICHALCUM_NUGGET.get(), 9)
                .unlockedBy("has_orichalcum_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ORICHALCUM_BLOCK.get()).build()))
                .save(pWriter, new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "orichalcum_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ORICHALCUM_BLOCK.get(), 1)
                .requires(ModItems.ORICHALCUM_INGOT.get(), 9)
                .unlockedBy("has_orichalcum", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ORICHALCUM_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .define('#', ModItems.MOONSTONE_NUGGET.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MALACHITE_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.MALACHITE_INGOT.get())
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MALACHITE_INGOT.get(), 9)
                .requires(ModBlocks.MALACHITE_BLOCK.get())
                .unlockedBy("has_malachite_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MALACHITE_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MALACHITE_INGOT.get(), 1)
                .requires(ModItems.MALACHITE_NUGGET.get(), 9)
                .unlockedBy("has_malachite_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.MALACHITE_BLOCK.get()).build()))
                .save(pWriter, new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "malachite_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MALACHITE_BLOCK.get(), 1)
                .requires(ModItems.MALACHITE_INGOT.get(), 9)
                .unlockedBy("has_malachite", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MALACHITE_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.EBONY_INGOT.get())
                .define('#', ModItems.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ModItems.EBONY_INGOT.get())
                .define('#', ModItems.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ModItems.EBONY_INGOT.get())
                .define('#', ModItems.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ModItems.EBONY_INGOT.get())
                .define('#', ModItems.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.EBONY_INGOT.get())
                .define('#', ModItems.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.EBONY_INGOT.get())
                .define('#', ModItems.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ModItems.EBONY_INGOT.get())
                .define('#', ModItems.EBONY_NUGGET.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ModItems.EBONY_INGOT.get())
                .define('#', Items.STRING)
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.EBONY_INGOT.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.EBONY_INGOT.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.EBONY_INGOT.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EBONY_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.EBONY_INGOT.get())
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EBONY_INGOT.get(), 9)
                .requires(ModBlocks.EBONY_BLOCK.get())
                .unlockedBy("has_ebony_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.EBONY_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EBONY_INGOT.get(), 1)
                .requires(ModItems.EBONY_NUGGET.get(), 9)
                .unlockedBy("has_ebony_nuggets", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.EBONY_BLOCK.get()).build()))
                .save(pWriter, new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "ebony_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.EBONY_BLOCK.get(), 1)
                .requires(ModItems.EBONY_INGOT.get(), 9)
                .unlockedBy("has_ebony", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.EBONY_INGOT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_PICKAXE.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', ModItems.DRAGON_BONE.get())
                .define('#', ModItems.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_AXE.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .define('X', ModItems.DRAGON_BONE.get())
                .define('#', ModItems.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_SHOVEL.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .define('X', ModItems.DRAGON_BONE.get())
                .define('#', ModItems.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_HOE.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .define('X', ModItems.DRAGON_BONE.get())
                .define('#', ModItems.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_SWORD.get())
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.DRAGON_BONE.get())
                .define('#', ModItems.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_DAGGER.get())
                .pattern("X")
                .pattern("#")
                .define('X', ModItems.DRAGON_BONE.get())
                .define('#', ModItems.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_MACE.get())
                .pattern(" X ")
                .pattern(" #X")
                .pattern("#  ")
                .define('X', ModItems.DRAGON_BONE.get())
                .define('#', ModItems.STEEL_NUGGET.get())
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_BOW.get())
                .pattern(" X#")
                .pattern("X #")
                .pattern(" X#")
                .define('X', ModItems.DRAGON_BONE.get())
                .define('#', Items.STRING)
                .unlockedBy("has_dragon_bone", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_HELMET.get())
                .pattern("XXX")
                .pattern("X X")
                .define('X', ModItems.DRAGON_SCALES.get())
                .unlockedBy("has_dragon_scales", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_CHESTPLATE.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.DRAGON_SCALES.get())
                .unlockedBy("has_dragon_scales", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_LEGGINGS.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.DRAGON_SCALES.get())
                .unlockedBy("has_dragon_scales", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGON_BOOTS.get())
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.DRAGON_SCALES.get())
                .unlockedBy("has_scales", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.DRAGON_BONE.get()).build()))
                .save(pWriter);


        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 200, "silver");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 100, "silver");
        oreSmelting(pWriter, CORUNDUM_SMELTABLES, RecipeCategory.MISC, ModItems.CORUNDUM_INGOT.get(), 0.25f, 200, "corundum");
        oreBlasting(pWriter, CORUNDUM_SMELTABLES, RecipeCategory.MISC, ModItems.CORUNDUM_INGOT.get(), 0.25f, 100, "corundum");
        oreSmelting(pWriter, ORICHALCUM_SMELTABLES, RecipeCategory.MISC, ModItems.ORICHALCUM_INGOT.get(), 0.25f, 200, "orichalcum");
        oreBlasting(pWriter, ORICHALCUM_SMELTABLES, RecipeCategory.MISC, ModItems.ORICHALCUM_INGOT.get(), 0.25f, 100, "orichalcum");
        oreSmelting(pWriter, MOONSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.MOONSTONE_INGOT.get(), 0.25f, 200, "moonstone");
        oreBlasting(pWriter, MOONSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.MOONSTONE_INGOT.get(), 0.25f, 100, "moonstone");
        oreSmelting(pWriter, MALACHITE_SMELTABLES, RecipeCategory.MISC, ModItems.MALACHITE_INGOT.get(), 0.25f, 200, "malachite");
        oreBlasting(pWriter, MALACHITE_SMELTABLES, RecipeCategory.MISC, ModItems.MALACHITE_INGOT.get(), 0.25f, 100, "malachite");
        oreSmelting(pWriter, EBONY_SMELTABLES, RecipeCategory.MISC, ModItems.EBONY_INGOT.get(), 0.25f, 200, "ebony");
        oreBlasting(pWriter, EBONY_SMELTABLES, RecipeCategory.MISC, ModItems.EBONY_INGOT.get(), 0.25f, 100, "ebony");
        oreSmelting(pWriter, AMETHYST_SMELTABLES, RecipeCategory.MISC, ModItems.AMETHYST.get(), 0.25f, 200, "amethyst");
        oreBlasting(pWriter, AMETHYST_SMELTABLES, RecipeCategory.MISC, ModItems.AMETHYST.get(), 0.25f, 100, "amethyst");
        oreSmelting(pWriter, GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.GARNET.get(), 0.25f, 200, "garnet");
        oreBlasting(pWriter, GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.GARNET.get(), 0.25f, 100, "garnet");
        oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f, 200, "ruby");
        oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f, 100, "ruby");
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");
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
                    .save(pFinishedRecipeConsumer, TalesOfSkyrimMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
