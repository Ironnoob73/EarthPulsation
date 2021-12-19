
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import idv.hailelectronic.earthpulsation.world.features.plants.PlaceOnWaterPlateFeature;
import idv.hailelectronic.earthpulsation.world.features.plants.FrozenBushFeature;
import idv.hailelectronic.earthpulsation.world.features.plants.ColdBirchFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.TopazOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.TinOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.SilverOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.SapphireOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.RubyOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.NickelOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.LumenCrystalStemFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.LeadOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.ForgottenIronOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.CopperOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.CobaltOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.BlackGoldOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.BigAppleBlockFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.AluminumOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ObeliskPointFeature;
import idv.hailelectronic.earthpulsation.world.features.MapleTreeFeature;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthPulsationModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(CopperOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CopperOreFeature.GENERATE_BIOMES,
				CopperOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AluminumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AluminumOreFeature.GENERATE_BIOMES, AluminumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ForgottenIronOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ForgottenIronOreFeature.GENERATE_BIOMES, ForgottenIronOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LeadOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LeadOreFeature.GENERATE_BIOMES,
				LeadOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TinOreFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TinOreFeature.GENERATE_BIOMES, TinOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SilverOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES,
				SilverOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CobaltOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CobaltOreFeature.GENERATE_BIOMES,
				CobaltOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NickelOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NickelOreFeature.GENERATE_BIOMES,
				NickelOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES,
				RubyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SapphireOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SapphireOreFeature.GENERATE_BIOMES, SapphireOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TopazOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TopazOreFeature.GENERATE_BIOMES,
				TopazOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlackGoldOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BlackGoldOreFeature.GENERATE_BIOMES, BlackGoldOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ColdBirchFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ColdBirchFeature.GENERATE_BIOMES,
				ColdBirchFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FrozenBushFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				FrozenBushFeature.GENERATE_BIOMES, FrozenBushFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LumenCrystalStemFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				LumenCrystalStemFeature.GENERATE_BIOMES, LumenCrystalStemFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BigAppleBlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BigAppleBlockFeature.GENERATE_BIOMES, BigAppleBlockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PlaceOnWaterPlateFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlaceOnWaterPlateFeature.GENERATE_BIOMES, PlaceOnWaterPlateFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ObeliskPointFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				ObeliskPointFeature.GENERATE_BIOMES, ObeliskPointFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MapleTreeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MapleTreeFeature.GENERATE_BIOMES,
				MapleTreeFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
