
package idv.hailelectronic.earthpulsation.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import idv.hailelectronic.earthpulsation.world.inventory.PDAGuiHomeMenu;
import idv.hailelectronic.earthpulsation.network.PDAGuiHomeButtonMessage;
import idv.hailelectronic.earthpulsation.EarthPulsationMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PDAGuiHomeScreen extends AbstractContainerScreen<PDAGuiHomeMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox H;

	public PDAGuiHomeScreen(PDAGuiHomeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 160;
		this.imageHeight = 224;
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/main_menu.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 160, 224, 160, 224);

		RenderSystem.setShaderTexture(0, new ResourceLocation("earth_pulsation:textures/main_menu_icon.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 256, 256, 256, 256);

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
		this.addRenderableWidget(new Button(this.leftPos + 167, this.topPos + 0, 30, 20, new TextComponent("Close"), e -> {
			if (true) {
				EarthPulsationMod.PACKET_HANDLER.sendToServer(new PDAGuiHomeButtonMessage(0, x, y, z));
				PDAGuiHomeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -40, this.topPos + 200, 30, 20, new TextComponent("Back"), e -> {
		}));
		H = new Checkbox(this.leftPos + 69, this.topPos + 203, 150, 20, new TextComponent(""), false);
		PDAGuiHomeMenu.guistate.put("checkbox:H", H);
		this.addRenderableWidget(H);
		this.addRenderableWidget(new Button(this.leftPos + 79, this.topPos + 176, 70, 20, new TextComponent("Test page"), e -> {
			if (true) {
				EarthPulsationMod.PACKET_HANDLER.sendToServer(new PDAGuiHomeButtonMessage(2, x, y, z));
				PDAGuiHomeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 64, 30, 20, new TextComponent(">"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 47, this.topPos + 64, 30, 20, new TextComponent(">"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 79, this.topPos + 64, 30, 20, new TextComponent(">"), e -> {
		}));
	}
}
