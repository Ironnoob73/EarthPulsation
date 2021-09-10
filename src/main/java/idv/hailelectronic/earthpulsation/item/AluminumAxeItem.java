
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
public class AluminumAxeItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:aluminum_axe")
	public static final Item block = null;
	public AluminumAxeItem(EarthPulsationModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 290;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 11;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AluminumIngotItem.block));
			}
		}, 1, -3.1f, new Item.Properties().group(EarthPulsationItemGroup.tab)) {
		}.setRegistryName("aluminum_axe"));
	}
}
