package idv.hailelectronic.earthpulsation.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import idv.hailelectronic.earthpulsation.entity.PureSlimeEntity;
import idv.hailelectronic.earthpulsation.client.model.Modelslime;

public class PureSlimeRenderer extends MobRenderer<PureSlimeEntity, Modelslime<PureSlimeEntity>> {
	public PureSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelslime(context.bakeLayer(Modelslime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PureSlimeEntity entity) {
		return new ResourceLocation("earth_pulsation:textures/slime.png");
	}
}
