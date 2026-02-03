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
			tabData.accept(DreamProjectionModItems.H_7362_SPAWN_EGG.get());
			tabData.accept(DreamProjectionModItems.DYNAMITE_SPAWNER_SPAWN_EGG.get());
			tabData.accept(DreamProjectionModItems.SPLUNGER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(DreamProjectionModItems.MEAT.get());
			tabData.accept(DreamProjectionModItems.SPLUNGER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(DreamProjectionModItems.MEAT.get());
			tabData.accept(DreamProjectionModItems.SCAB.get());
			tabData.accept(DreamProjectionModItems.TENDONS.get());
			tabData.accept(DreamProjectionModItems.PURE_DARKNESS.get());
			tabData.accept(DreamProjectionModItems.PUPIL.get());
			tabData.accept(DreamProjectionModItems.ABYSS_SPIRIT.get());
			tabData.accept(DreamProjectionModItems.COASITINE_SHARD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(DreamProjectionModBlocks.EYES.get().asItem());
			tabData.accept(DreamProjectionModBlocks.SKIN_BLOCK.get().asItem());
			tabData.accept(DreamProjectionModBlocks.BLOOD_CLOT.get().asItem());
			tabData.accept(DreamProjectionModBlocks.PORESTONE.get().asItem());
			tabData.accept(DreamProjectionModBlocks.NUTRIENT_SAC.get().asItem());
			tabData.accept(DreamProjectionModBlocks.EXPERIENCE_BLOCK.get().asItem());
			tabData.accept(DreamProjectionModBlocks.SHADOW_CURRANT.get().asItem());
			tabData.accept(DreamProjectionModBlocks.FINGER_BONE.get().asItem());
			tabData.accept(DreamProjectionModBlocks.COASITINE_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(DreamProjectionModBlocks.DARKNESS_BLOCK.get().asItem());
			tabData.accept(DreamProjectionModBlocks.SKIN_BLOCK.get().asItem());
			tabData.accept(DreamProjectionModBlocks.BLOOD_CLOT.get().asItem());
			tabData.accept(DreamProjectionModBlocks.PORESTONE.get().asItem());
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
			tabData.accept(DreamProjectionModItems.UNBLINKING_EYE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(DreamProjectionModBlocks.DARK_BELL.get().asItem());
		}
	}
}