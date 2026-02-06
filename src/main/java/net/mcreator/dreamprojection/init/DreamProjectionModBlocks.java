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
	public static final DeferredBlock<Block> SKIN_BLOCK;
	public static final DeferredBlock<Block> BLOOD_CLOT;
	public static final DeferredBlock<Block> PORESTONE;
	public static final DeferredBlock<Block> NUTRIENT_SAC;
	public static final DeferredBlock<Block> BEAST_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> DARK_BELL;
	public static final DeferredBlock<Block> EXPERIENCE_BLOCK;
	public static final DeferredBlock<Block> SHADOW_CURRANT;
	public static final DeferredBlock<Block> FOREST_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> FINGER_BONE;
	public static final DeferredBlock<Block> COASITINE_ORE;
	public static final DeferredBlock<Block> PANGEA_PORTAL;
	static {
		EYES = register("eyes", EyesBlock::new);
		DARKNESS_BLOCK = register("darkness_block", DarknessBlockBlock::new);
		SKIN_BLOCK = register("skin_block", SkinBlockBlock::new);
		BLOOD_CLOT = register("blood_clot", BloodClotBlock::new);
		PORESTONE = register("porestone", PorestoneBlock::new);
		NUTRIENT_SAC = register("nutrient_sac", NutrientSacBlock::new);
		BEAST_DIMENSION_PORTAL = register("beast_dimension_portal", BeastDimensionPortalBlock::new);
		DARK_BELL = register("dark_bell", DarkBellBlock::new);
		EXPERIENCE_BLOCK = register("experience_block", ExperienceBlockBlock::new);
		SHADOW_CURRANT = register("shadow_currant", ShadowCurrantBlock::new);
		FOREST_DIMENSION_PORTAL = register("forest_dimension_portal", ForestDimensionPortalBlock::new);
		FINGER_BONE = register("finger_bone", FingerBoneBlock::new);
		COASITINE_ORE = register("coasitine_ore", CoasitineOreBlock::new);
		PANGEA_PORTAL = register("pangea_portal", PangeaPortalBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}