package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;

import java.util.Map;

import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class PureSlimeSpawnProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency world for procedure PureSlimeSpawn!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
				new ResourceLocation("earth_pulsation:old_age"))))) {
			return (true);
		}
		return (false);
	}
}
