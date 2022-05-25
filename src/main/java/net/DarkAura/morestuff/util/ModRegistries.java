package net.DarkAura.morestuff.util;

import net.DarkAura.morestuff.DarksMoreStuffMod;
import net.DarkAura.morestuff.block.ModBlocks;
import net.DarkAura.morestuff.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerFlammableBlock();
        registerStrippables();


    }
    private static void  registerFuels() {
        DarksMoreStuffMod.LOGGER.info("Registering Fuels for " + DarksMoreStuffMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        }
    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.BLACK_CHERRY_LOG, ModBlocks.STRIPPED_BLACK_CHERRY_LOG);
        StrippableBlockRegistry.register(ModBlocks.BLACK_CHERRY_WOOD, ModBlocks.STRIPPED_BLACK_CHERRY_WOOD);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.BLACK_CHERRY_LOG, 5, 5);
        instance.add(ModBlocks.BLACK_CHERRY_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_BLACK_CHERRY_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_BLACK_CHERRY_WOOD, 5, 5);
        instance.add(ModBlocks.BLACK_CHERRY_PLANKS, 5, 20);
        instance.add(ModBlocks.BLACK_CHERRY_LEAVES, 30, 60);

    }

}
