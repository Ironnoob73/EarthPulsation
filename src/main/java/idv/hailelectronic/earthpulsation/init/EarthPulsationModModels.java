
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import idv.hailelectronic.earthpulsation.client.model.Modelsteve;
import idv.hailelectronic.earthpulsation.client.model.Modelslime;
import idv.hailelectronic.earthpulsation.client.model.ModelFan;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EarthPulsationModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsteve.LAYER_LOCATION, Modelsteve::createBodyLayer);
		event.registerLayerDefinition(Modelslime.LAYER_LOCATION, Modelslime::createBodyLayer);
		event.registerLayerDefinition(ModelFan.LAYER_LOCATION, ModelFan::createBodyLayer);
	}
}
