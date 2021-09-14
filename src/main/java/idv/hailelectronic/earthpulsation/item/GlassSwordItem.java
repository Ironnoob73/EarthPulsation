
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import idv.hailelectronic.earthpulsation.itemgroup.EarthPulsationItemGroup;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

@EarthPulsationModElements.ModElement.Tag
public class GlassSwordItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:glass_sword")
	public static final Item block = null;
	public GlassSwordItem(EarthPulsationModElements instance) {
		super(instance, 207);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.GLASS_PANE), new ItemStack(Blocks.WHITE_STAINED_GLASS_PANE),
						new ItemStack(Blocks.ORANGE_STAINED_GLASS_PANE), new ItemStack(Blocks.MAGENTA_STAINED_GLASS_PANE),
						new ItemStack(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE), new ItemStack(Blocks.YELLOW_STAINED_GLASS_PANE),
						new ItemStack(Blocks.LIME_STAINED_GLASS_PANE), new ItemStack(Blocks.PINK_STAINED_GLASS_PANE),
						new ItemStack(Blocks.GRAY_STAINED_GLASS_PANE), new ItemStack(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE),
						new ItemStack(Blocks.CYAN_STAINED_GLASS_PANE), new ItemStack(Blocks.PURPLE_STAINED_GLASS_PANE),
						new ItemStack(Blocks.BLUE_STAINED_GLASS_PANE), new ItemStack(Blocks.BROWN_STAINED_GLASS_PANE),
						new ItemStack(Blocks.GREEN_STAINED_GLASS_PANE), new ItemStack(Blocks.RED_STAINED_GLASS_PANE),
						new ItemStack(Blocks.BLACK_STAINED_GLASS_PANE));
			}
		}, 3, -2f, new Item.Properties().group(EarthPulsationItemGroup.tab)) {
		}.setRegistryName("glass_sword"));
	}
}
