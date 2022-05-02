package net.DarkAura.morestuff.item;

import net.DarkAura.morestuff.DarksMoreStuffMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup COBALT = FabricItemGroupBuilder.build(new Identifier(DarksMoreStuffMod.MOD_ID, "cobalt"),
            () -> new ItemStack(ModItems.COBALT_INGOT));
}
