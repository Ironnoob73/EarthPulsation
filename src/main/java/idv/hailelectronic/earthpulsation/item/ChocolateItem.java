
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;

public class ChocolateItem extends Item {
	public ChocolateItem() {
		super(new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(10f)

						.build()));
		setRegistryName("chocolate");
	}
}
