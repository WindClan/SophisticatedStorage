//package net.p3pp3rf1y.sophisticatedstorage.compat.sodium;
//
//import me.jellysquid.mods.sodium.client.model.vertex.buffer.VertexBufferWriter;
//import org.lwjgl.system.MemoryStack;
//
//import net.minecraft.client.renderer.MultiBufferSource;
//import net.p3pp3rf1y.sophisticatedstorage.client.render.TranslucentVertexConsumer;
//
//public class SodiumTranslucentVertexConsumer extends TranslucentVertexConsumer implements VertexBufferWriter {
//	public static void register() {
//		TranslucentVertexConsumer.setFactory(SodiumTranslucentVertexConsumer::new);
//	}
//
//	private final MultiBufferSource buffer;
//
//	public SodiumTranslucentVertexConsumer(MultiBufferSource buffer, int alpha) {
//		super(buffer, alpha);
//		this.buffer = buffer;
//	}
//
//	@Override
//	protected void onBufferStorageChanged() {
//	}
//
//	@Override
//	public void push(MemoryStack stack, long src, int count, VertexFormatDescription format) {
//		if (buffer instanceof VertexBufferWriter vertexBufferWriter) {
//			vertexBufferWriter.push(stack, src, count, format);
//		}
//	}
//}
