package net.mcreator.dreamprojection.procedures;

import net.neoforged.bus.api.Event;

public class SplungerRightclickedOnEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == DreamProjectionModItems.BEAST_DIMENSION.get()) {
			if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _serverLevel) {
				ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("dream_projection:forest_dimension"));
				if (_player.level().dimension() == destinationType)
					return;
				ServerLevel nextLevel = _serverLevel.getServer().getLevel(destinationType);
				if (nextLevel != null) {
					_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
					_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), Set.of(), _player.getYRot(), _player.getXRot(), true);
					_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
					for (MobEffectInstance _effectinstance : _player.getActiveEffects())
						_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
					_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
				}
			}
		}
	}
}