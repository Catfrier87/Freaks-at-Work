/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.nightmare.entity.MeatProjectileEntity;
import net.mcreator.nightmare.entity.FuckerEntity;
import net.mcreator.nightmare.entity.ClusterEntity;
import net.mcreator.nightmare.NightmareMod;

@EventBusSubscriber
public class NightmareModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, NightmareMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<FuckerEntity>> FREAK = register("freak",
			EntityType.Builder.<FuckerEntity>of(FuckerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ClusterEntity>> CLUSTER = register("cluster",
			EntityType.Builder.<ClusterEntity>of(ClusterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<MeatProjectileEntity>> MEAT_PROJECTILE = register("meat_projectile",
			EntityType.Builder.<MeatProjectileEntity>of(MeatProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(NightmareMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		FuckerEntity.init(event);
		ClusterEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FREAK.get(), FuckerEntity.createAttributes().build());
		event.put(CLUSTER.get(), ClusterEntity.createAttributes().build());
	}
}