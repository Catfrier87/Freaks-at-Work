package net.mcreator.dreamprojection.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.dreamprojection.init.DreamProjectionModItems;

public class StunstickShockProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (itemstack.getItem() == DreamProjectionModItems.STUNSTICK.get()) {
			if (!(sourceentity instanceof Player _plrCldCheck3 && _plrCldCheck3.getCooldowns().isOnCooldown(itemstack))) {
				if (sourceentity instanceof Player _plr4 && _plr4.gameMode() == GameType.CREATIVE) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 40, 4, false, false));
				} else {
					if (hasEntityInInventory(sourceentity, new ItemStack(DreamProjectionModItems.SOUL_POWER.get()))) {
						if (sourceentity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(DreamProjectionModItems.SOUL_POWER.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 40, 4, false, false));
					}
				}
			}
		} else if (itemstack.getItem() == DreamProjectionModItems.SUPER_STUNSTICK.get()) {
			if (!(sourceentity instanceof Player _plrCldCheck12 && _plrCldCheck12.getCooldowns().isOnCooldown(itemstack))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 80, 4, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 80, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 80, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 35, 1, false, false));
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}