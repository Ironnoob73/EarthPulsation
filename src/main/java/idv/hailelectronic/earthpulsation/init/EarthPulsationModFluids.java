
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class EarthPulsationModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, EarthPulsationMod.MODID);
	public static final RegistryObject<Fluid> WARPED_WART_SLURRIES = REGISTRY.register("warped_wart_slurries",
			() -> new WarpedWartSlurriesFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_WARPED_WART_SLURRIES = REGISTRY.register("flowing_warped_wart_slurries",
			() -> new WarpedWartSlurriesFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(WARPED_WART_SLURRIES.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WARPED_WART_SLURRIES.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
