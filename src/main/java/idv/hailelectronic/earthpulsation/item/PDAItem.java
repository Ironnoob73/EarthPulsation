
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResult;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.Minecraft;
import net.minecraft.block.BlockState;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import io.netty.buffer.Unpooled;

import idv.hailelectronic.earthpulsation.procedures.PDAToolTipProcedure;
import idv.hailelectronic.earthpulsation.itemgroup.EarthPulsationItemGroup;
import idv.hailelectronic.earthpulsation.gui.PDAGuiHomeGuiWindow;
import idv.hailelectronic.earthpulsation.gui.PDAGuiHomeGui;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

@EarthPulsationModElements.ModElement.Tag
public class PDAItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:pda")
	public static final Item block = null;
	public PDAItem(EarthPulsationModElements instance) {
		super(instance, 1);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void onItemDropped(ItemTossEvent event) {
		if (event.getEntityItem().getItem().getItem() == block) {
			if (Minecraft.getInstance().currentScreen instanceof PDAGuiHomeGuiWindow) {
				Minecraft.getInstance().player.closeScreen();
			}
		}
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EarthPulsationItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.RARE));
			setRegistryName("pda");
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

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot) {
			if (slot == EquipmentSlotType.MAINHAND) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(slot));
				builder.put(Attributes.ATTACK_DAMAGE,
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Item modifier", (double) 3, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_SPEED,
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Item modifier", -2.4, AttributeModifier.Operation.ADDITION));
			}
			return super.getAttributeModifiers(slot);
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("{\"translate\":\"tooltip.earth_pulsation.pda\"}"));
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (entity instanceof ServerPlayerEntity) {
				NetworkHooks.openGui((ServerPlayerEntity) entity, new INamedContainerProvider() {
					@Override
					public ITextComponent getDisplayName() {
						return new StringTextComponent("PDA");
					}

					@Override
					public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
						PacketBuffer packetBuffer = new PacketBuffer(Unpooled.buffer());
						packetBuffer.writeBlockPos(new BlockPos(x, y, z));
						packetBuffer.writeByte(hand == Hand.MAIN_HAND ? 0 : 1);
						return new PDAGuiHomeGui.GuiContainerMod(id, inventory, packetBuffer);
					}
				}, buf -> {
					buf.writeBlockPos(new BlockPos(x, y, z));
					buf.writeByte(hand == Hand.MAIN_HAND ? 0 : 1);
				});
			}
			return ar;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (selected) {
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				PDAToolTipProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT compound) {
			return new InventoryCapability();
		}

		@Override
		public CompoundNBT getShareTag(ItemStack stack) {
			CompoundNBT nbt = super.getShareTag(stack);
			if (nbt != null)
				stack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
						.ifPresent(capability -> nbt.put("Inventory", ((ItemStackHandler) capability).serializeNBT()));
			return nbt;
		}

		@Override
		public void readShareTag(ItemStack stack, @Nullable CompoundNBT nbt) {
			super.readShareTag(stack, nbt);
			if (nbt != null)
				stack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
						.ifPresent(capability -> ((ItemStackHandler) capability).deserializeNBT((CompoundNBT) nbt.get("Inventory")));
		}
	}

	private static class InventoryCapability implements ICapabilitySerializable<CompoundNBT> {
		private final LazyOptional<ItemStackHandler> inventory = LazyOptional.of(this::createItemHandler);
		@Override
		public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
			return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ? this.inventory.cast() : LazyOptional.empty();
		}

		@Override
		public CompoundNBT serializeNBT() {
			return getItemHandler().serializeNBT();
		}

		@Override
		public void deserializeNBT(CompoundNBT nbt) {
			getItemHandler().deserializeNBT(nbt);
		}

		private ItemStackHandler createItemHandler() {
			return new ItemStackHandler(0) {
				@Override
				public int getSlotLimit(int slot) {
					return 64;
				}

				@Override
				public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
					return stack.getItem() != block;
				}
			};
		}

		private ItemStackHandler getItemHandler() {
			return inventory.orElseThrow(RuntimeException::new);
		}
	}
}
