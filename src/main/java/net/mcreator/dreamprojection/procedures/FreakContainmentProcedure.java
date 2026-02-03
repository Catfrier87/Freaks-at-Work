package net.mcreator.dreamprojection.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

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