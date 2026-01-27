package net.mcreator.dreamprojection.item;

public class DeathsTouchItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2032, 4f, 0, 24, TagKey.create(Registries.ITEM, ResourceLocation.parse("dream_projection:deaths_touch_repair_items")));

	public DeathsTouchItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 7.5f, -2.3f));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		DeathsDecayProcedure.execute(entity);
	}
}