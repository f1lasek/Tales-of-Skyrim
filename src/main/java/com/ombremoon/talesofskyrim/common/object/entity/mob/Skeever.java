package com.ombremoon.talesofskyrim.common.object.entity.mob;

import com.ombremoon.talesofskyrim.common.object.entity.mob.generic.EnemyMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class Skeever extends EnemyMob<Skeever> {
    public Skeever(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
}
