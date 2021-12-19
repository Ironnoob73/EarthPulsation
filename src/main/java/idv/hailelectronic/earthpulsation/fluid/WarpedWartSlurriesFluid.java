
package idv.hailelectronic.earthpulsation.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModItems;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModFluids;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModBlocks;

public abstract class WarpedWartSlurriesFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> EarthPulsationModFluids.WARPED_WART_SLURRIES,
			() -> EarthPulsationModFluids.FLOWING_WARPED_WART_SLURRIES,
			FluidAttributes
					.builder(new ResourceLocation("earth_pulsation:blocks/warped_wart_slurries_still"),
							new ResourceLocation("earth_pulsation:blocks/warped_wart_slurries_flow"))

					.viscosity(4000).temperature(350)

	).explosionResistance(100f)

			.tickRate(10).levelDecreasePerBlock(2).slopeFindDistance(1).bucket(() -> EarthPulsationModItems.WARPED_WART_SLURRIES_BUCKET)
			.block(() -> (LiquidBlock) EarthPulsationModBlocks.WARPED_WART_SLURRIES);

	private WarpedWartSlurriesFluid() {
		super(PROPERTIES);
	}

	public static class Source extends WarpedWartSlurriesFluid {
		public Source() {
			super();
			setRegistryName("warped_wart_slurries");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends WarpedWartSlurriesFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_warped_wart_slurries");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
