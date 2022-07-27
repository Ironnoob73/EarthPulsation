
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;

public class BigApplePieceItem extends Item {
	public BigApplePieceItem() {
		super(new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

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
