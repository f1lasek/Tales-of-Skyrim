package com.ombremoon.talesofskyrim.datagen.custom;

import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.common.init.item.EquipmentInit;
import com.ombremoon.talesofskyrim.common.object.item.weapon.ModdedWeapon;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class ModWeaponAttributes extends WeaponAttributeProvider<WeaponAttributeBuilder> {
    public ModWeaponAttributes(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, Constants.MOD_ID, ATTRIBUTE_FOLDER, WeaponAttributeBuilder::new, existingFileHelper);
    }

    @Override
    protected void addWeaponAttributes() {
        weaponAttribute(EquipmentInit.STEEL_MACE.get());
    }

    public <T extends Item> WeaponAttributeBuilder weaponAttribute(T item) {
        return weaponAttribute(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item)), ((ModdedWeapon) item).getWeaponType().getWeaponName());
    }

    public WeaponAttributeBuilder weaponAttribute(ResourceLocation resourceLocation, String weaponAttribute) {
        return getBuilder(resourceLocation.toString()).parent(new ModelFile.UncheckedModelFile(new ResourceLocation("bettercombat", weaponAttribute)));
    }

    @Override
    public String getName() {
        return "Weapon Attributes: " + modId;
    }
}
