package com.tasaddar.tasaddarcreatures.entity.model;

import com.tasaddar.tasaddarcreatures.entity.SquirrelEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SquirrelModel extends EntityModel<SquirrelEntity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer body2_r1;
	private final ModelRenderer belly_r1;
	private final ModelRenderer tail;
	private final ModelRenderer body8_r1;
	private final ModelRenderer body5_r1;
	private final ModelRenderer body4_r1;
	private final ModelRenderer body3_r1;
	private final ModelRenderer head;
	private final ModelRenderer neck_r1;
	private final ModelRenderer ear1;
	private final ModelRenderer tip_r1;
	private final ModelRenderer ear2;
	private final ModelRenderer tip_r2;
	private final ModelRenderer legs;
	private final ModelRenderer frontleftleg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer frontrightleg;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer backleftleg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer backrightleg;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public SquirrelModel() {
		textureWidth = 32;
		textureHeight = 32;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 24.0F, 0.0F);


		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -5.0F, 0.0F);
		main.addChild(body);
		body.setTextureOffset(3, 23).addBox(-3.0F, -2.0F, -5.5F, 5.0F, 3.0F, 6.0F, 0.0F, false);

		body2_r1 = new ModelRenderer(this);
		body2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body2_r1);
		setRotationAngle(body2_r1, -0.3054F, 0.0F, 0.0F);
		body2_r1.setTextureOffset(3, 23).addBox(-3.0F, -2.0F, -0.25F, 5.0F, 3.0F, 6.0F, 0.0F, false);

		belly_r1 = new ModelRenderer(this);
		belly_r1.setRotationPoint(0.0F, 4.0F, -1.0F);
		body.addChild(belly_r1);
		setRotationAngle(belly_r1, -0.1745F, 0.0F, 0.0F);
		belly_r1.setTextureOffset(0, 10).addBox(-2.5F, -4.25F, -4.25F, 4.0F, 2.0F, 10.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 1.25F, 5.25F);
		body.addChild(tail);

		body8_r1 = new ModelRenderer(this);
		body8_r1.setRotationPoint(0.0F, -1.0F, 2.0F);
		tail.addChild(body8_r1);
		setRotationAngle(body8_r1, 2.2689F, 0.0F, 0.0F);
		body8_r1.setTextureOffset(3, 23).addBox(-1.5F, 0.2354F, 8.2727F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body8_r1.setTextureOffset(3, 23).addBox(-2.0F, 0.2354F, 6.2727F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		body8_r1.setTextureOffset(3, 23).addBox(-2.5F, 0.2354F, 2.7727F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		body5_r1 = new ModelRenderer(this);
		body5_r1.setRotationPoint(0.0F, -1.0F, 2.0F);
		tail.addChild(body5_r1);
		setRotationAngle(body5_r1, 1.8762F, 0.0F, 0.0F);
		body5_r1.setTextureOffset(3, 23).addBox(-2.5F, -1.0646F, 0.7727F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		body4_r1 = new ModelRenderer(this);
		body4_r1.setRotationPoint(0.0F, -1.0F, 2.0F);
		tail.addChild(body4_r1);
		setRotationAngle(body4_r1, 1.1781F, 0.0F, 0.0F);
		body4_r1.setTextureOffset(3, 23).addBox(-2.5F, -1.9646F, -1.1273F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		body3_r1 = new ModelRenderer(this);
		body3_r1.setRotationPoint(0.0F, -1.25F, -5.25F);
		tail.addChild(body3_r1);
		setRotationAngle(body3_r1, 0.3491F, 0.0F, 0.0F);
		body3_r1.setTextureOffset(18, 23).addBox(-2.5F, 1.25F, 3.75F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.0F, -5.6F);
		main.addChild(head);
		head.setTextureOffset(14, 0).addBox(-2.0F, -1.5F, -5.9F, 3.0F, 3.0F, 6.0F, 0.0F, false);

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(0.0F, 1.0F, 0.6F);
		head.addChild(neck_r1);
		setRotationAngle(neck_r1, -0.2182F, 0.0F, 0.0F);
		neck_r1.setTextureOffset(7, 27).addBox(-2.5F, -2.25F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		ear1 = new ModelRenderer(this);
		ear1.setRotationPoint(0.0F, 1.0F, 0.6F);
		head.addChild(ear1);

		tip_r1 = new ModelRenderer(this);
		tip_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		ear1.addChild(tip_r1);
		setRotationAngle(tip_r1, 0.0F, 1.5708F, 0.0F);
		tip_r1.setTextureOffset(28, 7).addBox(1.25F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		tip_r1.setTextureOffset(26, 6).addBox(0.75F, -4.5F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		ear2 = new ModelRenderer(this);
		ear2.setRotationPoint(2.0F, 1.0F, 0.6F);
		head.addChild(ear2);

		tip_r2 = new ModelRenderer(this);
		tip_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		ear2.addChild(tip_r2);
		setRotationAngle(tip_r2, 0.0F, 1.5708F, 0.0F);
		tip_r2.setTextureOffset(28, 7).addBox(1.25F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		tip_r2.setTextureOffset(26, 6).addBox(0.75F, -4.5F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(legs);

		frontleftleg = new ModelRenderer(this);
		frontleftleg.setRotationPoint(1.25F, -3.75F, -2.75F);
		legs.addChild(frontleftleg);
		frontleftleg.setTextureOffset(0, 0).addBox(0.0F, -2.25F, -1.25F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.75F, 2.25F, -0.75F);
		frontleftleg.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-0.75F, -0.4805F, -1.0932F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.75F, 0.75F, -0.25F);
		frontleftleg.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-0.75F, -0.5F, -1.15F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		frontrightleg = new ModelRenderer(this);
		frontrightleg.setRotationPoint(-2.5F, -5.0F, -2.75F);
		legs.addChild(frontrightleg);
		frontrightleg.setTextureOffset(0, 0).addBox(-0.75F, -1.0F, -1.25F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 3.5F, -0.75F);
		frontrightleg.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-0.75F, -0.4805F, -1.0932F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 2.0F, -0.25F);
		frontrightleg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3491F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(-0.75F, -0.5F, -1.15F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		backleftleg = new ModelRenderer(this);
		backleftleg.setRotationPoint(1.75F, -3.25F, 2.75F);
		legs.addChild(backleftleg);


		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.25F, 1.75F, -0.25F);
		backleftleg.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-0.75F, -0.4805F, -1.0932F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.25F, 0.25F, 0.25F);
		backleftleg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 0).addBox(-0.75F, -0.5F, -1.15F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		backrightleg = new ModelRenderer(this);
		backrightleg.setRotationPoint(-3.0F, -3.0F, 3.0F);
		legs.addChild(backrightleg);


		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 1.5F, -0.5F);
		backrightleg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 0).addBox(-0.75F, -0.4805F, -1.0932F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, 0.0F, 0.0F);
		backrightleg.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3491F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 0).addBox(-0.75F, -0.5F, -1.15F, 1.0F, 2.0F, 2.0F, 0.0F, false);
	}


	@Override
	public void setRotationAngles(SquirrelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}
	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		main.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	//@Override
	private void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
