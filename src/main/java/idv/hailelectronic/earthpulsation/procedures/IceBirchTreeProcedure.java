package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModBlocks;

public class IceBirchTreeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rand = 0;
		if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z)) && world.isEmptyBlock(new BlockPos((int) x, (int) (y + 2), (int) z))
				&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 3), (int) z))
				&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 4), (int) z))
				&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 5), (int) z))
				&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 6), (int) z))) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), EarthPulsationModBlocks.ICE_BIRCH_LOG.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LOG.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 2), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LOG.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 3), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LOG.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 4), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LOG.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 5), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LOG.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 6), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LOG.defaultBlockState(), 3);
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 7), (int) z))) {
				world.setBlock(new BlockPos((int) x, (int) (y + 7), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 7), (int) (z + 1)))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) x, (int) (y + 7), (int) (z + 1)), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(),
							3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 7), (int) (z + -1)))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) x, (int) (y + 7), (int) (z + -1)), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(),
							3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 7), (int) z))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + 1), (int) (y + 7), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(),
							3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 7), (int) z))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + -1), (int) (y + 7), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(),
							3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 6), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) x, (int) (y + 6), (int) (z + 1)), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 6), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) x, (int) (y + 6), (int) (z + -1)), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 6), (int) z))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 6), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 6), (int) z))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 6), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 5), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) x, (int) (y + 5), (int) (z + 1)), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 5), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) x, (int) (y + 5), (int) (z + -1)), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) z))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) z))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) (z + 1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + -1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + 2)))) {
				world.setBlock(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + 2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) (z + -1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 2)))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) (z + 2)))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) (z + 2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + -2)))) {
				world.setBlock(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + -2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + -2)))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + -2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) (z + -2)))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 5), (int) (z + -2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 0)))) {
				world.setBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 0)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + -1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 5), (int) (z + 0)))) {
				world.setBlock(new BlockPos((int) (x + -2), (int) (y + 5), (int) (z + 0)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 5), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) (x + -2), (int) (y + 5), (int) (z + 1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 5), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) (x + -2), (int) (y + 5), (int) (z + -1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 2)))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 2)),
							EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + -2)))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + -2)),
							EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 5), (int) (z + 2)))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + -2), (int) (y + 5), (int) (z + 2)),
							EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 5), (int) (z + -2)))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + -2)),
							EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 4), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) x, (int) (y + 4), (int) (z + 1)), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 4), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) x, (int) (y + 4), (int) (z + -1)), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) z))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) z))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) z), EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) (z + 1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + -1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z + 2)))) {
				world.setBlock(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z + 2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) (z + -1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 2)))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) (z + 2)))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) (z + 2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z + -2)))) {
				world.setBlock(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z + -2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + -2)))) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + -2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) (z + -2)))) {
				world.setBlock(new BlockPos((int) (x + -1), (int) (y + 4), (int) (z + -2)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 0)))) {
				world.setBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 0)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + -1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 4), (int) (z + 0)))) {
				world.setBlock(new BlockPos((int) (x + -2), (int) (y + 4), (int) (z + 0)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 4), (int) (z + 1)))) {
				world.setBlock(new BlockPos((int) (x + -2), (int) (y + 4), (int) (z + 1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 4), (int) (z + -1)))) {
				world.setBlock(new BlockPos((int) (x + -2), (int) (y + 4), (int) (z + -1)),
						EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 2)))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 2)),
							EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + -2)))) {
				rand = Math.random();
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + -2)),
							EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 4), (int) (z + 2)))) {
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + -2), (int) (y + 4), (int) (z + 2)),
							EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) (x + -2), (int) (y + 4), (int) (z + -2)))) {
				if (rand >= 0.5) {
					world.setBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + -2)),
							EarthPulsationModBlocks.ICE_BIRCH_LEAVES.defaultBlockState(), 3);
				}
			}
		}
	}
}
