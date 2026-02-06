package net.mcreator.dreamprojection.world.features.treedecorators;

@EventBusSubscriber
public class PangeaBiomeFruitDecorator extends CocoaDecorator {

	public static MapCodec<PangeaBiomeFruitDecorator> CODEC = MapCodec.unit(PangeaBiomeFruitDecorator::new);

	public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

	@SubscribeEvent
	public static void registerTreeDecorator(RegisterEvent event) {
		event.register(Registries.TREE_DECORATOR_TYPE, ResourceLocation.parse("dream_projection:pangea_biome_tree_fruit_decorator"), () -> DECORATOR_TYPE);
	}

	public PangeaBiomeFruitDecorator() {
		super(0.2f);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return DECORATOR_TYPE;
	}

	@Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

	@SuppressWarnings("deprecation")
	private static BlockState oriented(BlockState blockstate, Direction direction) {
		return switch (direction) {
			case SOUTH -> blockstate.rotate(Rotation.CLOCKWISE_180);
			case EAST -> blockstate.rotate(Rotation.CLOCKWISE_90);
			case WEST -> blockstate.rotate(Rotation.COUNTERCLOCKWISE_90);
			default -> blockstate;
		};
	}

}