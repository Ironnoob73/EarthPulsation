
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
public class StoneBrickHoeItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:stone_brick_hoe")
	public static final Item block = null;
	public StoneBrickHoeItem(EarthPulsationModElements instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return -0.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 6;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(StoneIngotItem.block));
			}
		}, 0, -2.5f, new Item.Properties().group(EarthPulsationItemGroup.tab)) {
		}.setRegistryName("stone_brick_hoe"));
	}
}
