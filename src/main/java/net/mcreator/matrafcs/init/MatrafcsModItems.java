
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matrafcs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.matrafcs.item.Zetop_ArmorArmorItem;
import net.mcreator.matrafcs.item.ZetopSwordItem;
import net.mcreator.matrafcs.item.ZetopItem;
import net.mcreator.matrafcs.item.LipottItem;
import net.mcreator.matrafcs.MatrafcsMod;

public class MatrafcsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MatrafcsMod.MODID);
	public static final RegistryObject<Item> ZETOP = REGISTRY.register("zetop", () -> new ZetopItem());
	public static final RegistryObject<Item> ZETOP_ORE = block(MatrafcsModBlocks.ZETOP_ORE, MatrafcsModTabs.TAB_MATRAF_2C);
	public static final RegistryObject<Item> ZETOP_BLOCK = block(MatrafcsModBlocks.ZETOP_BLOCK, MatrafcsModTabs.TAB_MATRAF_2C);
	public static final RegistryObject<Item> MAGIC_ZETOP = block(MatrafcsModBlocks.MAGIC_ZETOP, MatrafcsModTabs.TAB_MATRAF_2C);
	public static final RegistryObject<Item> DIAGAN = REGISTRY.register("diagan_spawn_egg",
			() -> new ForgeSpawnEggItem(MatrafcsModEntities.DIAGAN, -5701453, -16383886, new Item.Properties().tab(MatrafcsModTabs.TAB_MATRAF_2C)));
	public static final RegistryObject<Item> LIPOTT = REGISTRY.register("lipott", () -> new LipottItem());
	public static final RegistryObject<Item> LIPOTT_ORE = block(MatrafcsModBlocks.LIPOTT_ORE, MatrafcsModTabs.TAB_MATRAF_2C);
	public static final RegistryObject<Item> LIPOTT_BLOCK = block(MatrafcsModBlocks.LIPOTT_BLOCK, MatrafcsModTabs.TAB_MATRAF_2C);
	public static final RegistryObject<Item> ZETOP_ARMOR_ARMOR_HELMET = REGISTRY.register("zetop_armor_armor_helmet",
			() -> new Zetop_ArmorArmorItem.Helmet());
	public static final RegistryObject<Item> ZETOP_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("zetop_armor_armor_chestplate",
			() -> new Zetop_ArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> ZETOP_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("zetop_armor_armor_leggings",
			() -> new Zetop_ArmorArmorItem.Leggings());
	public static final RegistryObject<Item> ZETOP_ARMOR_ARMOR_BOOTS = REGISTRY.register("zetop_armor_armor_boots",
			() -> new Zetop_ArmorArmorItem.Boots());
	public static final RegistryObject<Item> ZETOP_SWORD = REGISTRY.register("zetop_sword", () -> new ZetopSwordItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
