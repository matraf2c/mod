
package net.mcreator.matrafcs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.matrafcs.entity.PinguinEntity;
import net.mcreator.matrafcs.client.model.Modelcustom_model;

public class PinguinRenderer extends MobRenderer<PinguinEntity, Modelcustom_model<PinguinEntity>> {
	public PinguinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PinguinEntity entity) {
		return new ResourceLocation("matrafcs:textures/entities/texture.png");
	}
}
