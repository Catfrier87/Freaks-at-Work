/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.dreamprojection.procedures.NightmaresEffectExpiresProcedure;
import net.mcreator.dreamprojection.potion.NightmaresMobEffect;
import net.mcreator.dreamprojection.potion.InsomniaMobEffect;
import net.mcreator.dreamprojection.DreamProjectionMod;

@EventBusSubscriber
public class DreamProjectionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, DreamProjectionMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> INSOMNIA = REGISTRY.register("insomnia", () -> new InsomniaMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> NIGHTMARES = REGISTRY.register("nightmares", () -> new NightmaresMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(NIGHTMARES)) {
			NightmaresEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}
}