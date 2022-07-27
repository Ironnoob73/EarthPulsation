
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package idv.hailelectronic.earthpulsation.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import idv.hailelectronic.earthpulsation.EarthPulsationMod;

public class EarthPulsationModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, EarthPulsationMod.MODID);
	public static final RegistryObject<ParticleType<?>> GREEN_PORTAL = REGISTRY.register("green_portal", () -> new SimpleParticleType(true));
}
