
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;

public class RefinedBreadItem extends Item {
	public RefinedBreadItem() {
		super(new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(6.5f)

						.build()));
		setRegistryName("refined_bread");
	}
}
