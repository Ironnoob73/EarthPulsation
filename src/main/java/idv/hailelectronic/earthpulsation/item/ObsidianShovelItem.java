
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
public class ObsidianShovelItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:obsidian_shovel")
	public static final Item block = null;
	public ObsidianShovelItem(EarthPulsationModElements instance) {
		super(instance, 153);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2048;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 1f;
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
		}.setRegistryName("obsidian_shovel"));
	}
}
