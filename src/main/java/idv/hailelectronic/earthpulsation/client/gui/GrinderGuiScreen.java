
package idv.hailelectronic.earthpulsation.client.gui;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import idv.hailelectronic.earthpulsation.world.inventory.GrinderGuiMenu;
import idv.hailelectronic.earthpulsation.procedures.POnProcedure;
import idv.hailelectronic.earthpulsation.procedures.POffProcedure;
import idv.hailelectronic.earthpulsation.procedures.P80zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P60zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P40zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P20zProcedure;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GrinderGuiScreen extends AbstractContainerScreen<GrinderGuiMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GrinderGuiScreen(GrinderGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/grinder.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (POnProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 62, this.topPos + 29, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 30, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 64, this.topPos + 31, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 65, this.topPos + 32, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 66, this.topPos + 33, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 67, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 68, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 72, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 74, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 76, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 77, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 78, this.topPos + 33, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 32, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 80, this.topPos + 31, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 81, this.topPos + 30, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 82, this.topPos + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 84, this.topPos + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 86, this.topPos + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 88, this.topPos + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 90, this.topPos + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 91, this.topPos + 30, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 92, this.topPos + 31, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 93, this.topPos + 32, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 94, this.topPos + 33, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 95, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.leftPos + 96, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Grinder", 68, 4, -13421773);
		if (POffProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, "Stop", 68, 51, -6710887);
		if (POnProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, "" + (new Object() {
				public String getValue(BlockPos pos, String tag) {
					BlockEntity BlockEntity = world.getBlockEntity(pos);
					if (BlockEntity != null)
						return BlockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "Progress")) + "", 68, 51, -10066330);
		this.font.draw(poseStack, "" + (new Object() {
			public double getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "craftingTime")) + "", 2, 57, -5066062);
		this.font.draw(poseStack, "" + (new Object() {
			public double getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "craftingProgress")) + "", 2, 65, -5066062);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
