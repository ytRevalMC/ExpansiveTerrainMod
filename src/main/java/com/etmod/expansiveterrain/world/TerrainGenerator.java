package com.etmod.expansiveterrain.world;

public class TerrainGenerator {

    public static final int WORLD_HEIGHT = 256;

    public static double terrainHeight(double noise) {

        noise *= 1.8D;

        if(noise > 0.5D) {
            noise *= 1.4D;
        }

        if(noise < -0.3D) {
            noise *= 1.2D;
        }

        return noise;
    }
}