package com.ombremoon.talesofskyrim.event;

import com.ombremoon.talesofskyrim.Constants;
import com.ombremoon.talesofskyrim.capability.SkyrimCapabilityProvider;
import com.ombremoon.talesofskyrim.common.object.custom.spell.AbstractSpell;
import com.ombremoon.talesofskyrim.common.object.custom.spell.SpellInstance;
import com.ombremoon.talesofskyrim.util.ArchetypeUtil;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID)
public class CommonModEvents {

    @SubscribeEvent
    public static void onAttachPlayerCapabilities(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof Player player) {
            if (!player.getCapability(SkyrimCapabilityProvider.SKYRIM_CAPABILITY).isPresent()) {
                var provider = new SkyrimCapabilityProvider();
                event.addCapability(SkyrimCapabilityProvider.CAPABILITY_LOCATION, provider);
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerDeath(PlayerEvent.Clone event) {
        event.getOriginal().reviveCaps();
        event.getEntity().getCapability(SkyrimCapabilityProvider.SKYRIM_CAPABILITY).ifPresent(b -> {
            b.setMana(b.getManaCapacity());
        });
    }

    @SubscribeEvent
    public static void onAbilityTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        Iterator<AbstractSpell> iterator = ArchetypeUtil.getActiveSpells(player).keySet().iterator();

        try {
            while (iterator.hasNext()) {
                var grimoireSpell = iterator.next();
                var grimoireSpellInstance = ArchetypeUtil.getActiveSpells(player).get(grimoireSpell);
                if (!grimoireSpellInstance.tickSpellEffect(player, () -> {
                    grimoireSpell.onSpellUpdate(grimoireSpellInstance, true, player);
                })) {
                    if (!player.level().isClientSide) {
                        iterator.remove();
                        grimoireSpell.onSpellRemoved(grimoireSpellInstance);
                    }
                } else if (grimoireSpellInstance.getDuration() % 600 == 0) {
                    grimoireSpell.onSpellUpdate(grimoireSpellInstance, false, player);
                }
            }
        } catch (ConcurrentModificationException ignored) {
        }
    }
}
