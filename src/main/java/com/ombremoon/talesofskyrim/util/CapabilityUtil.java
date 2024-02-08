package com.ombremoon.talesofskyrim.util;

import com.ombremoon.talesofskyrim.capability.ISkyrimCapability;
import com.ombremoon.talesofskyrim.capability.SkyrimCapabilityProvider;
import com.ombremoon.talesofskyrim.common.init.SpellInit;
import com.ombremoon.talesofskyrim.common.object.custom.spell.AbstractSpell;
import com.ombremoon.talesofskyrim.common.object.custom.spell.SpellInstance;
import com.ombremoon.talesofskyrim.common.object.custom.spell.SpellType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;

public class CapabilityUtil {

    public static SpellType<?> getSpellByName(ResourceLocation resourceLocation) {
        for (RegistryObject<SpellType<?>> registryObject : SpellInit.SPELL_TYPE.getEntries()) {
            if (registryObject.getId().equals(resourceLocation)) {
                return registryObject.get();
            }
        }
        return null;
    }

    public static Map<AbstractSpell, SpellInstance> getActiveSpells(Player player) {
        return SkyrimCapabilityProvider.get(player).getActiveSpells();
    }

    public static CompoundTag storeSpell(SpellType<?> spellType, String tagKey) {
        CompoundTag compoundTag = new CompoundTag();
        return storeSpell(compoundTag, spellType, tagKey);
    }

    public static CompoundTag storeSpell(CompoundTag compoundTag, SpellType<?> spellType, String tagKey) {
        compoundTag.putString(tagKey, spellType.getResourceLocation().toString());
        return compoundTag;
    }

    public static ResourceLocation getSpellId(CompoundTag compoundTag, String tagKey) {
        return ResourceLocation.tryParse(compoundTag.getString(tagKey));
    }
}
