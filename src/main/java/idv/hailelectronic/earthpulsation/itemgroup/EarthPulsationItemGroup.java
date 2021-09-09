
package idv.hailelectronic.earthpulsation.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import idv.hailelectronic.earthpulsation.item.PDAItem;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

@EarthPulsationModElements.ModElement.Tag
public class EarthPulsationItemGroup extends EarthPulsationModElements.ModElement {
	public EarthPulsationItemGroup(EarthPulsationModElements instance) {
		super(instance, 149);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabearth_pulsation") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PDAItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
