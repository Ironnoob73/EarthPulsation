
package idv.hailelectronic.earthpulsation.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import idv.hailelectronic.earthpulsation.procedures.POnProcedure;
import idv.hailelectronic.earthpulsation.procedures.POffProcedure;
import idv.hailelectronic.earthpulsation.procedures.P9Procedure;
import idv.hailelectronic.earthpulsation.procedures.P8Procedure;
import idv.hailelectronic.earthpulsation.procedures.P7Procedure;
import idv.hailelectronic.earthpulsation.procedures.P75zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P6Procedure;
import idv.hailelectronic.earthpulsation.procedures.P5Procedure;
import idv.hailelectronic.earthpulsation.procedures.P50zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P4Procedure;
import idv.hailelectronic.earthpulsation.procedures.P3Procedure;
import idv.hailelectronic.earthpulsation.procedures.P2Procedure;
import idv.hailelectronic.earthpulsation.procedures.P25zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P1Procedure;
import idv.hailelectronic.earthpulsation.procedures.P0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class RefinerGuiGuiWindow extends ContainerScreen<RefinerGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = RefinerGuiGui.guistate;
	public RefinerGuiGuiWindow(RefinerGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/refiner.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 176, 166, 176, 166);
		if (POnProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/refiner_fuel.png"));
			this.blit(ms, this.guiLeft + 55, this.guiTop + 38, 0, 0, 16, 16, 16, 16);
		}
		if (P25zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress0.png"));
			this.blit(ms, this.guiLeft + 83, this.guiTop + 37, 0, 0, 16, 16, 16, 16);
		}
		if (P50zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress0.png"));
			this.blit(ms, this.guiLeft + 90, this.guiTop + 37, 0, 0, 16, 16, 16, 16);
		}
		if (P75zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress0.png"));
			this.blit(ms, this.guiLeft + 97, this.guiTop + 37, 0, 0, 16, 16, 16, 16);
		}
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
		this.font.drawString(ms, "Refiner", 70, 7, -6737152);
		if (POffProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "Stop", 85, 54, -6710887);
		if (P0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "0/10", 85, 54, -10066330);
		if (P1Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "1/10", 85, 54, -10066330);
		if (P2Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "2/10", 85, 54, -10066330);
		if (P3Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "3/10", 85, 54, -10066330);
		if (P4Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "4/10", 85, 54, -10066330);
		if (P5Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "5/10", 85, 54, -10066330);
		if (P6Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "6/10", 85, 54, -10066330);
		if (P7Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "7/10", 85, 54, -10066330);
		if (P8Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "8/10", 85, 54, -10066330);
		if (P9Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "9/10", 85, 54, -10066330);
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
	}
}
