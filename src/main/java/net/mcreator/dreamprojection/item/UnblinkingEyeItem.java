package net.mcreator.dreamprojection.item;

public class UnblinkingEyeItem extends Item {
	public UnblinkingEyeItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		DetectAbyssProcedure.execute(entity);
		return ar;
	}
}