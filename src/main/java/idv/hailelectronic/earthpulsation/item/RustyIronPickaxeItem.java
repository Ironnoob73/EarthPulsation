
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import idv.hailelectronic.earthpulsation.procedures.TetanusProcedure;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;

public class RustyIronPickaxeItem extends PickaxeItem {
	public RustyIronPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 225;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.8f, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
		setRegistryName("rusty_iron_pickaxe");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		TetanusProcedure.execute(entity);
		return retval;
	}
}
