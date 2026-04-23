package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PangeaCrateBlock extends Block {
	public PangeaCrateBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(3f, 17f).lightLevel(blockstate -> 3));
	}
}