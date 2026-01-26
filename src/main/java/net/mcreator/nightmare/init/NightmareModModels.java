/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nightmare.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.nightmare.client.model.Modelcluster;

@EventBusSubscriber(Dist.CLIENT)
public class NightmareModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcluster.LAYER_LOCATION, Modelcluster::createBodyLayer);
	}
}