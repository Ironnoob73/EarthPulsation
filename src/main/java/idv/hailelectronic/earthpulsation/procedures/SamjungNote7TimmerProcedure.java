package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

public class SamjungNote7TimmerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("FlyTime") >= 1) {
			entity.getPersistentData().putDouble("FlyTime", (entity.getPersistentData().getDouble("FlyTime") + 1));
		} else if (entity.getPersistentData().getDouble("FlyTime") >= 20) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 8, Explosion.BlockInteraction.BREAK);
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			entity.getPersistentData().putDouble("FlyTime", 1);
		}
	}
}
