package net.mcreator.matrafcs.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.matrafcs.init.MatrafcsModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpeedEffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)) == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 1));
		} else {
			if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)) == 1) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 1));
			} else {
				if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) == 1) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 1));
				} else {
					if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)) == 1) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 1));
					} else {
						if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
								(entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.FEET)
										: ItemStack.EMPTY)) == 2) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 3));
						} else {
							if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
									(entity instanceof LivingEntity _entGetArmor
											? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS)
											: ItemStack.EMPTY)) == 2) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 3));
							} else {
								if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
										(entity instanceof LivingEntity _entGetArmor
												? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
												: ItemStack.EMPTY)) == 2) {
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 3));
								} else {
									if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
											(entity instanceof LivingEntity _entGetArmor
													? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
													: ItemStack.EMPTY)) == 2) {
										if (entity instanceof LivingEntity _entity)
											_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 3));
									} else {
										if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
												(entity instanceof LivingEntity _entGetArmor
														? _entGetArmor.getItemBySlot(EquipmentSlot.FEET)
														: ItemStack.EMPTY)) == 3) {
											if (entity instanceof LivingEntity _entity)
												_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, (int) 5.5));
										} else {
											if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
													(entity instanceof LivingEntity _entGetArmor
															? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS)
															: ItemStack.EMPTY)) == 3) {
												if (entity instanceof LivingEntity _entity)
													_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, (int) 5.5));
											} else {
												if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
														(entity instanceof LivingEntity _entGetArmor
																? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
																: ItemStack.EMPTY)) == 3) {
													if (entity instanceof LivingEntity _entity)
														_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, (int) 5.5));
												} else {
													if (EnchantmentHelper.getItemEnchantmentLevel(MatrafcsModEnchantments.SPEED.get(),
															(entity instanceof LivingEntity _entGetArmor
																	? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
																	: ItemStack.EMPTY)) == 3) {
														if (entity instanceof LivingEntity _entity)
															_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, (int) 5.5));
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
