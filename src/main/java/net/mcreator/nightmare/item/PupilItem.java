package net.mcreator.nightmare.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.core.component.DataComponents;

import net.mcreator.nightmare.init.NightmareModItems;

@EventBusSubscriber
public class PupilItem extends Item {
	public PupilItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.1f).build()));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(NightmareModItems.PUPIL.get(), builder -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStack(NightmareModItems.MEAT.get()))));
	}
}