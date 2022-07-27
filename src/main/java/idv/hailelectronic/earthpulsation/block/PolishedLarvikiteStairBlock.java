
package idv.hailelectronic.earthpulsation.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModBlocks;

public class PolishedLarvikiteStairBlock extends StairBlock {
	public PolishedLarvikiteStairBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE)
				.sound(SoundType.STONE).strength(5f, 15f).requiresCorrectToolForDrops().speedFactor(0.9f).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 15f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState p_56947_) {
		return false;
	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.PUSH_ONLY;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(EarthPulsationModBlocks.YELLOW_COBBLESTONE.get()));
	}
}
