package net.mcreator.dreamprojection.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class NutrientSacBlock extends Block {
	public NutrientSacBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SLIME_BLOCK).strength(0.5f, 0f).lightLevel(s -> 5).friction(1f));
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 2;
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.STICKY_HONEY;
	}
}