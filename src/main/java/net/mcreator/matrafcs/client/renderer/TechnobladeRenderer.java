
package net.mcreator.matrafcs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.matrafcs.entity.TechnobladeEntity;

public class TechnobladeRenderer extends MobRenderer<TechnobladeEntity, PigModel<TechnobladeEntity>> {
	public TechnobladeRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TechnobladeEntity entity) {
		return new ResourceLocation("matrafcs:textures/entities/pig.png");
	}
}
