package net.DarkAura.morestuff.item.custom;

import net.DarkAura.morestuff.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class JutePlant extends CropBlock {
    public JutePlant(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.JUTE_SEEDS;
    }
}
