
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import idv.hailelectronic.earthpulsation.item.YellowStoneIngotItem;
import idv.hailelectronic.earthpulsation.item.WoodenTroughItem;
import idv.hailelectronic.earthpulsation.item.WoodenTroughFilledWithDoughItem;
import idv.hailelectronic.earthpulsation.item.WoodenTroughFilledWithChocolateItem;
import idv.hailelectronic.earthpulsation.item.WarpedWartSlurriesBottleItem;
import idv.hailelectronic.earthpulsation.item.ToughCopperIngotItem;
import idv.hailelectronic.earthpulsation.item.SuperBatteryItem;
import idv.hailelectronic.earthpulsation.item.ShabbyCircuitBoardItem;
import idv.hailelectronic.earthpulsation.item.ScreenPartItem;
import idv.hailelectronic.earthpulsation.item.SamjungNote7Item;
import idv.hailelectronic.earthpulsation.item.ResinItem;
import idv.hailelectronic.earthpulsation.item.RefinedBreadItem;
import idv.hailelectronic.earthpulsation.item.RawTinItem;
import idv.hailelectronic.earthpulsation.item.RawLeadItem;
import idv.hailelectronic.earthpulsation.item.RawBlackGoldItem;
import idv.hailelectronic.earthpulsation.item.RawAluminumItem;
import idv.hailelectronic.earthpulsation.item.NormalGunItem;
import idv.hailelectronic.earthpulsation.item.NormalBatteryItem;
import idv.hailelectronic.earthpulsation.item.NokikaItem;
import idv.hailelectronic.earthpulsation.item.NickelIngotItem;
import idv.hailelectronic.earthpulsation.item.MagnetizedIronIngotItem;
import idv.hailelectronic.earthpulsation.item.MagnetIngotItem;
import idv.hailelectronic.earthpulsation.item.HighLevelBatteryItem;
import idv.hailelectronic.earthpulsation.item.DeepslateIngotItem;
import idv.hailelectronic.earthpulsation.item.DeepWellItem;
import idv.hailelectronic.earthpulsation.item.DarkCircuitBoardItem;
import idv.hailelectronic.earthpulsation.item.ConciseBatteryItem;
import idv.hailelectronic.earthpulsation.item.CobaltIngotItem;
import idv.hailelectronic.earthpulsation.item.ClassicBatteryItem;
import idv.hailelectronic.earthpulsation.item.ChocolateItem;
import idv.hailelectronic.earthpulsation.item.CastStoneIngotItem;
import idv.hailelectronic.earthpulsation.item.BlueShadowIngotItem;
import idv.hailelectronic.earthpulsation.item.BlankCircutiBoardItem;
import idv.hailelectronic.earthpulsation.item.BigApplePieceItem;
import idv.hailelectronic.earthpulsation.item.BasicBatteryItem;
import idv.hailelectronic.earthpulsation.item.BaseCircutiBoardItem;
import idv.hailelectronic.earthpulsation.item.BasaltFibreItem;
import idv.hailelectronic.earthpulsation.item.AlchemicalSilverIngotItem;
import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class EarthPulsationModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EarthPulsationMod.MODID);
	public static final RegistryObject<Item> PDA = REGISTRY.register("pda", () -> new PDAItem());
	public static final RegistryObject<Item> EP_BOOK = REGISTRY.register("ep_book", () -> new EPBookItem());
	public static final RegistryObject<Item> OBELISK = block(EarthPulsationModBlocks.OBELISK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RESEARCH_STATION = block(EarthPulsationModBlocks.RESEARCH_STATION,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> FORGING_TABLE_L_1 = block(EarthPulsationModBlocks.FORGING_TABLE_L_1,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> REFINER_LIT = block(EarthPulsationModBlocks.REFINER_LIT, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> GRINDER = block(EarthPulsationModBlocks.GRINDER, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> PULVERIZER = block(EarthPulsationModBlocks.PULVERIZER, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> REINFORCED_SIEVE = block(EarthPulsationModBlocks.REINFORCED_SIEVE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BASIN = block(EarthPulsationModBlocks.BASIN, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> COPPER_CUBE = REGISTRY.register("copper_cube", () -> new CopperCubeItem());
	public static final RegistryObject<Item> COPPER_PLATE = REGISTRY.register("copper_plate", () -> new CopperPlateItem());
	public static final RegistryObject<Item> COPPER_POWDER = REGISTRY.register("copper_powder", () -> new CopperPowderItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_PICKAXE_HEAD = REGISTRY.register("copper_pickaxe_head", () -> new CopperPickaxeHeadItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_AXE_HEAD = REGISTRY.register("copper_axe_head", () -> new CopperAxeHeadItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_SWORD_HEAD = REGISTRY.register("copper_sword_head", () -> new CopperSwordHeadItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_SHOVEL_HEAD = REGISTRY.register("copper_shovel_head", () -> new CopperShovelHeadItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_HOE_HEAD = REGISTRY.register("copper_hoe_head", () -> new CopperHoeHeadItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate",
			() -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_WRENCH = REGISTRY.register("copper_wrench", () -> new CopperWrenchItem());
	public static final RegistryObject<Item> ALUMINUM_INGOT = REGISTRY.register("aluminum_ingot", () -> new AluminumIngotItem());
	public static final RegistryObject<Item> ALUMINUM_CUBE = REGISTRY.register("aluminum_cube", () -> new AluminumCubeItem());
	public static final RegistryObject<Item> ALUMINUM_PLATE = REGISTRY.register("aluminum_plate", () -> new AluminumPlateItem());
	public static final RegistryObject<Item> ALUMINUM_POWDER = REGISTRY.register("aluminum_powder", () -> new AluminumPowderItem());
	public static final RegistryObject<Item> ALUMINUM_ORE = block(EarthPulsationModBlocks.ALUMINUM_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> DEEPSLATE_ALUMINUM_ORE = block(EarthPulsationModBlocks.DEEPSLATE_ALUMINUM_ORE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RAW_ALUMINUM = REGISTRY.register("raw_aluminum", () -> new RawAluminumItem());
	public static final RegistryObject<Item> RAW_ALUMINUM_BLOCK = block(EarthPulsationModBlocks.RAW_ALUMINUM_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ALUMINUM_BLOCK = block(EarthPulsationModBlocks.ALUMINUM_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ALUMINUM_PICKAXE = REGISTRY.register("aluminum_pickaxe", () -> new AluminumPickaxeItem());
	public static final RegistryObject<Item> ALUMINUM_AXE = REGISTRY.register("aluminum_axe", () -> new AluminumAxeItem());
	public static final RegistryObject<Item> ALUMINUM_SWORD = REGISTRY.register("aluminum_sword", () -> new AluminumSwordItem());
	public static final RegistryObject<Item> ALUMINUM_SHOVEL = REGISTRY.register("aluminum_shovel", () -> new AluminumShovelItem());
	public static final RegistryObject<Item> ALUMINUM_HOE = REGISTRY.register("aluminum_hoe", () -> new AluminumHoeItem());
	public static final RegistryObject<Item> ALUMINUM_ARMOR_HELMET = REGISTRY.register("aluminum_armor_helmet", () -> new AluminumArmorItem.Helmet());
	public static final RegistryObject<Item> ALUMINUM_ARMOR_CHESTPLATE = REGISTRY.register("aluminum_armor_chestplate",
			() -> new AluminumArmorItem.Chestplate());
	public static final RegistryObject<Item> ALUMINUM_ARMOR_LEGGINGS = REGISTRY.register("aluminum_armor_leggings",
			() -> new AluminumArmorItem.Leggings());
	public static final RegistryObject<Item> ALUMINUM_ARMOR_BOOTS = REGISTRY.register("aluminum_armor_boots", () -> new AluminumArmorItem.Boots());
	public static final RegistryObject<Item> RUGGEDIZED_ALUMINUM_PICKAXE = REGISTRY.register("ruggedized_aluminum_pickaxe",
			() -> new RuggedizedAluminumPickaxeItem());
	public static final RegistryObject<Item> RUGGEDIZED_ALUMINUM_AXE = REGISTRY.register("ruggedized_aluminum_axe",
			() -> new RuggedizedAluminumAxeItem());
	public static final RegistryObject<Item> RUGGEDIZED_ALUMINUM_SWORD = REGISTRY.register("ruggedized_aluminum_sword",
			() -> new RuggedizedAluminumSwordItem());
	public static final RegistryObject<Item> RUGGEDIZED_ALUMINUM_SHOVEL = REGISTRY.register("ruggedized_aluminum_shovel",
			() -> new RuggedizedAluminumShovelItem());
	public static final RegistryObject<Item> RUGGEDIZED_ALUMINUM_HOE = REGISTRY.register("ruggedized_aluminum_hoe",
			() -> new RuggedizedAluminumHoeItem());
	public static final RegistryObject<Item> IRON_CUBE = REGISTRY.register("iron_cube", () -> new IronCubeItem());
	public static final RegistryObject<Item> IRON_PLATE = REGISTRY.register("iron_plate", () -> new IronPlateItem());
	public static final RegistryObject<Item> IRON_STICK = REGISTRY.register("iron_stick", () -> new IronStickItem());
	public static final RegistryObject<Item> IRON_POWDER = REGISTRY.register("iron_powder", () -> new IronPowderItem());
	public static final RegistryObject<Item> FORGOTTEN_IRON_ORE = block(EarthPulsationModBlocks.FORGOTTEN_IRON_ORE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_IRON_BLOCK = block(EarthPulsationModBlocks.CHISELED_IRON_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ONLY_IRON_PICKAXE = REGISTRY.register("only_iron_pickaxe", () -> new OnlyIronPickaxeItem());
	public static final RegistryObject<Item> ONLY_IRON_AXE = REGISTRY.register("only_iron_axe", () -> new OnlyIronAxeItem());
	public static final RegistryObject<Item> ONLY_IRON_SWORD = REGISTRY.register("only_iron_sword", () -> new OnlyIronSwordItem());
	public static final RegistryObject<Item> ONLY_IRON_SHOVEL = REGISTRY.register("only_iron_shovel", () -> new OnlyIronShovelItem());
	public static final RegistryObject<Item> ONLY_IRON_HOE = REGISTRY.register("only_iron_hoe", () -> new OnlyIronHoeItem());
	public static final RegistryObject<Item> IRON_SAW = REGISTRY.register("iron_saw", () -> new IronSawItem());
	public static final RegistryObject<Item> CARBON_FIBRE = REGISTRY.register("carbon_fibre", () -> new CarbonFibreItem());
	public static final RegistryObject<Item> CARBON_CUBE = REGISTRY.register("carbon_cube", () -> new CarbonCubeItem());
	public static final RegistryObject<Item> CARBON_PLATE = REGISTRY.register("carbon_plate", () -> new CarbonPlateItem());
	public static final RegistryObject<Item> CARBON_STICK = REGISTRY.register("carbon_stick", () -> new CarbonStickItem());
	public static final RegistryObject<Item> CARBON_POWDER = REGISTRY.register("carbon_powder", () -> new CarbonPowderItem());
	public static final RegistryObject<Item> RAW_STEEL_INGOT = REGISTRY.register("raw_steel_ingot", () -> new RawSteelIngotItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_BLOCK = block(EarthPulsationModBlocks.STEEL_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> GOLD_CUBE = REGISTRY.register("gold_cube", () -> new GoldCubeItem());
	public static final RegistryObject<Item> GOLD_POWDER = REGISTRY.register("gold_powder", () -> new GoldPowderItem());
	public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final RegistryObject<Item> LEAD_CUBE = REGISTRY.register("lead_cube", () -> new LeadCubeItem());
	public static final RegistryObject<Item> LEAD_PLATE = REGISTRY.register("lead_plate", () -> new LeadPlateItem());
	public static final RegistryObject<Item> LEAD_POWDER = REGISTRY.register("lead_powder", () -> new LeadPowderItem());
	public static final RegistryObject<Item> LEAD_ORE = block(EarthPulsationModBlocks.LEAD_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> DEEPSLATE_LEAD_ORE = block(EarthPulsationModBlocks.DEEPSLATE_LEAD_ORE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RAW_LEAD = REGISTRY.register("raw_lead", () -> new RawLeadItem());
	public static final RegistryObject<Item> RAW_LEAD_BLOCK = block(EarthPulsationModBlocks.RAW_LEAD_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LEAD_BLOCK = block(EarthPulsationModBlocks.LEAD_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TIN_CUBE = REGISTRY.register("tin_cube", () -> new TinCubeItem());
	public static final RegistryObject<Item> TIN_PLATE = REGISTRY.register("tin_plate", () -> new TinPlateItem());
	public static final RegistryObject<Item> TIN_POWDER = REGISTRY.register("tin_powder", () -> new TinPowderItem());
	public static final RegistryObject<Item> TIN_ORE = block(EarthPulsationModBlocks.TIN_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> DEEPSLATE_TIN_ORE = block(EarthPulsationModBlocks.DEEPSLATE_TIN_ORE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> RAW_TIN_BLOCK = block(EarthPulsationModBlocks.RAW_TIN_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> TIN_BLOCK = block(EarthPulsationModBlocks.TIN_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_CUBE = REGISTRY.register("silver_cube", () -> new SilverCubeItem());
	public static final RegistryObject<Item> SILVER_PLATE = REGISTRY.register("silver_plate", () -> new SilverPlateItem());
	public static final RegistryObject<Item> SILVER_POWDER = REGISTRY.register("silver_powder", () -> new SilverPowderItem());
	public static final RegistryObject<Item> SILVER_ORE = block(EarthPulsationModBlocks.SILVER_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> DEEPSLATE_SILVER_ORE = block(EarthPulsationModBlocks.DEEPSLATE_SILVER_ORE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> SILVER_BLOCK = block(EarthPulsationModBlocks.SILVER_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> COBALT_INGOT = REGISTRY.register("cobalt_ingot", () -> new CobaltIngotItem());
	public static final RegistryObject<Item> COBALT_ORE = block(EarthPulsationModBlocks.COBALT_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> COBALT_BLOCK = block(EarthPulsationModBlocks.COBALT_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> NICKEL_INGOT = REGISTRY.register("nickel_ingot", () -> new NickelIngotItem());
	public static final RegistryObject<Item> NICKEL_ORE = block(EarthPulsationModBlocks.NICKEL_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> NICKEL_BLOCK = block(EarthPulsationModBlocks.NICKEL_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new ZincIngotItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_BLOCK = block(EarthPulsationModBlocks.RUBY_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RUBY_ORE = block(EarthPulsationModBlocks.RUBY_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> SAPPHIRE_BLOCK = block(EarthPulsationModBlocks.SAPPHIRE_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> SAPPHIRE_ORE = block(EarthPulsationModBlocks.SAPPHIRE_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final RegistryObject<Item> TOPAZ_BLOCK = block(EarthPulsationModBlocks.TOPAZ_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> TOPAZ_ORE = block(EarthPulsationModBlocks.TOPAZ_ORE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CINNABAR = REGISTRY.register("cinnabar", () -> new CinnabarItem());
	public static final RegistryObject<Item> RUST = REGISTRY.register("rust", () -> new RustItem());
	public static final RegistryObject<Item> RUST_IRON_INGOT = REGISTRY.register("rust_iron_ingot", () -> new RustIronIngotItem());
	public static final RegistryObject<Item> RUSTY_IRON_PICKAXE = REGISTRY.register("rusty_iron_pickaxe", () -> new RustyIronPickaxeItem());
	public static final RegistryObject<Item> RUSTY_IRON_AXE = REGISTRY.register("rusty_iron_axe", () -> new RustyIronAxeItem());
	public static final RegistryObject<Item> RUSTY_IRON_SWORD = REGISTRY.register("rusty_iron_sword", () -> new RustyIronSwordItem());
	public static final RegistryObject<Item> RUSTY_IRON_SHOVEL = REGISTRY.register("rusty_iron_shovel", () -> new RustyIronShovelItem());
	public static final RegistryObject<Item> SAW_DUST = REGISTRY.register("saw_dust", () -> new SawDustItem());
	public static final RegistryObject<Item> WOODEN_BOARD = REGISTRY.register("wooden_board", () -> new WoodenBoardItem());
	public static final RegistryObject<Item> STICK_PLANKS = block(EarthPulsationModBlocks.STICK_PLANKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WOODEN_PLANKS = block(EarthPulsationModBlocks.WOODEN_PLANKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WOODEN_BLOCK = block(EarthPulsationModBlocks.WOODEN_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> PLASTIC_WOOD_STICK = REGISTRY.register("plastic_wood_stick", () -> new PlasticWoodStickItem());
	public static final RegistryObject<Item> PLASTIC_WOOD_BOARD = REGISTRY.register("plastic_wood_board", () -> new PlasticWoodBoardItem());
	public static final RegistryObject<Item> PLASTIC_WOOD_PLANKS = block(EarthPulsationModBlocks.PLASTIC_WOOD_PLANKS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> STONE_INGOT = REGISTRY.register("stone_ingot", () -> new StoneIngotItem());
	public static final RegistryObject<Item> STONE_BRICK_PICKAXE = REGISTRY.register("stone_brick_pickaxe", () -> new StoneBrickPickaxeItem());
	public static final RegistryObject<Item> STONE_BRICK_AXE = REGISTRY.register("stone_brick_axe", () -> new StoneBrickAxeItem());
	public static final RegistryObject<Item> STONE_BRICK_SWORD = REGISTRY.register("stone_brick_sword", () -> new StoneBrickSwordItem());
	public static final RegistryObject<Item> STONE_BRICK_SHOVEL = REGISTRY.register("stone_brick_shovel", () -> new StoneBrickShovelItem());
	public static final RegistryObject<Item> STONE_BRICK_HOE = REGISTRY.register("stone_brick_hoe", () -> new StoneBrickHoeItem());
	public static final RegistryObject<Item> STONE_BRICK_ARMMOR_HELMET = REGISTRY.register("stone_brick_armmor_helmet",
			() -> new StoneBrickArmmorItem.Helmet());
	public static final RegistryObject<Item> STONE_BRICK_ARMMOR_CHESTPLATE = REGISTRY.register("stone_brick_armmor_chestplate",
			() -> new StoneBrickArmmorItem.Chestplate());
	public static final RegistryObject<Item> STONE_BRICK_ARMMOR_LEGGINGS = REGISTRY.register("stone_brick_armmor_leggings",
			() -> new StoneBrickArmmorItem.Leggings());
	public static final RegistryObject<Item> STONE_BRICK_ARMMOR_BOOTS = REGISTRY.register("stone_brick_armmor_boots",
			() -> new StoneBrickArmmorItem.Boots());
	public static final RegistryObject<Item> DEEPSLATE_INGOT = REGISTRY.register("deepslate_ingot", () -> new DeepslateIngotItem());
	public static final RegistryObject<Item> JADE_INGOT = REGISTRY.register("jade_ingot", () -> new JadeIngotItem());
	public static final RegistryObject<Item> JADE_BRICKS = block(EarthPulsationModBlocks.JADE_BRICKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BASALT_FIBRE = REGISTRY.register("basalt_fibre", () -> new BasaltFibreItem());
	public static final RegistryObject<Item> CAST_STONE_INGOT = REGISTRY.register("cast_stone_ingot", () -> new CastStoneIngotItem());
	public static final RegistryObject<Item> CAST_STONE_BRICK = block(EarthPulsationModBlocks.CAST_STONE_BRICK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLUE_SHADOW_INGOT = REGISTRY.register("blue_shadow_ingot", () -> new BlueShadowIngotItem());
	public static final RegistryObject<Item> BLACK_GOLD_INGOT = REGISTRY.register("black_gold_ingot", () -> new BlackGoldIngotItem());
	public static final RegistryObject<Item> BLACK_GOLD_ORE = block(EarthPulsationModBlocks.BLACK_GOLD_ORE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RAW_BLACK_GOLD = REGISTRY.register("raw_black_gold", () -> new RawBlackGoldItem());
	public static final RegistryObject<Item> RAW_BLACK_GOLD_BLOCK = block(EarthPulsationModBlocks.RAW_BLACK_GOLD_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLACK_GOLD_BLOCK = block(EarthPulsationModBlocks.BLACK_GOLD_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CAST_IRON_INGOT = REGISTRY.register("cast_iron_ingot", () -> new CastIronIngotItem());
	public static final RegistryObject<Item> CAST_IRON_BLOCK = block(EarthPulsationModBlocks.CAST_IRON_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> TOUGH_COPPER_INGOT = REGISTRY.register("tough_copper_ingot", () -> new ToughCopperIngotItem());
	public static final RegistryObject<Item> TOUGH_COPPER_BLOCK = block(EarthPulsationModBlocks.TOUGH_COPPER_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> HARD_ALUMINUM_INGOT = REGISTRY.register("hard_aluminum_ingot", () -> new HardAluminumIngotItem());
	public static final RegistryObject<Item> HARD_ALUMINUM_BLOCK = block(EarthPulsationModBlocks.HARD_ALUMINUM_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> PATTERN_GOLD_INGOT = REGISTRY.register("pattern_gold_ingot", () -> new PatternGoldIngotItem());
	public static final RegistryObject<Item> PATTERN_GOLD_BLOCK = block(EarthPulsationModBlocks.PATTERN_GOLD_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ALCHEMICAL_SILVER_INGOT = REGISTRY.register("alchemical_silver_ingot",
			() -> new AlchemicalSilverIngotItem());
	public static final RegistryObject<Item> ALCHEMICAL_SILVER_BLOCK = block(EarthPulsationModBlocks.ALCHEMICAL_SILVER_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> TURBID_OBSIDIAN_NUGGET = REGISTRY.register("turbid_obsidian_nugget",
			() -> new TurbidObsidianNuggetItem());
	public static final RegistryObject<Item> PURE_OBSIDIAN_NUGGET = REGISTRY.register("pure_obsidian_nugget", () -> new PureObsidianNuggetItem());
	public static final RegistryObject<Item> TURBID_OBSIDIAN_INGOT = REGISTRY.register("turbid_obsidian_ingot", () -> new TurbidObsidianIngotItem());
	public static final RegistryObject<Item> PURE_OBSIDIAN_INGOT = REGISTRY.register("pure_obsidian_ingot", () -> new PureObsidianIngotItem());
	public static final RegistryObject<Item> TURBID_OBSIDIAN_BLOCK = block(EarthPulsationModBlocks.TURBID_OBSIDIAN_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> PURE_OBSIDIAN_BLOCK = block(EarthPulsationModBlocks.PURE_OBSIDIAN_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = REGISTRY.register("obsidian_pickaxe", () -> new ObsidianPickaxeItem());
	public static final RegistryObject<Item> OBSIDIAN_AXE = REGISTRY.register("obsidian_axe", () -> new ObsidianAxeItem());
	public static final RegistryObject<Item> OBSIDIAN_SWORD = REGISTRY.register("obsidian_sword", () -> new ObsidianSwordItem());
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL = REGISTRY.register("obsidian_shovel", () -> new ObsidianShovelItem());
	public static final RegistryObject<Item> OBSIDIAN_HOE = REGISTRY.register("obsidian_hoe", () -> new ObsidianHoeItem());
	public static final RegistryObject<Item> MAGNETIZED_IRON_INGOT = REGISTRY.register("magnetized_iron_ingot", () -> new MagnetizedIronIngotItem());
	public static final RegistryObject<Item> MAGNET_INGOT = REGISTRY.register("magnet_ingot", () -> new MagnetIngotItem());
	public static final RegistryObject<Item> YELLOW_STONE = block(EarthPulsationModBlocks.YELLOW_STONE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> YELLOW_COBBLESTONE = block(EarthPulsationModBlocks.YELLOW_COBBLESTONE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> YELLOW_COBBLESTONE_STAIR = block(EarthPulsationModBlocks.YELLOW_COBBLESTONE_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> YELLOW_COBBLESTONE_SLAB = block(EarthPulsationModBlocks.YELLOW_COBBLESTONE_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> YELLOW_STONE_BRICKS = block(EarthPulsationModBlocks.YELLOW_STONE_BRICKS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_YELLOW_STONE_BRICKS = block(EarthPulsationModBlocks.CHISELED_YELLOW_STONE_BRICKS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> YELLOW_STONE_INGOT = REGISTRY.register("yellow_stone_ingot", () -> new YellowStoneIngotItem());
	public static final RegistryObject<Item> CHISELED_YELLOW_STONE_BRICKS_STAIR = block(EarthPulsationModBlocks.CHISELED_YELLOW_STONE_BRICKS_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_YELLOW_STONE_BRICKS_SLAB = block(EarthPulsationModBlocks.CHISELED_YELLOW_STONE_BRICKS_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> YELLOW_STONE_BRICKS_WALL = block(EarthPulsationModBlocks.YELLOW_STONE_BRICKS_WALL,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICESAND = block(EarthPulsationModBlocks.ICESAND, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICESANDSTONE = block(EarthPulsationModBlocks.ICESANDSTONE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> SMOOTH_ICESANDSTONE = block(EarthPulsationModBlocks.SMOOTH_ICESANDSTONE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_ICE_STONE = block(EarthPulsationModBlocks.CHISELED_ICE_STONE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_SAPLING = block(EarthPulsationModBlocks.ICE_BIRCH_SAPLING,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_LEAVES = block(EarthPulsationModBlocks.ICE_BIRCH_LEAVES,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_LOG = block(EarthPulsationModBlocks.ICE_BIRCH_LOG, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_WOOD = block(EarthPulsationModBlocks.ICE_BIRCH_WOOD,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> STRIPPED_ICE_BIRCH_LOG = block(EarthPulsationModBlocks.STRIPPED_ICE_BIRCH_LOG,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> STRIPPED_ICE_BIRCH_WOOD = block(EarthPulsationModBlocks.STRIPPED_ICE_BIRCH_WOOD,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_PLANKS = block(EarthPulsationModBlocks.ICE_BIRCH_PLANKS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_STAIRS = block(EarthPulsationModBlocks.ICE_BIRCH_STAIRS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_SLAB = block(EarthPulsationModBlocks.ICE_BIRCH_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_FENCE = block(EarthPulsationModBlocks.ICE_BIRCH_FENCE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_FENCE_GATE = block(EarthPulsationModBlocks.ICE_BIRCH_FENCE_GATE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_PRESSURE_PLATE = block(EarthPulsationModBlocks.ICE_BIRCH_PRESSURE_PLATE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICE_BIRCH_BUTTON = block(EarthPulsationModBlocks.ICE_BIRCH_BUTTON,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> FROZEN_BUSH = block(EarthPulsationModBlocks.FROZEN_BUSH, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLAZING_DIRT = block(EarthPulsationModBlocks.BLAZING_DIRT, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_LEAVES = block(EarthPulsationModBlocks.MAPLE_LEAVES, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_LOG = block(EarthPulsationModBlocks.MAPLE_LOG, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_WOOD = block(EarthPulsationModBlocks.MAPLE_WOOD, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> STRIPPED_MAPLE_LOG = block(EarthPulsationModBlocks.STRIPPED_MAPLE_LOG,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> STRIPPED_MAPLE_WOOD = block(EarthPulsationModBlocks.STRIPPED_MAPLE_WOOD,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_PLANKS = block(EarthPulsationModBlocks.MAPLE_PLANKS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_STAIRS = block(EarthPulsationModBlocks.MAPLE_STAIRS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_SLAB = block(EarthPulsationModBlocks.MAPLE_SLAB, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_FENCE = block(EarthPulsationModBlocks.MAPLE_FENCE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_FENCE_GATE = block(EarthPulsationModBlocks.MAPLE_FENCE_GATE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_PRESSURE_PLATE = block(EarthPulsationModBlocks.MAPLE_PRESSURE_PLATE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAPLE_BUTTON = block(EarthPulsationModBlocks.MAPLE_BUTTON, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LARVIKITE = block(EarthPulsationModBlocks.LARVIKITE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LARVIKITE_STAIR = block(EarthPulsationModBlocks.LARVIKITE_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LARVIKITE_SLAB = block(EarthPulsationModBlocks.LARVIKITE_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> POLISHED_LARVIKITE = block(EarthPulsationModBlocks.POLISHED_LARVIKITE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> POLISHED_LARVIKITE_STAIR = block(EarthPulsationModBlocks.POLISHED_LARVIKITE_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> POLISHED_LARVIKITE_SLAB = block(EarthPulsationModBlocks.POLISHED_LARVIKITE_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LUMEN_CRYSTAL_STEM = block(EarthPulsationModBlocks.LUMEN_CRYSTAL_STEM,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> SMOOTH_PRISMARINE_BRICK = block(EarthPulsationModBlocks.SMOOTH_PRISMARINE_BRICK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ICELAND_SPAR = block(EarthPulsationModBlocks.ICELAND_SPAR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> EMPTY_BLUE_PRINT = REGISTRY.register("empty_blue_print", () -> new EmptyBluePrintItem());
	public static final RegistryObject<Item> BLUE_PRINT = REGISTRY.register("blue_print", () -> new BluePrintItem());
	public static final RegistryObject<Item> EMPTY_STONE_RUNE = REGISTRY.register("empty_stone_rune", () -> new EmptyStoneRuneItem());
	public static final RegistryObject<Item> EMPTY_JADE_RUNE = REGISTRY.register("empty_jade_rune", () -> new EmptyJadeRuneItem());
	public static final RegistryObject<Item> EMPTY_YELLOW_STONE_RUNE = REGISTRY.register("empty_yellow_stone_rune",
			() -> new EmptyYellowStoneRuneItem());
	public static final RegistryObject<Item> WOODEN_RUNE = REGISTRY.register("wooden_rune", () -> new WoodenRuneItem());
	public static final RegistryObject<Item> RESIN = REGISTRY.register("resin", () -> new ResinItem());
	public static final RegistryObject<Item> RESIN_BLOCK = block(EarthPulsationModBlocks.RESIN_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> SHABBY_CIRCUIT_BOARD = REGISTRY.register("shabby_circuit_board", () -> new ShabbyCircuitBoardItem());
	public static final RegistryObject<Item> BLANK_CIRCUTI_BOARD = REGISTRY.register("blank_circuti_board", () -> new BlankCircutiBoardItem());
	public static final RegistryObject<Item> BASE_CIRCUTI_BOARD = REGISTRY.register("base_circuti_board", () -> new BaseCircutiBoardItem());
	public static final RegistryObject<Item> DARK_CIRCUIT_BOARD = REGISTRY.register("dark_circuit_board", () -> new DarkCircuitBoardItem());
	public static final RegistryObject<Item> SCREEN_PART = REGISTRY.register("screen_part", () -> new ScreenPartItem());
	public static final RegistryObject<Item> BASIC_BATTERY = REGISTRY.register("basic_battery", () -> new BasicBatteryItem());
	public static final RegistryObject<Item> CLASSIC_BATTERY = REGISTRY.register("classic_battery", () -> new ClassicBatteryItem());
	public static final RegistryObject<Item> CONCISE_BATTERY = REGISTRY.register("concise_battery", () -> new ConciseBatteryItem());
	public static final RegistryObject<Item> NORMAL_BATTERY = REGISTRY.register("normal_battery", () -> new NormalBatteryItem());
	public static final RegistryObject<Item> HIGH_LEVEL_BATTERY = REGISTRY.register("high_level_battery", () -> new HighLevelBatteryItem());
	public static final RegistryObject<Item> SUPER_BATTERY = REGISTRY.register("super_battery", () -> new SuperBatteryItem());
	public static final RegistryObject<Item> COAL_GENERATOR = block(EarthPulsationModBlocks.COAL_GENERATOR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BATTERY_BLOCK = block(EarthPulsationModBlocks.BATTERY_BLOCK, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WOODEN_TROUGH = REGISTRY.register("wooden_trough", () -> new WoodenTroughItem());
	public static final RegistryObject<Item> BIG_APPLE_BLOCK = block(EarthPulsationModBlocks.BIG_APPLE_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WARPED_WART_SLURRIES_BUCKET = REGISTRY.register("warped_wart_slurries_bucket",
			() -> new WarpedWartSlurriesItem());
	public static final RegistryObject<Item> COPPER_DOOR = doubleBlock(EarthPulsationModBlocks.COPPER_DOOR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ALUMINUM_DOOR = doubleBlock(EarthPulsationModBlocks.ALUMINUM_DOOR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CONTAINER_COLUMN = block(EarthPulsationModBlocks.CONTAINER_COLUMN,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CONTAINER_WALL = block(EarthPulsationModBlocks.CONTAINER_WALL,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CONTAINER_DOOR = doubleBlock(EarthPulsationModBlocks.CONTAINER_DOOR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLUE_CONTAINER_COLUMN = block(EarthPulsationModBlocks.BLUE_CONTAINER_COLUMN,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLUE_CONTAINER_WALL = block(EarthPulsationModBlocks.BLUE_CONTAINER_WALL,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLUE_CONTAINER_DOOR = doubleBlock(EarthPulsationModBlocks.BLUE_CONTAINER_DOOR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RED_CONTAINER_COLUMN = block(EarthPulsationModBlocks.RED_CONTAINER_COLUMN,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RED_CONTAINER_WALL = block(EarthPulsationModBlocks.RED_CONTAINER_WALL,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RED_CONTAINER_DOOR = doubleBlock(EarthPulsationModBlocks.RED_CONTAINER_DOOR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WOOD_PLANKS_DOOR = doubleBlock(EarthPulsationModBlocks.WOOD_PLANKS_DOOR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WOODEN_TABLE = block(EarthPulsationModBlocks.WOODEN_TABLE, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LONG_WOODEN_TABLE = block(EarthPulsationModBlocks.LONG_WOODEN_TABLE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WOODEN_HOLDER = block(EarthPulsationModBlocks.WOODEN_HOLDER, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WOODEN_CHAIR = block(EarthPulsationModBlocks.WOODEN_CHAIR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WHITE_LIGHT_LAB_BLOCK = block(EarthPulsationModBlocks.WHITE_LIGHT_LAB_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLUE_LIGHT_LAB_BLOCK = block(EarthPulsationModBlocks.BLUE_LIGHT_LAB_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_WHITE_LIGHT_LAB_BLOCK = block(EarthPulsationModBlocks.CHISELED_WHITE_LIGHT_LAB_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_WHITE_LIGHT_LAB_BLOCK_STAIR = block(
			EarthPulsationModBlocks.CHISELED_WHITE_LIGHT_LAB_BLOCK_STAIR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_WHITE_LIGHT_LAB_BLOCK_SLAB = block(EarthPulsationModBlocks.CHISELED_WHITE_LIGHT_LAB_BLOCK_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_BLUE_LIGHT_LAB_BLOCK = block(EarthPulsationModBlocks.CHISELED_BLUE_LIGHT_LAB_BLOCK,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_BLUE_LIGHT_LAB_BLOCK_STAIR = block(EarthPulsationModBlocks.CHISELED_BLUE_LIGHT_LAB_BLOCK_STAIR,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_BLUE_LIGHT_LAB_BLOCK_SLAB = block(EarthPulsationModBlocks.CHISELED_BLUE_LIGHT_LAB_BLOCK_SLAB,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_MIXED_LIGHT_LAB_BLOCK_A = block(EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_A,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_MIXED_LIGHT_LAB_BLOCK_A_STAIR = block(
			EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_A_STAIR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_MIXED_LIGHT_LAB_BLOCK_A_SLAB = block(
			EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_A_SLAB, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_MIXED_LIGHT_LAB_BLOCK_B = block(EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_B,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_MIXED_LIGHT_LAB_BLOCK_B_STAIR = block(
			EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_B_STAIR, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CHISELED_MIXED_LIGHT_LAB_BLOCK_B_SLAB = block(
			EarthPulsationModBlocks.CHISELED_MIXED_LIGHT_LAB_BLOCK_B_SLAB, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RESIN_GLASS = block(EarthPulsationModBlocks.RESIN_GLASS, EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WHITE_RESIN_GLASS = block(EarthPulsationModBlocks.WHITE_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ORANGE_RESIN_GLASS = block(EarthPulsationModBlocks.ORANGE_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAGENTA_RESIN_GLASS = block(EarthPulsationModBlocks.MAGENTA_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LIGHT_BLUE_RESIN_GLASS = block(EarthPulsationModBlocks.LIGHT_BLUE_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> YELLOW_RESIN_GLASS = block(EarthPulsationModBlocks.YELLOW_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LIME_RESIN_GLASS = block(EarthPulsationModBlocks.LIME_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> PINK_RESIN_GLASS = block(EarthPulsationModBlocks.PINK_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> GRAY_RESIN_GLASS = block(EarthPulsationModBlocks.GRAY_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LIGHT_GRAY_RESIN_GLASS = block(EarthPulsationModBlocks.LIGHT_GRAY_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CYAN_RESIN_GLASS = block(EarthPulsationModBlocks.CYAN_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> PURPLE_RESIN_GLASS = block(EarthPulsationModBlocks.PURPLE_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLUE_RESIN_GLASS = block(EarthPulsationModBlocks.BLUE_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BROWN_RESIN_GLASS = block(EarthPulsationModBlocks.BROWN_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> GREEN_RESIN_GLASS = block(EarthPulsationModBlocks.GREEN_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RED_RESIN_GLASS = block(EarthPulsationModBlocks.RED_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLACK_RESIN_GLASS = block(EarthPulsationModBlocks.BLACK_RESIN_GLASS,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RESIN_GLASS_PANE = block(EarthPulsationModBlocks.RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> WHITE_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.WHITE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> ORANGE_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.ORANGE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> MAGENTA_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.MAGENTA_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LIGHT_BLUE_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.LIGHT_BLUE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> YELLOW_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.YELLOW_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LIME_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.LIME_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> PINK_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.PINK_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> GRAY_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.GRAY_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> LIGHT_GRAY_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.LIGHT_GRAY_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> CYAN_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.CYAN_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> PURPLE_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.PURPLE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLUE_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.BLUE_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BROWN_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.BROWN_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> GREEN_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.GREEN_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> RED_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.RED_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BLACK_RESIN_GLASS_PANE = block(EarthPulsationModBlocks.BLACK_RESIN_GLASS_PANE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> PURE_SLIME = REGISTRY.register("pure_slime_spawn_egg",
			() -> new ForgeSpawnEggItem(EarthPulsationModEntities.PURE_SLIME, -13382401, -13395457,
					new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION)));
	public static final RegistryObject<Item> WANDERED_MINNER = REGISTRY.register("wandered_minner_spawn_egg",
			() -> new ForgeSpawnEggItem(EarthPulsationModEntities.WANDERED_MINNER, -16751053, -256,
					new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION)));
	public static final RegistryObject<Item> TINY_TNT = REGISTRY.register("tiny_tnt", () -> new TinyTNTItem());
	public static final RegistryObject<Item> MELON_GUN = REGISTRY.register("melon_gun", () -> new MelonGunItem());
	public static final RegistryObject<Item> NORMAL_GUN = REGISTRY.register("normal_gun", () -> new NormalGunItem());
	public static final RegistryObject<Item> GLASS_SWORD = REGISTRY.register("glass_sword", () -> new GlassSwordItem());
	public static final RegistryObject<Item> NOKIKA = REGISTRY.register("nokika", () -> new NokikaItem());
	public static final RegistryObject<Item> SAMJUNG_NOTE_7 = REGISTRY.register("samjung_note_7", () -> new SamjungNote7Item());
	public static final RegistryObject<Item> OLD_AGE = REGISTRY.register("old_age", () -> new OldAgeItem());
	public static final RegistryObject<Item> DEEP_WELL = REGISTRY.register("deep_well", () -> new DeepWellItem());
	public static final RegistryObject<Item> PLACE_ON_WATER_PLATE = block(EarthPulsationModBlocks.PLACE_ON_WATER_PLATE,
			EarthPulsationModTabs.TAB_EARTH_PULSATION);
	public static final RegistryObject<Item> BIG_APPLE_PIECE = REGISTRY.register("big_apple_piece", () -> new BigApplePieceItem());
	public static final RegistryObject<Item> WARPED_WART_SLURRIES_BOTTLE = REGISTRY.register("warped_wart_slurries_bottle",
			() -> new WarpedWartSlurriesBottleItem());
	public static final RegistryObject<Item> REFINED_BREAD = REGISTRY.register("refined_bread", () -> new RefinedBreadItem());
	public static final RegistryObject<Item> WOODEN_TROUGH_FILLED_WITH_DOUGH = REGISTRY.register("wooden_trough_filled_with_dough",
			() -> new WoodenTroughFilledWithDoughItem());
	public static final RegistryObject<Item> WOODEN_TROUGH_FILLED_WITH_CHOCOLATE = REGISTRY.register("wooden_trough_filled_with_chocolate",
			() -> new WoodenTroughFilledWithChocolateItem());
	public static final RegistryObject<Item> CHOCOLATE = REGISTRY.register("chocolate", () -> new ChocolateItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
