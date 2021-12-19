
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;

public class GlassSwordItem extends SwordItem {
	public GlassSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 5;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.GLASS_PANE), new ItemStack(Blocks.WHITE_STAINED_GLASS_PANE),
						new ItemStack(Blocks.ORANGE_STAINED_GLASS_PANE), new ItemStack(Blocks.MAGENTA_STAINED_GLASS_PANE),
						new ItemStack(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE), new ItemStack(Blocks.YELLOW_STAINED_GLASS_PANE),
						new ItemStack(Blocks.LIME_STAINED_GLASS_PANE), new ItemStack(Blocks.PINK_STAINED_GLASS_PANE),
						new ItemStack(Blocks.GRAY_STAINED_GLASS_PANE), new ItemStack(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE),
						new ItemStack(Blocks.CYAN_STAINED_GLASS_PANE), new ItemStack(Blocks.PURPLE_STAINED_GLASS_PANE),
						new ItemStack(Blocks.BLUE_STAINED_GLASS_PANE), new ItemStack(Blocks.BROWN_STAINED_GLASS_PANE),
						new ItemStack(Blocks.GREEN_STAINED_GLASS_PANE), new ItemStack(Blocks.RED_STAINED_GLASS_PANE),
						new ItemStack(Blocks.BLACK_STAINED_GLASS_PANE));
			}
		}, 3, -2f, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
		setRegistryName("glass_sword");
	}
}
