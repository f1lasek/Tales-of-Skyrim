package com.ombremoon.talesofskyrim.common.init.item;

import com.ombremoon.talesofskyrim.common.object.item.weapon.ModdedWeapon;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.RegistryObject;

public class EquipmentInit extends ItemInit {
    public static void init() {}

    //SWORDS
    public static final RegistryObject<Item> STEEL_SWORD = registerSwordWeapon("steel_sword", ToolTiersInit.STEEL, 1, 1);
    public static final RegistryObject<Item> SILVER_SWORD = registerSwordWeapon("silver_sword", ToolTiersInit.SILVER, 1, 1);
    public static final RegistryObject<Item> MOONSTONE_SWORD = registerSwordWeapon("moonstone_sword", ToolTiersInit.MOONSTONE, 1, 1);
    public static final RegistryObject<Item> DWARVEN_SWORD = registerSwordWeapon("dwarven_sword", ToolTiersInit.DWARVEN, 1, 1);
    public static final RegistryObject<Item> ORICHALCUM_SWORD = registerSwordWeapon("orichalcum_sword", ToolTiersInit.ORICHALCUM, 1, 1);
    public static final RegistryObject<Item> MALACHITE_SWORD = registerSwordWeapon("malachite_sword", ToolTiersInit.MALACHITE, 1, 1);
    public static final RegistryObject<Item> EBONY_SWORD = registerSwordWeapon("ebony_sword", ToolTiersInit.EBONY, 1, 1);
    public static final RegistryObject<Item> DAEDRIC_SWORD = registerSwordWeapon("daedric_sword", ToolTiersInit.DAEDRIC, 1, 1);
    public static final RegistryObject<Item> DRAGON_SWORD = registerSwordWeapon("dragon_sword", ToolTiersInit.DRAGON, 1, 1);

    //DAGGERS
    public static final RegistryObject<Item> STEEL_DAGGER = registerDaggerWeapon("steel_dagger", ToolTiersInit.STEEL, 1, 1);
    public static final RegistryObject<Item> SILVER_DAGGER = registerDaggerWeapon("silver_dagger", ToolTiersInit.SILVER, 1, 1);
    public static final RegistryObject<Item> MOONSTONE_DAGGER = registerDaggerWeapon("moonstone_dagger", ToolTiersInit.MOONSTONE, 1, 1);
    public static final RegistryObject<Item> DWARVEN_DAGGER = registerDaggerWeapon("dwarven_dagger", ToolTiersInit.DWARVEN, 1, 1);
    public static final RegistryObject<Item> ORICHALCUM_DAGGER = registerDaggerWeapon("orichalcum_dagger", ToolTiersInit.ORICHALCUM, 1, 1);
    public static final RegistryObject<Item> MALACHITE_DAGGER = registerDaggerWeapon("malachite_dagger", ToolTiersInit.MALACHITE, 1, 1);
    public static final RegistryObject<Item> EBONY_DAGGER = registerDaggerWeapon("ebony_dagger", ToolTiersInit.EBONY, 1, 1);
    public static final RegistryObject<Item> DAEDRIC_DAGGER = registerDaggerWeapon("daedric_dagger", ToolTiersInit.DAEDRIC, 1, 1);
    public static final RegistryObject<Item> DRAGON_DAGGER = registerDaggerWeapon("dragon_dagger", ToolTiersInit.DRAGON, 1, 1);

    //MACES
    public static final RegistryObject<Item> STEEL_MACE = registerMaceWeapon("steel_mace", ToolTiersInit.STEEL, 5, 5);
    public static final RegistryObject<Item> SILVER_MACE = registerMaceWeapon("silver_mace", ToolTiersInit.SILVER, 1, 1);
    public static final RegistryObject<Item> MOONSTONE_MACE = registerMaceWeapon("moonstone_mace", ToolTiersInit.MOONSTONE, 1, 1);
    public static final RegistryObject<Item> DWARVEN_MACE = registerMaceWeapon("dwarven_mace", ToolTiersInit.DWARVEN, 1, 1);
    public static final RegistryObject<Item> ORICHALCUM_MACE = registerMaceWeapon("orichalcum_mace", ToolTiersInit.ORICHALCUM, 1, 1);
    public static final RegistryObject<Item> MALACHITE_MACE = registerMaceWeapon("malachite_mace", ToolTiersInit.MALACHITE, 1, 1);
    public static final RegistryObject<Item> EBONY_MACE = registerMaceWeapon("ebony_mace", ToolTiersInit.EBONY, 1, 1);
    public static final RegistryObject<Item> DAEDRIC_MACE = registerMaceWeapon("daedric_mace", ToolTiersInit.DAEDRIC, 1, 1);
    public static final RegistryObject<Item> DRAGON_MACE = registerMaceWeapon("dragon_mace", ToolTiersInit.DRAGON, 1, 1);

    //BOWS
    public static final RegistryObject<Item> STEEL_BOW = registerBowWeapon("steel_bow",2034);
    public static final RegistryObject<Item> SILVER_BOW = registerBowWeapon("silver_bow",2034);
    public static final RegistryObject<Item> MOONSTONE_BOW = registerBowWeapon("moonstone_bow", 2034);
    public static final RegistryObject<Item> DWARVEN_BOW = registerBowWeapon("dwarven_bow", 2034);
    public static final RegistryObject<Item> ORICHALCUM_BOW = registerBowWeapon("orichalcum_bow", 2034);
    public static final RegistryObject<Item> MALACHITE_BOW = registerBowWeapon("malachite_bow", 2034);
    public static final RegistryObject<Item> EBONY_BOW = registerBowWeapon("ebony_bow", 2034);
    public static final RegistryObject<Item> DAEDRIC_BOW = registerBowWeapon("daedric_bow", 2034);
    public static final RegistryObject<Item> DRAGON_BOW = registerBowWeapon("dragon_bow", 2034);

    //ARMOR SETS
    public static final RegistryObject<Item> STEEL_CHESTPLATE = registerArmorPiece("steel_chestplate", ArmorMaterialsInit.STEEL, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> STEEL_LEGGINGS = registerArmorPiece("steel_leggings", ArmorMaterialsInit.STEEL, EquipmentSlot.LEGS);
    public static final RegistryObject<Item> STEEL_BOOTS = registerArmorPiece("steel_boots", ArmorMaterialsInit.STEEL, EquipmentSlot.FEET);
    public static final RegistryObject<Item> SILVER_HELMET = registerArmorPiece("silver_helmet", ArmorMaterialsInit.SILVER, EquipmentSlot.HEAD);
    public static final RegistryObject<Item> SILVER_CHESTPLATE = registerArmorPiece("silver_chestplate", ArmorMaterialsInit.SILVER, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> SILVER_LEGGINGS = registerArmorPiece("silver_leggings", ArmorMaterialsInit.SILVER, EquipmentSlot.LEGS);
    public static final RegistryObject<Item> SILVER_BOOTS = registerArmorPiece("silver_boots", ArmorMaterialsInit.SILVER, EquipmentSlot.FEET);
    public static final RegistryObject<Item> MOONSTONE_HELMET = registerArmorPiece("moonstone_helmet", ArmorMaterialsInit.MOONSTONE, EquipmentSlot.HEAD);
    public static final RegistryObject<Item> MOONSTONE_CHESTPLATE = registerArmorPiece("moonstone_chestplate", ArmorMaterialsInit.MOONSTONE, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> MOONSTONE_LEGGINGS = registerArmorPiece("moonstone_leggings", ArmorMaterialsInit.MOONSTONE, EquipmentSlot.LEGS);
    public static final RegistryObject<Item> MOONSTONE_BOOTS = registerArmorPiece("moonstone_boots", ArmorMaterialsInit.MOONSTONE, EquipmentSlot.FEET);
    public static final RegistryObject<Item> DWARVEN_HELMET = registerArmorPiece("dwarven_helmet", ArmorMaterialsInit.DWARVEN, EquipmentSlot.HEAD);
    public static final RegistryObject<Item> DWARVEN_CHESTPLATE = registerArmorPiece("dwarven_chestplate", ArmorMaterialsInit.DWARVEN, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> DWARVEN_LEGGINGS = registerArmorPiece("dwarven_leggings", ArmorMaterialsInit.DWARVEN, EquipmentSlot.LEGS);
    public static final RegistryObject<Item> DWARVEN_BOOTS = registerArmorPiece("dwarven_boots", ArmorMaterialsInit.DWARVEN, EquipmentSlot.FEET);
    public static final RegistryObject<Item> ORICHALCUM_HELMET = registerArmorPiece("orichalcum_helmet", ArmorMaterialsInit.ORICHALCUM, EquipmentSlot.HEAD);
    public static final RegistryObject<Item> ORICHALCUM_CHESTPLATE = registerArmorPiece("orichalcum_chestplate", ArmorMaterialsInit.ORICHALCUM, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> ORICHALCUM_LEGGINGS = registerArmorPiece("orichalcum_leggings", ArmorMaterialsInit.ORICHALCUM, EquipmentSlot.LEGS);
    public static final RegistryObject<Item> ORICHALCUM_BOOTS = registerArmorPiece("orichalcum_boots", ArmorMaterialsInit.ORICHALCUM, EquipmentSlot.FEET);
    public static final RegistryObject<Item> MALACHITE_HELMET = registerArmorPiece("malachite_helmet", ArmorMaterialsInit.MALACHITE, EquipmentSlot.HEAD);
    public static final RegistryObject<Item> MALACHITE_CHESTPLATE = registerArmorPiece("malachite_chestplate", ArmorMaterialsInit.MALACHITE, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> MALACHITE_LEGGINGS = registerArmorPiece("malachite_leggings", ArmorMaterialsInit.MALACHITE, EquipmentSlot.LEGS);
    public static final RegistryObject<Item> MALACHITE_BOOTS = registerArmorPiece("malachite_boots", ArmorMaterialsInit.MALACHITE, EquipmentSlot.FEET);
    public static final RegistryObject<Item> EBONY_HELMET = registerArmorPiece("ebony_helmet", ArmorMaterialsInit.EBONY, EquipmentSlot.HEAD);
    public static final RegistryObject<Item> EBONY_CHESTPLATE = registerArmorPiece("ebony_chestplate", ArmorMaterialsInit.EBONY, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> EBONY_LEGGINGS = registerArmorPiece("ebony_leggings", ArmorMaterialsInit.EBONY, EquipmentSlot.LEGS);
    public static final RegistryObject<Item> EBONY_BOOTS = registerArmorPiece("ebony_boots", ArmorMaterialsInit.EBONY, EquipmentSlot.FEET);
    public static final RegistryObject<Item> DAEDRIC_HELMET = registerArmorPiece("daedric_helmet", ArmorMaterialsInit.DAEDRIC, EquipmentSlot.HEAD);
    public static final RegistryObject<Item> DAEDRIC_CHESTPLATE = registerArmorPiece("daedric_chestplate", ArmorMaterialsInit.DAEDRIC, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> DAEDRIC_LEGGINGS = registerArmorPiece("daedric_leggings", ArmorMaterialsInit.DAEDRIC, EquipmentSlot.LEGS);
    public static final RegistryObject<Item> DAEDRIC_BOOTS = registerArmorPiece("daedric_boots", ArmorMaterialsInit.DAEDRIC, EquipmentSlot.FEET);
    public static final RegistryObject<Item> DRAGON_HELMET = registerArmorPiece("dragon_helmet", ArmorMaterialsInit.DRAGONBONE, EquipmentSlot.HEAD);
    public static final RegistryObject<Item> DRAGON_CHESTPLATE = registerArmorPiece("dragon_chestplate", ArmorMaterialsInit.DRAGONBONE, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> DRAGON_LEGGINGS = registerArmorPiece("dragon_leggings", ArmorMaterialsInit.DRAGONBONE, EquipmentSlot.LEGS);
    public static final RegistryObject<Item> DRAGON_BOOTS = registerArmorPiece("dragon_boots", ArmorMaterialsInit.DRAGONBONE, EquipmentSlot.FEET);

   //TOOL SETS
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ToolTiersInit.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ToolTiersInit.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new SwordItem(ToolTiersInit.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ToolTiersInit.STEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ToolTiersInit.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ToolTiersInit.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new SwordItem(ToolTiersInit.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ToolTiersInit.SILVER, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_SHOVEL = ITEMS.register("moonstone_shovel",
            () -> new ShovelItem(ToolTiersInit.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_PICKAXE = ITEMS.register("moonstone_pickaxe",
            () -> new PickaxeItem(ToolTiersInit.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_AXE = ITEMS.register("moonstone_axe",
            () -> new SwordItem(ToolTiersInit.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_HOE = ITEMS.register("moonstone_hoe",
            () -> new HoeItem(ToolTiersInit.MOONSTONE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DWARVEN_SHOVEL = ITEMS.register("dwarven_shovel",
            () -> new ShovelItem(ToolTiersInit.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DWARVEN_PICKAXE = ITEMS.register("dwarven_pickaxe",
            () -> new PickaxeItem(ToolTiersInit.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DWARVEN_AXE = ITEMS.register("dwarven_axe",
            () -> new SwordItem(ToolTiersInit.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DWARVEN_HOE = ITEMS.register("dwarven_hoe",
            () -> new HoeItem(ToolTiersInit.DWARVEN, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel",
            () -> new ShovelItem(ToolTiersInit.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe",
            () -> new PickaxeItem(ToolTiersInit.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_AXE = ITEMS.register("orichalcum_axe",
            () -> new SwordItem(ToolTiersInit.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_HOE = ITEMS.register("orichalcum_hoe",
            () -> new HoeItem(ToolTiersInit.ORICHALCUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE_SHOVEL = ITEMS.register("malachite_shovel",
            () -> new ShovelItem(ToolTiersInit.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE_PICKAXE = ITEMS.register("malachite_pickaxe",
            () -> new PickaxeItem(ToolTiersInit.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE_AXE = ITEMS.register("malachite_axe",
            () -> new SwordItem(ToolTiersInit.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE_HOE = ITEMS.register("malachite_hoe",
            () -> new HoeItem(ToolTiersInit.MALACHITE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EBONY_SHOVEL = ITEMS.register("ebony_shovel",
            () -> new ShovelItem(ToolTiersInit.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EBONY_PICKAXE = ITEMS.register("ebony_pickaxe",
            () -> new PickaxeItem(ToolTiersInit.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EBONY_AXE = ITEMS.register("ebony_axe",
            () -> new SwordItem(ToolTiersInit.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> EBONY_HOE = ITEMS.register("ebony_hoe",
            () -> new HoeItem(ToolTiersInit.EBONY, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DAEDRIC_SHOVEL = ITEMS.register("daedric_shovel",
            () -> new ShovelItem(ToolTiersInit.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DAEDRIC_PICKAXE = ITEMS.register("daedric_pickaxe",
            () -> new PickaxeItem(ToolTiersInit.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DAEDRIC_AXE = ITEMS.register("daedric_axe",
            () -> new SwordItem(ToolTiersInit.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DAEDRIC_HOE = ITEMS.register("daedric_hoe",
            () -> new HoeItem(ToolTiersInit.DAEDRIC, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SHOVEL = ITEMS.register("dragon_shovel",
            () -> new ShovelItem(ToolTiersInit.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_PICKAXE = ITEMS.register("dragon_pickaxe",
            () -> new PickaxeItem(ToolTiersInit.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_AXE = ITEMS.register("dragon_axe",
            () -> new SwordItem(ToolTiersInit.DRAGON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_HOE = ITEMS.register("dragon_hoe",
            () -> new HoeItem(ToolTiersInit.DRAGON, 1, 1, new Item.Properties()));

    private static RegistryObject<Item> registerBowWeapon(String name, int maxDamage) {
        return registerItem(name, () -> new BowItem(getItemProperties().durability(maxDamage)));
    }

    private static RegistryObject<Item> registerSwordWeapon(String name, Tier tier, int attackDamage, int attackSpeed) {
        return registerWeaponItem(name, ModdedWeapon.WeaponType.SWORD, tier, attackDamage, attackSpeed);
    }

    private static RegistryObject<Item> registerDaggerWeapon(String name, Tier tier, int attackDamage, int attackSpeed) {
        return registerWeaponItem(name, ModdedWeapon.WeaponType.DAGGER, tier, attackDamage, attackSpeed);
    }

    private static RegistryObject<Item> registerMaceWeapon(String name, Tier tier, int attackDamage, int attackSpeed) {
        return registerWeaponItem(name, ModdedWeapon.WeaponType.MACE, tier, attackDamage, attackSpeed);
    }

    private static RegistryObject<Item> registerWeaponItem(String name, ModdedWeapon.WeaponType weaponType, Tier tier, int attackDamage, int attackSpeed) {
        RegistryObject<Item> registryObject = registerItem(name, () -> new ModdedWeapon(weaponType, attackDamage, attackSpeed, tier, getItemProperties()));
        EQUIPMENT_LIST.add(registryObject);
        HANDHELD_LIST.add(registryObject);
        return registryObject;
    }

}
