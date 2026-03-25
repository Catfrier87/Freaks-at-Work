package net.mcreator.dreamprojection.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;

public class NightmaresMobEffect extends MobEffect {
	public NightmaresMobEffect() {
		super(MobEffectCategory.HARMFUL, -13421773, mobEffectInstance -> ParticleTypes.ASH);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("dream_projection:nightmaresound")));
	}
}