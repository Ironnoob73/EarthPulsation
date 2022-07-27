
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import idv.hailelectronic.earthpulsation.block.YellowResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.YellowResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.WoodenTableBlock;
import idv.hailelectronic.earthpulsation.block.WoodenHolderBlock;
import idv.hailelectronic.earthpulsation.block.WoodenChairBlock;
import idv.hailelectronic.earthpulsation.block.WhiteResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.WhiteResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.WhiteLightLabBlockBlock;
import idv.hailelectronic.earthpulsation.block.ToughCopperBlockBlock;
import idv.hailelectronic.earthpulsation.block.StrippedMapleWoodBlock;
import idv.hailelectronic.earthpulsation.block.StrippedMapleLogBlock;
import idv.hailelectronic.earthpulsation.block.ResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.ResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.ResinBlockBlock;
import idv.hailelectronic.earthpulsation.block.RedResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.RedResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.RedContainerWallBlock;
import idv.hailelectronic.earthpulsation.block.RedContainerDoorBlock;
import idv.hailelectronic.earthpulsation.block.RedContainerColumnBlock;
import idv.hailelectronic.earthpulsation.block.RawTinBlockBlock;
import idv.hailelectronic.earthpulsation.block.RawLeadBlockBlock;
import idv.hailelectronic.earthpulsation.block.RawBlackGoldBlockBlock;
import idv.hailelectronic.earthpulsation.block.RawAluminumBlockBlock;
import idv.hailelectronic.earthpulsation.block.PurpleResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.PurpleResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.PolishedLarvikiteStairBlock;
import idv.hailelectronic.earthpulsation.block.PolishedLarvikiteSlabBlock;
import idv.hailelectronic.earthpulsation.block.PolishedLarvikiteBlock;
import idv.hailelectronic.earthpulsation.block.PinkResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.PinkResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.OrangeResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.OrangeResinGlassBlock;
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
import idv.hailelectronic.earthpulsation.block.LarvikiteStairBlock;
import idv.hailelectronic.earthpulsation.block.LarvikiteSlabBlock;
import idv.hailelectronic.earthpulsation.block.LarvikiteBlock;
import idv.hailelectronic.earthpulsation.block.JadeBricksBlock;
import idv.hailelectronic.earthpulsation.block.IcelandSparBlock;
import idv.hailelectronic.earthpulsation.block.GreenResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.GreenResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.GrayResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.GrayResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.FrozenBushBlock;
import idv.hailelectronic.earthpulsation.block.DeepslateTinOreBlock;
import idv.hailelectronic.earthpulsation.block.DeepslateSilverOreBlock;
import idv.hailelectronic.earthpulsation.block.DeepslateLeadOreBlock;
import idv.hailelectronic.earthpulsation.block.DeepslateAluminumOreBlock;
import idv.hailelectronic.earthpulsation.block.DeepWellPortalBlock;
import idv.hailelectronic.earthpulsation.block.CyanResinGlassPaneBlock;
import idv.hailelectronic.earthpulsation.block.CyanResinGlassBlock;
import idv.hailelectronic.earthpulsation.block.ContainerWallBlock;
import idv.hailelectronic.earthpulsation.block.ContainerDoorBlock;
import idv.hailelectronic.earthpulsation.block.ContainerColumnBlock;
import idv.hailelectronic.earthpulsation.block.CobaltOreBlock;
import idv.hailelectronic.earthpulsation.block.CobaltBlockBlock;
import idv.hailelectronic.earthpulsation.block.CoalGeneratorBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledWhiteLightLabBlockStairBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledWhiteLightLabBlockSlabBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledWhiteLightLabBlockBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockBStairBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockBSlabBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockBBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockAStairBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockASlabBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledMixedLightLabBlockABlock;
import idv.hailelectronic.earthpulsation.block.ChiseledBlueLightLabBlockStairBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledBlueLightLabBlockSlabBlock;
import idv.hailelectronic.earthpulsation.block.ChiseledBlueLightLabBlockBlock;
import idv.hailelectronic.earthpulsation.block.CastStoneBrickBlock;
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
import idv.hailelectronic.earthpulsation.block.BatteryBlockBlock;
import idv.hailelectronic.earthpulsation.block.AlchemicalSilverBlockBlock;
import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class EarthPulsationModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EarthPulsationMod.MODID);
	public static final RegistryObject<Block> OBELISK = REGISTRY.register("obelisk", () -> new ObeliskBlock());
	public static final RegistryObject<Block> RESEARCH_STATION = REGISTRY.register("research_station", () -> new ResearchStationBlock());
	public static final RegistryObject<Block> FORGING_TABLE_L_1 = REGISTRY.register("forging_table_l_1", () -> new ForgingTableL1Block());
	public static final RegistryObject<Block> REFINER_LIT = REGISTRY.register("refiner_lit", () -> new RefinerLitBlock());
	public static final RegistryObject<Block> GRINDER = REGISTRY.register("grinder", () -> new GrinderBlock());
	public static final RegistryObject<Block> PULVERIZER = REGISTRY.register("pulverizer", () -> new PulverizerBlock());
	public static final RegistryObject<Block> REINFORCED_SIEVE = REGISTRY.register("reinforced_sieve", () -> new ReinforcedSieveBlock());
	public static final RegistryObject<Block> BASIN = REGISTRY.register("basin", () -> new BasinBlock());
	public static final RegistryObject<Block> ALUMINUM_ORE = REGISTRY.register("aluminum_ore", () -> new AluminumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_ALUMINUM_ORE = REGISTRY.register("deepslate_aluminum_ore",
			() -> new DeepslateAluminumOreBlock());
	public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = REGISTRY.register("raw_aluminum_block", () -> new RawAluminumBlockBlock());
	public static final RegistryObject<Block> ALUMINUM_BLOCK = REGISTRY.register("aluminum_block", () -> new AluminumBlockBlock());
	public static final RegistryObject<Block> FORGOTTEN_IRON_ORE = REGISTRY.register("forgotten_iron_ore", () -> new ForgottenIronOreBlock());
	public static final RegistryObject<Block> CHISELED_IRON_BLOCK = REGISTRY.register("chiseled_iron_block", () -> new ChiseledIronBlockBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> LEAD_ORE = REGISTRY.register("lead_ore", () -> new LeadOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = REGISTRY.register("deepslate_lead_ore", () -> new DeepslateLeadOreBlock());
	public static final RegistryObject<Block> RAW_LEAD_BLOCK = REGISTRY.register("raw_lead_block", () -> new RawLeadBlockBlock());
	public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new LeadBlockBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = REGISTRY.register("deepslate_tin_ore", () -> new DeepslateTinOreBlock());
	public static final RegistryObject<Block> RAW_TIN_BLOCK = REGISTRY.register("raw_tin_block", () -> new RawTinBlockBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = REGISTRY.register("deepslate_silver_ore", () -> new DeepslateSilverOreBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> COBALT_ORE = REGISTRY.register("cobalt_ore", () -> new CobaltOreBlock());
	public static final RegistryObject<Block> COBALT_BLOCK = REGISTRY.register("cobalt_block", () -> new CobaltBlockBlock());
	public static final RegistryObject<Block> NICKEL_ORE = REGISTRY.register("nickel_ore", () -> new NickelOreBlock());
	public static final RegistryObject<Block> NICKEL_BLOCK = REGISTRY.register("nickel_block", () -> new NickelBlockBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = REGISTRY.register("sapphire_block", () -> new SapphireBlockBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> TOPAZ_BLOCK = REGISTRY.register("topaz_block", () -> new TopazBlockBlock());
	public static final RegistryObject<Block> TOPAZ_ORE = REGISTRY.register("topaz_ore", () -> new TopazOreBlock());
	public static final RegistryObject<Block> STICK_PLANKS = REGISTRY.register("stick_planks", () -> new StickPlanksBlock());
	public static final RegistryObject<Block> WOODEN_PLANKS = REGISTRY.register("wooden_planks", () -> new WoodenPlanksBlock());
	public static final RegistryObject<Block> WOODEN_BLOCK = REGISTRY.register("wooden_block", () -> new WoodenBlockBlock());
	public static final RegistryObject<Block> PLASTIC_WOOD_PLANKS = REGISTRY.register("plastic_wood_planks", () -> new PlasticWoodPlanksBlock());
	public static final RegistryObject<Block> JADE_BRICKS = REGISTRY.register("jade_bricks", () -> new JadeBricksBlock());
	public static final RegistryObject<Block> CAST_STONE_BRICK = REGISTRY.register("cast_stone_brick", () -> new CastStoneBrickBlock());
	public static final RegistryObject<Block> BLACK_GOLD_ORE = REGISTRY.register("black_gold_ore", () -> new BlackGoldOreBlock());
	public static final RegistryObject<Block> RAW_BLACK_GOLD_BLOCK = REGISTRY.register("raw_black_gold_block", () -> new RawBlackGoldBlockBlock());
	public static final RegistryObject<Block> BLACK_GOLD_BLOCK = REGISTRY.register("black_gold_block", () -> new BlackGoldBlockBlock());
	public static final RegistryObject<Block> CAST_IRON_BLOCK = REGISTRY.register("cast_iron_block", () -> new CastIronBlockBlock());
	public static final RegistryObject<Block> TOUGH_COPPER_BLOCK = REGISTRY.register("tough_copper_block", () -> new ToughCopperBlockBlock());
	public static final RegistryObject<Block> HARD_ALUMINUM_BLOCK = REGISTRY.register("hard_aluminum_block", () -> new HardAluminumBlockBlock());
	public static final RegistryObject<Block> PATTERN_GOLD_BLOCK = REGISTRY.register("pattern_gold_block", () -> new PatternGoldBlockBlock());
	public static final RegistryObject<Block> ALCHEMICAL_SILVER_BLOCK = REGISTRY.register("alchemical_silver_block",
			() -> new AlchemicalSilverBlockBlock());
	public static final RegistryObject<Block> TURBID_OBSIDIAN_BLOCK = REGISTRY.register("turbid_obsidian_block",
			() -> new TurbidObsidianBlockBlock());
	public static final RegistryObject<Block> PURE_OBSIDIAN_BLOCK = REGISTRY.register("pure_obsidian_block", () -> new PureObsidianBlockBlock());
	public static final RegistryObject<Block> YELLOW_STONE = REGISTRY.register("yellow_stone", () -> new YellowStoneBlock());
	public static final RegistryObject<Block> YELLOW_COBBLESTONE = REGISTRY.register("yellow_cobblestone", () -> new YellowCobblestoneBlock());
	public static final RegistryObject<Block> YELLOW_COBBLESTONE_STAIR = REGISTRY.register("yellow_cobblestone_stair",
			() -> new YellowCobblestoneStairBlock());
	public static final RegistryObject<Block> YELLOW_COBBLESTONE_SLAB = REGISTRY.register("yellow_cobblestone_slab",
			() -> new YellowCobblestoneSlabBlock());
	public static final RegistryObject<Block> YELLOW_STONE_BRICKS = REGISTRY.register("yellow_stone_bricks", () -> new YellowStoneBricksBlock());
	public static final RegistryObject<Block> CHISELED_YELLOW_STONE_BRICKS = REGISTRY.register("chiseled_yellow_stone_bricks",
			() -> new ChiseledYellowStoneBricksBlock());
	public static final RegistryObject<Block> CHISELED_YELLOW_STONE_BRICKS_STAIR = REGISTRY.register("chiseled_yellow_stone_bricks_stair",
			() -> new ChiseledYellowStoneBricksStairBlock());
	public static final RegistryObject<Block> CHISELED_YELLOW_STONE_BRICKS_SLAB = REGISTRY.register("chiseled_yellow_stone_bricks_slab",
			() -> new ChiseledYellowStoneBricksSlabBlock());
	public static final RegistryObject<Block> YELLOW_STONE_BRICKS_WALL = REGISTRY.register("yellow_stone_bricks_wall",
			() -> new YellowStoneBricksWallBlock());
	public static final RegistryObject<Block> ICESAND = REGISTRY.register("icesand", () -> new IcesandBlock());
	public static final RegistryObject<Block> ICESANDSTONE = REGISTRY.register("icesandstone", () -> new IcesandstoneBlock());
	public static final RegistryObject<Block> SMOOTH_ICESANDSTONE = REGISTRY.register("smooth_icesandstone", () -> new SmoothIcesandstoneBlock());
	public static final RegistryObject<Block> CHISELED_ICE_STONE = REGISTRY.register("chiseled_ice_stone", () -> new ChiseledIceStoneBlock());
	public static final RegistryObject<Block> ICE_BIRCH_SAPLING = REGISTRY.register("ice_birch_sapling", () -> new ColdBirchBlock());
	public static final RegistryObject<Block> ICE_BIRCH_LEAVES = REGISTRY.register("ice_birch_leaves", () -> new IceBirchLeavesBlock());
	public static final RegistryObject<Block> ICE_BIRCH_LOG = REGISTRY.register("ice_birch_log", () -> new IceBirchLogBlock());
	public static final RegistryObject<Block> ICE_BIRCH_WOOD = REGISTRY.register("ice_birch_wood", () -> new IceBirchWoodBlock());
	public static final RegistryObject<Block> STRIPPED_ICE_BIRCH_LOG = REGISTRY.register("stripped_ice_birch_log",
			() -> new StrippedIceBirchLogBlock());
	public static final RegistryObject<Block> STRIPPED_ICE_BIRCH_WOOD = REGISTRY.register("stripped_ice_birch_wood",
			() -> new StrippedIceBirchWoodBlock());
	public static final RegistryObject<Block> ICE_BIRCH_PLANKS = REGISTRY.register("ice_birch_planks", () -> new IceBirchPlanksBlock());
	public static final RegistryObject<Block> ICE_BIRCH_STAIRS = REGISTRY.register("ice_birch_stairs", () -> new IceBirchStairsBlock());
	public static final RegistryObject<Block> ICE_BIRCH_SLAB = REGISTRY.register("ice_birch_slab", () -> new IceBirchSlabBlock());
	public static final RegistryObject<Block> ICE_BIRCH_FENCE = REGISTRY.register("ice_birch_fence", () -> new IceBirchFenceBlock());
	public static final RegistryObject<Block> ICE_BIRCH_FENCE_GATE = REGISTRY.register("ice_birch_fence_gate", () -> new IceBirchFenceGateBlock());
	public static final RegistryObject<Block> ICE_BIRCH_PRESSURE_PLATE = REGISTRY.register("ice_birch_pressure_plate",
			() -> new IceBirchPressurePlateBlock());
	public static final RegistryObject<Block> ICE_BIRCH_BUTTON = REGISTRY.register("ice_birch_button", () -> new IceBirchButtonBlock());
	public static final RegistryObject<Block> FROZEN_BUSH = REGISTRY.register("frozen_bush", () -> new FrozenBushBlock());
	public static final RegistryObject<Block> BLAZING_DIRT = REGISTRY.register("blazing_dirt", () -> new BlazingDirtBlock());
	public static final RegistryObject<Block> MAPLE_LEAVES = REGISTRY.register("maple_leaves", () -> new MapleLeavesBlock());
	public static final RegistryObject<Block> MAPLE_LOG = REGISTRY.register("maple_log", () -> new MapleLogBlock());
	public static final RegistryObject<Block> MAPLE_WOOD = REGISTRY.register("maple_wood", () -> new MapleWoodBlock());
	public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = REGISTRY.register("stripped_maple_log", () -> new StrippedMapleLogBlock());
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = REGISTRY.register("stripped_maple_wood", () -> new StrippedMapleWoodBlock());
	public static final RegistryObject<Block> MAPLE_PLANKS = REGISTRY.register("maple_planks", () -> new MaplePlanksBlock());
	public static final RegistryObject<Block> MAPLE_STAIRS = REGISTRY.register("maple_stairs", () -> new MapleStairsBlock());
	public static final RegistryObject<Block> MAPLE_SLAB = REGISTRY.register("maple_slab", () -> new MapleSlabBlock());
	public static final RegistryObject<Block> MAPLE_FENCE = REGISTRY.register("maple_fence", () -> new MapleFenceBlock());
	public static final RegistryObject<Block> MAPLE_FENCE_GATE = REGISTRY.register("maple_fence_gate", () -> new MapleFenceGateBlock());
	public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = REGISTRY.register("maple_pressure_plate", () -> new MaplePressurePlateBlock());
	public static final RegistryObject<Block> MAPLE_BUTTON = REGISTRY.register("maple_button", () -> new MapleButtonBlock());
	public static final RegistryObject<Block> LARVIKITE = REGISTRY.register("larvikite", () -> new LarvikiteBlock());
	public static final RegistryObject<Block> LARVIKITE_STAIR = REGISTRY.register("larvikite_stair", () -> new LarvikiteStairBlock());
	public static final RegistryObject<Block> LARVIKITE_SLAB = REGISTRY.register("larvikite_slab", () -> new LarvikiteSlabBlock());
	public static final RegistryObject<Block> POLISHED_LARVIKITE = REGISTRY.register("polished_larvikite", () -> new PolishedLarvikiteBlock());
	public static final RegistryObject<Block> POLISHED_LARVIKITE_STAIR = REGISTRY.register("polished_larvikite_stair",
			() -> new PolishedLarvikiteStairBlock());
	public static final RegistryObject<Block> POLISHED_LARVIKITE_SLAB = REGISTRY.register("polished_larvikite_slab",
			() -> new PolishedLarvikiteSlabBlock());
	public static final RegistryObject<Block> LUMEN_CRYSTAL_STEM = REGISTRY.register("lumen_crystal_stem", () -> new LumenCrystalStemBlock());
	public static final RegistryObject<Block> SMOOTH_PRISMARINE_BRICK = REGISTRY.register("smooth_prismarine_brick",
			() -> new SmoothPrismarineBrickBlock());
	public static final RegistryObject<Block> ICELAND_SPAR = REGISTRY.register("iceland_spar", () -> new IcelandSparBlock());
	public static final RegistryObject<Block> RESIN_BLOCK = REGISTRY.register("resin_block", () -> new ResinBlockBlock());
	public static final RegistryObject<Block> COAL_GENERATOR = REGISTRY.register("coal_generator", () -> new CoalGeneratorBlock());
	public static final RegistryObject<Block> BATTERY_BLOCK = REGISTRY.register("battery_block", () -> new BatteryBlockBlock());
	public static final RegistryObject<Block> BIG_APPLE_BLOCK = REGISTRY.register("big_apple_block", () -> new BigAppleBlockBlock());
	public static final RegistryObject<Block> WARPED_WART_SLURRIES = REGISTRY.register("warped_wart_slurries", () -> new WarpedWartSlurriesBlock());
	public static final RegistryObject<Block> COPPER_DOOR = REGISTRY.register("copper_door", () -> new CopperDoorBlock());
	public static final RegistryObject<Block> ALUMINUM_DOOR = REGISTRY.register("aluminum_door", () -> new AluminumDoorBlock());
	public static final RegistryObject<Block> CONTAINER_COLUMN = REGISTRY.register("container_column", () -> new ContainerColumnBlock());
	public static final RegistryObject<Block> CONTAINER_WALL = REGISTRY.register("container_wall", () -> new ContainerWallBlock());
	public static final RegistryObject<Block> CONTAINER_DOOR = REGISTRY.register("container_door", () -> new ContainerDoorBlock());
	public static final RegistryObject<Block> BLUE_CONTAINER_COLUMN = REGISTRY.register("blue_container_column",
			() -> new BlueContainerColumnBlock());
	public static final RegistryObject<Block> BLUE_CONTAINER_WALL = REGISTRY.register("blue_container_wall", () -> new BlueContainerWallBlock());
	public static final RegistryObject<Block> BLUE_CONTAINER_DOOR = REGISTRY.register("blue_container_door", () -> new BlueContainerDoorBlock());
	public static final RegistryObject<Block> RED_CONTAINER_COLUMN = REGISTRY.register("red_container_column", () -> new RedContainerColumnBlock());
	public static final RegistryObject<Block> RED_CONTAINER_WALL = REGISTRY.register("red_container_wall", () -> new RedContainerWallBlock());
	public static final RegistryObject<Block> RED_CONTAINER_DOOR = REGISTRY.register("red_container_door", () -> new RedContainerDoorBlock());
	public static final RegistryObject<Block> WOOD_PLANKS_DOOR = REGISTRY.register("wood_planks_door", () -> new WoodPlanksDoorBlock());
	public static final RegistryObject<Block> WOODEN_TABLE = REGISTRY.register("wooden_table", () -> new WoodenTableBlock());
	public static final RegistryObject<Block> LONG_WOODEN_TABLE = REGISTRY.register("long_wooden_table", () -> new LongWoodenTableBlock());
	public static final RegistryObject<Block> WOODEN_HOLDER = REGISTRY.register("wooden_holder", () -> new WoodenHolderBlock());
	public static final RegistryObject<Block> WOODEN_CHAIR = REGISTRY.register("wooden_chair", () -> new WoodenChairBlock());
	public static final RegistryObject<Block> WHITE_LIGHT_LAB_BLOCK = REGISTRY.register("white_light_lab_block", () -> new WhiteLightLabBlockBlock());
	public static final RegistryObject<Block> BLUE_LIGHT_LAB_BLOCK = REGISTRY.register("blue_light_lab_block", () -> new BlueLightLabBlockBlock());
	public static final RegistryObject<Block> CHISELED_WHITE_LIGHT_LAB_BLOCK = REGISTRY.register("chiseled_white_light_lab_block",
			() -> new ChiseledWhiteLightLabBlockBlock());
	public static final RegistryObject<Block> CHISELED_WHITE_LIGHT_LAB_BLOCK_STAIR = REGISTRY.register("chiseled_white_light_lab_block_stair",
			() -> new ChiseledWhiteLightLabBlockStairBlock());
	public static final RegistryObject<Block> CHISELED_WHITE_LIGHT_LAB_BLOCK_SLAB = REGISTRY.register("chiseled_white_light_lab_block_slab",
			() -> new ChiseledWhiteLightLabBlockSlabBlock());
	public static final RegistryObject<Block> CHISELED_BLUE_LIGHT_LAB_BLOCK = REGISTRY.register("chiseled_blue_light_lab_block",
			() -> new ChiseledBlueLightLabBlockBlock());
	public static final RegistryObject<Block> CHISELED_BLUE_LIGHT_LAB_BLOCK_STAIR = REGISTRY.register("chiseled_blue_light_lab_block_stair",
			() -> new ChiseledBlueLightLabBlockStairBlock());
	public static final RegistryObject<Block> CHISELED_BLUE_LIGHT_LAB_BLOCK_SLAB = REGISTRY.register("chiseled_blue_light_lab_block_slab",
			() -> new ChiseledBlueLightLabBlockSlabBlock());
	public static final RegistryObject<Block> CHISELED_MIXED_LIGHT_LAB_BLOCK_A = REGISTRY.register("chiseled_mixed_light_lab_block_a",
			() -> new ChiseledMixedLightLabBlockABlock());
	public static final RegistryObject<Block> CHISELED_MIXED_LIGHT_LAB_BLOCK_A_STAIR = REGISTRY.register("chiseled_mixed_light_lab_block_a_stair",
			() -> new ChiseledMixedLightLabBlockAStairBlock());
	public static final RegistryObject<Block> CHISELED_MIXED_LIGHT_LAB_BLOCK_A_SLAB = REGISTRY.register("chiseled_mixed_light_lab_block_a_slab",
			() -> new ChiseledMixedLightLabBlockASlabBlock());
	public static final RegistryObject<Block> CHISELED_MIXED_LIGHT_LAB_BLOCK_B = REGISTRY.register("chiseled_mixed_light_lab_block_b",
			() -> new ChiseledMixedLightLabBlockBBlock());
	public static final RegistryObject<Block> CHISELED_MIXED_LIGHT_LAB_BLOCK_B_STAIR = REGISTRY.register("chiseled_mixed_light_lab_block_b_stair",
			() -> new ChiseledMixedLightLabBlockBStairBlock());
	public static final RegistryObject<Block> CHISELED_MIXED_LIGHT_LAB_BLOCK_B_SLAB = REGISTRY.register("chiseled_mixed_light_lab_block_b_slab",
			() -> new ChiseledMixedLightLabBlockBSlabBlock());
	public static final RegistryObject<Block> RESIN_GLASS = REGISTRY.register("resin_glass", () -> new ResinGlassBlock());
	public static final RegistryObject<Block> WHITE_RESIN_GLASS = REGISTRY.register("white_resin_glass", () -> new WhiteResinGlassBlock());
	public static final RegistryObject<Block> ORANGE_RESIN_GLASS = REGISTRY.register("orange_resin_glass", () -> new OrangeResinGlassBlock());
	public static final RegistryObject<Block> MAGENTA_RESIN_GLASS = REGISTRY.register("magenta_resin_glass", () -> new MagentaResinGlassBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_RESIN_GLASS = REGISTRY.register("light_blue_resin_glass",
			() -> new LightBlueResinGlassBlock());
	public static final RegistryObject<Block> YELLOW_RESIN_GLASS = REGISTRY.register("yellow_resin_glass", () -> new YellowResinGlassBlock());
	public static final RegistryObject<Block> LIME_RESIN_GLASS = REGISTRY.register("lime_resin_glass", () -> new LimeResinGlassBlock());
	public static final RegistryObject<Block> PINK_RESIN_GLASS = REGISTRY.register("pink_resin_glass", () -> new PinkResinGlassBlock());
	public static final RegistryObject<Block> GRAY_RESIN_GLASS = REGISTRY.register("gray_resin_glass", () -> new GrayResinGlassBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_RESIN_GLASS = REGISTRY.register("light_gray_resin_glass",
			() -> new LightGrayResinGlassBlock());
	public static final RegistryObject<Block> CYAN_RESIN_GLASS = REGISTRY.register("cyan_resin_glass", () -> new CyanResinGlassBlock());
	public static final RegistryObject<Block> PURPLE_RESIN_GLASS = REGISTRY.register("purple_resin_glass", () -> new PurpleResinGlassBlock());
	public static final RegistryObject<Block> BLUE_RESIN_GLASS = REGISTRY.register("blue_resin_glass", () -> new BlueResinGlassBlock());
	public static final RegistryObject<Block> BROWN_RESIN_GLASS = REGISTRY.register("brown_resin_glass", () -> new BrownResinGlassBlock());
	public static final RegistryObject<Block> GREEN_RESIN_GLASS = REGISTRY.register("green_resin_glass", () -> new GreenResinGlassBlock());
	public static final RegistryObject<Block> RED_RESIN_GLASS = REGISTRY.register("red_resin_glass", () -> new RedResinGlassBlock());
	public static final RegistryObject<Block> BLACK_RESIN_GLASS = REGISTRY.register("black_resin_glass", () -> new BlackResinGlassBlock());
	public static final RegistryObject<Block> RESIN_GLASS_PANE = REGISTRY.register("resin_glass_pane", () -> new ResinGlassPaneBlock());
	public static final RegistryObject<Block> WHITE_RESIN_GLASS_PANE = REGISTRY.register("white_resin_glass_pane",
			() -> new WhiteResinGlassPaneBlock());
	public static final RegistryObject<Block> ORANGE_RESIN_GLASS_PANE = REGISTRY.register("orange_resin_glass_pane",
			() -> new OrangeResinGlassPaneBlock());
	public static final RegistryObject<Block> MAGENTA_RESIN_GLASS_PANE = REGISTRY.register("magenta_resin_glass_pane",
			() -> new MagentaResinGlassPaneBlock());
	public static final RegistryObject<Block> LIGHT_BLUE_RESIN_GLASS_PANE = REGISTRY.register("light_blue_resin_glass_pane",
			() -> new LightBlueResinGlassPaneBlock());
	public static final RegistryObject<Block> YELLOW_RESIN_GLASS_PANE = REGISTRY.register("yellow_resin_glass_pane",
			() -> new YellowResinGlassPaneBlock());
	public static final RegistryObject<Block> LIME_RESIN_GLASS_PANE = REGISTRY.register("lime_resin_glass_pane", () -> new LimeResinGlassPaneBlock());
	public static final RegistryObject<Block> PINK_RESIN_GLASS_PANE = REGISTRY.register("pink_resin_glass_pane", () -> new PinkResinGlassPaneBlock());
	public static final RegistryObject<Block> GRAY_RESIN_GLASS_PANE = REGISTRY.register("gray_resin_glass_pane", () -> new GrayResinGlassPaneBlock());
	public static final RegistryObject<Block> LIGHT_GRAY_RESIN_GLASS_PANE = REGISTRY.register("light_gray_resin_glass_pane",
			() -> new LightGrayResinGlassPaneBlock());
	public static final RegistryObject<Block> CYAN_RESIN_GLASS_PANE = REGISTRY.register("cyan_resin_glass_pane", () -> new CyanResinGlassPaneBlock());
	public static final RegistryObject<Block> PURPLE_RESIN_GLASS_PANE = REGISTRY.register("purple_resin_glass_pane",
			() -> new PurpleResinGlassPaneBlock());
	public static final RegistryObject<Block> BLUE_RESIN_GLASS_PANE = REGISTRY.register("blue_resin_glass_pane", () -> new BlueResinGlassPaneBlock());
	public static final RegistryObject<Block> BROWN_RESIN_GLASS_PANE = REGISTRY.register("brown_resin_glass_pane",
			() -> new BrownResinGlassPaneBlock());
	public static final RegistryObject<Block> GREEN_RESIN_GLASS_PANE = REGISTRY.register("green_resin_glass_pane",
			() -> new GreenResinGlassPaneBlock());
	public static final RegistryObject<Block> RED_RESIN_GLASS_PANE = REGISTRY.register("red_resin_glass_pane", () -> new RedResinGlassPaneBlock());
	public static final RegistryObject<Block> BLACK_RESIN_GLASS_PANE = REGISTRY.register("black_resin_glass_pane",
			() -> new BlackResinGlassPaneBlock());
	public static final RegistryObject<Block> OLD_AGE_PORTAL = REGISTRY.register("old_age_portal", () -> new OldAgePortalBlock());
	public static final RegistryObject<Block> DEEP_WELL_PORTAL = REGISTRY.register("deep_well_portal", () -> new DeepWellPortalBlock());
	public static final RegistryObject<Block> PLACE_ON_WATER_PLATE = REGISTRY.register("place_on_water_plate", () -> new PlaceOnWaterPlateBlock());

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
			IcelandSparBlock.registerRenderLayer();
			ResinBlockBlock.registerRenderLayer();
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
			WoodenChairBlock.registerRenderLayer();
			ResinGlassBlock.registerRenderLayer();
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
			ResinGlassPaneBlock.registerRenderLayer();
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
