package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StatePhasureItem extends Item {
	public StatePhasureItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1));
	}
}