package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.dreamprojection.procedures.SmileEatProcedure;

public class SmileHammerItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1450, 1f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("dream_projection:smile_hammer_repair_items")));

	public SmileHammerItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 10f, -3.2f, properties);
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		SmileEatProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
	}
}