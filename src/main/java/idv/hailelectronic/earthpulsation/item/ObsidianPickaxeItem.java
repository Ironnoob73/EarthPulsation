
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModItems;

public class ObsidianPickaxeItem extends PickaxeItem {
	public ObsidianPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2048;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EarthPulsationModItems.PURE_OBSIDIAN_INGOT),
						new ItemStack(EarthPulsationModItems.TURBID_OBSIDIAN_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION).fireResistant());
		setRegistryName("obsidian_pickaxe");
	}
}
