package com.ombremoon.talesofskyrim.capability;

import com.ombremoon.talesofskyrim.common.object.custom.perk.AbstractPerk;
import com.ombremoon.talesofskyrim.common.object.custom.spell.AbstractSpell;
import com.ombremoon.talesofskyrim.common.object.custom.spell.SpellInstance;
import com.ombremoon.talesofskyrim.common.object.custom.spell.SpellType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.common.capabilities.AutoRegisterCapability;
import net.minecraftforge.common.util.INBTSerializable;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

@AutoRegisterCapability
public interface ISkyrimCapability extends INBTSerializable<CompoundTag> {
    void updateSpellSet(SpellType<?> grimoireAbility);

    LinkedHashSet<SpellType<?>> getSpellSet();

    Map<AbstractSpell, SpellInstance> getActiveSpells();

    @Nullable
    SpellType<?> getRightHandSpell();

    @Nullable
    SpellType<?> getLeftHandSpell();

    void setRightHandSpell(SpellType<?> spellType);

    void setLeftHandSpell(SpellType<?> spellType);

    List<AbstractPerk> getPerks();

    boolean acquirePerk(AbstractPerk perk);

    int getPerkPoints();

    void setPerkPoints(int perkPoints);

    void addPerkPoints(int perkPoints);

    boolean canRespecPoints();

    void setRespecPoints(boolean canRespec);

    void respecPoints(ServerPlayer player);

    int increaseMana(int inc, boolean sim);

    int decreaseMana(int dec, boolean sim);

    void setMana(int energy);

    int getMana();

    int getManaCapacity();

    int setManaCapacity(int manaCapacity);
}
