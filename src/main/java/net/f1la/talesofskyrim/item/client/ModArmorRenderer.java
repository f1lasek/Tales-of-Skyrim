package net.f1la.talesofskyrim.item.client;

import net.f1la.talesofskyrim.item.custom.ModArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ModArmorRenderer extends GeoArmorRenderer<ModArmorItem> {
    public ModArmorRenderer() {
        super(new ModArmorModel());
    }
}