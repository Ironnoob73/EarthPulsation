package idv.hailelectronic.earthpulsation.procedures;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.RegistryKey;

import java.util.Map;

import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class SapphireBiomeLocateProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency x for procedure SapphireBiomeLocate!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency y for procedure SapphireBiomeLocate!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency z for procedure SapphireBiomeLocate!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency world for procedure SapphireBiomeLocate!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& BiomeDictionary
						.hasType(
								RegistryKey
										.getOrCreateKey(Registry.BIOME_KEY,
												world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
								BiomeDictionary.Type.OCEAN))) {
			return (true);
		}
		return (false);
	}
}
