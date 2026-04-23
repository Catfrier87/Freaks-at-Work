package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class EyesBlock extends Block {
	public EyesBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(6f, 15f).lightLevel(blockstate -> 15).requiresCorrectToolForDrops().speedFactor(0.8f).jumpFactor(0.6f).instrument(NoteBlockInstrument.HAT));
	}

	@Override
	public int getExpDrop(BlockState state, LevelAccessor level, BlockPos pos, BlockEntity blockEntity, Entity breaker, ItemStack tool) {
		return Mth.randomBetweenInclusive(level.getRandom(), 3, 5);
	}
}