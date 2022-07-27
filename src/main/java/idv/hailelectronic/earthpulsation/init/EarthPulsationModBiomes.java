
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

import net.minecraft.world.level.biome.Biome;

import idv.hailelectronic.earthpulsation.world.biome.BlazingWastelandBiome;
import idv.hailelectronic.earthpulsation.EarthPulsationMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthPulsationModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, EarthPulsationMod.MODID);
	public static final RegistryObject<Biome> ICE_DESERT = REGISTRY.register("ice_desert", () -> IceDesertBiome.createBiome());
	public static final RegistryObject<Biome> BLAZING_WASTELAND = REGISTRY.register("blazing_wasteland", () -> BlazingWastelandBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IceDesertBiome.init();
			BlazingWastelandBiome.init();
		});
	}
}
