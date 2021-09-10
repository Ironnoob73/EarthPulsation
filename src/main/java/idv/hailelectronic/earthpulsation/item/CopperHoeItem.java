
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import idv.hailelectronic.earthpulsation.itemgroup.EarthPulsationItemGroup;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

@EarthPulsationModElements.ModElement.Tag
public class CopperHoeItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:copper_hoe")
	public static final Item block = null;
	public CopperHoeItem(EarthPulsationModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 168;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 7;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperIngotItem.block));
			}
		}, 0, -2f, new Item.Properties().group(EarthPulsationItemGroup.tab)) {
		}.setRegistryName("copper_hoe"));
	}
}
