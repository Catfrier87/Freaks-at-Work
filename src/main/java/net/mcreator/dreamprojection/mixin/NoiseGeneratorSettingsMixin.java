package net.mcreator.dreamprojection.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.dreamprojection.init.DreamProjectionModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements DreamProjectionModBiomes.DreamProjectionModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> dream_projection_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.dream_projection_dimensionTypeReference != null) {
			retval = DreamProjectionModBiomes.adaptSurfaceRule(retval, this.dream_projection_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setdream_projectionDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.dream_projection_dimensionTypeReference = dimensionType;
	}
}