package idv.hailelectronic.earthpulsation.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import idv.hailelectronic.earthpulsation.entity.WanderedMinnerEntity;

public class WanderedMinnerRenderer extends HumanoidMobRenderer<WanderedMinnerEntity, HumanoidModel<WanderedMinnerEntity>> {
	public WanderedMinnerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(WanderedMinnerEntity entity) {
		return new ResourceLocation("earth_pulsation:textures/stone_guard.png");
	}
}
