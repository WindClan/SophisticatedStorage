package net.p3pp3rf1y.sophisticatedstorage.compat.litematica.mixin;

import fi.dy.masa.litematica.materials.MaterialListUtils;
import fi.dy.masa.malilib.util.ItemType;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageView;
import net.minecraft.world.Container;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.p3pp3rf1y.sophisticatedstorage.block.StorageBlockBase;
import net.p3pp3rf1y.sophisticatedstorage.common.CapabilityStorageWrapper;

@Mixin(MaterialListUtils.class)
public class MaterialListUtilsMixin {
	@Inject(method = "getInventoryItemCounts", at = @At(value = "INVOKE", target = "Lit/unimi/dsi/fastutil/objects/Object2IntOpenHashMap;addTo(Ljava/lang/Object;I)I", ordinal = 0, shift = At.Shift.AFTER, remap = false), locals = LocalCapture.CAPTURE_FAILHARD)
	private static void sophisticatedStorage$injectStorageBlockBase(Container inv, CallbackInfoReturnable<Object2IntOpenHashMap<ItemType>> cir, Object2IntOpenHashMap<ItemType> map, int slots, int slot, ItemStack stack) {
		if (stack.getItem() instanceof BlockItem &&
				((BlockItem) stack.getItem()).getBlock() instanceof StorageBlockBase) {
			CapabilityStorageWrapper.get(stack).ifPresent(wrapper -> {
				for (StorageView<ItemVariant> view : wrapper.getInventoryHandler().nonEmptyViews()) {
					map.addTo(new ItemType(view.getResource().toStack((int) view.getAmount()), true, false), (int)view.getAmount());
				}
			});
		}
	}
}
