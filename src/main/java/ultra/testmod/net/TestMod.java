package ultra.testmod.net;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ultra.testmod.net.item.ModItems;


public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";

	// Mod Logger
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
