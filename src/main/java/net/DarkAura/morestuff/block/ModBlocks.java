package net.DarkAura.morestuff.block;

import net.DarkAura.morestuff.DarksMoreStuffMod;
import net.DarkAura.morestuff.item.ModItemGroup;
import net.DarkAura.morestuff.item.custom.JutePlant;
import net.DarkAura.morestuff.item.custom.ModSaplingBlock;
import net.DarkAura.morestuff.world.feature.tree.BlackCherrySaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block COBALT_BLOCK = registerBlock("cobalt_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.COBALT);

    public static final Block JUTE_PLANT = registerBlockWithoutBlockItem("jute_plant",
            new JutePlant(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()), ModItemGroup.FOODEXPANSION);

    public static final Block BLACK_CHERRY_LOG = registerBlock("black_cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.FOODEXPANSION);

    public static final Block BLACK_CHERRY_WOOD = registerBlock("black_cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.FOODEXPANSION);

    public static final Block STRIPPED_BLACK_CHERRY_LOG = registerBlock("stripped_black_cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.FOODEXPANSION);

    public static final Block STRIPPED_BLACK_CHERRY_WOOD = registerBlock("stripped_black_cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.FOODEXPANSION);

    public static final Block BLACK_CHERRY_PLANKS = registerBlock("black_cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.FOODEXPANSION);

    public static final Block BLACK_CHERRY_LEAVES = registerBlock("black_cherry_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.FOODEXPANSION);

    public static final Block BLACK_CHERRY_SAPLING = registerBlock("black_cherry_sapling",
            new ModSaplingBlock(new BlackCherrySaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.FOODEXPANSION);




    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(DarksMoreStuffMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(DarksMoreStuffMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        DarksMoreStuffMod.LOGGER.info("Registering ModBlocks for " + DarksMoreStuffMod.MOD_ID);

    }
    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.BLOCK, new  Identifier(DarksMoreStuffMod.MOD_ID, name), block);
    }
}
