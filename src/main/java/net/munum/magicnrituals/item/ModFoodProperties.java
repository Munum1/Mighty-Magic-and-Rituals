package net.munum.magicnrituals.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties GARLIC = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 400, 1), 0.25f).build();

    public static final FoodProperties GARLIC_BREAD = new FoodProperties.Builder().nutrition(4).saturationModifier(0.35f)
            .effect(new MobEffectInstance(MobEffects.SATURATION , 400, 1), 0.85f).build();

    public static final FoodProperties SNOWBERRIES = new FoodProperties.Builder().nutrition(4).saturationModifier(0.2f)
            .saturationModifier(0.15f).fast().build();

}

