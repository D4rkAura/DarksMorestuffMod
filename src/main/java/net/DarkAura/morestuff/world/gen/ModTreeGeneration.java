package net.DarkAura.morestuff.world.gen;

import net.DarkAura.morestuff.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST),
        GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLACK_CHERRY_PLACED.getKey().get());
    }
}
