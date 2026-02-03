/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.dreamprojection.client.model.Modelsplunger;
import net.mcreator.dreamprojection.client.model.Modelcluster;
import net.mcreator.dreamprojection.client.model.ModelZLYQ;

@EventBusSubscriber(Dist.CLIENT)
public class DreamProjectionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsplunger.LAYER_LOCATION, Modelsplunger::createBodyLayer);
		event.registerLayerDefinition(Modelcluster.LAYER_LOCATION, Modelcluster::createBodyLayer);
		event.registerLayerDefinition(ModelZLYQ.LAYER_LOCATION, ModelZLYQ::createBodyLayer);
	}
}