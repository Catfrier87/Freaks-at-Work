package net.mcreator.dreamprojection.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.dreamprojection.init.DreamProjectionModMobEffects;

public class UseLexaproProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(DreamProjectionModMobEffects.INSOMNIA);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(DreamProjectionModMobEffects.NIGHTMARES);
	}
}