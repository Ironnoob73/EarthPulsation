
package idv.hailelectronic.earthpulsation.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
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
	public SamjungNote7Entity(PlayMessages.SpawnEntity packet, Level world) {
		super(EarthPulsationModEntities.SAMJUNG_NOTE_7.get(), world);
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
		return new ItemStack(EarthPulsationModItems.SAMJUNG_NOTE_7.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		SamjungNote7ToPlayerProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		SamjungNote7ExplotionProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		SamjungNote7ExplotionProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(),
				blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		SamjungNote7TimmerProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this.getOwner());
		if (this.inGround)
			this.discard();
	}

	public static SamjungNote7Entity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		SamjungNote7Entity entityarrow = new SamjungNote7Entity(EarthPulsationModEntities.SAMJUNG_NOTE_7.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static SamjungNote7Entity shoot(LivingEntity entity, LivingEntity target) {
		SamjungNote7Entity entityarrow = new SamjungNote7Entity(EarthPulsationModEntities.SAMJUNG_NOTE_7.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
