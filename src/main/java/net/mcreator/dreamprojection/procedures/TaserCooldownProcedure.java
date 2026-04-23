package net.mcreator.dreamprojection.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.dreamprojection.init.DreamProjectionModItems;

public class TaserCooldownProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == DreamProjectionModItems.TASER.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack, 60);
		} else if (itemstack.getItem() == DreamProjectionModItems.SUPER_TASER.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack, 40);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.STRENGTH, 80, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SPEED, 80, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 8000, 1, false, false));
		}
	}
}