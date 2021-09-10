
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import idv.hailelectronic.earthpulsation.itemgroup.EarthPulsationItemGroup;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

@EarthPulsationModElements.ModElement.Tag
public class RuggedizedAluminumPickaxeItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:ruggedized_aluminum_pickaxe")
	public static final Item block = null;
	public RuggedizedAluminumPickaxeItem(EarthPulsationModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 490;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 1f;
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
		}, 1, -2.8f, new Item.Properties().group(EarthPulsationItemGroup.tab)) {
		}.setRegistryName("ruggedized_aluminum_pickaxe"));
	}
}
