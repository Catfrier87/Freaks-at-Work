package net.mcreator.dreamprojection.procedures;

import net.neoforged.bus.api.Event;

public class FreakContainmentProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dream_projection:infinite_forest"))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.TORCH.defaultBlockState(), 3);
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}