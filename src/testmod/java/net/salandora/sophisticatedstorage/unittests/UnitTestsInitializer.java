package net.salandora.sophisticatedstorage.unittests;

import net.fabricmc.api.ModInitializer;

import org.slf4j.LoggerFactory;

public class UnitTestsInitializer implements ModInitializer {
	@Override
	public void onInitialize() {


		LoggerFactory.getLogger("sophisticatedstorage testmod").info("SophisticatedStorage unit tests successful.");
	}
}
