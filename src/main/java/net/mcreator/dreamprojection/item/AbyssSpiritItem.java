package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AbyssSpiritItem extends Item {
	public AbyssSpiritItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}