package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ExperienceBlockBlock extends Block {
	public ExperienceBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.AMETHYST).strength(1f, 10f).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public int getExpDrop(BlockState state, LevelAccessor level, BlockPos pos, BlockEntity blockEntity, Entity breaker, ItemStack tool) {
		return 128;
	}
}