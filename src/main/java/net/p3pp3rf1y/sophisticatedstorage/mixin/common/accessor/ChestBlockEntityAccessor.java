package net.p3pp3rf1y.sophisticatedstorage.mixin.common.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;

@Mixin(ChestBlockEntity.class)
public interface ChestBlockEntityAccessor {
	@Accessor
	ContainerOpenersCounter getOpenersCounter();
}
