package com.ombremoon.talesofskyrim.datagen;

import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.common.init.entity.AddItemModifier;
import com.ombremoon.talesofskyrim.common.init.item.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.IntRange;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition;
import net.minecraft.world.level.storage.loot.predicates.ValueCheckCondition;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void start() {
        addToEntitiesLootTable("spider_egg_from_spider", EntityType.SPIDER, EntityType.CAVE_SPIDER, ItemInit.SPIDER_EGG.get());
        addToEntityLootTable("bee_from_bee", EntityType.BEE, ItemInit.BEE.get());
        addToEntitiesLootTable("bear_claws_from_bear", EntityType.POLAR_BEAR, EntityType.PANDA, ItemInit.BEAR_CLAWS.get());
        addToEntityLootTable("ectoplasm_from_ghast", EntityType.GHAST, ItemInit.ECTOPLASM.get());
        addToEntitiesLootTable("flesh_and_heart_from_npc", EntityType.VILLAGER, EntityType.WANDERING_TRADER, 0.01F, ItemInit.HUMAN_FLESH.get(), ItemInit.HUMAN_HEART.get());
        addToEntityLootTable("void_salts_from_enderman", EntityType.ENDERMAN, 0.5F, 1, ItemInit.VOID_SALTS.get());
    }

    protected void addToEntitiesLootTable(String modifierName, EntityType<?> firstEntityType, EntityType<?> secondEntityType, Item item) {
        add(modifierName, new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(firstEntityType.getDefaultLootTable())
                        .or(new LootTableIdCondition.Builder(secondEntityType.getDefaultLootTable())).build()
        }, item));
    }

    protected void addToEntityLootTableUniformly(String modifierName, EntityType<?> entityType, NumberProvider numberProvider, IntRange intRange, Item item) {
        add(modifierName, new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(entityType.getDefaultLootTable()).build(),
                ValueCheckCondition.hasValue(numberProvider, intRange).build()
        }, item));
    }

    protected void addToEntityLootTable(String modifierName, EntityType<?> entityType, Item item) {
        add(modifierName, new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(entityType.getDefaultLootTable()).build()
        }, item));
    }

    protected void addToEntitiesLootTable(String modifierName, EntityType<?> firstEntityType, EntityType<?> secondEntityType, float dropChance, Item firstItem, Item secondItem) {
        addToEntitiesLootTable(modifierName, firstEntityType, secondEntityType, dropChance, dropChance, firstItem, secondItem);
    }

    protected void addToEntitiesLootTable(String modifierName, EntityType<?> firstEntityType, EntityType<?> secondEntityType, float firstDropChance, float secondDropChance, Item firstItem, Item secondItem) {
        add(modifierName, new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(firstEntityType.getDefaultLootTable())
                        .or(new LootTableIdCondition.Builder(secondEntityType.getDefaultLootTable())).build(),
                LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(firstDropChance, 0.25F).build()
        }, firstItem));
        add(modifierName, new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(firstEntityType.getDefaultLootTable())
                        .or(new LootTableIdCondition.Builder(secondEntityType.getDefaultLootTable())).build(),
                LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(secondDropChance, 0.25F).build()
        }, secondItem));
    }

    protected void addToEntityLootTable(String modifierName, EntityType<?> entityType, float dropChance, float lootMultiplier, Item item) {
        add(modifierName, new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(entityType.getDefaultLootTable()).build(),
                LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(dropChance, lootMultiplier).build()
        }, item));
    }
}
