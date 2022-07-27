
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import idv.hailelectronic.earthpulsation.world.features.plants.FrozenBushFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.NickelOreFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.LumenCrystalStemFeature;
import idv.hailelectronic.earthpulsation.world.features.ores.CobaltOreFeature;
import idv.hailelectronic.earthpulsation.world.features.MapleTreeFeature;
import idv.hailelectronic.earthpulsation.EarthPulsationMod;

@Mod.EventBusSubscriber
public class EarthPulsationModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EarthPulsationMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ALUMINUM_ORE = register("aluminum_ore", AluminumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, AluminumOreFeature.GENERATE_BIOMES, AluminumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FORGOTTEN_IRON_ORE = register("forgotten_iron_ore", ForgottenIronOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ForgottenIronOreFeature.GENERATE_BIOMES,
					ForgottenIronOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LEAD_ORE = register("lead_ore", LeadOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LeadOreFeature.GENERATE_BIOMES, LeadOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TIN_ORE = register("tin_ore", TinOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TinOreFeature.GENERATE_BIOMES, TinOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVER_ORE = register("silver_ore", SilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES, SilverOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COBALT_ORE = register("cobalt_ore", CobaltOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CobaltOreFeature.GENERATE_BIOMES, CobaltOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NICKEL_ORE = register("nickel_ore", NickelOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NickelOreFeature.GENERATE_BIOMES, NickelOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUBY_ORE = register("ruby_ore", RubyOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES, RubyOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = register("sapphire_ore", SapphireOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, SapphireOreFeature.GENERATE_BIOMES, SapphireOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TOPAZ_ORE = register("topaz_ore", TopazOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TopazOreFeature.GENERATE_BIOMES, TopazOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLACK_GOLD_ORE = register("black_gold_ore", BlackGoldOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, BlackGoldOreFeature.GENERATE_BIOMES, BlackGoldOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ICE_BIRCH_SAPLING = register("ice_birch_sapling", ColdBirchFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ColdBirchFeature.GENERATE_BIOMES, ColdBirchFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FROZEN_BUSH = register("frozen_bush", FrozenBushFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, FrozenBushFeature.GENERATE_BIOMES, FrozenBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LUMEN_CRYSTAL_STEM = register("lumen_crystal_stem", LumenCrystalStemFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LumenCrystalStemFeature.GENERATE_BIOMES,
					LumenCrystalStemFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BIG_APPLE_BLOCK = register("big_apple_block", BigAppleBlockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BigAppleBlockFeature.GENERATE_BIOMES,
					BigAppleBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PLACE_ON_WATER_PLATE = register("place_on_water_plate", PlaceOnWaterPlateFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PlaceOnWaterPlateFeature.GENERATE_BIOMES,
					PlaceOnWaterPlateFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OBELISK_POINT = register("obelisk_point", ObeliskPointFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, ObeliskPointFeature.GENERATE_BIOMES, ObeliskPointFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAPLE_TREE = register("maple_tree", MapleTreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MapleTreeFeature.GENERATE_BIOMES, MapleTreeFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
