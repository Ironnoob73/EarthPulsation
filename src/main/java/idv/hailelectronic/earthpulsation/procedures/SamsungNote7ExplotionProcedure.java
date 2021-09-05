package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;

import java.util.Map;

import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class SamsungNote7ExplotionProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency x for procedure SamsungNote7Explotion!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency y for procedure SamsungNote7Explotion!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency z for procedure SamsungNote7Explotion!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency world for procedure SamsungNote7Explotion!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 8, Explosion.Mode.DESTROY);
		}
	}
}
