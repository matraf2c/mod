
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matrafcs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.matrafcs.entity.TechnobladeEntity;
import net.mcreator.matrafcs.entity.PinguinEntity;
import net.mcreator.matrafcs.entity.KillerWhaleEntity;
import net.mcreator.matrafcs.entity.DiaganEntity;
import net.mcreator.matrafcs.entity.AirBossEntity;
import net.mcreator.matrafcs.MatrafcsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MatrafcsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MatrafcsMod.MODID);
	public static final RegistryObject<EntityType<DiaganEntity>> DIAGAN = register("diagan",
			EntityType.Builder.<DiaganEntity>of(DiaganEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DiaganEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<AirBossEntity>> AIR_BOSS = register("air_boss",
			EntityType.Builder.<AirBossEntity>of(AirBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AirBossEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PinguinEntity>> PINGUIN = register("pinguin",
			EntityType.Builder.<PinguinEntity>of(PinguinEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PinguinEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<TechnobladeEntity>> TECHNOBLADE = register("technoblade",
			EntityType.Builder.<TechnobladeEntity>of(TechnobladeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TechnobladeEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<KillerWhaleEntity>> KILLER_WHALE = register("killer_whale",
			EntityType.Builder.<KillerWhaleEntity>of(KillerWhaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KillerWhaleEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DiaganEntity.init();
			AirBossEntity.init();
			PinguinEntity.init();
			TechnobladeEntity.init();
			KillerWhaleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DIAGAN.get(), DiaganEntity.createAttributes().build());
		event.put(AIR_BOSS.get(), AirBossEntity.createAttributes().build());
		event.put(PINGUIN.get(), PinguinEntity.createAttributes().build());
		event.put(TECHNOBLADE.get(), TechnobladeEntity.createAttributes().build());
		event.put(KILLER_WHALE.get(), KillerWhaleEntity.createAttributes().build());
	}
}
