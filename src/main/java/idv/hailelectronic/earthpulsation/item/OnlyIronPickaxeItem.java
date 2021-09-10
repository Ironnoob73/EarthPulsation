
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import idv.hailelectronic.earthpulsation.itemgroup.EarthPulsationItemGroup;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

@EarthPulsationModElements.ModElement.Tag
public class OnlyIronPickaxeItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:only_iron_pickaxe")
	public static final Item block = null;
	public OnlyIronPickaxeItem(EarthPulsationModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 286;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT));
			}
		}, 1, -3f, new Item.Properties().group(EarthPulsationItemGroup.tab)) {
		}.setRegistryName("only_iron_pickaxe"));
	}
}
