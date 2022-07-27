package idv.hailelectronic.earthpulsation.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;

public class CoalGeneratorFuelProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double down = 0;
		double up = 0;
		double west = 0;
		double east = 0;
		double north = 0;
		double south = 0;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "fuel") > 0) {
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, new BlockPos(x, y - 1, z))) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "fuel") >= 20) {
					down = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x, y - 1, z), 20);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
						int _amount = (int) down;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - down));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					down = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuel");
					down = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x, y - 1, z), (int) down);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
						int _amount = (int) down;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - down));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, new BlockPos(x, y + 1, z))) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "fuel") >= 20) {
					up = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x, y + 1, z), 20);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y + 1, z));
						int _amount = (int) up;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - up));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					up = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuel");
					up = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x, y + 1, z), (int) up);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y + 1, z));
						int _amount = (int) up;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - up));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, new BlockPos(x - 1, y, z)) && !((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.WEST)) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "fuel") >= 20) {
					west = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x - 1, y, z), 20);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x - 1, y, z));
						int _amount = (int) west;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - west));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					west = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuel");
					west = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x - 1, y, z), (int) west);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x - 1, y, z));
						int _amount = (int) west;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - west));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, new BlockPos(x + 1, y, z)) && !((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.EAST)) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "fuel") >= 20) {
					east = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x + 1, y, z), 20);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 1, y, z));
						int _amount = (int) east;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - east));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					east = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuel");
					east = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x + 1, y, z), (int) east);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 1, y, z));
						int _amount = (int) east;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - east));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, new BlockPos(x, y, z - 1)) && !((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.NORTH)) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "fuel") >= 20) {
					north = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x, y, z - 1), 20);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z - 1));
						int _amount = (int) north;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - north));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					north = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuel");
					north = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x, y, z - 1), (int) north);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z - 1));
						int _amount = (int) north;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - north));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, new BlockPos(x, y, z + 1)) && !((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
						return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(new BlockPos(x, y, z))) == Direction.SOUTH)) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "fuel") >= 20) {
					south = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x, y, z + 1), 20);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z + 1));
						int _amount = (int) south;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - south));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					south = new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "fuel");
					south = new Object() {
						public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = level.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
										.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
							return _retval.get();
						}
					}.receiveEnergySimulate(world, new BlockPos(x, y, z + 1), (int) south);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z + 1));
						int _amount = (int) south;
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
									.ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("fuel", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "fuel")) - south));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		} else {
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x, y, z), 0)).is(ItemTags.create(new ResourceLocation("earth_pulsation:as_coal_tag")))) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("fuel", 50);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final int _amount = 1;
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(x, y, z), 0)).is(ItemTags.create(new ResourceLocation("earth_pulsation:as_coal_block_tag")))) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("fuel", 450);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final int _amount = 1;
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
			}
		}
	}
}
