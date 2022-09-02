
package net.mcreator.matrafcs.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.matrafcs.init.MatrafcsModTabs;

public class ZetopItem extends Item {
	public ZetopItem() {
		super(new Item.Properties().tab(MatrafcsModTabs.TAB_MATRAF_2C).stacksTo(64).rarity(Rarity.COMMON));
	}
}
