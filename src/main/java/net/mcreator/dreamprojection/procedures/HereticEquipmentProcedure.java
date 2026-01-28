package net.mcreator.dreamprojection.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.dreamprojection.init.DreamProjectionModItems;

public class HereticEquipmentProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = new ItemStack(DreamProjectionModItems.HERETIC_DAGGER.get()).copy();
			_setstack.setCount(1);
			_modHandler.setStackInSlot(0, _setstack);
		}
	}
}