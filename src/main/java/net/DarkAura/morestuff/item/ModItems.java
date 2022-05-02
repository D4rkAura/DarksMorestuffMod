package net.DarkAura.morestuff.item;

import net.DarkAura.morestuff.DarksMoreStuffMod;
import net.DarkAura.morestuff.item.custom.ModAxeItem;
import net.DarkAura.morestuff.item.custom.ModHoeItem;
import net.DarkAura.morestuff.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item COBALT_INGOT = registerItem( "cobalt_ingot",
         new Item(new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_NUGGET = registerItem( "cobalt_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_ALLOY = registerItem( "cobalt_alloy",
            new Item(new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_SWORD = registerItem( "cobalt_sword",
            new SwordItem(ModToolMaterials.COBALT, 5, 0f,
                    new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_AXE = registerItem( "cobalt_axe",
            new ModAxeItem(ModToolMaterials.COBALT, 6, 0f,
                    new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_HOE = registerItem( "cobalt_hoe",
            new ModHoeItem(ModToolMaterials.COBALT, 1, 0f,
                    new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_SHOVEL = registerItem( "cobalt_shovel",
            new ShovelItem(ModToolMaterials.COBALT, 1, 0f,
                    new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_PICKAXE = registerItem( "cobalt_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COBALT, 1, 0f,
                    new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_HELMET = registerItem( "cobalt_helmet",
            new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_CHESTPLATE = registerItem( "cobalt_chestplate",
            new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_LEGGINGS = registerItem( "cobalt_leggings",
            new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.COBALT)));

    public static final Item COBALT_BOOTS = registerItem( "cobalt_boots",
            new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.COBALT)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(DarksMoreStuffMod.MOD_ID, name), item);

    }
    public static void registerModItems(){
        DarksMoreStuffMod.LOGGER.info("Registering Mod Items for " + DarksMoreStuffMod.MOD_ID);

    }

}
