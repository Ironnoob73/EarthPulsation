
package idv.hailelectronic.earthpulsation.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.CheckboxButton;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import idv.hailelectronic.earthpulsation.EarthPulsationMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PDAGuiTestGuiWindow extends ContainerScreen<PDAGuiTestGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PDAGuiTestGui.guistate;
	CheckboxButton H;
	public PDAGuiTestGuiWindow(PDAGuiTestGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 160;
		this.ySize = 224;
	}

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/main_menu.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 160, 224, 160, 224);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Test", 7, 17, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 161, this.guiTop + -1, 30, 20, new StringTextComponent("Close"), e -> {
			if (true) {
				EarthPulsationMod.PACKET_HANDLER.sendToServer(new PDAGuiTestGui.ButtonPressedMessage(0, x, y, z));
				PDAGuiTestGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -32, this.guiTop + 205, 30, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				EarthPulsationMod.PACKET_HANDLER.sendToServer(new PDAGuiTestGui.ButtonPressedMessage(1, x, y, z));
				PDAGuiTestGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		H = new CheckboxButton(this.guiLeft + 69, this.guiTop + 202, 150, 20, new StringTextComponent(""), false);
		PDAGuiTestGui.guistate.put("checkbox:H", H);
		this.addButton(H);
	}
}