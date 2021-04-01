package com.tasaddar.tasaddarcreatures.common;

import com.tasaddar.tasaddarcreatures.init.InitEntities;
import com.tasaddar.tasaddarcreatures.entity.renderer.*;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
  public static void registerEntityRenders() {
    RenderingRegistry.registerEntityRenderingHandler(InitEntities.SQUIRREL.get(), SquirrelRenderer::new);
  }
}
