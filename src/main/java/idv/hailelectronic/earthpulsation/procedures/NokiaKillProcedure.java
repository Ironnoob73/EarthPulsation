package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class NokiaKillProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency entity for procedure NokiaKill!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote())
			entity.remove();
	}
}
