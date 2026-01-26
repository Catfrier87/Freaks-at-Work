package net.mcreator.nightmare.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ScabItem extends Item {
	public ScabItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}