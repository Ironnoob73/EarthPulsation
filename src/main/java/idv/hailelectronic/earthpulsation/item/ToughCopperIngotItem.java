
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;

public class ToughCopperIngotItem extends Item {
	public ToughCopperIngotItem() {
		super(new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("tough_copper_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
