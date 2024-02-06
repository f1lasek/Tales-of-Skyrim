package net.f1la.talesofskyrim.item;

import net.f1la.talesofskyrim.TalesOfSkyrimMod;
import net.f1la.talesofskyrim.item.custom.ModArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TalesOfSkyrimMod.MOD_ID);

    public static final RegistryObject<Item> DAEDRA_HEART = ITEMS.register("daedra_heart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BONE = ITEMS.register("dragon_bone",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> DRAGON_SCALES = ITEMS.register("dragon_scales",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_INGOT = ITEMS.register("moonstone_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MOONSTONE = ITEMS.register("raw_moonstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_NUGGET = ITEMS.register("moonstone_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORUNDUM_INGOT = ITEMS.register("corundum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CORUNDUM = ITEMS.register("raw_corundum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORUNDUM_NUGGET = ITEMS.register("corundum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DWARVEN_INGOT = ITEMS.register("dwarven_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DWARVEN_NUGGET = ITEMS.register("dwarven_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_NUGGET = ITEMS.register("orichalcum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE_INGOT = ITEMS.register("malachite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MALACHITE = ITEMS.register("raw_malachite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE_NUGGET = ITEMS.register("malachite_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EBONY_INGOT = ITEMS.register("ebony_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_EBONY = ITEMS.register("raw_ebony",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EBONY_NUGGET = ITEMS.register("ebony_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET = ITEMS.register("garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_HELMET = ITEMS.register("moonstone_helmet",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_CHESTPLATE = ITEMS.register("moonstone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_LEGGINGS = ITEMS.register("moonstone_leggings",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_BOOTS = ITEMS.register("moonstone_boots",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_HELMET = ITEMS.register("dwarven_helmet",
            () -> new ArmorItem(ModArmorMaterials.DWARVEN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_CHESTPLATE = ITEMS.register("dwarven_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DWARVEN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_LEGGINGS = ITEMS.register("dwarven_leggings",
            () -> new ArmorItem(ModArmorMaterials.DWARVEN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_BOOTS = ITEMS.register("dwarven_boots",
            () -> new ArmorItem(ModArmorMaterials.DWARVEN, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_HELMET = ITEMS.register("orichalcum_helmet",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_CHESTPLATE = ITEMS.register("orichalcum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_LEGGINGS = ITEMS.register("orichalcum_leggings",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_BOOTS = ITEMS.register("orichalcum_boots",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_HELMET = ITEMS.register("malachite_helmet",
            () -> new ArmorItem(ModArmorMaterials.MALACHITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_CHESTPLATE = ITEMS.register("malachite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MALACHITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_LEGGINGS = ITEMS.register("malachite_leggings",
            () -> new ArmorItem(ModArmorMaterials.MALACHITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_BOOTS = ITEMS.register("malachite_boots",
            () -> new ArmorItem(ModArmorMaterials.MALACHITE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_HELMET = ITEMS.register("ebony_helmet",
            () -> new ModArmorItem(ModArmorMaterials.EBONY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_CHESTPLATE = ITEMS.register("ebony_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.EBONY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_LEGGINGS = ITEMS.register("ebony_leggings",
            () -> new ModArmorItem(ModArmorMaterials.EBONY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_BOOTS = ITEMS.register("ebony_boots",
            () -> new ModArmorItem(ModArmorMaterials.EBONY, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_HELMET = ITEMS.register("daedric_helmet",
            () -> new ArmorItem(ModArmorMaterials.DAEDRIC, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_CHESTPLATE = ITEMS.register("daedric_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DAEDRIC, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_LEGGINGS = ITEMS.register("daedric_leggings",
            () -> new ArmorItem(ModArmorMaterials.DAEDRIC, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_BOOTS = ITEMS.register("daedric_boots",
            () -> new ArmorItem(ModArmorMaterials.DAEDRIC, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_HELMET = ITEMS.register("dragon_helmet",
            () -> new ArmorItem(ModArmorMaterials.DRAGONBONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_CHESTPLATE = ITEMS.register("dragon_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DRAGONBONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_LEGGINGS = ITEMS.register("dragon_leggings",
            () -> new ArmorItem(ModArmorMaterials.DRAGONBONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_BOOTS = ITEMS.register("dragon_boots",
            () -> new ArmorItem(ModArmorMaterials.DRAGONBONE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item>    STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    STEEL_AXE = ITEMS.register("steel_axe",
            () -> new SwordItem(ModToolTiers.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    STEEL_DAGGER = ITEMS.register("steel_dagger",
            () -> new SwordItem(ModToolTiers.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    STEEL_MACE = ITEMS.register("steel_mace",
            () -> new SwordItem(ModToolTiers.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModToolTiers.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    SILVER_AXE = ITEMS.register("silver_axe",
            () -> new SwordItem(ModToolTiers.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModToolTiers.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(ModToolTiers.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    SILVER_DAGGER = ITEMS.register("silver_dagger",
            () -> new SwordItem(ModToolTiers.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    SILVER_MACE = ITEMS.register("silver_mace",
            () -> new SwordItem(ModToolTiers.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_SHOVEL = ITEMS.register("moonstone_shovel",
            () -> new ShovelItem(ModToolTiers.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_PICKAXE = ITEMS.register("moonstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_AXE = ITEMS.register("moonstone_axe",
            () -> new SwordItem(ModToolTiers.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_HOE = ITEMS.register("moonstone_hoe",
            () -> new HoeItem(ModToolTiers.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_SWORD = ITEMS.register("moonstone_sword",
            () -> new SwordItem(ModToolTiers.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_DAGGER = ITEMS.register("moonstone_dagger",
            () -> new SwordItem(ModToolTiers.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MOONSTONE_MACE = ITEMS.register("moonstone_mace",
            () -> new SwordItem(ModToolTiers.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_SHOVEL = ITEMS.register("dwarven_shovel",
            () -> new ShovelItem(ModToolTiers.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_PICKAXE = ITEMS.register("dwarven_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_AXE = ITEMS.register("dwarven_axe",
            () -> new SwordItem(ModToolTiers.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_HOE = ITEMS.register("dwarven_hoe",
            () -> new HoeItem(ModToolTiers.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_SWORD = ITEMS.register("dwarven_sword",
            () -> new SwordItem(ModToolTiers.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_DAGGER = ITEMS.register("dwarven_dagger",
            () -> new SwordItem(ModToolTiers.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DWARVEN_MACE = ITEMS.register("dwarven_mace",
            () -> new SwordItem(ModToolTiers.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel",
            () -> new ShovelItem(ModToolTiers.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_AXE = ITEMS.register("orichalcum_axe",
            () -> new SwordItem(ModToolTiers.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_HOE = ITEMS.register("orichalcum_hoe",
            () -> new HoeItem(ModToolTiers.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword",
            () -> new SwordItem(ModToolTiers.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_DAGGER = ITEMS.register("orichalcum_dagger",
            () -> new SwordItem(ModToolTiers.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    ORICHALCUM_MACE = ITEMS.register("orichalcum_mace",
            () -> new SwordItem(ModToolTiers.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_SHOVEL = ITEMS.register("malachite_shovel",
            () -> new ShovelItem(ModToolTiers.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_PICKAXE = ITEMS.register("malachite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_AXE = ITEMS.register("malachite_axe",
            () -> new SwordItem(ModToolTiers.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_HOE = ITEMS.register("malachite_hoe",
            () -> new HoeItem(ModToolTiers.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_SWORD = ITEMS.register("malachite_sword",
            () -> new SwordItem(ModToolTiers.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_DAGGER = ITEMS.register("malachite_dagger",
            () -> new SwordItem(ModToolTiers.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    MALACHITE_MACE = ITEMS.register("malachite_mace",
            () -> new SwordItem(ModToolTiers.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_SHOVEL = ITEMS.register("ebony_shovel",
            () -> new ShovelItem(ModToolTiers.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_PICKAXE = ITEMS.register("ebony_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_AXE = ITEMS.register("ebony_axe",
            () -> new SwordItem(ModToolTiers.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_HOE = ITEMS.register("ebony_hoe",
            () -> new HoeItem(ModToolTiers.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_SWORD = ITEMS.register("ebony_sword",
            () -> new SwordItem(ModToolTiers.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_DAGGER = ITEMS.register("ebony_dagger",
            () -> new SwordItem(ModToolTiers.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    EBONY_MACE = ITEMS.register("ebony_mace",
            () -> new SwordItem(ModToolTiers.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_SHOVEL = ITEMS.register("daedric_shovel",
            () -> new ShovelItem(ModToolTiers.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_PICKAXE = ITEMS.register("daedric_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_AXE = ITEMS.register("daedric_axe",
            () -> new SwordItem(ModToolTiers.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_HOE = ITEMS.register("daedric_hoe",
            () -> new HoeItem(ModToolTiers.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_SWORD = ITEMS.register("daedric_sword",
            () -> new SwordItem(ModToolTiers.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_DAGGER = ITEMS.register("daedric_dagger",
            () -> new SwordItem(ModToolTiers.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DAEDRIC_MACE = ITEMS.register("daedric_mace",
            () -> new SwordItem(ModToolTiers.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_SHOVEL = ITEMS.register("dragon_shovel",
            () -> new ShovelItem(ModToolTiers.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_PICKAXE = ITEMS.register("dragon_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_AXE = ITEMS.register("dragon_axe",
            () -> new SwordItem(ModToolTiers.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_HOE = ITEMS.register("dragon_hoe",
            () -> new HoeItem(ModToolTiers.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_SWORD = ITEMS.register("dragon_sword",
            () -> new SwordItem(ModToolTiers.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_DAGGER = ITEMS.register("dragon_dagger",
            () -> new SwordItem(ModToolTiers.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item>    DRAGON_MACE = ITEMS.register("dragon_mace",
            () -> new SwordItem(ModToolTiers.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOW = ITEMS.register("steel_bow",
            () -> new BowItem(new Item.Properties().durability(2034)));
    public static final RegistryObject<Item> SILVER_BOW = ITEMS.register("silver_bow",
            () -> new BowItem(new Item.Properties().durability(2034)));
    public static final RegistryObject<Item> MOONSTONE_BOW = ITEMS.register("moonstone_bow",
            () -> new BowItem(new Item.Properties().durability(2034)));
    public static final RegistryObject<Item> DWARVEN_BOW = ITEMS.register("dwarven_bow",
            () -> new BowItem(new Item.Properties().durability(2034)));
    public static final RegistryObject<Item> ORICHALCUM_BOW = ITEMS.register("orichalcum_bow",
            () -> new BowItem(new Item.Properties().durability(2034)));
    public static final RegistryObject<Item> MALACHITE_BOW = ITEMS.register("malachite_bow",
            () -> new BowItem(new Item.Properties().durability(2034)));
    public static final RegistryObject<Item> EBONY_BOW = ITEMS.register("ebony_bow",
            () -> new BowItem(new Item.Properties().durability(2034)));
    public static final RegistryObject<Item> DAEDRIC_BOW = ITEMS.register("daedric_bow",
            () -> new BowItem(new Item.Properties().durability(2034)));
    public static final RegistryObject<Item> DRAGON_BOW = ITEMS.register("dragon_bow",
            () -> new BowItem(new Item.Properties().durability(2034)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
