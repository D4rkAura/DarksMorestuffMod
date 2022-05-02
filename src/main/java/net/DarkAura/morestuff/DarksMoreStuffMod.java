package net.DarkAura.morestuff;

import net.DarkAura.morestuff.block.ModBlocks;
import net.DarkAura.morestuff.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarksMoreStuffMod implements ModInitializer {
	public static final String MOD_ID = "morestuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
