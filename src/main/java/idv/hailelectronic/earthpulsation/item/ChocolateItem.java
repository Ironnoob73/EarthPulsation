
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;

public class ChocolateItem extends Item {
	public ChocolateItem() {
		super(new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(10f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
