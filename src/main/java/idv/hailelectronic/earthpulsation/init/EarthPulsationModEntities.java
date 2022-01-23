
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.ArrayList;

import idv.hailelectronic.earthpulsation.entity.WanderedMinnerEntity;
import idv.hailelectronic.earthpulsation.entity.TinyTNTEntity;
import idv.hailelectronic.earthpulsation.entity.SamjungNote7Entity;
import idv.hailelectronic.earthpulsation.entity.PureSlimeEntity;
import idv.hailelectronic.earthpulsation.entity.NormalGunEntity;
import idv.hailelectronic.earthpulsation.entity.MelonGunEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthPulsationModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<PureSlimeEntity> PURE_SLIME = register("pure_slime",
			EntityType.Builder.<PureSlimeEntity>of(PureSlimeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PureSlimeEntity::new).sized(1f, 1f));
	public static final EntityType<WanderedMinnerEntity> WANDERED_MINNER = register("wandered_minner",
			EntityType.Builder.<WanderedMinnerEntity>of(WanderedMinnerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WanderedMinnerEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<TinyTNTEntity> TINY_TNT = register("entitybullettiny_tnt",
			EntityType.Builder.<TinyTNTEntity>of(TinyTNTEntity::new, MobCategory.MISC).setCustomClientFactory(TinyTNTEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<MelonGunEntity> MELON_GUN = register("entitybulletmelon_gun",
			EntityType.Builder.<MelonGunEntity>of(MelonGunEntity::new, MobCategory.MISC).setCustomClientFactory(MelonGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<NormalGunEntity> NORMAL_GUN = register("entitybulletnormal_gun",
			EntityType.Builder.<NormalGunEntity>of(NormalGunEntity::new, MobCategory.MISC).setCustomClientFactory(NormalGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SamjungNote7Entity> SAMJUNG_NOTE_7 = register("entitybulletsamjung_note_7",
			EntityType.Builder.<SamjungNote7Entity>of(SamjungNote7Entity::new, MobCategory.MISC).setCustomClientFactory(SamjungNote7Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PureSlimeEntity.init();
			WanderedMinnerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PURE_SLIME, PureSlimeEntity.createAttributes().build());
		event.put(WANDERED_MINNER, WanderedMinnerEntity.createAttributes().build());
	}
}
