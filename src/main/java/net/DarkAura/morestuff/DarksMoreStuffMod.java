package net.DarkAura.morestuff;

import net.DarkAura.morestuff.block.ModBlocks;
import net.DarkAura.morestuff.item.ModItems;
import net.DarkAura.morestuff.util.ModRegistries;
import net.DarkAura.morestuff.world.feature.ModConfiguredFeatures;
import net.DarkAura.morestuff.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarksMoreStuffMod implements ModInitializer {
	public static final String MOD_ID = "morestuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredfeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();
	}

}
