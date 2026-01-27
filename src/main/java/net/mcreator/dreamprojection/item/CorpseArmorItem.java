package net.mcreator.dreamprojection.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Map;

public abstract class CorpseArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(24, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 2, ArmorType.BODY, 6), 9,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.wither.spawn")), 3f, 0.2f, TagKey.create(Registries.ITEM, ResourceLocation.parse("dream_projection:corpse_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("dream_projection:corpse_armor")));

	private CorpseArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends CorpseArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends CorpseArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends CorpseArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends CorpseArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}