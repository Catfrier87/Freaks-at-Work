package net.mcreator.nightmare.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class VoidToolItem extends Item {
	public VoidToolItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(1));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}