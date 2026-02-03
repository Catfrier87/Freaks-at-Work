package net.mcreator.dreamprojection.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dreamprojection.entity.SplungerEntity;
import net.mcreator.dreamprojection.client.model.Modelsplunger;

public class SplungerRenderer extends MobRenderer<SplungerEntity, LivingEntityRenderState, Modelsplunger> {
	private SplungerEntity entity = null;

	public SplungerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsplunger(context.bakeLayer(Modelsplunger.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SplungerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("dream_projection:textures/entities/rollypolly.png");
	}
}