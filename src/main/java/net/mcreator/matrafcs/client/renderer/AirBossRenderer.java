
package net.mcreator.matrafcs.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.matrafcs.entity.AirBossEntity;

public class AirBossRenderer extends HumanoidMobRenderer<AirBossEntity, HumanoidModel<AirBossEntity>> {
	public AirBossRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(AirBossEntity entity) {
		return new ResourceLocation("matrafcs:textures/entities/hmvsnxhc6xxmad4556dofgtwrvq1apvq1atwrvq1apvq1btno0pj6saxf4ndrkaaaaasuvork5cyii.png");
	}
}
