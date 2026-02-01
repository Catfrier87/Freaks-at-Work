package net.mcreator.dreamprojection.client.renderer;

public class DynamiteSpawnerRenderer extends MobRenderer<DynamiteSpawnerEntity, ChickenRenderState, ChickenModel> {
	private DynamiteSpawnerEntity entity = null;

	public DynamiteSpawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ChickenRenderState createRenderState() {
		return new ChickenRenderState();
	}

	@Override
	public void extractRenderState(DynamiteSpawnerEntity entity, ChickenRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(ChickenRenderState state) {
		return ResourceLocation.parse("dream_projection:textures/entities/twink_punch.png");
	}
}