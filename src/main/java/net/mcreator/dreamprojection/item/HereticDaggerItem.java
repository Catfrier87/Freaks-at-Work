package net.mcreator.dreamprojection.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class HereticDaggerItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 100, 0f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("dream_projection:heretic_dagger_repair_items")));

	public HereticDaggerItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 4f, -3f));
	}
}