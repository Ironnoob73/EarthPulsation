package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import java.util.Comparator;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModEntities;
import idv.hailelectronic.earthpulsation.entity.ChairEntity;

public class SitOnChairProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isPassenger()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ChairEntity(EarthPulsationModEntities.CHAIR.get(), _level);
				entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			entity.startRiding(
					((Entity) world.getEntitiesOfClass(ChairEntity.class, AABB.ofSize(new Vec3((x + 0.5), y, (z + 0.5)), 1, 1, 1), e -> true).stream()
							.sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf((x + 0.5), y, (z + 0.5))).findFirst().orElse(null)));
		}
	}
}
