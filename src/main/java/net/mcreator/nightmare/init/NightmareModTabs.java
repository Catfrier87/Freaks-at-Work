/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.nightmare.NightmareMod;

@EventBusSubscriber
public class NightmareModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NightmareMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(NightmareModItems.FREAK_SPAWN_EGG.get());
			tabData.accept(NightmareModItems.CLUSTER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(NightmareModItems.NIGHTMARE.get());
			tabData.accept(NightmareModItems.DISC_EYES.get());
			tabData.accept(NightmareModItems.VEIN_CUTTER.get());
			tabData.accept(NightmareModItems.MISERY_SPECTRUM.get());
			tabData.accept(NightmareModItems.VOID_TOOL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(NightmareModItems.MEAT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NightmareModItems.SCAB.get());
			tabData.accept(NightmareModItems.PURE_DARKNESS.get());
			tabData.accept(NightmareModItems.PUPIL.get());
			tabData.accept(NightmareModItems.TENDON.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NightmareModBlocks.DARKNESS.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(NightmareModItems.CORPSE_HELMET.get());
			tabData.accept(NightmareModItems.CORPSE_CHESTPLATE.get());
			tabData.accept(NightmareModItems.CORPSE_LEGGINGS.get());
			tabData.accept(NightmareModItems.CORPSE_BOOTS.get());
			tabData.accept(NightmareModItems.MEAT_SHOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(NightmareModBlocks.NUTRIENT_SAC.get().asItem());
		}
	}
}