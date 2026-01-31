package net.mcreator.dreamprojection.procedures;

import net.neoforged.bus.api.Event;

public class Psychosis_DespawnOnContactProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}