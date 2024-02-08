package com.ombremoon.talesofskyrim.common.init.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ItemPropertiesInit {

    public static void addCustomItemProperties() {
        for (RegistryObject<Item> registryObject : ItemInit.ITEMS.getEntries()) {
            if (registryObject.get() instanceof BowItem) {
                makeBow(registryObject.get());
            }
        }
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (itemStack, level, livingEntity, i) -> {
            if (livingEntity == null) {
                return 0.0F;
            } else {
                return livingEntity.getUseItem() != itemStack ? 0.0F : (float)(itemStack.getUseDuration() - livingEntity.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(item, new ResourceLocation("pulling"), (itemStack, level, livingEntity, i) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });
    }
}