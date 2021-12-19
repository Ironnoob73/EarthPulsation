
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.ArrayList;

import idv.hailelectronic.earthpulsation.world.biome.IceDesertBiome;
import idv.hailelectronic.earthpulsation.world.biome.BlazingWastelandBiome;
import idv.hailelectronic.earthpulsation.EarthPulsationMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthPulsationModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome ICE_DESERT = register("ice_desert", IceDesertBiome.createBiome());
	public static Biome BLAZING_WASTELAND = register("blazing_wasteland", BlazingWastelandBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(EarthPulsationMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IceDesertBiome.init();
			BlazingWastelandBiome.init();
		});
	}
}
