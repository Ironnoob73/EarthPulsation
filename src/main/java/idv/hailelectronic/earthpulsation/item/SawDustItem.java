
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;

public class SawDustItem extends Item {
	public SawDustItem() {
		super(new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("saw_dust");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
