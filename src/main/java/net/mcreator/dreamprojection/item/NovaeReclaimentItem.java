package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NovaeReclaimentItem extends Item {
	public NovaeReclaimentItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1));
	}
}