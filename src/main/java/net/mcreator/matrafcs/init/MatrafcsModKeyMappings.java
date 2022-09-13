
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matrafcs.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.matrafcs.network.ActivateJetPackMessage;
import net.mcreator.matrafcs.MatrafcsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MatrafcsModKeyMappings {
	public static final KeyMapping ACTIVATE_JET_PACK = new KeyMapping("key.matrafcs.activate_jet_pack", GLFW.GLFW_KEY_J, "key.categories.misc");
	private static long ACTIVATE_JET_PACK_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(ACTIVATE_JET_PACK);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == ACTIVATE_JET_PACK.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MatrafcsMod.PACKET_HANDLER.sendToServer(new ActivateJetPackMessage(0, 0));
						ActivateJetPackMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						ACTIVATE_JET_PACK_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - ACTIVATE_JET_PACK_LASTPRESS);
						MatrafcsMod.PACKET_HANDLER.sendToServer(new ActivateJetPackMessage(1, dt));
						ActivateJetPackMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
			}
		}
	}
}
