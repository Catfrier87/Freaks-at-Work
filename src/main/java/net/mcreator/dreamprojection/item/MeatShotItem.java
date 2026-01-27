package net.mcreator.dreamprojection.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.*;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.dreamprojection.entity.MeatProjectileEntity;

public class MeatShotItem extends Item {
	public MeatShotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).durability(384));
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return 72000;
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = InteractionResult.FAIL;
		if (entity.getAbilities().instabuild || findAmmo(entity) != ItemStack.EMPTY) {
			ar = InteractionResult.SUCCESS;
			entity.startUsingItem(hand);
		}
		return ar;
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		if (!world.isClientSide() && entity instanceof ServerPlayer player) {
			float pullingPower = BowItem.getPowerForTime(this.getUseDuration(itemstack, player) - time);
			if (pullingPower < 0.1)
				return false;
			ItemStack stack = findAmmo(player);
			if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
				MeatProjectileEntity projectile = MeatProjectileEntity.shoot(world, entity, world.getRandom(), pullingPower);
				itemstack.hurtAndBreak(1, entity, LivingEntity.getSlotForHand(entity.getUsedItemHand()));
				if (player.getAbilities().instabuild) {
					projectile.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
				} else {
					if (stack.isDamageableItem()) {
						if (world instanceof ServerLevel serverLevel)
							stack.hurtAndBreak(1, serverLevel, player, _stkprov -> {
							});
					} else {
						stack.shrink(1);
					}
				}
			}
		}
		return super.releaseUsing(itemstack, world, entity, time);
	}

	private ItemStack findAmmo(Player player) {
		ItemStack stack = ProjectileWeaponItem.getHeldProjectile(player, e -> e.getItem() == MeatProjectileEntity.PROJECTILE_ITEM.getItem());
		if (stack == ItemStack.EMPTY) {
			for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
				ItemStack teststack = player.getInventory().getItem(i);
				if (teststack != null && teststack.getItem() == MeatProjectileEntity.PROJECTILE_ITEM.getItem()) {
					stack = teststack;
					break;
				}
			}
		}
		return stack;
	}
}