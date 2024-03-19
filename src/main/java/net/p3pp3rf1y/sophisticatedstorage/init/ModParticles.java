package net.p3pp3rf1y.sophisticatedstorage.init;

import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.p3pp3rf1y.sophisticatedstorage.SophisticatedStorage;
import net.p3pp3rf1y.sophisticatedstorage.client.particle.CustomTintTerrainParticleData;

public class ModParticles {
	private ModParticles() {}

	public static final CustomTintTerrainParticleData TERRAIN_PARTICLE = register("terrain_particle", new CustomTintTerrainParticleData());

	public static <T extends ParticleType<?>> T register(String id, T value) {
		return Registry.register(Registry.PARTICLE_TYPE, SophisticatedStorage.getRL(id), value);
	}

	public static void registerParticles() {
	}

}
