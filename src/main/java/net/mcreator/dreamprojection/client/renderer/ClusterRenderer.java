package net.mcreator.dreamprojection.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dreamprojection.entity.ClusterEntity;
import net.mcreator.dreamprojection.client.model.Modelcluster;

public class ClusterRenderer extends MobRenderer<ClusterEntity, LivingEntityRenderState, Modelcluster> {
	private ClusterEntity entity = null;

	public ClusterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcluster(context.bakeLayer(Modelcluster.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ClusterEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("dream_projection:textures/entities/cluster.png");
	}
}