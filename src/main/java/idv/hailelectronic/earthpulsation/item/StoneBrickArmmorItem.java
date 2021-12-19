
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import idv.hailelectronic.earthpulsation.init.EarthPulsationModTabs;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModItems;

public abstract class StoneBrickArmmorItem extends ArmorItem {
	public StoneBrickArmmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 4, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EarthPulsationModItems.STONE_INGOT));
			}

			@Override
			public String getName() {
				return "stone_brick_armmor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends StoneBrickArmmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
			setRegistryName("stone_brick_armmor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "earth_pulsation:textures/models/armor/stonebrick__layer_1.png";
		}
	}

	public static class Chestplate extends StoneBrickArmmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
			setRegistryName("stone_brick_armmor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "earth_pulsation:textures/models/armor/stonebrick__layer_1.png";
		}
	}

	public static class Leggings extends StoneBrickArmmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
			setRegistryName("stone_brick_armmor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "earth_pulsation:textures/models/armor/stonebrick__layer_2.png";
		}
	}

	public static class Boots extends StoneBrickArmmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
			setRegistryName("stone_brick_armmor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "earth_pulsation:textures/models/armor/stonebrick__layer_1.png";
		}
	}
}
