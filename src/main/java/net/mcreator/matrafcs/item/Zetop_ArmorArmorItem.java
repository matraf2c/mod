
package net.mcreator.matrafcs.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.matrafcs.procedures.ZetopArmorLeggingsOnTickProcedure;
import net.mcreator.matrafcs.procedures.ZetopArmorHelmetOnTickProcedure;
import net.mcreator.matrafcs.procedures.ZetopArmorChestPlateOnTickProcedure;
import net.mcreator.matrafcs.procedures.ZetopArmorBootsOnTickProcedure;
import net.mcreator.matrafcs.init.MatrafcsModItems;

public abstract class Zetop_ArmorArmorItem extends ArmorItem {
	public Zetop_ArmorArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MatrafcsModItems.ZETOP.get()));
			}

			@Override
			public String getName() {
				return "zetop_armor_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends Zetop_ArmorArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "matrafcs:textures/models/armor/zetop_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ZetopArmorHelmetOnTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static class Chestplate extends Zetop_ArmorArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "matrafcs:textures/models/armor/zetop_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ZetopArmorChestPlateOnTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static class Leggings extends Zetop_ArmorArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "matrafcs:textures/models/armor/zetop_armor_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ZetopArmorLeggingsOnTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static class Boots extends Zetop_ArmorArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "matrafcs:textures/models/armor/zetop_armor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ZetopArmorBootsOnTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}
}
