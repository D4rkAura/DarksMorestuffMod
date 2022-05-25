package net.DarkAura.morestuff.world.feature;

import net.DarkAura.morestuff.DarksMoreStuffMod;
import net.DarkAura.morestuff.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
public class ModConfiguredFeatures {
        public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BLACK_CHERRY_TREE =
                ConfiguredFeatures.register("black_cherry_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.BLACK_CHERRY_LOG),
                        new StraightTrunkPlacer(5, 6, 3),
                        BlockStateProvider.of(ModBlocks.BLACK_CHERRY_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                        new TwoLayersFeatureSize(1, 0, 2)).build());

        public static final RegistryEntry<PlacedFeature> BLACK_CHERRY_CHECKED =
                PlacedFeatures.register("black_cherry_checked", BLACK_CHERRY_TREE,
                        PlacedFeatures.wouldSurvive(ModBlocks.BLACK_CHERRY_SAPLING));

        public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BLACK_CHERRY_SPAWN =
                ConfiguredFeatures.register("black_cherry_spawn", Feature.RANDOM_SELECTOR,
                        new RandomFeatureConfig(List.of(new RandomFeatureEntry(BLACK_CHERRY_CHECKED, 0.5f)),
                                BLACK_CHERRY_CHECKED));


        public static void registerConfiguredfeatures() {
            System.out.println("Registering ModConfiguredFeatures for " + DarksMoreStuffMod.MOD_ID);
        }
    }


