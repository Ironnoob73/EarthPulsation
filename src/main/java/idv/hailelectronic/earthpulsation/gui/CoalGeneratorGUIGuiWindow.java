
package idv.hailelectronic.earthpulsation.gui;

import net.minecraftforge.energy.CapabilityEnergy;
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

import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CoalGeneratorGUIGuiWindow extends ContainerScreen<CoalGeneratorGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = CoalGeneratorGUIGui.guistate;
	public CoalGeneratorGUIGuiWindow(CoalGeneratorGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/coal_generator.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 176, 166, 176, 166);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/refiner_fuel.png"));
		this.blit(ms, this.guiLeft + 80, this.guiTop + 25, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 74, this.guiTop + 32, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 73, this.guiTop + 31, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 72, this.guiTop + 30, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 71, this.guiTop + 29, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 71, this.guiTop + 28, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 71, this.guiTop + 27, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 26, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 25, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 24, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 23, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 22, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 71, this.guiTop + 21, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 71, this.guiTop + 20, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 71, this.guiTop + 19, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 72, this.guiTop + 18, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 73, this.guiTop + 17, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 74, this.guiTop + 16, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 75, this.guiTop + 15, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 76, this.guiTop + 15, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 77, this.guiTop + 15, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 78, this.guiTop + 14, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 79, this.guiTop + 14, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 80, this.guiTop + 14, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 81, this.guiTop + 14, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 82, this.guiTop + 14, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 83, this.guiTop + 15, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 84, this.guiTop + 15, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 85, this.guiTop + 15, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 86, this.guiTop + 16, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 87, this.guiTop + 17, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 88, this.guiTop + 18, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 89, this.guiTop + 19, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 89, this.guiTop + 20, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 89, this.guiTop + 21, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 90, this.guiTop + 22, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 90, this.guiTop + 23, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 90, this.guiTop + 24, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 90, this.guiTop + 25, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 90, this.guiTop + 26, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 89, this.guiTop + 27, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 89, this.guiTop + 28, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 89, this.guiTop + 29, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 88, this.guiTop + 30, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 87, this.guiTop + 31, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("earth_pulsation:textures/progress1.png"));
		this.blit(ms, this.guiLeft + 86, this.guiTop + 32, 0, 0, 16, 16, 16, 16);
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
		this.font.drawString(ms, "Coal Generator", 54, 2, -13421773);
		this.font.drawString(ms, "" + (new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + "", 100, 27, -16724890);
		this.font.drawString(ms, "" + (new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "fuel")) + "", 2, 65, -5066062);
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
