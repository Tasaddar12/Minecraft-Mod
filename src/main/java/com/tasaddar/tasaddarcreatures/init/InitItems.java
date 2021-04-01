package com.tasaddar.tasaddarcreatures.init;

import com.tasaddar.tasaddarcreatures.TasaddarCreatures;
import com.tasaddar.tasaddarcreatures.items.*;
import com.tasaddar.tasaddarcreatures.Utils;

import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.tasaddar.tasaddarcreatures.TasaddarCreatures.GROUP;

public class InitItems {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

  public static RegistryObject<ModSpawnEggItem> SQUIRREL_SPAWN_EGG = ITEMS.register("squirrel_spawn_egg", () -> new ModSpawnEggItem(InitEntities.SQUIRREL, 0x00FFFFFF, 0x00FFFFFF, builder()));

  public static Item.Properties builder() {
    return new Item.Properties().group(GROUP);
  }
}
