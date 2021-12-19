package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.world.entity.Entity;

public class NokiaKillProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
