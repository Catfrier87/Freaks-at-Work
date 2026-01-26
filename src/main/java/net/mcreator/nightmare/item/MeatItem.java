package net.mcreator.nightmare.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class MeatItem extends Item {
	public MeatItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}
}