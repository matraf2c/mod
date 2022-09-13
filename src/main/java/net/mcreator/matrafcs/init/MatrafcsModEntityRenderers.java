
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matrafcs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.matrafcs.client.renderer.TechnobladeRenderer;
import net.mcreator.matrafcs.client.renderer.PinguinRenderer;
import net.mcreator.matrafcs.client.renderer.KillerWhaleRenderer;
import net.mcreator.matrafcs.client.renderer.DiaganRenderer;
import net.mcreator.matrafcs.client.renderer.AirBossRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MatrafcsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MatrafcsModEntities.DIAGAN.get(), DiaganRenderer::new);
		event.registerEntityRenderer(MatrafcsModEntities.AIR_BOSS.get(), AirBossRenderer::new);
		event.registerEntityRenderer(MatrafcsModEntities.PINGUIN.get(), PinguinRenderer::new);
		event.registerEntityRenderer(MatrafcsModEntities.TECHNOBLADE.get(), TechnobladeRenderer::new);
		event.registerEntityRenderer(MatrafcsModEntities.KILLER_WHALE.get(), KillerWhaleRenderer::new);
	}
}
