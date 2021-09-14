
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
import idv.hailelectronic.earthpulsation.procedures.P80zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P60zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P40zProcedure;
import idv.hailelectronic.earthpulsation.procedures.P20zProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class GrinderGuiGuiWindow extends ContainerScreen<GrinderGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = GrinderGuiGui.guistate;
	public GrinderGuiGuiWindow(GrinderGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/grinder.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 176, 166, 176, 166);
		if (POnProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 62, this.guiTop + 29, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 63, this.guiTop + 30, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 64, this.guiTop + 31, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 65, this.guiTop + 32, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 66, this.guiTop + 33, 0, 0, 16, 16, 16, 16);
		}
		if (POnProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 67, this.guiTop + 34, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 68, this.guiTop + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 72, this.guiTop + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 74, this.guiTop + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P20zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 76, this.guiTop + 35, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 77, this.guiTop + 34, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 33, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 79, this.guiTop + 32, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 80, this.guiTop + 31, 0, 0, 16, 16, 16, 16);
		}
		if (P40zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 81, this.guiTop + 30, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 82, this.guiTop + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 84, this.guiTop + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 86, this.guiTop + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 88, this.guiTop + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P60zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 90, this.guiTop + 29, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 91, this.guiTop + 30, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 92, this.guiTop + 31, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 93, this.guiTop + 32, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 94, this.guiTop + 33, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 95, this.guiTop + 34, 0, 0, 16, 16, 16, 16);
		}
		if (P80zProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
			this.blit(ms, this.guiLeft + 96, this.guiTop + 35, 0, 0, 16, 16, 16, 16);
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
		this.font.drawString(ms, "Grinder", 68, 4, -13421773);
		if (POffProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "Stop", 68, 51, -6710887);
		if (POnProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "" + (new Object() {
				public String getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "Progress")) + "", 68, 51, -10066330);
		this.font.drawString(ms, "" + (new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "craftingTime")) + "", 2, 57, -5066062);
		this.font.drawString(ms, "" + (new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "craftingProgress")) + "", 2, 65, -5066062);
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
