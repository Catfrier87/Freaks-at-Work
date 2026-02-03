package net.mcreator.dreamprojection.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.dreamprojection.init.DreamProjectionModMobEffects;
import net.mcreator.dreamprojection.init.DreamProjectionModEntities;

import javax.annotation.Nullable;

@EventBusSubscriber
public class EffectinsomniaProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Distance = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(DreamProjectionModMobEffects.INSOMNIA)) {
			if (Mth.nextDouble(RandomSource.create(), 1, 60) == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = DreamProjectionModEntities.H_7362.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getX(), entity.getX()), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
		}
	}
}