
package idv.hailelectronic.earthpulsation.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import idv.hailelectronic.earthpulsation.procedures.POnProcedure;
import idv.hailelectronic.earthpulsation.procedures.POffProcedure;
import idv.hailelectronic.earthpulsation.procedures.P75zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P50zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P25zProcedure;

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
		if (POnProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "" + (new Object() {
				public String getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "Progress")) + "", 85, 54, -10066330);
		this.font.drawString(ms, "" + (new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "craftingProgress")) + "", 3, 61, -3355444);
		this.font.drawString(ms, "" + (new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "craftingTime")) + "", 3, 53, -3355444);
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
