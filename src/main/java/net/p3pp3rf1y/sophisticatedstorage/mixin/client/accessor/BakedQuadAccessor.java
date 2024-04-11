package net.p3pp3rf1y.sophisticatedstorage.mixin.client.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.core.Direction;

@Mixin(BakedQuad.class)
public interface BakedQuadAccessor {
	@Accessor
	void setDirection(Direction direction);

	@Accessor
	int getTintIndex();

	@Accessor
	void setTintIndex(int tintIndex);
}
