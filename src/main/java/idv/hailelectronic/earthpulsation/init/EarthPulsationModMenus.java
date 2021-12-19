
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import idv.hailelectronic.earthpulsation.world.inventory.ResearchStationGUIMenu;
import idv.hailelectronic.earthpulsation.world.inventory.RefinerGuiMenu;
import idv.hailelectronic.earthpulsation.world.inventory.PDARegisterMenu;
import idv.hailelectronic.earthpulsation.world.inventory.PDAGuiTestMenu;
import idv.hailelectronic.earthpulsation.world.inventory.PDAGuiHomeMenu;
import idv.hailelectronic.earthpulsation.world.inventory.PDAGUITMenu;
import idv.hailelectronic.earthpulsation.world.inventory.GrinderGuiMenu;
import idv.hailelectronic.earthpulsation.world.inventory.ForgingTableL1GMenu;
import idv.hailelectronic.earthpulsation.world.inventory.CoalGeneratorGUIMenu;
import idv.hailelectronic.earthpulsation.world.inventory.BatteryGuiMenu;
import idv.hailelectronic.earthpulsation.world.inventory.BasinGuiMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthPulsationModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<ForgingTableL1GMenu> FORGING_TABLE_L_1_G = register("forging_table_l_1_g",
			(id, inv, extraData) -> new ForgingTableL1GMenu(id, inv, extraData));
	public static final MenuType<RefinerGuiMenu> REFINER_GUI = register("refiner_gui",
			(id, inv, extraData) -> new RefinerGuiMenu(id, inv, extraData));
	public static final MenuType<PDAGuiHomeMenu> PDA_GUI_HOME = register("pda_gui_home",
			(id, inv, extraData) -> new PDAGuiHomeMenu(id, inv, extraData));
	public static final MenuType<PDAGuiTestMenu> PDA_GUI_TEST = register("pda_gui_test",
			(id, inv, extraData) -> new PDAGuiTestMenu(id, inv, extraData));
	public static final MenuType<GrinderGuiMenu> GRINDER_GUI = register("grinder_gui",
			(id, inv, extraData) -> new GrinderGuiMenu(id, inv, extraData));
	public static final MenuType<PDAGUITMenu> PDAGUIT = register("pdaguit", (id, inv, extraData) -> new PDAGUITMenu(id, inv, extraData));
	public static final MenuType<BasinGuiMenu> BASIN_GUI = register("basin_gui", (id, inv, extraData) -> new BasinGuiMenu(id, inv, extraData));
	public static final MenuType<ResearchStationGUIMenu> RESEARCH_STATION_GUI = register("research_station_gui",
			(id, inv, extraData) -> new ResearchStationGUIMenu(id, inv, extraData));
	public static final MenuType<CoalGeneratorGUIMenu> COAL_GENERATOR_GUI = register("coal_generator_gui",
			(id, inv, extraData) -> new CoalGeneratorGUIMenu(id, inv, extraData));
	public static final MenuType<BatteryGuiMenu> BATTERY_GUI = register("battery_gui",
			(id, inv, extraData) -> new BatteryGuiMenu(id, inv, extraData));
	public static final MenuType<PDARegisterMenu> PDA_REGISTER = register("pda_register",
			(id, inv, extraData) -> new PDARegisterMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
