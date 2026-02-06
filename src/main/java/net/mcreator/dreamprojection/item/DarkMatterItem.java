package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DarkMatterItem extends Item {
	public DarkMatterItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}