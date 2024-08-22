package net.purejosh.purediscslofi;

import net.fabricmc.api.ModInitializer;
import net.purejosh.purediscslofi.item.ModItemGroups;
import net.purejosh.purediscslofi.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PureDiscsLofi implements ModInitializer {
	public static final String MOD_ID = "purediscslofi";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This is the log line that gets printed when the mod is loaded.
		LOGGER.info("Pure Discs - Lofi Edition by purejosh has been loaded!");
		// Now, I call the init methods in the registry classes.
		ModItems.init();
		ModItemGroups.init();
	}
}