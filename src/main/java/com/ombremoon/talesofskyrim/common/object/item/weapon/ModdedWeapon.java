package com.ombremoon.talesofskyrim.common.object.item.weapon;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;

public class ModdedWeapon extends TieredItem {
    private final WeaponType weaponType;

    public ModdedWeapon(WeaponType weaponType, int attackDamage, int attackSpeed, Tier pTier, Properties pProperties) {
        super(pTier, pProperties);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return this.weaponType;
    }

    public enum WeaponType {
        SWORD("sword"),
        DAGGER("dagger"),
        MACE("mace"),
        BOW("bow");

        private final String weaponName;

        WeaponType(String weaponName) {
            this.weaponName = weaponName;
        }

        public String getWeaponName() {
            return this.weaponName;
        }
    }
}
