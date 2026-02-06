package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NoosphericOrbItem extends Item {
	public NoosphericOrbItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1));
	}
}