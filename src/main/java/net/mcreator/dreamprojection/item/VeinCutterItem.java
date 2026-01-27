package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class VeinCutterItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 1450, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("dream_projection:vein_cutter_repair_items")));

	public VeinCutterItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 5.5f, -3f));
	}
}