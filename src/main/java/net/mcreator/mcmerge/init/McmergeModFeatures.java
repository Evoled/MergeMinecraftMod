
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcmerge.init;

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

import net.mcreator.mcmerge.world.features.plants.MergegrassplantFeature;
import net.mcreator.mcmerge.world.features.plants.CherryplantFeature;
import net.mcreator.mcmerge.world.features.CherrytreeFeature;
import net.mcreator.mcmerge.McmergeMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class McmergeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, McmergeMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> MERGEGRASSPLANT = register("mergegrassplant", MergegrassplantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MergegrassplantFeature.GENERATE_BIOMES,
					MergegrassplantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CHERRYPLANT = register("cherryplant", CherryplantFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CherryplantFeature.GENERATE_BIOMES, CherryplantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CHERRYTREE = register("cherrytree", CherrytreeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, CherrytreeFeature.GENERATE_BIOMES, CherrytreeFeature::placedFeature));

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
