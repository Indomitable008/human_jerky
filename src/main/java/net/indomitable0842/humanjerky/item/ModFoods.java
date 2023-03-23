package net.indomitable0842.humanjerky.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties HUMANJERKY = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.9F).meat().build();
    public static final FoodProperties RAW_HUMANJERKY = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).meat().build();
}
