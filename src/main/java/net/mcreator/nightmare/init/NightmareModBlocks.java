/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nightmare.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.nightmare.block.*;
import net.mcreator.nightmare.NightmareMod;

import java.util.function.Function;

public class NightmareModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(NightmareMod.MODID);
	public static final DeferredBlock<Block> FUCK;
	public static final DeferredBlock<Block> PORESTONE;
	public static final DeferredBlock<Block> SKIN;
	public static final DeferredBlock<Block> NIGHTMARE_PORTAL;
	public static final DeferredBlock<Block> BLOOD_CLOT;
	public static final DeferredBlock<Block> DARKNESS;
	public static final DeferredBlock<Block> EYES;
	public static final DeferredBlock<Block> NUTRIENT_SAC;
	public static final DeferredBlock<Block> THE_WHEATFIELD_PORTAL;
	static {
		FUCK = register("fuck", FUCKBlock::new);
		PORESTONE = register("porestone", PorestoneBlock::new);
		SKIN = register("skin", SkinBlock::new);
		NIGHTMARE_PORTAL = register("nightmare_portal", NightmarePortalBlock::new);
		BLOOD_CLOT = register("blood_clot", BloodClotBlock::new);
		DARKNESS = register("darkness", DarknessBlock::new);
		EYES = register("eyes", EyesBlock::new);
		NUTRIENT_SAC = register("nutrient_sac", NutrientSacBlock::new);
		THE_WHEATFIELD_PORTAL = register("the_wheatfield_portal", WheatfieldPortalBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}