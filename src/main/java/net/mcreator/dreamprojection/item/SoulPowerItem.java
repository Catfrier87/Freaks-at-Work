package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SoulPowerItem extends Item {
	public SoulPowerItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}