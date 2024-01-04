package net.william.enderupdate;

import net.fabricmc.api.ModInitializer;

import net.william.enderupdate.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnderUpdate implements ModInitializer {
	public static final String MOD_ID = "enderupdate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}