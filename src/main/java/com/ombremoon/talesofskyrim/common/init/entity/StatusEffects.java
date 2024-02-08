package com.ombremoon.talesofskyrim.common.init.entity;

import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.common.object.entity.effects.StatusEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class StatusEffects {
    public static DeferredRegister<MobEffect> STATUS_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Constants.MOD_ID);

    public static RegistryObject<MobEffect> DAMAGE_STAMINA = STATUS_EFFECTS.register("damage_stamina", () -> new StatusEffect(MobEffectCategory.HARMFUL, 2558751));

    public static void register(IEventBus modEventBus) {
        STATUS_EFFECTS.register(modEventBus);
    }
}
