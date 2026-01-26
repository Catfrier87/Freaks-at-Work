/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.dreamprojection.client.particle.WheatfieldbugfuckersParticle;

@EventBusSubscriber(Dist.CLIENT)
public class DreamProjectionModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(DreamProjectionModParticleTypes.WHEATFIELDBUGFUCKERS.get(), WheatfieldbugfuckersParticle::provider);
	}
}