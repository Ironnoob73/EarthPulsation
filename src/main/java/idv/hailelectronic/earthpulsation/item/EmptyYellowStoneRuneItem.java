
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import idv.hailelectronic.earthpulsation.itemgroup.EarthPulsationItemGroup;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

@EarthPulsationModElements.ModElement.Tag
public class EmptyYellowStoneRuneItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:empty_yellow_stone_rune")
	public static final Item block = null;
	public EmptyYellowStoneRuneItem(EarthPulsationModElements instance) {
		super(instance, 210);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EarthPulsationItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("empty_yellow_stone_rune");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
