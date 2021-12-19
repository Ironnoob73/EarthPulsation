
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModItems;

public class AluminumHoeItem extends HoeItem {
	public AluminumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 290;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EarthPulsationModItems.ALUMINUM_INGOT));
			}
		}, 0, -1f, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
		setRegistryName("aluminum_hoe");
	}
}
