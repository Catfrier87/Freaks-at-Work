/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nightmare.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.nightmare.client.renderer.FuckerRenderer;
import net.mcreator.nightmare.client.renderer.ClusterRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class NightmareModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NightmareModEntities.FREAK.get(), FuckerRenderer::new);
		event.registerEntityRenderer(NightmareModEntities.CLUSTER.get(), ClusterRenderer::new);
		event.registerEntityRenderer(NightmareModEntities.MEAT_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}