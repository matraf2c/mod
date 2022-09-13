package net.mcreator.matrafcs.procedures;

import net.minecraft.world.entity.Entity;

public class ActivateJetPackOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("fly", (true));
	}
}
