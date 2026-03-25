package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CornItem extends Item {
	public CornItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}
}