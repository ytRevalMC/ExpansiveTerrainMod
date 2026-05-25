package com.etmod.expansiveterrain.world;

public class TerrainNoise {

    public static double modify(double base, double erosion, double peaks) {

        double continents = base * 2.8D;
        double mountains = Math.pow(Math.abs(peaks), 1.45D) * 2.2D;
        double valleys = -(Math.pow(Math.abs(erosion), 1.2D) * 1.7D);
        double detail = Math.sin(base * 15D) * 0.5D;

        return continents + mountains + valleys + detail;
    }
}