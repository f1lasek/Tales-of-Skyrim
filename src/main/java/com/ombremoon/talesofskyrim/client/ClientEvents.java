package com.ombremoon.talesofskyrim.client;

import com.ombremoon.talesofskyrim.client.model.armor.SteelArmorModel;
import com.ombremoon.talesofskyrim.client.renderer.armor.SteelArmorLayer;
import com.ombremoon.talesofskyrim.common.init.item.ItemPropertiesInit;
import com.ombremoon.talesofskyrim.Constants;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientEvents {

    @Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModBusEvents {

        @SubscribeEvent
        public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(SteelArmorModel.LAYER_LOCATION, SteelArmorModel::createBodyLayer);
        }

        @SubscribeEvent
        public static void registerLayerDefinitions(EntityRenderersEvent.AddLayers event) {
            for (final String skin : event.getSkins()) {
                final LivingEntityRenderer<Player, PlayerModel<Player>> playerRenderer = event.getSkin(skin);
                if (playerRenderer == null)
                    continue;
                playerRenderer.addLayer(new SteelArmorLayer<>(playerRenderer));
            }
        }
    }

    @Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(ItemPropertiesInit::addCustomItemProperties);
        }
    }
}
