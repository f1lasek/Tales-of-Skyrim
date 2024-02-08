package com.ombremoon.talesofskyrim.common.object.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Equipable;
import net.minecraft.world.item.Item;

public class ModdedArmor extends Item implements Equipable {
    private final ArmorMaterial armorMaterial;
    private final EquipmentSlot equipmentSlot;

    public ModdedArmor(ArmorMaterial armorMaterial, EquipmentSlot equipmentSlot, Properties properties) {
        super(properties.stacksTo(1));
        this.armorMaterial = armorMaterial;
        this.equipmentSlot = equipmentSlot;
    }

    public ArmorMaterial getArmorMaterial() {
        return this.armorMaterial;
    }

    @Override
    public EquipmentSlot getEquipmentSlot() {
        return this.equipmentSlot;
    }
}