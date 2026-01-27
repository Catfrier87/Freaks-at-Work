package net.mcreator.dreamprojection.client.renderer.item;

import net.minecraft.client.model.Model;

@EventBusSubscriber(Dist.CLIENT)
public class CorpseArmorArmor {

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("dream_projection:textures/models/armor/flesh_layer_1.png");
			}
		}, DreamProjectionModItems.CORPSE_ARMOR_HELMET.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("dream_projection:textures/models/armor/flesh_layer_1.png");
			}
		}, DreamProjectionModItems.CORPSE_ARMOR_CHESTPLATE.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("dream_projection:textures/models/armor/flesh_layer_2.png");
			}
		}, DreamProjectionModItems.CORPSE_ARMOR_LEGGINGS.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("dream_projection:textures/models/armor/flesh_layer_1.png");
			}
		}, DreamProjectionModItems.CORPSE_ARMOR_BOOTS.get());
	}

}