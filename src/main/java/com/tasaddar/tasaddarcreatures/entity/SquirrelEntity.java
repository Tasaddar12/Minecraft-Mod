package com.tasaddar.tasaddarcreatures.entity;

import com.tasaddar.tasaddarcreatures.init.InitEntities;

import net.minecraft.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.loot.LootTables;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nonnull;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class SquirrelEntity extends AnimalEntity {

  public SquirrelEntity(EntityType<? extends AnimalEntity> squirrel, World world) {
    super(squirrel, world);
    this.stepHeight = 1.0F;
  }

  @Override
  protected void registerGoals() {
    this.goalSelector.addGoal(0, new SwimGoal(this));
    this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 6.0F));
  }

  @Override
  public net.minecraft.util.SoundEvent getAmbientSound() {
    return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.sheep.ambient"));
  }

  @Override
  public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
    return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
  }

  @Override
  public net.minecraft.util.SoundEvent getDeathSound() {
    return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
  }

  @Override
  public void tick() {
    super.tick();
  }

  public static AttributeModifierMap.MutableAttribute getAttributes() {
    return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 8.0D).createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.16D);
  }

  public static boolean canEntitySpawn(EntityType<? extends AnimalEntity> animal, IWorld world, SpawnReason reason, BlockPos pos, Random random) {
    return world.getLightSubtracted(pos, 0) > 8;
  }

  @Override
  public AgeableEntity func_241840_a(@Nonnull ServerWorld world, @Nonnull AgeableEntity ageableEntity) {
    return InitEntities.SQUIRREL.get().create(this.world);
  }
}
