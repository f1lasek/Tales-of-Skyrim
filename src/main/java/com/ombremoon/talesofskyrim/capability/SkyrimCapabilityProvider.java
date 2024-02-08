package com.ombremoon.talesofskyrim.capability;

import com.ombremoon.talesofskyrim.CommonClass;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SkyrimCapabilityProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    public static final Capability<ISkyrimCapability> SKYRIM_CAPABILITY = CapabilityManager.get(new CapabilityToken<>() {});
    public static final ResourceLocation CAPABILITY_LOCATION = CommonClass.customLocation("talesofskyrim");

    private ISkyrimCapability archetypeCapability = new SkyrimCapabilityHandler(100);
    private final LazyOptional<ISkyrimCapability> optional = LazyOptional.of(() -> archetypeCapability);


    public static @NotNull ISkyrimCapability get(Player player) {
        return player.getCapability(SKYRIM_CAPABILITY).orElseThrow(NullPointerException::new);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return SKYRIM_CAPABILITY.orEmpty(cap, this.optional);
    }

    @Override
    public CompoundTag serializeNBT() {
        return this.archetypeCapability.serializeNBT();
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        this.archetypeCapability.deserializeNBT(nbt);
    }
}
