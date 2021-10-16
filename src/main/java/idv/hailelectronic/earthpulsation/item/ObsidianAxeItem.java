
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import idv.hailelectronic.earthpulsation.itemgroup.EarthPulsationItemGroup;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

@EarthPulsationModElements.ModElement.Tag
public class ObsidianAxeItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:obsidian_axe")
	public static final Item block = null;
	public ObsidianAxeItem(EarthPulsationModElements instance) {
		super(instance, 151);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2048;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PureObsidianIngotItem.block), new ItemStack(TurbidObsidianIngotItem.block));
			}
		}, 1, -3.1f, new Item.Properties().group(EarthPulsationItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("obsidian_axe"));
	}
}
