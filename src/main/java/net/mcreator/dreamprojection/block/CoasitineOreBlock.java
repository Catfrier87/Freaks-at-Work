package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CoasitineOreBlock extends Block {
	public CoasitineOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3f, 15f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public int getExpDrop(BlockState state, LevelAccessor level, BlockPos pos, BlockEntity blockEntity, Entity breaker, ItemStack tool) {
		return Mth.randomBetweenInclusive(level.getRandom(), 3, 8);
	}
}