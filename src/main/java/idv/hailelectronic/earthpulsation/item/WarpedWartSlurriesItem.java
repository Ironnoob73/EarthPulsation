
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModFluids;

public class WarpedWartSlurriesItem extends BucketItem {
	public WarpedWartSlurriesItem() {
		super(() -> EarthPulsationModFluids.WARPED_WART_SLURRIES,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
		setRegistryName("warped_wart_slurries_bucket");
	}
}
