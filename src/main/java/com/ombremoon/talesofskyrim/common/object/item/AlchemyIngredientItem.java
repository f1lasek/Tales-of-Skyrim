package com.ombremoon.talesofskyrim.common.object.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class AlchemyIngredientItem extends Item {
    private final Supplier<MobEffect> firstEffect;
    @Nullable
    private final Supplier<MobEffect> secondEffect;
    @Nullable
    private final Supplier<MobEffect> thirdEffect;
    @Nullable
    private final Supplier<MobEffect> fourthEffect;

    public AlchemyIngredientItem(Supplier<MobEffect> firstEffect, @Nullable Supplier<MobEffect> secondEffect, @Nullable Supplier<MobEffect> thirdEffect, @Nullable Supplier<MobEffect> fourthEffect, Properties pProperties) {
        super(pProperties.stacksTo(16).food(new FoodProperties.Builder().alwaysEat().effect(() -> new MobEffectInstance(firstEffect.get(), 100), 1.0F).nutrition(1).build()));
        this.firstEffect = firstEffect;
        this.secondEffect = secondEffect;
        this.thirdEffect = thirdEffect;
        this.fourthEffect = fourthEffect;
    }

    public AlchemyIngredientItem(Supplier<MobEffect> firstEffect, @Nullable Supplier<MobEffect> secondEffect, @Nullable Supplier<MobEffect> thirdEffect, Properties properties) {
        this(firstEffect, secondEffect, thirdEffect, null, properties);
    }

    public AlchemyIngredientItem(Supplier<MobEffect> firstEffect, @Nullable Supplier<MobEffect> secondEffect, Properties properties) {
        this(firstEffect, secondEffect, null, null, properties);
    }

    public AlchemyIngredientItem(Supplier<MobEffect> firstEffect, Properties properties) {
        this(firstEffect, null, null, null, properties);
    }
}
