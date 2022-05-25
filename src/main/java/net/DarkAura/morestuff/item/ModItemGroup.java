package net.DarkAura.morestuff.item;

import net.DarkAura.morestuff.DarksMoreStuffMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup COBALT = FabricItemGroupBuilder.build(new Identifier(DarksMoreStuffMod.MOD_ID, "cobalt"),
            () -> new ItemStack(ModItems.COBALT_INGOT));
    public static final ItemGroup SILVER = FabricItemGroupBuilder.build(new Identifier(DarksMoreStuffMod.MOD_ID, "silver"),
            () -> new ItemStack(ModItems.SILVER_INGOT));
    public static final ItemGroup ENDEREXPANSION = FabricItemGroupBuilder.build(new Identifier(DarksMoreStuffMod.MOD_ID, "enderexpansion"),
            () -> new ItemStack(ModItems.DRAGON_SCALE));
    public static final ItemGroup FOODEXPANSION = FabricItemGroupBuilder.build(new Identifier(DarksMoreStuffMod.MOD_ID, "foodexpansion"),
            () -> new ItemStack(ModItems.COOKED_BACON));

    public static final ItemGroup WEAPONEXPANSION = FabricItemGroupBuilder.build(new Identifier(DarksMoreStuffMod.MOD_ID, "weaponexpansion"),
            () -> new ItemStack(ModItems.AMETHYST_DAGGER));

}
