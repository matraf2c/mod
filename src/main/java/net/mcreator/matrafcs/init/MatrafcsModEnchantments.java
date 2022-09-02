
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matrafcs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.matrafcs.enchantment.SpeedEnchantment;
import net.mcreator.matrafcs.MatrafcsMod;

public class MatrafcsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MatrafcsMod.MODID);
	public static final RegistryObject<Enchantment> SPEED = REGISTRY.register("speed", () -> new SpeedEnchantment());
}
