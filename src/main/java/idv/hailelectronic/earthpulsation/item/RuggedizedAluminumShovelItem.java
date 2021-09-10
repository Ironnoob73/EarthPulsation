
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
public class RuggedizedAluminumShovelItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:ruggedized_aluminum_shovel")
	public static final Item block = null;
	public RuggedizedAluminumShovelItem(EarthPulsationModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 490;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 0.25f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 21;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AluminumIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(EarthPulsationItemGroup.tab)) {
		}.setRegistryName("ruggedized_aluminum_shovel"));
	}
}
