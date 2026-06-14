package net.mcreator.dreamprojection.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.dreamprojection.procedures.OpenSurgeryUIProcedure;
import net.mcreator.dreamprojection.init.DreamProjectionModBlocks;

public class SurgeryTableBlock extends UntintedParticleLeavesBlock {
	public SurgeryTableBlock(BlockBehaviour.Properties properties) {
		super(0.01f, ParticleTypes.SONIC_BOOM, properties.sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava()
				.instrument(NoteBlockInstrument.WITHER_SKELETON).isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 4;
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.DANGER_FIRE;
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		OpenSurgeryUIProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.register((bs, world, pos, index) -> {
			return world != null && pos != null ? Minecraft.getInstance().level.getBiome(pos).value().getFogColor() : 12638463;
		}, DreamProjectionModBlocks.SURGERY_TABLE.get());
	}
}