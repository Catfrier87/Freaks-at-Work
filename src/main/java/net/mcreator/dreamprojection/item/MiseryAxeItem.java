package net.mcreator.dreamprojection.item;

public class MiseryAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 1450, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("dream_projection:misery_axe_repair_items")));

	public MiseryAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 7f, -2.9f, properties);
	}
}