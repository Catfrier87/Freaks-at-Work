package net.mcreator.dreamprojection.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.dreamprojection.block.PangeaPortalBlock;
import net.mcreator.dreamprojection.block.BeastDimensionPortalBlock;

public class DreamProjectorCoreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRANITE) {
			if (world instanceof Level _level)
				BeastDimensionPortalBlock.portalSpawn(_level, BlockPos.containing(x, y + 1, z));
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRANITE) {
			if (world instanceof Level _level)
				PangeaPortalBlock.portalSpawn(_level, BlockPos.containing(x, y + 1, z));
		}
	}
}