/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.dreamprojection.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class DreamProjectionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DreamProjectionModEntities.FREAK.get(), FreakRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.MEAT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.CLUSTER.get(), ClusterRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.ABYSS_BOSS.get(), AbyssBossRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.HERETIC.get(), HereticRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.H_7362.get(), H7362Renderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.DYNAMITE_SPAWNER.get(), DynamiteSpawnerRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.SPLUNGER.get(), SplungerRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.GREEN_MAN.get(), GreenManRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.TASER_SHOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.CARRION_CAPTAIN.get(), CarrionCaptainRenderer::new);
		event.registerEntityRenderer(DreamProjectionModEntities.TERMINATOR.get(), TerminatorRenderer::new);
	}
}