package net.p3pp3rf1y.sophisticatedstorage.client.util;

import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;

public class QuaternionHelper {
    public static Quaternion quatFromXYZDegree(Vector3f xyz, boolean degrees) {
		return new Quaternion(xyz.x(), xyz.y(), xyz.z(), degrees);
    }
}
