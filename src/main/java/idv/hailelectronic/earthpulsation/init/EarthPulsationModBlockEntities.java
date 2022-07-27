
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import idv.hailelectronic.earthpulsation.block.entity.CoalGeneratorBlockEntity;
import idv.hailelectronic.earthpulsation.block.entity.BatteryBlockBlockEntity;
import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class EarthPulsationModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			EarthPulsationMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> RESEARCH_STATION = register("research_station", EarthPulsationModBlocks.RESEARCH_STATION,
			ResearchStationBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REFINER_LIT = register("refiner_lit", EarthPulsationModBlocks.REFINER_LIT,
			RefinerLitBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRINDER = register("grinder", EarthPulsationModBlocks.GRINDER, GrinderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REINFORCED_SIEVE = register("reinforced_sieve", EarthPulsationModBlocks.REINFORCED_SIEVE,
			ReinforcedSieveBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BASIN = register("basin", EarthPulsationModBlocks.BASIN, BasinBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COAL_GENERATOR = register("coal_generator", EarthPulsationModBlocks.COAL_GENERATOR,
			CoalGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BATTERY_BLOCK = register("battery_block", EarthPulsationModBlocks.BATTERY_BLOCK,
			BatteryBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
