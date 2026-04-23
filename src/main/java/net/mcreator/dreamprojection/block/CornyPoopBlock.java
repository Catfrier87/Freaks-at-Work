package net.mcreator.dreamprojection.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class CornyPoopBlock extends Block {
	public CornyPoopBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WART_BLOCK).strength(8f, 10f).instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}
}