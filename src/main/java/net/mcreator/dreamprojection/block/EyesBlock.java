package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EyesBlock extends Block {
	public EyesBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(6f, 15f).lightLevel(s -> 15).requiresCorrectToolForDrops().speedFactor(0.8f).jumpFactor(0.6f).instrument(NoteBlockInstrument.HAT));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public int getExpDrop(BlockState state, LevelAccessor level, BlockPos pos, BlockEntity blockEntity, Entity breaker, ItemStack tool) {
		return Mth.randomBetweenInclusive(level.getRandom(), 3, 5);
	}
}