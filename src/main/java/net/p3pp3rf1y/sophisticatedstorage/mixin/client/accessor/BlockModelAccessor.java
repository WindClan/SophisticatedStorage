package net.p3pp3rf1y.sophisticatedstorage.mixin.client.accessor;

import com.mojang.datafixers.util.Either;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.client.resources.model.Material;

import java.util.Map;

@Mixin(BlockModel.class)
public interface BlockModelAccessor {
	@Accessor
	Map<String, Either<Material, String>> getTextureMap();
}
