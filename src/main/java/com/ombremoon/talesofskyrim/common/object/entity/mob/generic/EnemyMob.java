package com.ombremoon.talesofskyrim.common.object.entity.mob.generic;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public abstract class EnemyMob<T extends EnemyMob<T>> extends Monster {
    public EnemyMob(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.ATTACK_DAMAGE).add(Attributes.ATTACK_KNOCKBACK).add(Attributes.MOVEMENT_SPEED);
    }
}
