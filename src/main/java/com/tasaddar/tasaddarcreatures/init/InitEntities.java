package com.tasaddar.tasaddarcreatures.init;

import com.tasaddar.tasaddarcreatures.entity.*;
import com.tasaddar.tasaddarcreatures.items.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry.PlacementType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;


import  com.tasaddar.tasaddarcreatures.Utils;

public class InitEntities {

  public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Utils.MOD_ID);

  public static final RegistryObject<EntityType<SquirrelEntity>> SQUIRREL = ENTITIES.register("squirrel", () -> EntityType.Builder.create(SquirrelEntity::new, EntityClassification.CREATURE).size(.5f, .5f).setUpdateInterval(1).build(new ResourceLocation(Utils.MOD_ID, "squirrel").toString()));

  //public static final RegistryObject<ModSpawnEggItem> SQUIRREL_SPAWN_EGG = ITEMS.register("squirrel_spawn_egg", () -> new ModSpawnEggItem(SQUIRREL, 0x00000000, 0xFFFFFFFF, builder()));



  private static <T extends Entity> EntityType<T> createStandardEntityType(String entity_name, EntityType.IFactory<T> factory, EntityClassification classification, float width, float height) {
	   return EntityType.Builder.create(factory, classification).size(width, height).build(entity_name);
	}

  public static void registerEntityAttributes() {
    GlobalEntityTypeAttributes.put(SQUIRREL.get(), SquirrelEntity.getAttributes().create());
  }

  public static void registerEntitySpawns() {
    EntitySpawnPlacementRegistry.register(SQUIRREL.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
  }

  public static void addToBiomes() {

  }
}
