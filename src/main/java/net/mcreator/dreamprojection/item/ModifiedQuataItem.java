package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ModifiedQuataItem extends Item {
	public ModifiedQuataItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1));
	}
}