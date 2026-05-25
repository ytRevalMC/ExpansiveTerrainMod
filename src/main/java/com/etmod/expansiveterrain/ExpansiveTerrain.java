package com.etmod.expansiveterrain;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.MinecraftForge;

@Mod(ExpansiveTerrain.MODID)
public class ExpansiveTerrain {

    public static final String MODID = "expansiveterrain";

    public ExpansiveTerrain() {
        MinecraftForge.EVENT_BUS.register(this);
        System.out.println("Expansive Terrain Loaded");
    }
}