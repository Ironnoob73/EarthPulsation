
package idv.hailelectronic.earthpulsation.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import idv.hailelectronic.earthpulsation.procedures.InWWSProcedure;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModFluids;

public class WarpedWartSlurriesBlock extends LiquidBlock {
	public WarpedWartSlurriesBlock() {
		super(EarthPulsationModFluids.WARPED_WART_SLURRIES,
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.WARPED_WART_BLOCK).strength(100f)

		);
		setRegistryName("warped_wart_slurries");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		InWWSProcedure.execute(entity);
	}
}
