package net.p3pp3rf1y.sophisticatedstorage.mixin.common.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;

@Mixin(BarrelBlockEntity.class)
public interface BarrelBlockEntityAccessor {
	@Accessor
	ContainerOpenersCounter getOpenersCounter();
}
