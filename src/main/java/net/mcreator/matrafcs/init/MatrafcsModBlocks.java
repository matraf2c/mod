
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matrafcs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.matrafcs.block.ZetopOreBlock;
import net.mcreator.matrafcs.block.ZetopBlockBlock;
import net.mcreator.matrafcs.block.MagicZetopBlock;
import net.mcreator.matrafcs.block.LipottOreBlock;
import net.mcreator.matrafcs.block.LipottBlockBlock;
import net.mcreator.matrafcs.MatrafcsMod;

public class MatrafcsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MatrafcsMod.MODID);
	public static final RegistryObject<Block> ZETOP_ORE = REGISTRY.register("zetop_ore", () -> new ZetopOreBlock());
	public static final RegistryObject<Block> ZETOP_BLOCK = REGISTRY.register("zetop_block", () -> new ZetopBlockBlock());
	public static final RegistryObject<Block> MAGIC_ZETOP = REGISTRY.register("magic_zetop", () -> new MagicZetopBlock());
	public static final RegistryObject<Block> LIPOTT_ORE = REGISTRY.register("lipott_ore", () -> new LipottOreBlock());
	public static final RegistryObject<Block> LIPOTT_BLOCK = REGISTRY.register("lipott_block", () -> new LipottBlockBlock());
}
