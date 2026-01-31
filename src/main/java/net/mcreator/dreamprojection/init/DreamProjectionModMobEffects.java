/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.dreamprojection.potion.InsomniaMobEffect;
import net.mcreator.dreamprojection.DreamProjectionMod;

public class DreamProjectionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, DreamProjectionMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> INSOMNIA = REGISTRY.register("insomnia", () -> new InsomniaMobEffect());
}