package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PorestoneBlock extends Block {
	public PorestoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WART_BLOCK).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}