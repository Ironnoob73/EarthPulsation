package idv.hailelectronic.earthpulsation.procedures;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class RubyBiomeLocateProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName() != null
				&& BiomeDictionary
						.hasType(
								ResourceKey
										.create(Registry.BIOME_REGISTRY,
												world.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY)
														.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
								BiomeDictionary.Type.JUNGLE)) {
			return true;
		}
		return false;
	}
}
