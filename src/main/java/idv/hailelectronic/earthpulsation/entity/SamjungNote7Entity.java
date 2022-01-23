
package idv.hailelectronic.earthpulsation.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import java.util.Random;

import idv.hailelectronic.earthpulsation.procedures.SamjungNote7ToPlayerProcedure;
import idv.hailelectronic.earthpulsation.procedures.SamjungNote7TimmerProcedure;
import idv.hailelectronic.earthpulsation.procedures.SamjungNote7ExplotionProcedure;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModItems;
import idv.hailelectronic.earthpulsation.init.EarthPulsationModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class SamjungNote7Entity extends AbstractArrow implements ItemSupplier {
	public SamjungNote7Entity(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(EarthPulsationModEntities.SAMJUNG_NOTE_7, world);
	}

	public SamjungNote7Entity(EntityType<? extends SamjungNote7Entity> type, Level world) {
		super(type, world);
	}

	public SamjungNote7Entity(EntityType<? extends SamjungNote7Entity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public SamjungNote7Entity(EntityType<? extends SamjungNote7Entity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(EarthPulsationModItems.SAMJUNG_NOTE_7);
	}

	@Override
	protected ItemStack getPickupItem() {
		return null;
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		Entity sourceentity = this.getOwner();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity imediatesourceentity = this;

		SamjungNote7ToPlayerProcedure.execute(world, x, y, z, entity);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
		Entity sourceentity = this.getOwner();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity imediatesourceentity = this;

		SamjungNote7ExplotionProcedure.execute(world, x, y, z);
	}

	@Override
	public void tick() {
		super.tick();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this.getOwner();
		Entity imediatesourceentity = this;

		SamjungNote7TimmerProcedure.execute(world, x, y, z, entity);
		if (this.inGround) {

			SamjungNote7ExplotionProcedure.execute(world, x, y, z);
			this.discard();
		}
	}

	public static SamjungNote7Entity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		SamjungNote7Entity entityarrow = new SamjungNote7Entity(EarthPulsationModEntities.SAMJUNG_NOTE_7, entity, world);
		entityarrow.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static SamjungNote7Entity shoot(LivingEntity entity, LivingEntity target) {
		SamjungNote7Entity entityarrow = new SamjungNote7Entity(EarthPulsationModEntities.SAMJUNG_NOTE_7, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z,
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
