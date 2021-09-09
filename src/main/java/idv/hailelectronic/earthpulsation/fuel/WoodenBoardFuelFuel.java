
package idv.hailelectronic.earthpulsation.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import idv.hailelectronic.earthpulsation.item.WoodenBoardItem;

@Mod.EventBusSubscriber
public class WoodenBoardFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == WoodenBoardItem.block)
			event.setBurnTime(100);
	}
}
