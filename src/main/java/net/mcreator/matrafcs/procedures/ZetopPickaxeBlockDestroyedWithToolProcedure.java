package net.mcreator.matrafcs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.Mth;

import java.util.Random;

public class ZetopPickaxeBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("tagName", (Mth.nextInt(new Random(), 1, 10)));
		if (itemstack.getOrCreateTag().getDouble("tagName") == 1) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.BREAK);
		}
	}
}
