
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import idv.hailelectronic.earthpulsation.client.gui.PDARegisterScreen;
import idv.hailelectronic.earthpulsation.client.gui.CoalGeneratorGUIScreen;
import idv.hailelectronic.earthpulsation.client.gui.BatteryGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EarthPulsationModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EarthPulsationModMenus.FORGING_TABLE_L_1_G, ForgingTableL1GScreen::new);
			MenuScreens.register(EarthPulsationModMenus.REFINER_GUI, RefinerGuiScreen::new);
			MenuScreens.register(EarthPulsationModMenus.PDA_GUI_HOME, PDAGuiHomeScreen::new);
			MenuScreens.register(EarthPulsationModMenus.PDA_GUI_TEST, PDAGuiTestScreen::new);
			MenuScreens.register(EarthPulsationModMenus.GRINDER_GUI, GrinderGuiScreen::new);
			MenuScreens.register(EarthPulsationModMenus.PDAGUIT, PDAGUITScreen::new);
			MenuScreens.register(EarthPulsationModMenus.BASIN_GUI, BasinGuiScreen::new);
			MenuScreens.register(EarthPulsationModMenus.RESEARCH_STATION_GUI, ResearchStationGUIScreen::new);
			MenuScreens.register(EarthPulsationModMenus.COAL_GENERATOR_GUI, CoalGeneratorGUIScreen::new);
			MenuScreens.register(EarthPulsationModMenus.BATTERY_GUI, BatteryGuiScreen::new);
			MenuScreens.register(EarthPulsationModMenus.PDA_REGISTER, PDARegisterScreen::new);
		});
	}
}
