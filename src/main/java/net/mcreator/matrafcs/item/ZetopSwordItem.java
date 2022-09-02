
package net.mcreator.matrafcs.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.matrafcs.procedures.ZetopSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.matrafcs.init.MatrafcsModTabs;
import net.mcreator.matrafcs.init.MatrafcsModItems;

public class ZetopSwordItem extends SwordItem {
	public ZetopSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MatrafcsModItems.ZETOP.get()));
			}
		}, 3, -3f, new Item.Properties().tab(MatrafcsModTabs.TAB_MATRAF_2C));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ZetopSwordLivingEntityIsHitWithToolProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}
