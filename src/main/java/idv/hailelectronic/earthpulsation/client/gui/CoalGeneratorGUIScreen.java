
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

import idv.hailelectronic.earthpulsation.world.inventory.CoalGeneratorGUIMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CoalGeneratorGUIScreen extends AbstractContainerScreen<CoalGeneratorGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CoalGeneratorGUIScreen(CoalGeneratorGUIMenu container, Inventory inventory, Component text) {
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/coal_generator.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/refiner_fuel.png"));
		this.blit(ms, this.leftPos + 80, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 74, this.topPos + 32, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 73, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 72, this.topPos + 30, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 71, this.topPos + 29, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 71, this.topPos + 28, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 71, this.topPos + 27, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 70, this.topPos + 26, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 70, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 70, this.topPos + 24, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 70, this.topPos + 23, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 70, this.topPos + 22, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 71, this.topPos + 21, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 71, this.topPos + 20, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 71, this.topPos + 19, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 72, this.topPos + 18, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 73, this.topPos + 17, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 74, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 75, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 76, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 77, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 80, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 81, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 82, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 83, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 84, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 85, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 86, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 87, this.topPos + 17, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 88, this.topPos + 18, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 89, this.topPos + 19, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 89, this.topPos + 20, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 89, this.topPos + 21, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 90, this.topPos + 22, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 90, this.topPos + 23, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 90, this.topPos + 24, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 90, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 90, this.topPos + 26, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 89, this.topPos + 27, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 89, this.topPos + 28, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 89, this.topPos + 29, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 88, this.topPos + 30, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 87, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.leftPos + 86, this.topPos + 32, 0, 0, 16, 16, 16, 16);

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
		drawString(poseStack, this.font, "Coal Generator", 54, 2, -13421773);
		drawString(poseStack, this.font, "" + (new Object() {
			public double getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "fuel")) + "", 2, 65, -5066062);
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
