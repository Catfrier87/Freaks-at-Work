// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelZLYQ<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "zlyq"), "main");
	private final ModelPart Body;
	private final ModelPart RLeg;
	private final ModelPart LLeg;
	private final ModelPart Head;
	private final ModelPart RArm;
	private final ModelPart LArm;

	public ModelZLYQ(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RLeg = this.Body.getChild("RLeg");
		this.LLeg = this.Body.getChild("LLeg");
		this.Head = this.Body.getChild("Head");
		this.RArm = this.Body.getChild("RArm");
		this.LArm = this.Body.getChild("LArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).addBox(
				0.0F, -14.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 1.0F, 0.0F));

		PartDefinition RLeg = Body.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(24, 7).addBox(-1.0F, 0.0F,
				-1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LLeg = Body.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(24, 7).addBox(3.0F, 0.0F,
				-1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F,
				-8.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -13.0F, 3.0F));

		PartDefinition RArm = Body.addOrReplaceChild("RArm",
				CubeListBuilder.create().texOffs(24, 3)
						.addBox(-4.0F, 2.0F, -1.0F, 2.0F, 27.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 14)
						.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition LArm = Body.addOrReplaceChild("LArm",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-4.0F, 2.0F, -1.0F, 2.0F, 27.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 14)
						.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -12.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}