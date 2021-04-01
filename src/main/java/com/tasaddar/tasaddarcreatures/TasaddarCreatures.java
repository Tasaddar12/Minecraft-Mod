package com.tasaddar.tasaddarcreatures;

import com.tasaddar.tasaddarcreatures.init.InitEntities;
import com.tasaddar.tasaddarcreatures.init.InitItems;
import com.tasaddar.tasaddarcreatures.entity.renderer.*;
import com.tasaddar.tasaddarcreatures.common.ServerConfig;
import com.tasaddar.tasaddarcreatures.world.MobSpawns;
import com.tasaddar.tasaddarcreatures.entity.*;
import com.tasaddar.tasaddarcreatures.common.RenderHandler;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.DistExecutor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Utils.MOD_ID)
public final class TasaddarCreatures {

  public void TasaddarCreatures() {
    ModLoadingContext.get().registerConfig(Type.COMMON, ServerConfig.COMMON_SPEC);

    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    bus.addListener(this::setup);

    InitEntities.ENTITIES.register(bus);
    InitItems.ITEMS.register(bus);

    MinecraftForge.EVENT_BUS.register(this);
  }

  private void setup(final FMLCommonSetupEvent event) {
    // Set Attributes
    event.enqueueWork(() -> {
      GlobalEntityTypeAttributes.put(InitEntities.SQUIRREL.get(), SquirrelEntity.getAttributes().create());
    });
    // Register Spawn Placement Settings
    MobSpawns.entitySpawnPlacementRegistry();
    RenderHandler.registerEntityRenders();
  }

  public static final ItemGroup GROUP = new ItemGroup("tasaddarcreatures_tab") {
    @Override
    public ItemStack createIcon() {
      return new ItemStack(Items.LEAD, (int) (1));
    }
  };
}
