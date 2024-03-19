package net.p3pp3rf1y.sophisticatedstorage.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class DataGenerators implements DataGeneratorEntrypoint {
	public DataGenerators() {
	}

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator gen) {
		FabricTagProvider.BlockTagProvider blockTagProvider = new BlockTagProvider(gen);
		gen.addProvider(blockTagProvider);
		gen.addProvider((output) -> new ItemTagProvider(output, blockTagProvider));
		gen.addProvider(StorageBlockLootProvider::new);
		gen.addProvider(StorageRecipeProvider::new);
	}
}
