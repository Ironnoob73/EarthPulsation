
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

import idv.hailelectronic.earthpulsation.item.ZincIngotItem;
import idv.hailelectronic.earthpulsation.item.YellowStoneIngotItem;
import idv.hailelectronic.earthpulsation.item.WoodenTroughItem;
import idv.hailelectronic.earthpulsation.item.WoodenTroughFilledWithDoughItem;
import idv.hailelectronic.earthpulsation.item.WoodenTroughFilledWithChocolateItem;
import idv.hailelectronic.earthpulsation.item.WoodenRuneItem;
import idv.hailelectronic.earthpulsation.item.WoodenBoardItem;
import idv.hailelectronic.earthpulsation.item.WarpedWartSlurriesItem;
import idv.hailelectronic.earthpulsation.item.WarpedWartSlurriesBottleItem;
import idv.hailelectronic.earthpulsation.item.TurbidObsidianNuggetItem;
import idv.hailelectronic.earthpulsation.item.TurbidObsidianIngotItem;
import idv.hailelectronic.earthpulsation.item.ToughCopperIngotItem;
import idv.hailelectronic.earthpulsation.item.TopazItem;
import idv.hailelectronic.earthpulsation.item.TinyTNTItem;
import idv.hailelectronic.earthpulsation.item.TinPowderItem;
import idv.hailelectronic.earthpulsation.item.TinPlateItem;
import idv.hailelectronic.earthpulsation.item.TinIngotItem;
import idv.hailelectronic.earthpulsation.item.TinCubeItem;
import idv.hailelectronic.earthpulsation.item.SuperBatteryItem;
import idv.hailelectronic.earthpulsation.item.StoneIngotItem;
import idv.hailelectronic.earthpulsation.item.StoneBrickSwordItem;
import idv.hailelectronic.earthpulsation.item.StoneBrickShovelItem;
import idv.hailelectronic.earthpulsation.item.StoneBrickPickaxeItem;
import idv.hailelectronic.earthpulsation.item.StoneBrickHoeItem;
import idv.hailelectronic.earthpulsation.item.StoneBrickAxeItem;
import idv.hailelectronic.earthpulsation.item.StoneBrickArmmorItem;
import idv.hailelectronic.earthpulsation.item.SteelSwordItem;
import idv.hailelectronic.earthpulsation.item.SteelShovelItem;
import idv.hailelectronic.earthpulsation.item.SteelPickaxeItem;
import idv.hailelectronic.earthpulsation.item.SteelIngotItem;
import idv.hailelectronic.earthpulsation.item.SteelHoeItem;
import idv.hailelectronic.earthpulsation.item.SteelAxeItem;
import idv.hailelectronic.earthpulsation.item.SilverPowderItem;
import idv.hailelectronic.earthpulsation.item.SilverPlateItem;
import idv.hailelectronic.earthpulsation.item.SilverIngotItem;
import idv.hailelectronic.earthpulsation.item.SilverCubeItem;
import idv.hailelectronic.earthpulsation.item.ShabbyCircuitBoardItem;
import idv.hailelectronic.earthpulsation.item.ScreenPartItem;
import idv.hailelectronic.earthpulsation.item.SawDustItem;
import idv.hailelectronic.earthpulsation.item.SapphireItem;
import idv.hailelectronic.earthpulsation.item.SamjungNote7Item;
import idv.hailelectronic.earthpulsation.item.RustyIronSwordItem;
import idv.hailelectronic.earthpulsation.item.RustyIronShovelItem;
import idv.hailelectronic.earthpulsation.item.RustyIronPickaxeItem;
import idv.hailelectronic.earthpulsation.item.RustyIronAxeItem;
import idv.hailelectronic.earthpulsation.item.RustItem;
import idv.hailelectronic.earthpulsation.item.RustIronIngotItem;
import idv.hailelectronic.earthpulsation.item.RuggedizedAluminumSwordItem;
import idv.hailelectronic.earthpulsation.item.RuggedizedAluminumShovelItem;
import idv.hailelectronic.earthpulsation.item.RuggedizedAluminumPickaxeItem;
import idv.hailelectronic.earthpulsation.item.RuggedizedAluminumHoeItem;
import idv.hailelectronic.earthpulsation.item.RuggedizedAluminumAxeItem;
import idv.hailelectronic.earthpulsation.item.RubyItem;
import idv.hailelectronic.earthpulsation.item.ResinItem;
import idv.hailelectronic.earthpulsation.item.RefinedBreadItem;
import idv.hailelectronic.earthpulsation.item.RawTinItem;
import idv.hailelectronic.earthpulsation.item.RawSteelIngotItem;
import idv.hailelectronic.earthpulsation.item.RawLeadItem;
import idv.hailelectronic.earthpulsation.item.RawBlackGoldItem;
import idv.hailelectronic.earthpulsation.item.RawAluminumItem;
import idv.hailelectronic.earthpulsation.item.PureObsidianNuggetItem;
import idv.hailelectronic.earthpulsation.item.PureObsidianIngotItem;
import idv.hailelectronic.earthpulsation.item.PlasticWoodStickItem;
import idv.hailelectronic.earthpulsation.item.PlasticWoodBoardItem;
import idv.hailelectronic.earthpulsation.item.PatternGoldIngotItem;
import idv.hailelectronic.earthpulsation.item.PDAItem;
import idv.hailelectronic.earthpulsation.item.OnlyIronSwordItem;
import idv.hailelectronic.earthpulsation.item.OnlyIronShovelItem;
import idv.hailelectronic.earthpulsation.item.OnlyIronPickaxeItem;
import idv.hailelectronic.earthpulsation.item.OnlyIronHoeItem;
import idv.hailelectronic.earthpulsation.item.OnlyIronAxeItem;
import idv.hailelectronic.earthpulsation.item.OldAgeItem;
import idv.hailelectronic.earthpulsation.item.ObsidianSwordItem;
import idv.hailelectronic.earthpulsation.item.ObsidianShovelItem;
import idv.hailelectronic.earthpulsation.item.ObsidianPickaxeItem;
import idv.hailelectronic.earthpulsation.item.ObsidianHoeItem;
import idv.hailelectronic.earthpulsation.item.ObsidianAxeItem;
import idv.hailelectronic.earthpulsation.item.NormalGunItem;
import idv.hailelectronic.earthpulsation.item.NormalBatteryItem;
import idv.hailelectronic.earthpulsation.item.NokikaItem;
import idv.hailelectronic.earthpulsation.item.NickelIngotItem;
import idv.hailelectronic.earthpulsation.item.MelonGunItem;
import idv.hailelectronic.earthpulsation.item.MagnetizedIronIngotItem;
import idv.hailelectronic.earthpulsation.item.MagnetIngotItem;
import idv.hailelectronic.earthpulsation.item.LeadPowderItem;
import idv.hailelectronic.earthpulsation.item.LeadPlateItem;
import idv.hailelectronic.earthpulsation.item.LeadIngotItem;
import idv.hailelectronic.earthpulsation.item.LeadCubeItem;
import idv.hailelectronic.earthpulsation.item.JadeIngotItem;
import idv.hailelectronic.earthpulsation.item.IronStickItem;
import idv.hailelectronic.earthpulsation.item.IronSawItem;
import idv.hailelectronic.earthpulsation.item.IronPowderItem;
import idv.hailelectronic.earthpulsation.item.IronPlateItem;
import idv.hailelectronic.earthpulsation.item.IronCubeItem;
import idv.hailelectronic.earthpulsation.item.HighLevelBatteryItem;
import idv.hailelectronic.earthpulsation.item.HardAluminumIngotItem;
import idv.hailelectronic.earthpulsation.item.GoldPowderItem;
import idv.hailelectronic.earthpulsation.item.GoldCubeItem;
import idv.hailelectronic.earthpulsation.item.GlassSwordItem;
import idv.hailelectronic.earthpulsation.item.EmptyYellowStoneRuneItem;
import idv.hailelectronic.earthpulsation.item.EmptyStoneRuneItem;
import idv.hailelectronic.earthpulsation.item.EmptyJadeRuneItem;
import idv.hailelectronic.earthpulsation.item.EmptyBluePrintItem;
import idv.hailelectronic.earthpulsation.item.EPBookItem;
import idv.hailelectronic.earthpulsation.item.DeepslateIngotItem;
import idv.hailelectronic.earthpulsation.item.DeepWellItem;
import idv.hailelectronic.earthpulsation.item.DarkCircuitBoardItem;
import idv.hailelectronic.earthpulsation.item.CopperWrenchItem;
import idv.hailelectronic.earthpulsation.item.CopperSwordItem;
import idv.hailelectronic.earthpulsation.item.CopperSwordHeadItem;
import idv.hailelectronic.earthpulsation.item.CopperShovelItem;
import idv.hailelectronic.earthpulsation.item.CopperShovelHeadItem;
import idv.hailelectronic.earthpulsation.item.CopperPowderItem;
import idv.hailelectronic.earthpulsation.item.CopperPlateItem;
import idv.hailelectronic.earthpulsation.item.CopperPickaxeItem;
import idv.hailelectronic.earthpulsation.item.CopperPickaxeHeadItem;
import idv.hailelectronic.earthpulsation.item.CopperHoeItem;
import idv.hailelectronic.earthpulsation.item.CopperHoeHeadItem;
import idv.hailelectronic.earthpulsation.item.CopperCubeItem;
import idv.hailelectronic.earthpulsation.item.CopperAxeItem;
import idv.hailelectronic.earthpulsation.item.CopperAxeHeadItem;
import idv.hailelectronic.earthpulsation.item.CopperArmorItem;
import idv.hailelectronic.earthpulsation.item.ConciseBatteryItem;
import idv.hailelectronic.earthpulsation.item.CobaltIngotItem;
import idv.hailelectronic.earthpulsation.item.ClassicBatteryItem;
import idv.hailelectronic.earthpulsation.item.CinnabarItem;
import idv.hailelectronic.earthpulsation.item.ChocolateItem;
import idv.hailelectronic.earthpulsation.item.CastStoneIngotItem;
import idv.hailelectronic.earthpulsation.item.CastIronIngotItem;
import idv.hailelectronic.earthpulsation.item.CarbonStickItem;
import idv.hailelectronic.earthpulsation.item.CarbonPowderItem;
import idv.hailelectronic.earthpulsation.item.CarbonPlateItem;
import idv.hailelectronic.earthpulsation.item.CarbonFibreItem;
import idv.hailelectronic.earthpulsation.item.CarbonCubeItem;
import idv.hailelectronic.earthpulsation.item.BlueShadowIngotItem;
import idv.hailelectronic.earthpulsation.item.BluePrintItem;
import idv.hailelectronic.earthpulsation.item.BlankCircutiBoardItem;
import idv.hailelectronic.earthpulsation.item.BlackGoldIngotItem;
import idv.hailelectronic.earthpulsation.item.BigApplePieceItem;
import idv.hailelectronic.earthpulsation.item.BasicBatteryItem;
import idv.hailelectronic.earthpulsation.item.BaseCircutiBoardItem;
import idv.hailelectronic.earthpulsation.item.BasaltFibreItem;
import idv.hailelectronic.earthpulsation.item.AluminumSwordItem;
import idv.hailelectronic.earthpulsation.item.AluminumShovelItem;
import idv.hailelectronic.earthpulsation.item.AluminumPowderItem;
import idv.hailelectronic.earthpulsation.item.AluminumPlateItem;
import idv.hailelectronic.earthpulsation.item.AluminumPickaxeItem;
import idv.hailelectronic.earthpulsation.item.AluminumIngotItem;
import idv.hailelectronic.earthpulsation.item.AluminumHoeItem;
import idv.hailelectronic.earthpulsation.item.AluminumCubeItem;
import idv.hailelectronic.earthpulsation.item.AluminumAxeItem;
import idv.hailelectronic.earthpulsation.item.AluminumArmorItem;
import idv.hailelectronic.earthpulsation.item.AlchemicalSilverIngotItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthPulsationModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item PDA = register(new PDAItem());
	public static final Item EP_BOOK = register(new EPBookItem());
	public static final Item OBELISK = register(EarthPulsationModBlocks.OBELISK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RESEARCH_STATION = register(EarthPulsationModBlocks.RESEARCH_STATION, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item FORGING_TABLE_L_1 = register(EarthPulsationModBlocks.FORGING_TABLE_L_1, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item REFINER_LIT = register(EarthPulsationModBlocks.REFINER_LIT, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item GRINDER = register(EarthPulsationModBlocks.GRINDER, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item PULVERIZER = register(EarthPulsationModBlocks.PULVERIZER, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item REINFORCED_SIEVE = register(EarthPulsationModBlocks.REINFORCED_SIEVE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BASIN = register(EarthPulsationModBlocks.BASIN, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item COPPER_CUBE = register(new CopperCubeItem());
	public static final Item COPPER_PLATE = register(new CopperPlateItem());
	public static final Item COPPER_POWDER = register(new CopperPowderItem());
	public static final Item COPPER_PICKAXE = register(new CopperPickaxeItem());
	public static final Item COPPER_PICKAXE_HEAD = register(new CopperPickaxeHeadItem());
	public static final Item COPPER_AXE = register(new CopperAxeItem());
	public static final Item COPPER_AXE_HEAD = register(new CopperAxeHeadItem());
	public static final Item COPPER_SWORD = register(new CopperSwordItem());
	public static final Item COPPER_SWORD_HEAD = register(new CopperSwordHeadItem());
	public static final Item COPPER_SHOVEL = register(new CopperShovelItem());
	public static final Item COPPER_SHOVEL_HEAD = register(new CopperShovelHeadItem());
	public static final Item COPPER_HOE = register(new CopperHoeItem());
	public static final Item COPPER_HOE_HEAD = register(new CopperHoeHeadItem());
	public static final Item COPPER_ARMOR_HELMET = register(new CopperArmorItem.Helmet());
	public static final Item COPPER_ARMOR_CHESTPLATE = register(new CopperArmorItem.Chestplate());
	public static final Item COPPER_ARMOR_LEGGINGS = register(new CopperArmorItem.Leggings());
	public static final Item COPPER_ARMOR_BOOTS = register(new CopperArmorItem.Boots());
	public static final Item COPPER_WRENCH = register(new CopperWrenchItem());
	public static final Item ALUMINUM_INGOT = register(new AluminumIngotItem());
	public static final Item ALUMINUM_CUBE = register(new AluminumCubeItem());
	public static final Item ALUMINUM_PLATE = register(new AluminumPlateItem());
	public static final Item ALUMINUM_POWDER = register(new AluminumPowderItem());
	public static final Item ALUMINUM_ORE = register(EarthPulsationModBlocks.ALUMINUM_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item DEEPSLATE_ALUMINUM_ORE = register(EarthPulsationModBlocks.DEEPSLATE_ALUMINUM_ORE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RAW_ALUMINUM = register(new RawAluminumItem());
	public static final Item RAW_ALUMINUM_BLOCK = register(EarthPulsationModBlocks.RAW_ALUMINUM_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ALUMINUM_BLOCK = register(EarthPulsationModBlocks.ALUMINUM_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ALUMINUM_PICKAXE = register(new AluminumPickaxeItem());
	public static final Item ALUMINUM_AXE = register(new AluminumAxeItem());
	public static final Item ALUMINUM_SWORD = register(new AluminumSwordItem());
	public static final Item ALUMINUM_SHOVEL = register(new AluminumShovelItem());
	public static final Item ALUMINUM_HOE = register(new AluminumHoeItem());
	public static final Item ALUMINUM_ARMOR_HELMET = register(new AluminumArmorItem.Helmet());
	public static final Item ALUMINUM_ARMOR_CHESTPLATE = register(new AluminumArmorItem.Chestplate());
	public static final Item ALUMINUM_ARMOR_LEGGINGS = register(new AluminumArmorItem.Leggings());
	public static final Item ALUMINUM_ARMOR_BOOTS = register(new AluminumArmorItem.Boots());
	public static final Item RUGGEDIZED_ALUMINUM_PICKAXE = register(new RuggedizedAluminumPickaxeItem());
	public static final Item RUGGEDIZED_ALUMINUM_AXE = register(new RuggedizedAluminumAxeItem());
	public static final Item RUGGEDIZED_ALUMINUM_SWORD = register(new RuggedizedAluminumSwordItem());
	public static final Item RUGGEDIZED_ALUMINUM_SHOVEL = register(new RuggedizedAluminumShovelItem());
	public static final Item RUGGEDIZED_ALUMINUM_HOE = register(new RuggedizedAluminumHoeItem());
	public static final Item IRON_CUBE = register(new IronCubeItem());
	public static final Item IRON_PLATE = register(new IronPlateItem());
	public static final Item IRON_STICK = register(new IronStickItem());
	public static final Item IRON_POWDER = register(new IronPowderItem());
	public static final Item FORGOTTEN_IRON_ORE = register(EarthPulsationModBlocks.FORGOTTEN_IRON_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_IRON_BLOCK = register(EarthPulsationModBlocks.CHISELED_IRON_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ONLY_IRON_PICKAXE = register(new OnlyIronPickaxeItem());
	public static final Item ONLY_IRON_AXE = register(new OnlyIronAxeItem());
	public static final Item ONLY_IRON_SWORD = register(new OnlyIronSwordItem());
	public static final Item ONLY_IRON_SHOVEL = register(new OnlyIronShovelItem());
	public static final Item ONLY_IRON_HOE = register(new OnlyIronHoeItem());
	public static final Item IRON_SAW = register(new IronSawItem());
	public static final Item CARBON_FIBRE = register(new CarbonFibreItem());
	public static final Item CARBON_CUBE = register(new CarbonCubeItem());
	public static final Item CARBON_PLATE = register(new CarbonPlateItem());
	public static final Item CARBON_STICK = register(new CarbonStickItem());
	public static final Item CARBON_POWDER = register(new CarbonPowderItem());
	public static final Item RAW_STEEL_INGOT = register(new RawSteelIngotItem());
	public static final Item STEEL_INGOT = register(new SteelIngotItem());
	public static final Item STEEL_BLOCK = register(EarthPulsationModBlocks.STEEL_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item STEEL_PICKAXE = register(new SteelPickaxeItem());
	public static final Item STEEL_AXE = register(new SteelAxeItem());
	public static final Item STEEL_SHOVEL = register(new SteelShovelItem());
	public static final Item STEEL_HOE = register(new SteelHoeItem());
	public static final Item STEEL_SWORD = register(new SteelSwordItem());
	public static final Item GOLD_CUBE = register(new GoldCubeItem());
	public static final Item GOLD_POWDER = register(new GoldPowderItem());
	public static final Item LEAD_INGOT = register(new LeadIngotItem());
	public static final Item LEAD_CUBE = register(new LeadCubeItem());
	public static final Item LEAD_PLATE = register(new LeadPlateItem());
	public static final Item LEAD_POWDER = register(new LeadPowderItem());
	public static final Item LEAD_ORE = register(EarthPulsationModBlocks.LEAD_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item DEEPSLATE_LEAD_ORE = register(EarthPulsationModBlocks.DEEPSLATE_LEAD_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RAW_LEAD = register(new RawLeadItem());
	public static final Item RAW_LEAD_BLOCK = register(EarthPulsationModBlocks.RAW_LEAD_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LEAD_BLOCK = register(EarthPulsationModBlocks.LEAD_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item TIN_INGOT = register(new TinIngotItem());
	public static final Item TIN_CUBE = register(new TinCubeItem());
	public static final Item TIN_PLATE = register(new TinPlateItem());
	public static final Item TIN_POWDER = register(new TinPowderItem());
	public static final Item TIN_ORE = register(EarthPulsationModBlocks.TIN_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item DEEPSLATE_TIN_ORE = register(EarthPulsationModBlocks.DEEPSLATE_TIN_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RAW_TIN = register(new RawTinItem());
	public static final Item RAW_TIN_BLOCK = register(EarthPulsationModBlocks.RAW_TIN_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item TIN_BLOCK = register(EarthPulsationModBlocks.TIN_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item SILVER_INGOT = register(new SilverIngotItem());
	public static final Item SILVER_CUBE = register(new SilverCubeItem());
	public static final Item SILVER_PLATE = register(new SilverPlateItem());
	public static final Item SILVER_POWDER = register(new SilverPowderItem());
	public static final Item SILVER_ORE = register(EarthPulsationModBlocks.SILVER_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item DEEPSLATE_SILVER_ORE = register(EarthPulsationModBlocks.DEEPSLATE_SILVER_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item SILVER_BLOCK = register(EarthPulsationModBlocks.SILVER_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item COBALT_INGOT = register(new CobaltIngotItem());
	public static final Item COBALT_ORE = register(EarthPulsationModBlocks.COBALT_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item COBALT_BLOCK = register(EarthPulsationModBlocks.COBALT_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item NICKEL_INGOT = register(new NickelIngotItem());
	public static final Item NICKEL_ORE = register(EarthPulsationModBlocks.NICKEL_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item NICKEL_BLOCK = register(EarthPulsationModBlocks.NICKEL_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ZINC_INGOT = register(new ZincIngotItem());
	public static final Item RUBY = register(new RubyItem());
	public static final Item RUBY_BLOCK = register(EarthPulsationModBlocks.RUBY_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RUBY_ORE = register(EarthPulsationModBlocks.RUBY_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item SAPPHIRE = register(new SapphireItem());
	public static final Item SAPPHIRE_BLOCK = register(EarthPulsationModBlocks.SAPPHIRE_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item SAPPHIRE_ORE = register(EarthPulsationModBlocks.SAPPHIRE_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item TOPAZ = register(new TopazItem());
	public static final Item TOPAZ_BLOCK = register(EarthPulsationModBlocks.TOPAZ_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item TOPAZ_ORE = register(EarthPulsationModBlocks.TOPAZ_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CINNABAR = register(new CinnabarItem());
	public static final Item RUST = register(new RustItem());
	public static final Item RUST_IRON_INGOT = register(new RustIronIngotItem());
	public static final Item RUSTY_IRON_PICKAXE = register(new RustyIronPickaxeItem());
	public static final Item RUSTY_IRON_AXE = register(new RustyIronAxeItem());
	public static final Item RUSTY_IRON_SWORD = register(new RustyIronSwordItem());
	public static final Item RUSTY_IRON_SHOVEL = register(new RustyIronShovelItem());
	public static final Item SAW_DUST = register(new SawDustItem());
	public static final Item WOODEN_BOARD = register(new WoodenBoardItem());
	public static final Item STICK_PLANKS = register(EarthPulsationModBlocks.STICK_PLANKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WOODEN_PLANKS = register(EarthPulsationModBlocks.WOODEN_PLANKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WOODEN_BLOCK = register(EarthPulsationModBlocks.WOODEN_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item PLASTIC_WOOD_STICK = register(new PlasticWoodStickItem());
	public static final Item PLASTIC_WOOD_BOARD = register(new PlasticWoodBoardItem());
	public static final Item PLASTIC_WOOD_PLANKS = register(EarthPulsationModBlocks.PLASTIC_WOOD_PLANKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item STONE_INGOT = register(new StoneIngotItem());
	public static final Item STONE_BRICK_PICKAXE = register(new StoneBrickPickaxeItem());
	public static final Item STONE_BRICK_AXE = register(new StoneBrickAxeItem());
	public static final Item STONE_BRICK_SWORD = register(new StoneBrickSwordItem());
	public static final Item STONE_BRICK_SHOVEL = register(new StoneBrickShovelItem());
	public static final Item STONE_BRICK_HOE = register(new StoneBrickHoeItem());
	public static final Item STONE_BRICK_ARMMOR_HELMET = register(new StoneBrickArmmorItem.Helmet());
	public static final Item STONE_BRICK_ARMMOR_CHESTPLATE = register(new StoneBrickArmmorItem.Chestplate());
	public static final Item STONE_BRICK_ARMMOR_LEGGINGS = register(new StoneBrickArmmorItem.Leggings());
	public static final Item STONE_BRICK_ARMMOR_BOOTS = register(new StoneBrickArmmorItem.Boots());
	public static final Item DEEPSLATE_INGOT = register(new DeepslateIngotItem());
	public static final Item JADE_INGOT = register(new JadeIngotItem());
	public static final Item JADE_BRICKS = register(EarthPulsationModBlocks.JADE_BRICKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BASALT_FIBRE = register(new BasaltFibreItem());
	public static final Item CAST_STONE_INGOT = register(new CastStoneIngotItem());
	public static final Item CAST_STONE_BRICK = register(EarthPulsationModBlocks.CAST_STONE_BRICK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLUE_SHADOW_INGOT = register(new BlueShadowIngotItem());
	public static final Item BLACK_GOLD_INGOT = register(new BlackGoldIngotItem());
	public static final Item BLACK_GOLD_ORE = register(EarthPulsationModBlocks.BLACK_GOLD_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RAW_BLACK_GOLD = register(new RawBlackGoldItem());
	public static final Item RAW_BLACK_GOLD_BLOCK = register(EarthPulsationModBlocks.RAW_BLACK_GOLD_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLACK_GOLD_BLOCK = register(EarthPulsationModBlocks.BLACK_GOLD_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CAST_IRON_INGOT = register(new CastIronIngotItem());
	public static final Item CAST_IRON_BLOCK = register(EarthPulsationModBlocks.CAST_IRON_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item TOUGH_COPPER_INGOT = register(new ToughCopperIngotItem());
	public static final Item TOUGH_COPPER_BLOCK = register(EarthPulsationModBlocks.TOUGH_COPPER_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item HARD_ALUMINUM_INGOT = register(new HardAluminumIngotItem());
	public static final Item HARD_ALUMINUM_BLOCK = register(EarthPulsationModBlocks.HARD_ALUMINUM_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item PATTERN_GOLD_INGOT = register(new PatternGoldIngotItem());
	public static final Item PATTERN_GOLD_BLOCK = register(EarthPulsationModBlocks.PATTERN_GOLD_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ALCHEMICAL_SILVER_INGOT = register(new AlchemicalSilverIngotItem());
	public static final Item ALCHEMICAL_SILVER_BLOCK = register(EarthPulsationModBlocks.ALCHEMICAL_SILVER_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item TURBID_OBSIDIAN_NUGGET = register(new TurbidObsidianNuggetItem());
	public static final Item PURE_OBSIDIAN_NUGGET = register(new PureObsidianNuggetItem());
	public static final Item TURBID_OBSIDIAN_INGOT = register(new TurbidObsidianIngotItem());
	public static final Item PURE_OBSIDIAN_INGOT = register(new PureObsidianIngotItem());
	public static final Item TURBID_OBSIDIAN_BLOCK = register(EarthPulsationModBlocks.TURBID_OBSIDIAN_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item PURE_OBSIDIAN_BLOCK = register(EarthPulsationModBlocks.PURE_OBSIDIAN_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item OBSIDIAN_PICKAXE = register(new ObsidianPickaxeItem());
	public static final Item OBSIDIAN_AXE = register(new ObsidianAxeItem());
	public static final Item OBSIDIAN_SWORD = register(new ObsidianSwordItem());
	public static final Item OBSIDIAN_SHOVEL = register(new ObsidianShovelItem());
	public static final Item OBSIDIAN_HOE = register(new ObsidianHoeItem());
	public static final Item MAGNETIZED_IRON_INGOT = register(new MagnetizedIronIngotItem());
	public static final Item MAGNET_INGOT = register(new MagnetIngotItem());
	public static final Item YELLOW_STONE = register(EarthPulsationModBlocks.YELLOW_STONE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item YELLOW_COBBLESTONE = register(EarthPulsationModBlocks.YELLOW_COBBLESTONE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item YELLOW_COBBLESTONE_STAIR = register(EarthPulsationModBlocks.YELLOW_COBBLESTONE_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item YELLOW_COBBLESTONE_SLAB = register(EarthPulsationModBlocks.YELLOW_COBBLESTONE_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item YELLOW_STONE_BRICKS = register(EarthPulsationModBlocks.YELLOW_STONE_BRICKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_YELLOW_STONE_BRICKS = register(EarthPulsationModBlocks.CHISELED_YELLOW_STONE_BRICKS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item YELLOW_STONE_INGOT = register(new YellowStoneIngotItem());
	public static final Item CHISELED_YELLOW_STONE_BRICKS_STAIR = register(EarthPulsationModBlocks.CHISELED_YELLOW_STONE_BRICKS_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_YELLOW_STONE_BRICKS_SLAB = register(EarthPulsationModBlocks.CHISELED_YELLOW_STONE_BRICKS_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item YELLOW_STONE_BRICKS_WALL = register(EarthPulsationModBlocks.YELLOW_STONE_BRICKS_WALL,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICESAND = register(EarthPulsationModBlocks.ICESAND, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICESANDSTONE = register(EarthPulsationModBlocks.ICESANDSTONE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item SMOOTH_ICESANDSTONE = register(EarthPulsationModBlocks.SMOOTH_ICESANDSTONE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_ICE_STONE = register(EarthPulsationModBlocks.CHISELED_ICE_STONE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_SAPLING = register(EarthPulsationModBlocks.ICE_BIRCH_SAPLING, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_LEAVES = register(EarthPulsationModBlocks.ICE_BIRCH_LEAVES, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_LOG = register(EarthPulsationModBlocks.ICE_BIRCH_LOG, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_WOOD = register(EarthPulsationModBlocks.ICE_BIRCH_WOOD, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item STRIPPED_ICE_BIRCH_LOG = register(EarthPulsationModBlocks.STRIPPED_ICE_BIRCH_LOG,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item STRIPPED_ICE_BIRCH_WOOD = register(EarthPulsationModBlocks.STRIPPED_ICE_BIRCH_WOOD,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_PLANKS = register(EarthPulsationModBlocks.ICE_BIRCH_PLANKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_STAIRS = register(EarthPulsationModBlocks.ICE_BIRCH_STAIRS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_SLAB = register(EarthPulsationModBlocks.ICE_BIRCH_SLAB, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_FENCE = register(EarthPulsationModBlocks.ICE_BIRCH_FENCE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_FENCE_GATE = register(EarthPulsationModBlocks.ICE_BIRCH_FENCE_GATE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_PRESSURE_PLATE = register(EarthPulsationModBlocks.ICE_BIRCH_PRESSURE_PLATE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICE_BIRCH_BUTTON = register(EarthPulsationModBlocks.ICE_BIRCH_BUTTON, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item FROZEN_BUSH = register(EarthPulsationModBlocks.FROZEN_BUSH, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLAZING_DIRT = register(EarthPulsationModBlocks.BLAZING_DIRT, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_LEAVES = register(EarthPulsationModBlocks.MAPLE_LEAVES, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_LOG = register(EarthPulsationModBlocks.MAPLE_LOG, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_WOOD = register(EarthPulsationModBlocks.MAPLE_WOOD, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item STRIPPED_MAPLE_LOG = register(EarthPulsationModBlocks.STRIPPED_MAPLE_LOG, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item STRIPPED_MAPLE_WOOD = register(EarthPulsationModBlocks.STRIPPED_MAPLE_WOOD, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_PLANKS = register(EarthPulsationModBlocks.MAPLE_PLANKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_STAIRS = register(EarthPulsationModBlocks.MAPLE_STAIRS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_SLAB = register(EarthPulsationModBlocks.MAPLE_SLAB, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_FENCE = register(EarthPulsationModBlocks.MAPLE_FENCE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_FENCE_GATE = register(EarthPulsationModBlocks.MAPLE_FENCE_GATE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_PRESSURE_PLATE = register(EarthPulsationModBlocks.MAPLE_PRESSURE_PLATE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAPLE_BUTTON = register(EarthPulsationModBlocks.MAPLE_BUTTON, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LARVIKITE = register(EarthPulsationModBlocks.LARVIKITE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LUMEN_CRYSTAL_STEM = register(EarthPulsationModBlocks.LUMEN_CRYSTAL_STEM, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item SMOOTH_PRISMARINE_BRICK = register(EarthPulsationModBlocks.SMOOTH_PRISMARINE_BRICK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ICELAND_SPAR = register(EarthPulsationModBlocks.ICELAND_SPAR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item EMPTY_BLUE_PRINT = register(new EmptyBluePrintItem());
	public static final Item BLUE_PRINT = register(new BluePrintItem());
	public static final Item EMPTY_STONE_RUNE = register(new EmptyStoneRuneItem());
	public static final Item EMPTY_JADE_RUNE = register(new EmptyJadeRuneItem());
	public static final Item EMPTY_YELLOW_STONE_RUNE = register(new EmptyYellowStoneRuneItem());
	public static final Item WOODEN_RUNE = register(new WoodenRuneItem());
	public static final Item RESIN = register(new ResinItem());
	public static final Item RESIN_BLOCK = register(EarthPulsationModBlocks.RESIN_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item SHABBY_CIRCUIT_BOARD = register(new ShabbyCircuitBoardItem());
	public static final Item BLANK_CIRCUTI_BOARD = register(new BlankCircutiBoardItem());
	public static final Item BASE_CIRCUTI_BOARD = register(new BaseCircutiBoardItem());
	public static final Item DARK_CIRCUIT_BOARD = register(new DarkCircuitBoardItem());
	public static final Item SCREEN_PART = register(new ScreenPartItem());
	public static final Item BASIC_BATTERY = register(new BasicBatteryItem());
	public static final Item CLASSIC_BATTERY = register(new ClassicBatteryItem());
	public static final Item CONCISE_BATTERY = register(new ConciseBatteryItem());
	public static final Item NORMAL_BATTERY = register(new NormalBatteryItem());
	public static final Item HIGH_LEVEL_BATTERY = register(new HighLevelBatteryItem());
	public static final Item SUPER_BATTERY = register(new SuperBatteryItem());
	public static final Item COAL_GENERATOR = register(EarthPulsationModBlocks.COAL_GENERATOR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BATTERY_BLOCK = register(EarthPulsationModBlocks.BATTERY_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WOODEN_TROUGH = register(new WoodenTroughItem());
	public static final Item BIG_APPLE_PIECE = register(new BigApplePieceItem());
	public static final Item BIG_APPLE_BLOCK = register(EarthPulsationModBlocks.BIG_APPLE_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WOODEN_TROUGH_FILLED_WITH_DOUGH = register(new WoodenTroughFilledWithDoughItem());
	public static final Item REFINED_BREAD = register(new RefinedBreadItem());
	public static final Item WOODEN_TROUGH_FILLED_WITH_CHOCOLATE = register(new WoodenTroughFilledWithChocolateItem());
	public static final Item CHOCOLATE = register(new ChocolateItem());
	public static final Item WARPED_WART_SLURRIES_BUCKET = register(new WarpedWartSlurriesItem());
	public static final Item WARPED_WART_SLURRIES_BOTTLE = register(new WarpedWartSlurriesBottleItem());
	public static final Item COPPER_DOOR = register(EarthPulsationModBlocks.COPPER_DOOR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ALUMINUM_DOOR = register(EarthPulsationModBlocks.ALUMINUM_DOOR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CONTAINER_COLUMN = register(EarthPulsationModBlocks.CONTAINER_COLUMN, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CONTAINER_WALL = register(EarthPulsationModBlocks.CONTAINER_WALL, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CONTAINER_DOOR = register(EarthPulsationModBlocks.CONTAINER_DOOR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLUE_CONTAINER_COLUMN = register(EarthPulsationModBlocks.BLUE_CONTAINER_COLUMN,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLUE_CONTAINER_WALL = register(EarthPulsationModBlocks.BLUE_CONTAINER_WALL, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLUE_CONTAINER_DOOR = register(EarthPulsationModBlocks.BLUE_CONTAINER_DOOR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RED_CONTAINER_COLUMN = register(EarthPulsationModBlocks.RED_CONTAINER_COLUMN, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RED_CONTAINER_WALL = register(EarthPulsationModBlocks.RED_CONTAINER_WALL, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RED_CONTAINER_DOOR = register(EarthPulsationModBlocks.RED_CONTAINER_DOOR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WOOD_PLANKS_DOOR = register(EarthPulsationModBlocks.WOOD_PLANKS_DOOR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WOODEN_TABLE = register(EarthPulsationModBlocks.WOODEN_TABLE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LONG_WOODEN_TABLE = register(EarthPulsationModBlocks.LONG_WOODEN_TABLE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WOODEN_HOLDER = register(EarthPulsationModBlocks.WOODEN_HOLDER, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WOODEN_CHAIR = register(EarthPulsationModBlocks.WOODEN_CHAIR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WHITE_LIGHT_LAB_BLOCK = register(EarthPulsationModBlocks.WHITE_LIGHT_LAB_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLUE_LIGHT_LAB_BLOCK = register(EarthPulsationModBlocks.BLUE_LIGHT_LAB_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_WHITE_LIGHT_LAB_BLOCK = register(EarthPulsationModBlocks.CHISELED_WHITE_LIGHT_LAB_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_WHITE_LIGHT_LAB_BLOCK_STAIR = register(EarthPulsationModBlocks.CHISELED_WHITE_LIGHT_LAB_BLOCK_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_WHITE_LIGHT_LAB_BLOCK_SLAB = register(EarthPulsationModBlocks.CHISELED_WHITE_LIGHT_LAB_BLOCK_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_BLUE_LIGHT_LAB_BLOCK = register(EarthPulsationModBlocks.CHISELED_BLUE_LIGHT_LAB_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_BLUE_LIGHT_LAB_BLOCK_STAIR = register(EarthPulsationModBlocks.CHISELED_BLUE_LIGHT_LAB_BLOCK_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_BLUE_LIGHT_LAB_BLOCK_SLAB = register(EarthPulsationModBlocks.CHISELED_BLUE_LIGHT_LAB_BLOCK_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_MIXED_LIGHT_LAB_BLOCK_A = register(EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_A,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_MIXED_LIGHT_LAB_BLOCK_A_STAIR = register(EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_A_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_MIXED_LIGHT_LAB_BLOCK_A_SLAB = register(EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_A_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_MIXED_LIGHT_LAB_BLOCK_B = register(EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_B,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_MIXED_LIGHT_LAB_BLOCK_B_STAIR = register(EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_B_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CHISELED_MIXED_LIGHT_LAB_BLOCK_B_SLAB = register(EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_B_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RESIN_GLASS = register(EarthPulsationModBlocks.RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WHITE_RESIN_GLASS = register(EarthPulsationModBlocks.WHITE_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ORANGE_RESIN_GLASS = register(EarthPulsationModBlocks.ORANGE_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAGENTA_RESIN_GLASS = register(EarthPulsationModBlocks.MAGENTA_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LIGHT_BLUE_RESIN_GLASS = register(EarthPulsationModBlocks.LIGHT_BLUE_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item YELLOW_RESIN_GLASS = register(EarthPulsationModBlocks.YELLOW_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LIME_RESIN_GLASS = register(EarthPulsationModBlocks.LIME_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item PINK_RESIN_GLASS = register(EarthPulsationModBlocks.PINK_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item GRAY_RESIN_GLASS = register(EarthPulsationModBlocks.GRAY_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LIGHT_GRAY_RESIN_GLASS = register(EarthPulsationModBlocks.LIGHT_GRAY_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CYAN_RESIN_GLASS = register(EarthPulsationModBlocks.CYAN_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item PURPLE_RESIN_GLASS = register(EarthPulsationModBlocks.PURPLE_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLUE_RESIN_GLASS = register(EarthPulsationModBlocks.BLUE_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BROWN_RESIN_GLASS = register(EarthPulsationModBlocks.BROWN_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item GREEN_RESIN_GLASS = register(EarthPulsationModBlocks.GREEN_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RED_RESIN_GLASS = register(EarthPulsationModBlocks.RED_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLACK_RESIN_GLASS = register(EarthPulsationModBlocks.BLACK_RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RESIN_GLASS_PANE = register(EarthPulsationModBlocks.RESIN_GLASS_PANE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item WHITE_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.WHITE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item ORANGE_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.ORANGE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item MAGENTA_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.MAGENTA_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LIGHT_BLUE_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.LIGHT_BLUE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item YELLOW_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.YELLOW_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LIME_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.LIME_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item PINK_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.PINK_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item GRAY_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.GRAY_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item LIGHT_GRAY_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.LIGHT_GRAY_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item CYAN_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.CYAN_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item PURPLE_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.PURPLE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLUE_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.BLUE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BROWN_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.BROWN_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item GREEN_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.GREEN_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item RED_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.RED_RESIN_GLASS_PANE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item BLACK_RESIN_GLASS_PANE = register(EarthPulsationModBlocks.BLACK_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final Item PURE_SLIME = register(new SpawnEggItem(EarthPulsationModEntities.PURE_SLIME, -13382401, -13395457,
			new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION)).setRegistryName("pure_slime_spawn_egg"));
	public static final Item WANDERED_MINNER = register(new SpawnEggItem(EarthPulsationModEntities.WANDERED_MINNER, -16751053, -256,
			new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION)).setRegistryName("wandered_minner_spawn_egg"));
	public static final Item TINY_TNT = register(new TinyTNTItem());
	public static final Item MELON_GUN = register(new MelonGunItem());
	public static final Item NORMAL_GUN = register(new NormalGunItem());
	public static final Item GLASS_SWORD = register(new GlassSwordItem());
	public static final Item NOKIKA = register(new NokikaItem());
	public static final Item SAMJUNG_NOTE_7 = register(new SamjungNote7Item());
	public static final Item OLD_AGE = register(new OldAgeItem());
	public static final Item DEEP_WELL = register(new DeepWellItem());
	public static final Item PLACE_ON_WATER_PLATE = register(EarthPulsationModBlocks.PLACE_ON_WATER_PLATE, EarthPulsationModTabs.TAB_EARTH_PULSATION);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
