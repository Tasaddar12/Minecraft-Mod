package com.tasaddar.tasaddarcreatures.entity.renderer;

import com.tasaddar.tasaddarcreatures.entity.model.SquirrelModel;
import com.tasaddar.tasaddarcreatures.entity.SquirrelEntity;
import com.tasaddar.tasaddarcreatures.Utils;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class SquirrelRenderer extends MobRenderer<SquirrelEntity, SquirrelModel> {

  private static final ResourceLocation TEXTURE = new ResourceLocation(Utils.MOD_ID, "textures/entity/squirrel.png");

  public SquirrelRenderer(EntityRendererManager renderManager) {
    super(renderManager, new SquirrelModel(), 0.5F);
  }

  @Override
  @Nonnull
  public ResourceLocation getEntityTexture(@Nonnull SquirrelEntity squirrel) {
    return TEXTURE;
  }

}
