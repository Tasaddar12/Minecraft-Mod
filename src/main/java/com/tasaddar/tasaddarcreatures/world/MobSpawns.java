package com.tasaddar.tasaddarcreatures.world;

import com.tasaddar.tasaddarcreatures.init.InitEntities;
import com.tasaddar.tasaddarcreatures.entity.*;
import com.tasaddar.tasaddarcreatures.common.EntityConfig;
import com.tasaddar.tasaddarcreatures.common.ServerConfig.MainConfig;

import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.World;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.MobSpawnInfo.Spawners;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class MobSpawns {
  @SubscribeEvent
  public void spawnMobs(BiomeLoadingEvent event) {
    checkBiomeForEntity(event, MainConfig.SQUIRREL_CONFIG, InitEntities.SQUIRREL.get(), EntityClassification.CREATURE, 100, 4, 6);

  }

  private static void checkBiomeForEntity(BiomeLoadingEvent event, EntityConfig config, EntityType<? extends Entity> entity, EntityClassification classification, int weight, int min, int max) {
    if (!config.spawnBiomes.contains(event.getName().toString())) {
      event.getSpawns().getSpawner(classification).add(new MobSpawnInfo.Spawners(entity, weight, min, max));
    }
  }

  public static void entitySpawnPlacementRegistry() {
    EntitySpawnPlacementRegistry.register(InitEntities.SQUIRREL.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SquirrelEntity::canEntitySpawn);
  }
}
