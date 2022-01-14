
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

import idv.hailelectronic.earthpulsation.world.inventory.BasinGuiMenu;
import idv.hailelectronic.earthpulsation.procedures.POnProcedure;
import idv.hailelectronic.earthpulsation.procedures.POffProcedure;
import idv.hailelectronic.earthpulsation.procedures.P75zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P50zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P25zProcedure;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BasinGuiScreen extends AbstractContainerScreen<BasinGuiMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BasinGuiScreen(BasinGuiMenu container, Inventory inventory, Component text) {
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/basin.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (P25zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress0.png"));
			this.blit(ms, this.leftPos + 89, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (P50zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress0.png"));
			this.blit(ms, this.leftPos + 97, this.topPos + 36, 0, 0, 16, 16, 16, 16);
		}
		if (P75zProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress0.png"));
			this.blit(ms, this.leftPos + 105, this.topPos + 36, 0, 0, 16, 16, 16, 16);
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
		this.font.draw(poseStack, "Basin", 77, 5, -13395712);
		if (POffProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, "stop", 91, 53, -6710887);
		if (POnProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, "" + (new Object() {
				public String getValue(BlockPos pos, String tag) {
					BlockEntity BlockEntity = world.getBlockEntity(pos);
					if (BlockEntity != null)
						return BlockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "Progress")) + "", 91, 53, -10066330);
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
