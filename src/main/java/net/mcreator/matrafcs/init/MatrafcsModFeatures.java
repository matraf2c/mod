
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.matrafcs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.matrafcs.world.features.ores.ZetopOreFeature;
import net.mcreator.matrafcs.world.features.ores.LipottOreFeature;
import net.mcreator.matrafcs.world.features.DonjonvolantFeature;
import net.mcreator.matrafcs.MatrafcsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MatrafcsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MatrafcsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ZETOP_ORE = register("zetop_ore", ZetopOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ZetopOreFeature.GENERATE_BIOMES, ZetopOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LIPOTT_ORE = register("lipott_ore", LipottOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LipottOreFeature.GENERATE_BIOMES, LipottOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DONJONVOLANT = register("donjonvolant", DonjonvolantFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.RAW_GENERATION, DonjonvolantFeature.GENERATE_BIOMES, DonjonvolantFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
