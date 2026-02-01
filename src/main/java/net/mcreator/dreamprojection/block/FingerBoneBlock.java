package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class FingerBoneBlock extends SaplingBlock {
	public static final TreeGrower TREE_GROWER = new TreeGrower("finger_bone", Optional.of(getFeatureKey("dream_projection:bone_tree")), Optional.of(getFeatureKey("dream_projection:bone_tree")),
			Optional.of(getFeatureKey("dream_projection:bone_tree")));

	public FingerBoneBlock(BlockBehaviour.Properties properties) {
		super(TREE_GROWER, properties.mapColor(MapColor.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollission().pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(DreamProjectionModBlocks.DARKNESS_BLOCK.get()) || groundState.is(DreamProjectionModBlocks.SKIN_BLOCK.get()) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.DIRT) || groundState.is(Blocks.MOSS_BLOCK)
				|| groundState.is(Blocks.DIAMOND_BLOCK);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	private static ResourceKey<ConfiguredFeature<?, ?>> getFeatureKey(String feature) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse(feature));
	}
}