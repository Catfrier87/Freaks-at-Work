/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.dreamprojection.DreamProjectionMod;

public class DreamProjectionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, DreamProjectionMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> WHEAT_WIND = REGISTRY.register("wheat_wind", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("dream_projection", "wheat_wind")));
}