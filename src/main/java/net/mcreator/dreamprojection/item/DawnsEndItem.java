package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DawnsEndItem extends Item {
	public DawnsEndItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}