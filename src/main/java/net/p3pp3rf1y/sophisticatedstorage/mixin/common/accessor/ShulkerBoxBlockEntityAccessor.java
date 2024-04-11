package net.p3pp3rf1y.sophisticatedstorage.mixin.common.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity;

@Mixin(ShulkerBoxBlockEntity.class)
public interface ShulkerBoxBlockEntityAccessor {
	@Accessor
	int getOpenCount();
}
