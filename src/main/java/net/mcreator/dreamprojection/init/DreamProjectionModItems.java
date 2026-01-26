/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import net.mcreator.dreamprojection.item.MeatItem;
import net.mcreator.dreamprojection.DreamProjectionMod;

import java.util.function.Function;

public class DreamProjectionModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DreamProjectionMod.MODID);
	public static final DeferredItem<Item> MEAT;
	public static final DeferredItem<Item> FREAK_SPAWN_EGG;
	static {
		MEAT = register("meat", MeatItem::new);
		FREAK_SPAWN_EGG = register("freak_spawn_egg", properties -> new SpawnEggItem(DreamProjectionModEntities.FREAK.get(), properties));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}