package net.mcreator.dreamprojection.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PangeaCrateBlock extends Block {
	public PangeaCrateBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(3f, 17f).lightLevel(s -> 3));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}