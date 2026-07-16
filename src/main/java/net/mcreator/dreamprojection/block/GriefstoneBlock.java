package net.mcreator.dreamprojection.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class GriefstoneBlock extends Block {
	public GriefstoneBlock(BlockBehaviour.Properties properties) {
		super(properties
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("dream_projection:grief")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("dream_projection:grief2")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("dream_projection:grief")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("dream_projection:grief2")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("dream_projection:grief2"))))
				.strength(5f, 25f).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).instrument(NoteBlockInstrument.CHIME));
	}
}