package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.util.ARGB;
import net.minecraft.core.BlockPos;

public class PoopBlockBlock extends Block {
	public PoopBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_BROWN).sound(SoundType.GRAVEL).strength(1f).friction(0.8f).speedFactor(0.9f).jumpFactor(0.9f).instrument(NoteBlockInstrument.FLUTE));
	}

	@Override
	public Integer getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return ARGB.opaque(-6724096);
	}
}