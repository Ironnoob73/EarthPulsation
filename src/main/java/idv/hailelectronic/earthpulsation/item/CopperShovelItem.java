
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import idv.hailelectronic.earthpulsation.itemgroup.EarthPulsationItemGroup;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

@EarthPulsationModElements.ModElement.Tag
public class CopperShovelItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:copper_shovel")
	public static final Item block = null;
	public CopperShovelItem(EarthPulsationModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 168;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -0.2f;
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
		}, 1, -3f, new Item.Properties().group(EarthPulsationItemGroup.tab)) {
		}.setRegistryName("copper_shovel"));
	}
}
