package com.ombremoon.talesofskyrim;

import com.ombremoon.talesofskyrim.common.init.SpellInit;
import com.ombremoon.talesofskyrim.common.init.block.BlockInit;
import com.ombremoon.talesofskyrim.common.init.entity.EntityInit;
import com.ombremoon.talesofskyrim.common.init.LootModifiersInit;
import com.ombremoon.talesofskyrim.common.init.entity.StatusEffects;
import com.ombremoon.talesofskyrim.common.init.item.ItemInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;

public class CommonClass {

    public static void init(IEventBus modEventBus) {
        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
        EntityInit.register(modEventBus);
        SpellInit.init(modEventBus);
//        ModCreativeModeTabs.register(modEventBus);
        StatusEffects.register(modEventBus);
        LootModifiersInit.register(modEventBus);
    }

    public static ResourceLocation customLocation(String name) {
        return new ResourceLocation(Constants.MOD_ID, name);
    }
}
