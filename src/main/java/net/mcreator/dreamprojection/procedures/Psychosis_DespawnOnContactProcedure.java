package net.mcreator.dreamprojection.procedures;

import net.minecraft.world.entity.Entity;

public class Psychosis_DespawnOnContactProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}