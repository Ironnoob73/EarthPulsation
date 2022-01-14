
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import idv.hailelectronic.earthpulsation.block.YellowStoneBricksWallBlock;
import idv.hailelectronic.earthpulsation.block.YellowStoneBricksBlock;
import idv.hailelectronic.earthpulsation.block.YellowStoneBlock;
import idv.hailelectronic.earthpulsation.block.YellowResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.YellowResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.YellowCobblestoneStairBlock;
import idv.hailelectronic.earthpulsation.block.YellowCobblestoneSlabBlock;
import idv.hailelectronic.earthpulsation.block.YellowCobblestoneBlock;
import idv.hailelectronic.earthpulsation.block.WoodenTableBlock;
import idv.hailelectronic.earthpulsation.block.WoodenPlanksBlock;
import idv.hailelectronic.earthpulsation.block.WoodenHolderBlock;
import idv.hailelectronic.earthpulsation.block.WoodenBlockBlock;
import idv.hailelectronic.earthpulsation.block.WoodPlanksDoorBlock;
import idv.hailelectronic.earthpulsation.block.WhiteResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.WhiteResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.WhiteLightLabBlockBlock;
import idv.hailelectronic.earthpulsation.block.WarpedWartSlurriesBlock;
import idv.hailelectronic.earthpulsation.block.TurbidObsidianBlockBlock;
import idv.hailelectronic.earthpulsation.block.ToughCopperBlockBlock;
import idv.hailelectronic.earthpulsation.block.TopazOreBlock;
import idv.hailelectronic.earthpulsation.block.TopazBlockBlock;
import idv.hailelectronic.earthpulsation.block.TinOreBlock;
import idv.hailelectronic.earthpulsation.block.TinBlockBlock;
import idv.hailelectronic.earthpulsation.block.StrippedMapleWoodBlock;
import idv.hailelectronic.earthpulsation.block.StrippedMapleLogBlock;
import idv.hailelectronic.earthpulsation.block.StrippedIceBirchWoodBlock;
import idv.hailelectronic.earthpulsation.block.StrippedIceBirchLogBlock;
import idv.hailelectronic.earthpulsation.block.StickPlanksBlock;
import idv.hailelectronic.earthpulsation.block.SteelBlockBlock;
import idv.hailelectronic.earthpulsation.block.SmoothPrismarineBrickBlock;
import idv.hailelectronic.earthpulsation.block.SmoothIcesandstoneBlock;
import idv.hailelectronic.earthpulsation.block.SilverOreBlock;
import idv.hailelectronic.earthpulsation.block.SilverBlockBlock;
import idv.hailelectronic.earthpulsation.block.SapphireOreBlock;
import idv.hailelectronic.earthpulsation.block.SapphireBlockBlock;
import idv.hailelectronic.earthpulsation.block.RubyOreBlock;
import idv.hailelectronic.earthpulsation.block.RubyBlockBlock;
import idv.hailelectronic.earthpulsation.block.ResearchStationBlock;
import idv.hailelectronic.earthpulsation.block.ReinforcedSieveBlock;
import idv.hailelectronic.earthpulsation.block.RefinerLitBlock;
import idv.hailelectronic.earthpulsation.block.RedResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.RedResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.RedContainerWallBlock;
import idv.hailelectronic.earthpulsation.block.RedContainerDoorBlock;
import idv.hailelectronic.earthpulsation.block.RedContainerColumnBlock;
import idv.hailelectronic.earthpulsation.block.PurpleResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.PurpleResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.PureObsidianBlockBlock;
import idv.hailelectronic.earthpulsation.block.PulverizerBlock;
import idv.hailelectronic.earthpulsation.block.PlasticWoodPlanksBlock;
import idv.hailelectronic.earthpulsation.block.PlaceOnWaterPlateBlock;
import idv.hailelectronic.earthpulsation.block.PinkResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.PinkResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.PatternGoldBlockBlock;
import idv.hailelectronic.earthpulsation.block.OrangeResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.OrangeResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.OldAgePortalBlock;
import idv.hailelectronic.earthpulsation.block.ObeliskBlock;
import idv.hailelectronic.earthpulsation.block.NickelOreBlock;
import idv.hailelectronic.earthpulsation.block.NickelBlockBlock;
import idv.hailelectronic.earthpulsation.block.MapleWoodBlock;
import idv.hailelectronic.earthpulsation.block.MapleStairsBlock;
import idv.hailelectronic.earthpulsation.block.MapleSlabBlock;
import idv.hailelectronic.earthpulsation.block.MaplePressurePlateBlock;
import idv.hailelectronic.earthpulsation.block.MaplePlanksBlock;
import idv.hailelectronic.earthpulsation.block.MapleLogBlock;
import idv.hailelectronic.earthpulsation.block.MapleLeavesBlock;
import idv.hailelectronic.earthpulsation.block.MapleFenceGateBlock;
import idv.hailelectronic.earthpulsation.block.MapleFenceBlock;
import idv.hailelectronic.earthpulsation.block.MapleButtonBlock;
import idv.hailelectronic.earthpulsation.block.MagentaResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.MagentaResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.LumenCrystalStemBlock;
import idv.hailelectronic.earthpulsation.block.LongWoodenTableBlock;
import idv.hailelectronic.earthpulsation.block.LimeResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.LimeResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.LightGrayResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.LightGrayResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.LightBlueResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.LightBlueResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.LeadOreBlock;
import idv.hailelectronic.earthpulsation.block.LeadBlockBlock;
import idv.hailelectronic.earthpulsation.block.LarvikiteBlock;
import idv.hailelectronic.earthpulsation.block.IcesandstoneBlock;
import idv.hailelectronic.earthpulsation.block.IcesandBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchWoodBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchStairsBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchSlabBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchPressurePlateBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchPlanksBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchLogBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchLeavesBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchFenceGateBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchFenceBlock;
import idv.hailelectronic.earthpulsation.block.IceBirchButtonBlock;
import idv.hailelectronic.earthpulsation.block.HardAluminumBlockBlock;
import idv.hailelectronic.earthpulsation.block.GrinderBlock;
import idv.hailelectronic.earthpulsation.block.GreenResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.GreenResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.GrayResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.GrayResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.FrozenBushBlock;
import idv.hailelectronic.earthpulsation.block.ForgottenIronOreBlock;
import idv.hailelectronic.earthpulsation.block.ForgingTableL1Block;
import idv.hailelectronic.earthpulsation.block.DeepWellPortalBlock;
import idv.hailelectronic.earthpulsation.block.CyanResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.CyanResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.CopperDoorBlock;
import idv.hailelectronic.earthpulsation.block.ContainerWallBlock;
import idv.hailelectronic.earthpulsation.block.ContainerDoorBlock;
import idv.hailelectronic.earthpulsation.block.ContainerColumnBlock;
import idv.hailelectronic.earthpulsation.block.ColdBirchBlock;
import idv.hailelectronic.earthpulsation.block.CobaltOreBlock;
import idv.hailelectronic.earthpulsation.block.CobaltBlockBlock;
import idv.hailelectronic.earthpulsation.block.CoalGeneratorBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledYellowStoneBricksStairBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledYellowStoneBricksSlabBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledYellowStoneBricksBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledWhiteLightLabBlockStairBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledWhiteLightLabBlockSlabBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledWhiteLightLabBlockBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockBStairBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockBSlabBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockBBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockAStairBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockASlabBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockABlock;
import idv.hailelectronic.earthpulsation.block.ChiseledIronBlockBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledIceStoneBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledBlueLightLabBlockStairBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledBlueLightLabBlockSlabBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledBlueLightLabBlockBlock;
import idv.hailelectronic.earthpulsation.block.CastIronBlockBlock;
import idv.hailelectronic.earthpulsation.block.BrownResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.BrownResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.BlueResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.BlueResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.BlueLightLabBlockBlock;
import idv.hailelectronic.earthpulsation.block.BlueContainerWallBlock;
import idv.hailelectronic.earthpulsation.block.BlueContainerDoorBlock;
import idv.hailelectronic.earthpulsation.block.BlueContainerColumnBlock;
import idv.hailelectronic.earthpulsation.block.BlazingDirtBlock;
import idv.hailelectronic.earthpulsation.block.BlackResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.BlackResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.BlackGoldOreBlock;
import idv.hailelectronic.earthpulsation.block.BlackGoldBlockBlock;
import idv.hailelectronic.earthpulsation.block.BigAppleBlockBlock;
import idv.hailelectronic.earthpulsation.block.BatteryBlockBlock;
import idv.hailelectronic.earthpulsation.block.BasinBlock;
import idv.hailelectronic.earthpulsation.block.AluminumOreBlock;
import idv.hailelectronic.earthpulsation.block.AluminumDoorBlock;
import idv.hailelectronic.earthpulsation.block.AluminumBlockBlock;
import idv.hailelectronic.earthpulsation.block.AlchemicalSilverBlockBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EarthPulsationModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block OBELISK = register(new ObeliskBlock());
	public static final Block RESEARCH_STATION = register(new ResearchStationBlock());
	public static final Block FORGING_TABLE_L_1 = register(new ForgingTableL1Block());
	public static final Block REFINER_LIT = register(new RefinerLitBlock());
	public static final Block GRINDER = register(new GrinderBlock());
	public static final Block PULVERIZER = register(new PulverizerBlock());
	public static final Block REINFORCED_SIEVE = register(new ReinforcedSieveBlock());
	public static final Block BASIN = register(new BasinBlock());
	public static final Block ALUMINUM_ORE = register(new AluminumOreBlock());
	public static final Block ALUMINUM_BLOCK = register(new AluminumBlockBlock());
	public static final Block FORGOTTEN_IRON_ORE = register(new ForgottenIronOreBlock());
	public static final Block CHISELED_IRON_BLOCK = register(new ChiseledIronBlockBlock());
	public static final Block STEEL_BLOCK = register(new SteelBlockBlock());
	public static final Block LEAD_ORE = register(new LeadOreBlock());
	public static final Block LEAD_BLOCK = register(new LeadBlockBlock());
	public static final Block TIN_ORE = register(new TinOreBlock());
	public static final Block TIN_BLOCK = register(new TinBlockBlock());
	public static final Block SILVER_ORE = register(new SilverOreBlock());
	public static final Block SILVER_BLOCK = register(new SilverBlockBlock());
	public static final Block COBALT_ORE = register(new CobaltOreBlock());
	public static final Block COBALT_BLOCK = register(new CobaltBlockBlock());
	public static final Block NICKEL_ORE = register(new NickelOreBlock());
	public static final Block NICKEL_BLOCK = register(new NickelBlockBlock());
	public static final Block RUBY_BLOCK = register(new RubyBlockBlock());
	public static final Block RUBY_ORE = register(new RubyOreBlock());
	public static final Block SAPPHIRE_BLOCK = register(new SapphireBlockBlock());
	public static final Block SAPPHIRE_ORE = register(new SapphireOreBlock());
	public static final Block TOPAZ_BLOCK = register(new TopazBlockBlock());
	public static final Block TOPAZ_ORE = register(new TopazOreBlock());
	public static final Block STICK_PLANKS = register(new StickPlanksBlock());
	public static final Block WOODEN_PLANKS = register(new WoodenPlanksBlock());
	public static final Block WOODEN_BLOCK = register(new WoodenBlockBlock());
	public static final Block PLASTIC_WOOD_PLANKS = register(new PlasticWoodPlanksBlock());
	public static final Block BLACK_GOLD_ORE = register(new BlackGoldOreBlock());
	public static final Block BLACK_GOLD_BLOCK = register(new BlackGoldBlockBlock());
	public static final Block CAST_IRON_BLOCK = register(new CastIronBlockBlock());
	public static final Block TOUGH_COPPER_BLOCK = register(new ToughCopperBlockBlock());
	public static final Block HARD_ALUMINUM_BLOCK = register(new HardAluminumBlockBlock());
	public static final Block PATTERN_GOLD_BLOCK = register(new PatternGoldBlockBlock());
	public static final Block ALCHEMICAL_SILVER_BLOCK = register(new AlchemicalSilverBlockBlock());
	public static final Block TURBID_OBSIDIAN_BLOCK = register(new TurbidObsidianBlockBlock());
	public static final Block PURE_OBSIDIAN_BLOCK = register(new PureObsidianBlockBlock());
	public static final Block YELLOW_STONE = register(new YellowStoneBlock());
	public static final Block YELLOW_COBBLESTONE = register(new YellowCobblestoneBlock());
	public static final Block YELLOW_COBBLESTONE_STAIR = register(new YellowCobblestoneStairBlock());
	public static final Block YELLOW_COBBLESTONE_SLAB = register(new YellowCobblestoneSlabBlock());
	public static final Block YELLOW_STONE_BRICKS = register(new YellowStoneBricksBlock());
	public static final Block CHISELED_YELLOW_STONE_BRICKS = register(new ChiseledYellowStoneBricksBlock());
	public static final Block CHISELED_YELLOW_STONE_BRICKS_STAIR = register(new ChiseledYellowStoneBricksStairBlock());
	public static final Block CHISELED_YELLOW_STONE_BRICKS_SLAB = register(new ChiseledYellowStoneBricksSlabBlock());
	public static final Block YELLOW_STONE_BRICKS_WALL = register(new YellowStoneBricksWallBlock());
	public static final Block ICESAND = register(new IcesandBlock());
	public static final Block ICESANDSTONE = register(new IcesandstoneBlock());
	public static final Block SMOOTH_ICESANDSTONE = register(new SmoothIcesandstoneBlock());
	public static final Block CHISELED_ICE_STONE = register(new ChiseledIceStoneBlock());
	public static final Block SMOOTH_PRISMARINE_BRICK = register(new SmoothPrismarineBrickBlock());
	public static final Block ICE_BIRCH_SAPLING = register(new ColdBirchBlock());
	public static final Block ICE_BIRCH_LEAVES = register(new IceBirchLeavesBlock());
	public static final Block ICE_BIRCH_LOG = register(new IceBirchLogBlock());
	public static final Block ICE_BIRCH_WOOD = register(new IceBirchWoodBlock());
	public static final Block STRIPPED_ICE_BIRCH_LOG = register(new StrippedIceBirchLogBlock());
	public static final Block STRIPPED_ICE_BIRCH_WOOD = register(new StrippedIceBirchWoodBlock());
	public static final Block ICE_BIRCH_PLANKS = register(new IceBirchPlanksBlock());
	public static final Block ICE_BIRCH_STAIRS = register(new IceBirchStairsBlock());
	public static final Block ICE_BIRCH_SLAB = register(new IceBirchSlabBlock());
	public static final Block ICE_BIRCH_FENCE = register(new IceBirchFenceBlock());
	public static final Block ICE_BIRCH_FENCE_GATE = register(new IceBirchFenceGateBlock());
	public static final Block ICE_BIRCH_PRESSURE_PLATE = register(new IceBirchPressurePlateBlock());
	public static final Block ICE_BIRCH_BUTTON = register(new IceBirchButtonBlock());
	public static final Block FROZEN_BUSH = register(new FrozenBushBlock());
	public static final Block BLAZING_DIRT = register(new BlazingDirtBlock());
	public static final Block MAPLE_LEAVES = register(new MapleLeavesBlock());
	public static final Block MAPLE_LOG = register(new MapleLogBlock());
	public static final Block MAPLE_WOOD = register(new MapleWoodBlock());
	public static final Block STRIPPED_MAPLE_LOG = register(new StrippedMapleLogBlock());
	public static final Block STRIPPED_MAPLE_WOOD = register(new StrippedMapleWoodBlock());
	public static final Block MAPLE_PLANKS = register(new MaplePlanksBlock());
	public static final Block MAPLE_STAIRS = register(new MapleStairsBlock());
	public static final Block MAPLE_SLAB = register(new MapleSlabBlock());
	public static final Block MAPLE_FENCE = register(new MapleFenceBlock());
	public static final Block MAPLE_FENCE_GATE = register(new MapleFenceGateBlock());
	public static final Block MAPLE_PRESSURE_PLATE = register(new MaplePressurePlateBlock());
	public static final Block MAPLE_BUTTON = register(new MapleButtonBlock());
	public static final Block LARVIKITE = register(new LarvikiteBlock());
	public static final Block LUMEN_CRYSTAL_STEM = register(new LumenCrystalStemBlock());
	public static final Block COAL_GENERATOR = register(new CoalGeneratorBlock());
	public static final Block BATTERY_BLOCK = register(new BatteryBlockBlock());
	public static final Block BIG_APPLE_BLOCK = register(new BigAppleBlockBlock());
	public static final Block WARPED_WART_SLURRIES = register(new WarpedWartSlurriesBlock());
	public static final Block COPPER_DOOR = register(new CopperDoorBlock());
	public static final Block ALUMINUM_DOOR = register(new AluminumDoorBlock());
	public static final Block CONTAINER_COLUMN = register(new ContainerColumnBlock());
	public static final Block CONTAINER_WALL = register(new ContainerWallBlock());
	public static final Block CONTAINER_DOOR = register(new ContainerDoorBlock());
	public static final Block BLUE_CONTAINER_COLUMN = register(new BlueContainerColumnBlock());
	public static final Block BLUE_CONTAINER_WALL = register(new BlueContainerWallBlock());
	public static final Block BLUE_CONTAINER_DOOR = register(new BlueContainerDoorBlock());
	public static final Block RED_CONTAINER_COLUMN = register(new RedContainerColumnBlock());
	public static final Block RED_CONTAINER_WALL = register(new RedContainerWallBlock());
	public static final Block RED_CONTAINER_DOOR = register(new RedContainerDoorBlock());
	public static final Block WOOD_PLANKS_DOOR = register(new WoodPlanksDoorBlock());
	public static final Block WOODEN_TABLE = register(new WoodenTableBlock());
	public static final Block LONG_WOODEN_TABLE = register(new LongWoodenTableBlock());
	public static final Block WOODEN_HOLDER = register(new WoodenHolderBlock());
	public static final Block WHITE_LIGHT_LAB_BLOCK = register(new WhiteLightLabBlockBlock());
	public static final Block BLUE_LIGHT_LAB_BLOCK = register(new BlueLightLabBlockBlock());
	public static final Block CHISELED_WHITE_LIGHT_LAB_BLOCK = register(new ChiseledWhiteLightLabBlockBlock());
	public static final Block CHISELED_WHITE_LIGHT_LAB_BLOCK_STAIR = register(new ChiseledWhiteLightLabBlockStairBlock());
	public static final Block CHISELED_WHITE_LIGHT_LAB_BLOCK_SLAB = register(new ChiseledWhiteLightLabBlockSlabBlock());
	public static final Block CHISELED_BLUE_LIGHT_LAB_BLOCK = register(new ChiseledBlueLightLabBlockBlock());
	public static final Block CHISELED_BLUE_LIGHT_LAB_BLOCK_STAIR = register(new ChiseledBlueLightLabBlockStairBlock());
	public static final Block CHISELED_BLUE_LIGHT_LAB_BLOCK_SLAB = register(new ChiseledBlueLightLabBlockSlabBlock());
	public static final Block CHISELED_MIXED_LIGHT_LAB_BLOCK_A = register(new ChiseledMixedLightLabBlockABlock());
	public static final Block CHISELED_MIXED_LIGHT_LAB_BLOCK_A_STAIR = register(new ChiseledMixedLightLabBlockAStairBlock());
	public static final Block CHISELED_MIXED_LIGHT_LAB_BLOCK_A_SLAB = register(new ChiseledMixedLightLabBlockASlabBlock());
	public static final Block CHISELED_MIXED_LIGHT_LAB_BLOCK_B = register(new ChiseledMixedLightLabBlockBBlock());
	public static final Block CHISELED_MIXED_LIGHT_LAB_BLOCK_B_STAIR = register(new ChiseledMixedLightLabBlockBStairBlock());
	public static final Block CHISELED_MIXED_LIGHT_LAB_BLOCK_B_SLAB = register(new ChiseledMixedLightLabBlockBSlabBlock());
	public static final Block WHITE_RESIN_GLASS = register(new WhiteResinGlassBlock());
	public static final Block ORANGE_RESIN_GLASS = register(new OrangeResinGlassBlock());
	public static final Block MAGENTA_RESIN_GLASS = register(new MagentaResinGlassBlock());
	public static final Block LIGHT_BLUE_RESIN_GLASS = register(new LightBlueResinGlassBlock());
	public static final Block YELLOW_RESIN_GLASS = register(new YellowResinGlassBlock());
	public static final Block LIME_RESIN_GLASS = register(new LimeResinGlassBlock());
	public static final Block PINK_RESIN_GLASS = register(new PinkResinGlassBlock());
	public static final Block GRAY_RESIN_GLASS = register(new GrayResinGlassBlock());
	public static final Block LIGHT_GRAY_RESIN_GLASS = register(new LightGrayResinGlassBlock());
	public static final Block CYAN_RESIN_GLASS = register(new CyanResinGlassBlock());
	public static final Block PURPLE_RESIN_GLASS = register(new PurpleResinGlassBlock());
	public static final Block BLUE_RESIN_GLASS = register(new BlueResinGlassBlock());
	public static final Block BROWN_RESIN_GLASS = register(new BrownResinGlassBlock());
	public static final Block GREEN_RESIN_GLASS = register(new GreenResinGlassBlock());
	public static final Block RED_RESIN_GLASS = register(new RedResinGlassBlock());
	public static final Block BLACK_RESIN_GLASS = register(new BlackResinGlassBlock());
	public static final Block WHITE_RESIN_GLASS_PANE = register(new WhiteResinGlassPaneBlock());
	public static final Block ORANGE_RESIN_GLASS_PANE = register(new OrangeResinGlassPaneBlock());
	public static final Block MAGENTA_RESIN_GLASS_PANE = register(new MagentaResinGlassPaneBlock());
	public static final Block LIGHT_BLUE_RESIN_GLASS_PANE = register(new LightBlueResinGlassPaneBlock());
	public static final Block YELLOW_RESIN_GLASS_PANE = register(new YellowResinGlassPaneBlock());
	public static final Block LIME_RESIN_GLASS_PANE = register(new LimeResinGlassPaneBlock());
	public static final Block PINK_RESIN_GLASS_PANE = register(new PinkResinGlassPaneBlock());
	public static final Block GRAY_RESIN_GLASS_PANE = register(new GrayResinGlassPaneBlock());
	public static final Block LIGHT_GRAY_RESIN_GLASS_PANE = register(new LightGrayResinGlassPaneBlock());
	public static final Block CYAN_RESIN_GLASS_PANE = register(new CyanResinGlassPaneBlock());
	public static final Block PURPLE_RESIN_GLASS_PANE = register(new PurpleResinGlassPaneBlock());
	public static final Block BLUE_RESIN_GLASS_PANE = register(new BlueResinGlassPaneBlock());
	public static final Block BROWN_RESIN_GLASS_PANE = register(new BrownResinGlassPaneBlock());
	public static final Block GREEN_RESIN_GLASS_PANE = register(new GreenResinGlassPaneBlock());
	public static final Block RED_RESIN_GLASS_PANE = register(new RedResinGlassPaneBlock());
	public static final Block BLACK_RESIN_GLASS_PANE = register(new BlackResinGlassPaneBlock());
	public static final Block OLD_AGE_PORTAL = register(new OldAgePortalBlock());
	public static final Block DEEP_WELL_PORTAL = register(new DeepWellPortalBlock());
	public static final Block PLACE_ON_WATER_PLATE = register(new PlaceOnWaterPlateBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ObeliskBlock.registerRenderLayer();
			PulverizerBlock.registerRenderLayer();
			ReinforcedSieveBlock.registerRenderLayer();
			BasinBlock.registerRenderLayer();
			CastIronBlockBlock.registerRenderLayer();
			ToughCopperBlockBlock.registerRenderLayer();
			HardAluminumBlockBlock.registerRenderLayer();
			PatternGoldBlockBlock.registerRenderLayer();
			AlchemicalSilverBlockBlock.registerRenderLayer();
			PureObsidianBlockBlock.registerRenderLayer();
			IcesandstoneBlock.registerRenderLayer();
			SmoothIcesandstoneBlock.registerRenderLayer();
			ChiseledIceStoneBlock.registerRenderLayer();
			ColdBirchBlock.registerRenderLayer();
			StrippedIceBirchLogBlock.registerRenderLayer();
			FrozenBushBlock.registerRenderLayer();
			LumenCrystalStemBlock.registerRenderLayer();
			CopperDoorBlock.registerRenderLayer();
			AluminumDoorBlock.registerRenderLayer();
			ContainerColumnBlock.registerRenderLayer();
			ContainerWallBlock.registerRenderLayer();
			ContainerDoorBlock.registerRenderLayer();
			BlueContainerColumnBlock.registerRenderLayer();
			BlueContainerWallBlock.registerRenderLayer();
			BlueContainerDoorBlock.registerRenderLayer();
			RedContainerColumnBlock.registerRenderLayer();
			RedContainerWallBlock.registerRenderLayer();
			RedContainerDoorBlock.registerRenderLayer();
			WoodPlanksDoorBlock.registerRenderLayer();
			WoodenTableBlock.registerRenderLayer();
			LongWoodenTableBlock.registerRenderLayer();
			WoodenHolderBlock.registerRenderLayer();
			WhiteResinGlassBlock.registerRenderLayer();
			OrangeResinGlassBlock.registerRenderLayer();
			MagentaResinGlassBlock.registerRenderLayer();
			LightBlueResinGlassBlock.registerRenderLayer();
			YellowResinGlassBlock.registerRenderLayer();
			LimeResinGlassBlock.registerRenderLayer();
			PinkResinGlassBlock.registerRenderLayer();
			GrayResinGlassBlock.registerRenderLayer();
			LightGrayResinGlassBlock.registerRenderLayer();
			CyanResinGlassBlock.registerRenderLayer();
			PurpleResinGlassBlock.registerRenderLayer();
			BlueResinGlassBlock.registerRenderLayer();
			BrownResinGlassBlock.registerRenderLayer();
			GreenResinGlassBlock.registerRenderLayer();
			RedResinGlassBlock.registerRenderLayer();
			BlackResinGlassBlock.registerRenderLayer();
			WhiteResinGlassPaneBlock.registerRenderLayer();
			OrangeResinGlassPaneBlock.registerRenderLayer();
			MagentaResinGlassPaneBlock.registerRenderLayer();
			LightBlueResinGlassPaneBlock.registerRenderLayer();
			YellowResinGlassPaneBlock.registerRenderLayer();
			LimeResinGlassPaneBlock.registerRenderLayer();
			PinkResinGlassPaneBlock.registerRenderLayer();
			GrayResinGlassPaneBlock.registerRenderLayer();
			LightGrayResinGlassPaneBlock.registerRenderLayer();
			CyanResinGlassPaneBlock.registerRenderLayer();
			PurpleResinGlassPaneBlock.registerRenderLayer();
			BlueResinGlassPaneBlock.registerRenderLayer();
			BrownResinGlassPaneBlock.registerRenderLayer();
			GreenResinGlassPaneBlock.registerRenderLayer();
			RedResinGlassPaneBlock.registerRenderLayer();
			BlackResinGlassPaneBlock.registerRenderLayer();
			PlaceOnWaterPlateBlock.registerRenderLayer();
		}
	}
}
