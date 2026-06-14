package net.mcreator.dreamprojection.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dreamprojection.world.inventory.SugeryGUIMenu;
import net.mcreator.dreamprojection.init.DreamProjectionModScreens;

public class SugeryGUIScreen extends AbstractContainerScreen<SugeryGUIMenu> implements DreamProjectionModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_empty1;
	private Button button_empty;
	private Button button_initiate_procedure;
	private static final ResourceLocation BACKGROUND = ResourceLocation.parse("dream_projection:textures/screens/sugery_gui.png");
	private static final ResourceLocation IMAGE_0 = ResourceLocation.parse("dream_projection:textures/screens/red_cross.png");

	public SugeryGUIScreen(SugeryGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 190;
		this.imageHeight = 190;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, this.leftPos + -113, this.topPos + -21, 0, 0, 156, 51, 156, 51);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dream_projection.sugery_gui.label_it_hurts"), 76, 194, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dream_projection.sugery_gui.label_resources"), 69, 56, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dream_projection.sugery_gui.label_systemic_lethargy_05"), 36, 151, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dream_projection.sugery_gui.label_pooplol"), 68, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dream_projection.sugery_gui.label_lobotomy"), 73, 23, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.dream_projection.sugery_gui.label_05"), 86, 36, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty1 = Button.builder(Component.translatable("gui.dream_projection.sugery_gui.button_empty1"), e -> {
		}).bounds(this.leftPos + 5, this.topPos + 18, 30, 20).build();
		this.addRenderableWidget(button_empty1);
		button_empty = Button.builder(Component.translatable("gui.dream_projection.sugery_gui.button_empty"), e -> {
		}).bounds(this.leftPos + 155, this.topPos + 19, 30, 20).build();
		this.addRenderableWidget(button_empty);
		button_initiate_procedure = Button.builder(Component.translatable("gui.dream_projection.sugery_gui.button_initiate_procedure"), e -> {
		}).bounds(this.leftPos + 35, this.topPos + 165, 121, 20).build();
		this.addRenderableWidget(button_initiate_procedure);
	}
}