package idv.hailelectronic.earthpulsation.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import idv.hailelectronic.earthpulsation.entity.PureSlimeEntity;

public class PureSlimeRenderer extends MobRenderer<PureSlimeEntity, SlimeModel<PureSlimeEntity>> {
	public PureSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PureSlimeEntity entity) {
		return new ResourceLocation("earth_pulsation:textures/slime.png");
	}
}
