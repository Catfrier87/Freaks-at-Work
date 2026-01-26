package net.mcreator.nightmare.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MiserySpectrumItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 1450, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("nightmare:misery_spectrum_repair_items")));

	public MiserySpectrumItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 7f, -2.9f, properties);
	}
}