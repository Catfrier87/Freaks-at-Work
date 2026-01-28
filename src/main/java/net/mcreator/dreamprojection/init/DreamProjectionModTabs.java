/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.dreamprojection.DreamProjectionMod;

@EventBusSubscriber
public class DreamProjectionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DreamProjectionMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DreamProjectionModItems.FREAK_SPAWN_EGG.get());
			tabData.accept(DreamProjectionModItems.CLUSTER_SPAWN_EGG.get());
			tabData.accept(DreamProjectionModItems.ABYSS_BOSS_SPAWN_EGG.get());
			tabData.accept(DreamProjectionModItems.DEATH_CERTIFICATE.get());
			tabData.accept(DreamProjectionModItems.HERETIC_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(DreamProjectionModBlocks.DARKNESS_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(DreamProjectionModBlocks.NUTRIENT_SAC.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DreamProjectionModItems.CORPSE_ARMOR_HELMET.get());
			tabData.accept(DreamProjectionModItems.CORPSE_ARMOR_CHESTPLATE.get());
			tabData.accept(DreamProjectionModItems.CORPSE_ARMOR_LEGGINGS.get());
			tabData.accept(DreamProjectionModItems.CORPSE_ARMOR_BOOTS.get());
			tabData.accept(DreamProjectionModItems.MEAT_SHOT.get());
			tabData.accept(DreamProjectionModItems.VEIN_CUTTER.get());
			tabData.accept(DreamProjectionModItems.MISERY_AXE.get());
			tabData.accept(DreamProjectionModItems.DEATHS_TOUCH.get());
			tabData.accept(DreamProjectionModItems.BOOK_OF_EVIL.get());
			tabData.accept(DreamProjectionModItems.HERETIC_DAGGER.get());
			tabData.accept(DreamProjectionModItems.SMILE_HAMMER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DreamProjectionModItems.BEAST_DIMENSION.get());
			tabData.accept(DreamProjectionModItems.VOID_TOOL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(DreamProjectionModItems.ABYSS_SPIRIT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(DreamProjectionModBlocks.DARK_BELL.get().asItem());
		}
	}
}