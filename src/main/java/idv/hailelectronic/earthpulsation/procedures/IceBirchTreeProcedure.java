package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

import idv.hailelectronic.earthpulsation.block.IceBirchLogBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchLeavesBlock;
import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class IceBirchTreeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency x for procedure IceBirchTree!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency y for procedure IceBirchTree!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency z for procedure IceBirchTree!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency world for procedure IceBirchTree!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double rand = 0;
		if (((((world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) && (world.isAirBlock(new BlockPos((int) x, (int) (y + 2), (int) z))))
				&& ((world.isAirBlock(new BlockPos((int) x, (int) (y + 3), (int) z)))
						&& (world.isAirBlock(new BlockPos((int) x, (int) (y + 4), (int) z)))))
				&& ((world.isAirBlock(new BlockPos((int) x, (int) (y + 5), (int) z)))
						&& (world.isAirBlock(new BlockPos((int) x, (int) (y + 6), (int) z)))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), IceBirchLogBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), IceBirchLogBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), IceBirchLogBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), IceBirchLogBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), IceBirchLogBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) z), IceBirchLogBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 6), (int) z), IceBirchLogBlock.block.getDefaultState(), 3);
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 7), (int) z)))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 7), (int) z), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 7), (int) (z + 1))))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 7), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 7), (int) (z + (-1)))))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 7), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 7), (int) z)))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 7), (int) z), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 7), (int) z)))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 7), (int) z), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 6), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 6), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 6), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 6), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 6), (int) z)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 6), (int) z), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 6), (int) z)))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 6), (int) z), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 5), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 5), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) z)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) z), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) z)))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) z), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + 2))))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 2))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) (z + 2))))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + (-2)))))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + (-2)))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) (z + (-2)))))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 5), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 0))))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 0)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 5), (int) (z + 0))))) {
				world.setBlockState(new BlockPos((int) (x + (-2)), (int) (y + 5), (int) (z + 0)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 5), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x + (-2)), (int) (y + 5), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 5), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) (x + (-2)), (int) (y + 5), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 2))))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + (-2)))))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 5), (int) (z + 2))))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + (-2)), (int) (y + 5), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 5), (int) (z + (-2)))))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 4), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 4), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) z)))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 4), (int) z), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) z)))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) z), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z + 2))))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 2))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) (z + 2))))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z + (-2)))))) {
				world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + (-2)))))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 4), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) (z + (-2)))))) {
				world.setBlockState(new BlockPos((int) (x + (-1)), (int) (y + 4), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 0))))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 0)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 4), (int) (z + 0))))) {
				world.setBlockState(new BlockPos((int) (x + (-2)), (int) (y + 4), (int) (z + 0)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 4), (int) (z + 1))))) {
				world.setBlockState(new BlockPos((int) (x + (-2)), (int) (y + 4), (int) (z + 1)), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 4), (int) (z + (-1)))))) {
				world.setBlockState(new BlockPos((int) (x + (-2)), (int) (y + 4), (int) (z + (-1))), IceBirchLeavesBlock.block.getDefaultState(), 3);
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 2))))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + (-2)))))) {
				rand = (double) Math.random();
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 4), (int) (z + 2))))) {
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + (-2)), (int) (y + 4), (int) (z + 2)), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
			if ((world.isAirBlock(new BlockPos((int) (x + (-2)), (int) (y + 4), (int) (z + (-2)))))) {
				if ((rand >= 0.5)) {
					world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 4), (int) (z + (-2))), IceBirchLeavesBlock.block.getDefaultState(), 3);
				}
			}
		}
	}
}
