
package idv.hailelectronic.earthpulsation.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

import idv.hailelectronic.earthpulsation.procedures.TetanusProcedure;
import idv.hailelectronic.earthpulsation.itemgroup.EarthPulsationItemGroup;
import idv.hailelectronic.earthpulsation.EarthPulsationModElements;

@EarthPulsationModElements.ModElement.Tag
public class RustyIronShovelItem extends EarthPulsationModElements.ModElement {
	@ObjectHolder("earth_pulsation:rusty_iron_shovel")
	public static final Item block = null;
	public RustyIronShovelItem(EarthPulsationModElements instance) {
		super(instance, 115);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 225;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 0.15f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(EarthPulsationItemGroup.tab)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					TetanusProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("rusty_iron_shovel"));
	}
}
