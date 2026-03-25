package net.mcreator.dreamprojection.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.BlockPos;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import java.util.Set;

public class NightmaresEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(getEntityGameType(entity) == GameType.CREATIVE)) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dream_projection:infinite_forest"))) {
				if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _serverLevel) {
					ResourceKey<Level> destinationType = Level.OVERWORLD;
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
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity instanceof ServerPlayer _player)
									? (_player.getRespawnConfig() != null && (_player.getRespawnConfig().dimension().equals(_player.level().dimension())) ? _player.getRespawnConfig().pos().getX() : _player.level().getLevelData().getSpawnPos().getX())
									: 0),
							((entity instanceof ServerPlayer _player)
									? (_player.getRespawnConfig() != null && (_player.getRespawnConfig().dimension().equals(_player.level().dimension())) ? _player.getRespawnConfig().pos().getY() : _player.level().getLevelData().getSpawnPos().getY())
									: 0),
							((entity instanceof ServerPlayer _player)
									? (_player.getRespawnConfig() != null && (_player.getRespawnConfig().dimension().equals(_player.level().dimension())) ? _player.getRespawnConfig().pos().getZ() : _player.level().getLevelData().getSpawnPos().getZ())
									: 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof ServerPlayer _player)
								? (_player.getRespawnConfig() != null && (_player.getRespawnConfig().dimension().equals(_player.level().dimension())) ? _player.getRespawnConfig().pos().getX() : _player.level().getLevelData().getSpawnPos().getX())
								: 0),
								((entity instanceof ServerPlayer _player)
										? (_player.getRespawnConfig() != null && (_player.getRespawnConfig().dimension().equals(_player.level().dimension()))
												? _player.getRespawnConfig().pos().getY()
												: _player.level().getLevelData().getSpawnPos().getY())
										: 0),
								((entity instanceof ServerPlayer _player)
										? (_player.getRespawnConfig() != null && (_player.getRespawnConfig().dimension().equals(_player.level().dimension()))
												? _player.getRespawnConfig().pos().getZ()
												: _player.level().getLevelData().getSpawnPos().getZ())
										: 0),
								_ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}