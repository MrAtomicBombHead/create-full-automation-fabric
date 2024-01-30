package net.donbarz.createmoreautomation;

import net.donbarz.createmoreautomation.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateMoreAutomation implements ModInitializer {

	public static final String MOD_ID = "createmoreautomation";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}