
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class EarthPulsationModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == EarthPulsationModItems.SAW_DUST.get())
			event.setBurnTime(100);
		else if (event.getItemStack().getItem() == EarthPulsationModBlocks.WOODEN_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (event.getItemStack().getItem() == EarthPulsationModItems.WOODEN_BOARD.get())
			event.setBurnTime(100);
		else if (event.getItemStack().getItem() == EarthPulsationModBlocks.STICK_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (event.getItemStack().getItem() == EarthPulsationModBlocks.WOODEN_BLOCK.get().asItem())
			event.setBurnTime(300);
	}
}
