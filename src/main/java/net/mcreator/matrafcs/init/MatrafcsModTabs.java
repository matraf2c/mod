
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matrafcs.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MatrafcsModTabs {
	public static CreativeModeTab TAB_MATRAF_2C;

	public static void load() {
		TAB_MATRAF_2C = new CreativeModeTab("tabmatraf_2c") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MatrafcsModItems.ZETOP.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
