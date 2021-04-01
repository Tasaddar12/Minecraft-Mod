package com.tasaddar.tasaddarcreatures.common;

import com.tasaddar.tasaddarcreatures.Utils;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;

import com.google.common.collect.Lists;

import org.apache.commons.lang3.tuple.Pair;

public class ServerConfig {

  public static final MainConfig COMMON;
  public static final ForgeConfigSpec COMMON_SPEC;

  static
  {
    final Pair<MainConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(MainConfig::new);
    COMMON_SPEC = specPair.getRight();
    COMMON = specPair.getLeft();
  }

  public static class MainConfig {
    public static EntityConfig SQUIRREL_CONFIG;

    public MainConfig(ForgeConfigSpec.Builder builder) {
      builder.push(Utils.MOD_ID).comment("Tasaddars Creatures");
      builder.push(Utils.MOD_ID + "_entity").comment("Tasaddars Creatures Entity Config");

      SQUIRREL_CONFIG = EntityConfig.createConfigForEntity(builder, "squirrel", true, 30, Lists.newArrayList("minecraft:swamp", "minecraft:plains", "minecraft:forest"));

      builder.pop();
    }
  }

  public static void bakeConfig() {
    MainConfig.SQUIRREL_CONFIG.bake();
  }

  @SubscribeEvent
  public static void onModConfigEvent(final ModConfig.ModConfigEvent configEvent) {
    bakeConfig();
  }
}
