/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.dreamprojection.client.renderer.FreakRenderer;
import net.mcreator.dreamprojection.client.renderer.ClusterRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class DreamProjectionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DreamProjectionModEntities.FREAK.get(), FreakRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.CLUSTER.get(), ClusterRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.MEAT_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}