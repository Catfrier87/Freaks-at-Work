/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nightmare.item.*;
import net.mcreator.nightmare.NightmareMod;

import java.util.function.Function;

public class NightmareModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(NightmareMod.MODID);
	public static final DeferredItem<Item> FUCK;
	public static final DeferredItem<Item> FREAK_SPAWN_EGG;
	public static final DeferredItem<Item> PORESTONE;
	public static final DeferredItem<Item> SKIN;
	public static final DeferredItem<Item> NIGHTMARE;
	public static final DeferredItem<Item> MEAT;
	public static final DeferredItem<Item> SCAB;
	public static final DeferredItem<Item> BLOOD_CLOT;
	public static final DeferredItem<Item> CLUSTER_SPAWN_EGG;
	public static final DeferredItem<Item> PURE_DARKNESS;
	public static final DeferredItem<Item> DARKNESS;
	public static final DeferredItem<Item> PUPIL;
	public static final DeferredItem<Item> EYES;
	public static final DeferredItem<Item> CORPSE_HELMET;
	public static final DeferredItem<Item> CORPSE_CHESTPLATE;
	public static final DeferredItem<Item> CORPSE_LEGGINGS;
	public static final DeferredItem<Item> CORPSE_BOOTS;
	public static final DeferredItem<Item> TENDON;
	public static final DeferredItem<Item> NUTRIENT_SAC;
	public static final DeferredItem<Item> DISC_EYES;
	public static final DeferredItem<Item> MEAT_SHOT;
	public static final DeferredItem<Item> VEIN_CUTTER;
	public static final DeferredItem<Item> MISERY_SPECTRUM;
	public static final DeferredItem<Item> VOID_TOOL;
	static {
		FUCK = block(NightmareModBlocks.FUCK);
		FREAK_SPAWN_EGG = register("freak_spawn_egg", properties -> new SpawnEggItem(NightmareModEntities.FREAK.get(), properties));
		PORESTONE = block(NightmareModBlocks.PORESTONE);
		SKIN = block(NightmareModBlocks.SKIN);
		NIGHTMARE = register("nightmare", NightmareItem::new);
		MEAT = register("meat", MeatItem::new);
		SCAB = register("scab", ScabItem::new);
		BLOOD_CLOT = block(NightmareModBlocks.BLOOD_CLOT);
		CLUSTER_SPAWN_EGG = register("cluster_spawn_egg", properties -> new SpawnEggItem(NightmareModEntities.CLUSTER.get(), properties));
		PURE_DARKNESS = register("pure_darkness", PureDarknessItem::new);
		DARKNESS = block(NightmareModBlocks.DARKNESS);
		PUPIL = register("pupil", PupilItem::new);
		EYES = block(NightmareModBlocks.EYES);
		CORPSE_HELMET = register("corpse_helmet", CorpseItem.Helmet::new);
		CORPSE_CHESTPLATE = register("corpse_chestplate", CorpseItem.Chestplate::new);
		CORPSE_LEGGINGS = register("corpse_leggings", CorpseItem.Leggings::new);
		CORPSE_BOOTS = register("corpse_boots", CorpseItem.Boots::new);
		TENDON = register("tendon", TendonItem::new);
		NUTRIENT_SAC = block(NightmareModBlocks.NUTRIENT_SAC);
		DISC_EYES = register("disc_eyes", DiscEyesItem::new);
		MEAT_SHOT = register("meat_shot", MeatShotItem::new);
		VEIN_CUTTER = register("vein_cutter", VeinCutterItem::new);
		MISERY_SPECTRUM = register("misery_spectrum", MiserySpectrumItem::new);
		VOID_TOOL = register("void_tool", VoidToolItem::new);
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