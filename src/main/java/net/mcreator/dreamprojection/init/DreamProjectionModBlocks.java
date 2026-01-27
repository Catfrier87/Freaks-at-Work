/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamprojection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.dreamprojection.block.*;
import net.mcreator.dreamprojection.DreamProjectionMod;

import java.util.function.Function;

public class DreamProjectionModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DreamProjectionMod.MODID);
	public static final DeferredBlock<Block> EYES;
	public static final DeferredBlock<Block> DARKNESS_BLOCK;
	public static final DeferredBlock<Block> BEAST_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> BLOOD_CLOT;
	public static final DeferredBlock<Block> SKIN_BLOCK;
	public static final DeferredBlock<Block> PORESTONE;
	public static final DeferredBlock<Block> NUTRIENT_SAC;
	static {
		EYES = register("eyes", EyesBlock::new);
		DARKNESS_BLOCK = register("darkness_block", DarknessBlockBlock::new);
		BEAST_DIMENSION_PORTAL = register("beast_dimension_portal", BeastDimensionPortalBlock::new);
		BLOOD_CLOT = register("blood_clot", BloodClotBlock::new);
		SKIN_BLOCK = register("skin_block", SkinBlockBlock::new);
		PORESTONE = register("porestone", PorestoneBlock::new);
		NUTRIENT_SAC = register("nutrient_sac", NutrientSacBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}