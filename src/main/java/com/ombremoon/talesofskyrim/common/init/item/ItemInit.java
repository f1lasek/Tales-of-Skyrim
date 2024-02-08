package com.ombremoon.talesofskyrim.common.init.item;

import com.ombremoon.talesofskyrim.common.init.entity.StatusEffects;
import com.ombremoon.talesofskyrim.common.object.item.AlchemyIngredientItem;
import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.common.object.item.ModdedArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ItemInit {
    public static final List<RegistryObject<Item>> GENERAL_LIST = new ArrayList<>();
    public static final List<RegistryObject<Item>> POTION_LIST = new ArrayList<>();
    public static final List<RegistryObject<Item>> EQUIPMENT_LIST = new ArrayList<>();
    public static final List<RegistryObject<Item>> FOOD_LIST = new ArrayList<>();
    public static final List<RegistryObject<Item>> MAGIC_LIST = new ArrayList<>();
    public static final List<RegistryObject<Item>> SIMPLE_ITEM_LIST = new ArrayList<>();
    public static final List<RegistryObject<Item>> HANDHELD_LIST = new ArrayList<>();
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static final RegistryObject<Item> EBONY_INGOT = registerSimpleItem("ebony_ingot");
    public static final RegistryObject<Item> STEEL_HELMET = registerArmorPiece("steel_helmet", ArmorMaterialsInit.STEEL, EquipmentSlot.CHEST);
    public static final RegistryObject<Item> DAEDRA_HEART = registerAlchemyIngredient("daedra_heart", StatusEffects.DAMAGE_STAMINA);

    //METALS AND GEMS
    public static final RegistryObject<Item> SILVER_INGOT = registerSimpleItem("silver_ingot");
    public static final RegistryObject<Item> RAW_SILVER = registerSimpleItem("raw_silver");
    public static final RegistryObject<Item> SILVER_NUGGET = registerSimpleItem("silver_nugget");
    public static final RegistryObject<Item> STEEL_INGOT = registerSimpleItem("steel_ingot");
    public static final RegistryObject<Item> STEEL_NUGGET = registerSimpleItem("steel_nugget");
    public static final RegistryObject<Item> MOONSTONE_INGOT = registerSimpleItem("moonstone_ingot");
    public static final RegistryObject<Item> RAW_MOONSTONE = registerSimpleItem("raw_moonstone");
    public static final RegistryObject<Item> MOONSTONE_NUGGET = registerSimpleItem("moonstone_nugget");
    public static final RegistryObject<Item> CORUNDUM_INGOT = registerSimpleItem("corundum_ingot");
    public static final RegistryObject<Item> RAW_CORUNDUM = registerSimpleItem("raw_corundum");
    public static final RegistryObject<Item> CORUNDUM_NUGGET = registerSimpleItem("corundum_nugget");
    public static final RegistryObject<Item> DWARVEN_INGOT = registerSimpleItem("dwarven_ingot");
    public static final RegistryObject<Item> DWARVEN_NUGGET = registerSimpleItem("dwarven_nugget");
    public static final RegistryObject<Item> ORICHALCUM_INGOT = registerSimpleItem("orichalcum_ingot");
    public static final RegistryObject<Item> RAW_ORICHALCUM = registerSimpleItem("raw_orichalcum");
    public static final RegistryObject<Item> ORICHALCUM_NUGGET = registerSimpleItem("orichalcum_nugget");
    public static final RegistryObject<Item> MALACHITE_INGOT = registerSimpleItem("malachite_ingot");
    public static final RegistryObject<Item> RAW_MALACHITE = registerSimpleItem("raw_malachite");
    public static final RegistryObject<Item> MALACHITE_NUGGET = registerSimpleItem("malachite_nugget");
    public static final RegistryObject<Item> RAW_EBONY = registerSimpleItem("raw_ebony");
    public static final RegistryObject<Item> EBONY_NUGGET = registerSimpleItem("ebony_nugget");
    public static final RegistryObject<Item> AMETHYST = registerSimpleItem("amethyst");
    public static final RegistryObject<Item> GARNET = registerSimpleItem("garnet");
    public static final RegistryObject<Item> RUBY = registerSimpleItem("ruby");
    public static final RegistryObject<Item> SAPPHIRE = registerSimpleItem("sapphire");
    public static final RegistryObject<Item> DRAGON_BONE = registerSimpleItem("dragon_bone");
    public static final RegistryObject<Item> DRAGON_SCALES = registerSimpleItem("dragon_scales");

    //ALCHEMY INGREDIENTS
    public static RegistryObject<Item> SPIDER_EGG = registerAlchemyIngredient("spider_egg", StatusEffects.DAMAGE_STAMINA);
    public static RegistryObject<Item> VOID_SALTS = registerAlchemyIngredient("void_salts", StatusEffects.DAMAGE_STAMINA);
    public static RegistryObject<Item> BEE = registerAlchemyIngredient("bee", StatusEffects.DAMAGE_STAMINA);
    public static RegistryObject<Item> BEAR_CLAWS = registerAlchemyIngredient("bear_claws", StatusEffects.DAMAGE_STAMINA);
    public static RegistryObject<Item> FIRE_SALTS = registerAlchemyIngredient("fire_salts", StatusEffects.DAMAGE_STAMINA);
    public static RegistryObject<Item> HUMAN_FLESH = registerAlchemyIngredient("human_flesh", StatusEffects.DAMAGE_STAMINA);
    public static RegistryObject<Item> HUMAN_HEART = registerAlchemyIngredient("human_heart", StatusEffects.DAMAGE_STAMINA);
    public static RegistryObject<Item> SALMON_ROE = registerAlchemyIngredient("salmon_roe", StatusEffects.DAMAGE_STAMINA);
    public static RegistryObject<Item> ECTOPLASM = registerAlchemyIngredient("ectoplasm", StatusEffects.DAMAGE_STAMINA);

    //TABS
    public static final RegistryObject<CreativeModeTab> TAB = registerCreativeModeTab(Constants.MOD_ID, ItemInit.EBONY_INGOT, GENERAL_LIST);
    public static final RegistryObject<CreativeModeTab> SMITHING = registerCreativeModeTab("smithing", ItemInit.STEEL_HELMET, EQUIPMENT_LIST);
    public static final RegistryObject<CreativeModeTab> POTIONS = registerCreativeModeTab("potions_and_ingredients", ItemInit.DAEDRA_HEART, POTION_LIST);
    public static final RegistryObject<CreativeModeTab> FOOD = registerCreativeModeTab("food", ItemInit.STEEL_HELMET, FOOD_LIST);
    public static final RegistryObject<CreativeModeTab> MAGIC = registerCreativeModeTab("magic", ItemInit.STEEL_HELMET, MAGIC_LIST);

    protected static RegistryObject<Item> registerAlchemyIngredient(String name, Supplier<MobEffect> firstEffect) {
        return registerAlchemyIngredient(name, firstEffect, null);
    }

    protected static RegistryObject<Item> registerAlchemyIngredient(String name, Supplier<MobEffect> firstEffect, Supplier<MobEffect> secondEffect) {
        return registerAlchemyIngredient(name, firstEffect, secondEffect, null);
    }

    protected static RegistryObject<Item> registerAlchemyIngredient(String name, Supplier<MobEffect> firstEffect, Supplier<MobEffect> secondEffect, Supplier<MobEffect> thirdEffect) {
        return registerAlchemyIngredient(name, firstEffect, secondEffect, thirdEffect, null);
    }

    protected static RegistryObject<Item> registerAlchemyIngredient(String name, Supplier<MobEffect> firstEffect, Supplier<MobEffect> secondEffect, Supplier<MobEffect> thirdEffect, Supplier<MobEffect> fourthEffect) {
        return registerAlchemyIngredient(name, firstEffect, secondEffect, thirdEffect, fourthEffect, getItemProperties());
    }

    protected static RegistryObject<Item> registerAlchemyIngredient(String name, Supplier<MobEffect> firstEffect, Supplier<MobEffect> secondEffect, Supplier<MobEffect> thirdEffect, Supplier<MobEffect> fourthEffect, Item.Properties properties) {
        RegistryObject<Item> registryObject = registerItem(name, () -> new AlchemyIngredientItem(firstEffect, secondEffect, thirdEffect, fourthEffect, properties));
        POTION_LIST.add(registryObject);
        SIMPLE_ITEM_LIST.add(registryObject);
        return registryObject;
    }

    protected static RegistryObject<Item> registerArmorPiece(String name, ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot) {
        return registerArmorPiece(name, armorMaterial, equipmentSlot, getItemProperties());
    }

    protected static RegistryObject<Item> registerArmorPiece(String name, ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Item.Properties properties) {
        RegistryObject<Item> registryObject = registerItem(name, () -> new ModdedArmor(armorMaterial, equipmentSlot, properties));
        EQUIPMENT_LIST.add(registryObject);
        SIMPLE_ITEM_LIST.add(registryObject);
        return registryObject;
    }

    protected static RegistryObject<Item> registerSimpleItem(String name) {
        return registerSimpleItem(name, getItemProperties());
    }

    protected static RegistryObject<Item> registerSimpleItem(String name, Item.Properties properties) {
        RegistryObject<Item> registryObject = ITEMS.register(name, () -> new Item(properties));
        GENERAL_LIST.add(registryObject);
        SIMPLE_ITEM_LIST.add(registryObject);
        return registryObject;
    }

    protected static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    /**Marked For Testing Purposes*/
    protected static RegistryObject<CreativeModeTab> registerCreativeModeTab(String name, RegistryObject<Item> item, List<RegistryObject<Item>> registryObjects) {
        return CREATIVE_MODE_TABS.register(name, () -> CreativeModeTab.builder()
                .icon(() -> new ItemStack(item.get()))
                .title(Component.translatable("itemGroup." + name + ".tab"))
                .displayItems(
                        (itemDisplayParameters, output) -> {
                            registryObjects.forEach((registryObject) -> output.accept(new ItemStack(registryObject.get())));
                        })
                .build());
    }

    public static Item.Properties getItemProperties() {
        return new Item.Properties();
    }

    public static void register(IEventBus modEventBus) {
        EquipmentInit.init();
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
