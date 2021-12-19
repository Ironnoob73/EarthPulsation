
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

public abstract class AluminumArmorItem extends ArmorItem {
	public AluminumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 12;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1, 4, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 7;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EarthPulsationModItems.ALUMINUM_INGOT));
			}

			@Override
			public String getName() {
				return "aluminum_armor";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AluminumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
			setRegistryName("aluminum_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "earth_pulsation:textures/models/armor/aluminum__layer_1.png";
		}
	}

	public static class Chestplate extends AluminumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
			setRegistryName("aluminum_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "earth_pulsation:textures/models/armor/aluminum__layer_1.png";
		}
	}

	public static class Leggings extends AluminumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
			setRegistryName("aluminum_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "earth_pulsation:textures/models/armor/aluminum__layer_2.png";
		}
	}

	public static class Boots extends AluminumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EarthPulsationModTabs.TAB_EARTH_PULSATION));
			setRegistryName("aluminum_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "earth_pulsation:textures/models/armor/aluminum__layer_1.png";
		}
	}
}
