
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

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

import idv.hailelectronic.earthpulsation.entity.SamjungNote7Entity;
import idv.hailelectronic.earthpulsation.entity.NormalGunEntity;
import idv.hailelectronic.earthpulsation.entity.ChairEntity;
import idv.hailelectronic.earthpulsation.EarthPulsationMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthPulsationModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, EarthPulsationMod.MODID);
	public static final RegistryObject<EntityType<PureSlimeEntity>> PURE_SLIME = register("pure_slime",
			EntityType.Builder.<PureSlimeEntity>of(PureSlimeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PureSlimeEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<WanderedMinnerEntity>> WANDERED_MINNER = register("wandered_minner",
			EntityType.Builder.<WanderedMinnerEntity>of(WanderedMinnerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WanderedMinnerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TinyTNTEntity>> TINY_TNT = register("projectile_tiny_tnt",
			EntityType.Builder.<TinyTNTEntity>of(TinyTNTEntity::new, MobCategory.MISC).setCustomClientFactory(TinyTNTEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MelonGunEntity>> MELON_GUN = register("projectile_melon_gun",
			EntityType.Builder.<MelonGunEntity>of(MelonGunEntity::new, MobCategory.MISC).setCustomClientFactory(MelonGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NormalGunEntity>> NORMAL_GUN = register("projectile_normal_gun",
			EntityType.Builder.<NormalGunEntity>of(NormalGunEntity::new, MobCategory.MISC).setCustomClientFactory(NormalGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SamjungNote7Entity>> SAMJUNG_NOTE_7 = register("projectile_samjung_note_7",
			EntityType.Builder.<SamjungNote7Entity>of(SamjungNote7Entity::new, MobCategory.MISC).setCustomClientFactory(SamjungNote7Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChairEntity>> CHAIR = register("chair",
			EntityType.Builder.<ChairEntity>of(ChairEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ChairEntity::new).fireImmune().sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PureSlimeEntity.init();
			WanderedMinnerEntity.init();
			ChairEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PURE_SLIME.get(), PureSlimeEntity.createAttributes().build());
		event.put(WANDERED_MINNER.get(), WanderedMinnerEntity.createAttributes().build());
		event.put(CHAIR.get(), ChairEntity.createAttributes().build());
	}
}
