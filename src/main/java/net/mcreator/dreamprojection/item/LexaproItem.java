package net.mcreator.dreamprojection.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.dreamprojection.procedures.UseLexaproProcedure;

public class LexaproItem extends Item {
	public LexaproItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(-3).saturationModifier(-1f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(2F).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		UseLexaproProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}
}