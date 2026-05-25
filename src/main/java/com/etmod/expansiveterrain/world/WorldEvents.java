package com.etmod.expansiveterrain.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class WorldEvents {

    @SubscribeEvent
    public static void biomeLoading(BiomeLoadingEvent event) {

        System.out.println(
            "Loading biome terrain: " +
            event.getName()
        );
    }
}