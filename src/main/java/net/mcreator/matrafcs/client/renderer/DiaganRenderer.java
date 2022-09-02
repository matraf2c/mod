
package net.mcreator.matrafcs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.matrafcs.entity.DiaganEntity;

public class DiaganRenderer extends MobRenderer<DiaganEntity, OcelotModel<DiaganEntity>> {
	public DiaganRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DiaganEntity entity) {
		return new ResourceLocation("matrafcs:textures/entities/diagan.png");
	}
}
