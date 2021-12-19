
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import idv.hailelectronic.earthpulsation.block.entity.ResearchStationBlockEntity;
import idv.hailelectronic.earthpulsation.block.entity.ReinforcedSieveBlockEntity;
import idv.hailelectronic.earthpulsation.block.entity.RefinerLitBlockEntity;
import idv.hailelectronic.earthpulsation.block.entity.GrinderBlockEntity;
import idv.hailelectronic.earthpulsation.block.entity.CoalGeneratorBlockEntity;
import idv.hailelectronic.earthpulsation.block.entity.BatteryBlockBlockEntity;
import idv.hailelectronic.earthpulsation.block.entity.BasinBlockEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthPulsationModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> RESEARCH_STATION = register("earth_pulsation:research_station", EarthPulsationModBlocks.RESEARCH_STATION,
			ResearchStationBlockEntity::new);
	public static final BlockEntityType<?> REFINER_LIT = register("earth_pulsation:refiner_lit", EarthPulsationModBlocks.REFINER_LIT,
			RefinerLitBlockEntity::new);
	public static final BlockEntityType<?> GRINDER = register("earth_pulsation:grinder", EarthPulsationModBlocks.GRINDER, GrinderBlockEntity::new);
	public static final BlockEntityType<?> REINFORCED_SIEVE = register("earth_pulsation:reinforced_sieve", EarthPulsationModBlocks.REINFORCED_SIEVE,
			ReinforcedSieveBlockEntity::new);
	public static final BlockEntityType<?> BASIN = register("earth_pulsation:basin", EarthPulsationModBlocks.BASIN, BasinBlockEntity::new);
	public static final BlockEntityType<?> COAL_GENERATOR = register("earth_pulsation:coal_generator", EarthPulsationModBlocks.COAL_GENERATOR,
			CoalGeneratorBlockEntity::new);
	public static final BlockEntityType<?> BATTERY_BLOCK = register("earth_pulsation:battery_block", EarthPulsationModBlocks.BATTERY_BLOCK,
			BatteryBlockBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
