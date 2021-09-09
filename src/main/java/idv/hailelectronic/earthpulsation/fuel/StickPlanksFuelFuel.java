
package idv.hailelectronic.earthpulsation.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import idv.hailelectronic.earthpulsation.block.StickPlanksBlock;

@Mod.EventBusSubscriber
public class StickPlanksFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == StickPlanksBlock.block.asItem())
			event.setBurnTime(300);
	}
}
