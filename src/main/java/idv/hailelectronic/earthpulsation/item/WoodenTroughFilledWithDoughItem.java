
package idv.hailelectronic.earthpulsation.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModItems;

public class WoodenTroughFilledWithDoughItem extends Item {
	public WoodenTroughFilledWithDoughItem() {
		super(new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION).stacksTo(8).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.5f)

						.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(EarthPulsationModItems.WOODEN_TROUGH.get());
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
