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

import net.mcreator.dreamprojection.item.*;
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
	public static final DeferredItem<Item> PURE_DARKNESS;
	public static final DeferredItem<Item> PUPIL;
	public static final DeferredItem<Item> CORPSE_ARMOR_HELMET;
	public static final DeferredItem<Item> CORPSE_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> CORPSE_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> CORPSE_ARMOR_BOOTS;
	public static final DeferredItem<Item> MEAT_SHOT;
	public static final DeferredItem<Item> CLUSTER_SPAWN_EGG;
	public static final DeferredItem<Item> BEAST_DIMENSION;
	public static final DeferredItem<Item> VEIN_CUTTER;
	public static final DeferredItem<Item> MISERY_AXE;
	public static final DeferredItem<Item> DEATHS_TOUCH;
	public static final DeferredItem<Item> VOID_TOOL;
	public static final DeferredItem<Item> ABYSS_SPIRIT;
	public static final DeferredItem<Item> ABYSS_BOSS_SPAWN_EGG;
	public static final DeferredItem<Item> DEATH_CERTIFICATE;
	public static final DeferredItem<Item> HERETIC_SPAWN_EGG;
	public static final DeferredItem<Item> BOOK_OF_EVIL;
	public static final DeferredItem<Item> HERETIC_DAGGER;
	public static final DeferredItem<Item> SMILE_HAMMER;
	public static final DeferredItem<Item> DARK_BELL;
	public static final DeferredItem<Item> H_7362_SPAWN_EGG;
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
		PURE_DARKNESS = register("pure_darkness", PureDarknessItem::new);
		PUPIL = register("pupil", PupilItem::new);
		CORPSE_ARMOR_HELMET = register("corpse_armor_helmet", CorpseArmorItem.Helmet::new);
		CORPSE_ARMOR_CHESTPLATE = register("corpse_armor_chestplate", CorpseArmorItem.Chestplate::new);
		CORPSE_ARMOR_LEGGINGS = register("corpse_armor_leggings", CorpseArmorItem.Leggings::new);
		CORPSE_ARMOR_BOOTS = register("corpse_armor_boots", CorpseArmorItem.Boots::new);
		MEAT_SHOT = register("meat_shot", MeatShotItem::new);
		CLUSTER_SPAWN_EGG = register("cluster_spawn_egg", properties -> new SpawnEggItem(DreamProjectionModEntities.CLUSTER.get(), properties));
		BEAST_DIMENSION = register("beast_dimension", BeastDimensionItem::new);
		VEIN_CUTTER = register("vein_cutter", VeinCutterItem::new);
		MISERY_AXE = register("misery_axe", MiseryAxeItem::new);
		DEATHS_TOUCH = register("deaths_touch", DeathsTouchItem::new);
		VOID_TOOL = register("void_tool", VoidToolItem::new);
		ABYSS_SPIRIT = register("abyss_spirit", AbyssSpiritItem::new);
		ABYSS_BOSS_SPAWN_EGG = register("abyss_boss_spawn_egg", properties -> new SpawnEggItem(DreamProjectionModEntities.ABYSS_BOSS.get(), properties));
		DEATH_CERTIFICATE = register("death_certificate", DeathCertificateItem::new);
		HERETIC_SPAWN_EGG = register("heretic_spawn_egg", properties -> new SpawnEggItem(DreamProjectionModEntities.HERETIC.get(), properties));
		BOOK_OF_EVIL = register("book_of_evil", BookOfEvilItem::new);
		HERETIC_DAGGER = register("heretic_dagger", HereticDaggerItem::new);
		SMILE_HAMMER = register("smile_hammer", SmileHammerItem::new);
		DARK_BELL = block(DreamProjectionModBlocks.DARK_BELL);
		H_7362_SPAWN_EGG = register("h_7362_spawn_egg", properties -> new SpawnEggItem(DreamProjectionModEntities.H_7362.get(), properties));
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