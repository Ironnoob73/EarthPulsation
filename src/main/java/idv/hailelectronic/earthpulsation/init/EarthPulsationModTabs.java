
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EarthPulsationModTabs {
	public static CreativeModeTab TAB_EARTH_PULSATION;

	public static void load() {
		TAB_EARTH_PULSATION = new CreativeModeTab("tabearth_pulsation") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EarthPulsationModItems.EMPTY_YELLOW_STONE_RUNE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
