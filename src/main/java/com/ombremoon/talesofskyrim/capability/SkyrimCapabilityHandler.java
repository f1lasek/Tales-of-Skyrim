package com.ombremoon.talesofskyrim.capability;

import com.ombremoon.talesofskyrim.common.object.custom.perk.AbstractPerk;
import com.ombremoon.talesofskyrim.common.object.custom.spell.AbstractSpell;
import com.ombremoon.talesofskyrim.common.object.custom.spell.SpellInstance;
import com.ombremoon.talesofskyrim.common.object.custom.spell.SpellType;
import com.ombremoon.talesofskyrim.util.CapabilityUtil;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class SkyrimCapabilityHandler implements ISkyrimCapability {
    private final LinkedHashSet<SpellType<?>> spellSet = new LinkedHashSet<>();
    private final List<AbstractPerk> activePerks = new ArrayList<>();
    private SpellType<?> rightHandSpell;
    private SpellType<?> leftHandSpell;
    private int perkPoints;
    private boolean respecPoints;
    private int currentMana;
    private int manaCapacity;
    private boolean inCombatMode;
    private final Map<AbstractSpell, SpellInstance> activeSpells = new HashMap<>();
    private static final String NBT_SPELLS_KEY = "spells";
    private static final String NBT_COMBAT_KEY = "combat";
    private static final String NBT_MANA_KEY = "mana";
    private static final String NBT_RIGHT_KEY = "right";
    private static final String NBT_LEFT_KEY = "left";

    public SkyrimCapabilityHandler(int manaCapacity) {
        this(manaCapacity, 0);
    }

    public SkyrimCapabilityHandler(int manaCapacity, int currentMana) {
        this.manaCapacity = manaCapacity;
        this.currentMana = Mth.clamp(currentMana, 0, manaCapacity);
    }

    @Override
    public void updateSpellSet(SpellType<?> spellType) {
        this.spellSet.add(spellType);
    }

    @Override
    public LinkedHashSet<SpellType<?>> getSpellSet() {
        return this.spellSet;
    }

    @Override
    public Map<AbstractSpell, SpellInstance> getActiveSpells() {
        return this.activeSpells;
    }

    @Override
    @Nullable
    public SpellType<?> getRightHandSpell() {
        return this.rightHandSpell;
    }

    @Override
    @Nullable
    public SpellType<?> getLeftHandSpell() {
        return this.leftHandSpell;
    }

    @Override
    public void setRightHandSpell(SpellType<?> rightHandSpell) {
        this.rightHandSpell = rightHandSpell;
    }

    @Override
    public void setLeftHandSpell(SpellType<?> leftHandSpell) {
        this.leftHandSpell = leftHandSpell;
    }

    @Override
    public List<AbstractPerk> getPerks() {
        return this.activePerks;
    }

    @Override
    public boolean acquirePerk(AbstractPerk perk) {
        if (perkPoints == 0) return false;
        if (activePerks.contains(perk)) return false;
        perkPoints--;
        return activePerks.add(perk);
    }

    @Override
    public int getPerkPoints() {
        return this.perkPoints;
    }

    @Override
    public void setPerkPoints(int perkPoints) {
        this.perkPoints = perkPoints;
    }

    @Override
    public void addPerkPoints(int perkPoints) {
        this.perkPoints += perkPoints;
    }

    @Override
    public boolean canRespecPoints() {
        return this.respecPoints;
    }

    @Override
    public void setRespecPoints(boolean canRespec) {
        this.respecPoints = canRespec;
    }

    @Override
    public void respecPoints(ServerPlayer player) {
        this.perkPoints += this.activePerks.size();
        this.activePerks.clear();
    }

    @Override
    public int increaseMana(int inc, boolean sim) {
        int manaIncreased = Math.min(manaCapacity - currentMana, inc);
        if (!sim)
            currentMana += manaIncreased;
        return manaIncreased;
    }

    @Override
    public int decreaseMana(int dec, boolean sim) {
        int manaDecreased = Math.min(currentMana, dec);
        if (!sim)
            currentMana -= manaDecreased;
        return manaDecreased;
    }

    @Override
    public void setMana(int manaAmount) {
        this.currentMana = manaAmount;
    }

    @Override
    public int getMana() {
        return this.currentMana;
    }

    @Override
    public int getManaCapacity() {
        return this.manaCapacity;
    }

    @Override
    public int setManaCapacity(int manaCapacity) {
        return this.manaCapacity = manaCapacity;
    }

    @Override
    public CompoundTag serializeNBT() {
        final CompoundTag tag = new CompoundTag();
        final ListTag listTag = new ListTag();

        tag.putInt(NBT_MANA_KEY, this.currentMana);
        tag.putBoolean(NBT_COMBAT_KEY, this.inCombatMode);
        for (SpellType<?> grimoireAbility : spellSet) {
            listTag.add(CapabilityUtil.storeSpell(grimoireAbility, NBT_SPELLS_KEY));
        }
        tag.put(NBT_SPELLS_KEY, listTag);
        if (this.rightHandSpell != null) {
            CapabilityUtil.storeSpell(tag, this.rightHandSpell, NBT_RIGHT_KEY);
        }
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        this.currentMana = nbt.getInt(NBT_MANA_KEY);
        this.inCombatMode = nbt.getBoolean(NBT_COMBAT_KEY);
        ListTag listTag = nbt.getList(NBT_SPELLS_KEY, 10);

        for (int i = 0; i < listTag.size(); i++) {
            CompoundTag compoundTag = listTag.getCompound(i);
            this.spellSet.add(CapabilityUtil.getSpellByName(CapabilityUtil.getSpellId(compoundTag, NBT_SPELLS_KEY)));
        }
        this.rightHandSpell = CapabilityUtil.getSpellByName(CapabilityUtil.getSpellId(nbt, NBT_RIGHT_KEY));
    }
}
