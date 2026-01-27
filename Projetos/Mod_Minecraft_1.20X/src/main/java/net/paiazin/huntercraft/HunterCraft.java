package net.paiazin.huntercraft;

import net.fabricmc.api.ModInitializer;

import net.paiazin.huntercraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HunterCraft implements ModInitializer {
	public static final String MOD_ID = "huntercraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}