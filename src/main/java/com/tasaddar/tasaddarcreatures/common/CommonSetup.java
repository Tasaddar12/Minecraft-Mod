package com.tasaddar.tasaddarcreatures.common;

import com.tasaddar.tasaddarcreatures.entity.*;
import com.tasaddar.tasaddarcreatures.entity.renderer.*;
import com.tasaddar.tasaddarcreatures.init.InitEntities;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class CommonSetup {
  public static void onCommonSetup(FMLCommonSetupEvent event) {
    event.enqueueWork(CommonSetup::afterCommonSetup);
  }

  public static void afterCommonSetup() {
    GlobalEntityTypeAttributes.put(InitEntities.SQUIRREL.get(), SquirrelEntity.getAttributes().create());

    EntitySpawnPlacementRegistry.register(InitEntities.SQUIRREL.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);

    //RenderingRegistry.registerEntityRenderingHandler(InitEntities.SQUIRREL.get(), SquirrelRenderer::new);
  }
}
