package net.mcreator.dreamprojection.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.dreamprojection.entity.AbyssBossEntity;
import net.mcreator.dreamprojection.client.model.animations.ZLYQAnimation;
import net.mcreator.dreamprojection.client.model.ModelZLYQ;

public class AbyssBossRenderer extends MobRenderer<AbyssBossEntity, LivingEntityRenderState, ModelZLYQ> {
	private AbyssBossEntity entity = null;

	public AbyssBossRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelZLYQ.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AbyssBossEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("dream_projection:textures/entities/abyssbosstexture.png");
	}

	private static final class AnimatedModel extends ModelZLYQ {
		private AbyssBossEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = ZLYQAnimation.Run.bake(root);
		}

		public void setEntity(AbyssBossEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}