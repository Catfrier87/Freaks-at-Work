package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SkinBlockBlock extends Block {
	public SkinBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SLIME_BLOCK).strength(0.7f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}