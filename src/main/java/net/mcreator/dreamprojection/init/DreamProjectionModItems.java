/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dreamprojection.item.TendonsItem;
import net.mcreator.dreamprojection.item.ScabItem;
import net.mcreator.dreamprojection.item.MeatItem;
import net.mcreator.dreamprojection.DreamProjectionMod;

import java.util.function.Function;

public class DreamProjectionModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DreamProjectionMod.MODID);
	public static final DeferredItem<Item> FREAK_SPAWN_EGG;
	public static final DeferredItem<Item> MEAT;
	public static final DeferredItem<Item> EYES;
	public static final DeferredItem<Item> DARKNESS_BLOCK;
	public static final DeferredItem<Item> SKIN_BLOCK;
	public static final DeferredItem<Item> BLOOD_CLOT;
	public static final DeferredItem<Item> PORESTONE;
	public static final DeferredItem<Item> NUTRIENT_SAC;
	public static final DeferredItem<Item> SCAB;
	public static final DeferredItem<Item> TENDONS;
	static {
		FREAK_SPAWN_EGG = register("freak_spawn_egg", properties -> new SpawnEggItem(DreamProjectionModEntities.FREAK.get(), properties));
		MEAT = register("meat", MeatItem::new);
		EYES = block(DreamProjectionModBlocks.EYES);
		DARKNESS_BLOCK = block(DreamProjectionModBlocks.DARKNESS_BLOCK);
		SKIN_BLOCK = block(DreamProjectionModBlocks.SKIN_BLOCK);
		BLOOD_CLOT = block(DreamProjectionModBlocks.BLOOD_CLOT);
		PORESTONE = block(DreamProjectionModBlocks.PORESTONE);
		NUTRIENT_SAC = block(DreamProjectionModBlocks.NUTRIENT_SAC);
		SCAB = register("scab", ScabItem::new);
		TENDONS = register("tendons", TendonsItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}