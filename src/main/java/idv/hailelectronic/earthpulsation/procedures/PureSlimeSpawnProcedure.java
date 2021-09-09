package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.world.World;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;

import java.util.Map;

import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class PureSlimeSpawnProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("dimension") == null) {
			if (!dependencies.containsKey("dimension"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency dimension for procedure PureSlimeSpawn!");
			return false;
		}
		RegistryKey<World> dimension = (RegistryKey<World>) dependencies.get("dimension");
		if (((dimension) == (RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("earth_pulsation:old_age"))))) {
			return (true);
		}
		return (false);
	}
}
