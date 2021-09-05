package idv.hailelectronic.earthpulsation.procedures;

import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class PDAToolTipProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EarthPulsationMod.LOGGER.warn("Failed to load dependency entity for procedure PDAToolTip!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag().putString("Lore",
				(new TranslationTextComponent("tooltip.earth_pulsation.pda").getString()));
	}
}
