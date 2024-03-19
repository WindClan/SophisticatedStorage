package net.p3pp3rf1y.sophisticatedstorage.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.p3pp3rf1y.sophisticatedstorage.init.ModBlocks;

import static net.p3pp3rf1y.sophisticatedstorage.init.ModBlocks.BASE_TIER_WOODEN_STORAGE_TAG;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ItemTagProvider(FabricDataGenerator output, FabricTagProvider.BlockTagProvider blockTagProvider) {
		super(output, blockTagProvider);
	}

	@Override
	protected void generateTags() {
		getOrCreateTagBuilder(BASE_TIER_WOODEN_STORAGE_TAG).add(ModBlocks.BARREL_ITEM, ModBlocks.CHEST_ITEM);
	}
}
