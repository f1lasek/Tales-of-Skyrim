package net.f1la.talesofskyrim.item.client;

import net.f1la.talesofskyrim.TalesOfSkyrimMod;
import net.f1la.talesofskyrim.item.custom.ModArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ModArmorModel extends GeoModel<ModArmorItem> {
    @Override
    public ResourceLocation getModelResource(ModArmorItem animatable) {
        return new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "geo/ebony_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModArmorItem animatable) {
        return new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "textures/armor/ebony_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModArmorItem animatable) {
        return new ResourceLocation(TalesOfSkyrimMod.MOD_ID, "animations/ebony_armor.animation.json");
    }
}
