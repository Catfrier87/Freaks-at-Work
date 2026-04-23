package net.mcreator.dreamprojection.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dreamprojection.entity.CarrionCaptainEntity;
import net.mcreator.dreamprojection.client.model.Modelcarrioncaptain;

public class CarrionCaptainRenderer extends MobRenderer<CarrionCaptainEntity, LivingEntityRenderState, Modelcarrioncaptain> {
	private CarrionCaptainEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("dream_projection:textures/entities/carrioncaptain.png");

	public CarrionCaptainRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcarrioncaptain(context.bakeLayer(Modelcarrioncaptain.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CarrionCaptainEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}