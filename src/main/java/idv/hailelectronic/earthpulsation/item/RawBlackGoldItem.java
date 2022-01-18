
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;

public class RawBlackGoldItem extends Item {
	public RawBlackGoldItem() {
		super(new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("raw_black_gold");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
