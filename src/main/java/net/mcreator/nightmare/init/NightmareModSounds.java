/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.nightmare.NightmareMod;

public class NightmareModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, NightmareMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> SHOCK = REGISTRY.register("shock", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("nightmare", "shock")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RAPTURE = REGISTRY.register("rapture", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("nightmare", "rapture")));
}