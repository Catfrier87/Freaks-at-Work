/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.dreamprojection.DreamProjectionMod;

public class DreamProjectionModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, DreamProjectionMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> WHEATFIELDBUGFUCKERS = REGISTRY.register("wheatfieldbugfuckers", () -> new SimpleParticleType(false));
}