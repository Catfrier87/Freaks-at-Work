package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.dreamprojection.procedures.AnimalExpandedProcedure;

public class ExpansionPakItem extends Item {
	public ExpansionPakItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		AnimalExpandedProcedure.execute(entity.level(), entity, sourceentity, itemstack);
	}
}