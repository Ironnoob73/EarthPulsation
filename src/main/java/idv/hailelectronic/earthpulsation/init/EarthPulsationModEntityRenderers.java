
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import idv.hailelectronic.earthpulsation.client.renderer.WanderedMinnerRenderer;
import idv.hailelectronic.earthpulsation.client.renderer.PureSlimeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EarthPulsationModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EarthPulsationModEntities.PURE_SLIME, PureSlimeRenderer::new);
		event.registerEntityRenderer(EarthPulsationModEntities.WANDERED_MINNER, WanderedMinnerRenderer::new);
		event.registerEntityRenderer(EarthPulsationModEntities.TINY_TNT, ThrownItemRenderer::new);
		event.registerEntityRenderer(EarthPulsationModEntities.MELON_GUN, ThrownItemRenderer::new);
		event.registerEntityRenderer(EarthPulsationModEntities.SAMSUNG_NOTE_7, ThrownItemRenderer::new);
	}
}
