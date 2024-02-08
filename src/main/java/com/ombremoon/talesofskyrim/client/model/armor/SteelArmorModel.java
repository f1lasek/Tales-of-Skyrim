package com.ombremoon.talesofskyrim.client.model.armor;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.ombremoon.talesofskyrim.CommonClass;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class SteelArmorModel<T extends LivingEntity> extends HumanoidModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(CommonClass.customLocation("steel_armor"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart leg;
	public final ModelPart leg2;
	public final ModelPart right_boot;
	public final ModelPart left_boot;

	public SteelArmorModel(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.leg = left_leg.getChild("leg");
		this.leg2 = right_leg.getChild("leg2");
		this.left_boot = left_leg.getChild("left_boot");
		this.right_boot = right_leg.getChild("right_boot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = createArmorMesh();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.25F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 52).addBox(-4.0F, 5.5F, -2.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.75F))
		.texOffs(0, 16).addBox(-4.5F, 1.75F, -2.75F, 9.0F, 6.0F, 5.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition belt = body.addOrReplaceChild("belt", CubeListBuilder.create().texOffs(0, 31).addBox(-3.95F, -14.5F, -2.45F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 24.0F, -0.25F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(26, 10).mirror().addBox(-1.0F, -0.5F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.75F)).mirror(false)
		.texOffs(46, 11).mirror().addBox(-0.5F, 1.75F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(26, 10).addBox(-3.0F, -0.5F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.75F))
		.texOffs(46, 11).addBox(-2.5F, 1.75F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.75F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition left_boot = left_leg.addOrReplaceChild("left_boot", CubeListBuilder.create().texOffs(24, 53).mirror().addBox(0.15F, -10.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offset(-1.9F, 15.0F, 0.0F));

		PartDefinition leg = left_leg.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.65F, 3.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg_r1 = leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(16, 41).mirror().addBox(-3.35F, 0.75F, -2.5F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offsetAndRotation(2.85F, 0.75F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition right_boot = right_leg.addOrReplaceChild("right_boot", CubeListBuilder.create().texOffs(24, 53).addBox(-4.05F, -10.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(1.9F, 15.0F, 0.0F));

		PartDefinition leg2 = right_leg.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 41).addBox(-2.35F, 3.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_leg_r1 = leg2.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(16, 41).addBox(0.35F, 0.75F, -2.5F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.75F)), PartPose.offsetAndRotation(-2.85F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0436F));

		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offsetAndRotation(-0, -0, -0, 0, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public static MeshDefinition createArmorMesh() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.25F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 52).addBox(-4.0F, 5.5F, -2.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.75F))
				.texOffs(0, 16).addBox(-4.5F, 1.75F, -2.75F, 9.0F, 6.0F, 5.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition belt = body.addOrReplaceChild("belt", CubeListBuilder.create().texOffs(0, 31).addBox(-3.95F, -14.5F, -2.45F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 24.0F, -0.25F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(26, 10).mirror().addBox(-1.0F, -0.5F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.75F)).mirror(false)
				.texOffs(46, 11).mirror().addBox(-0.5F, 1.75F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(26, 10).addBox(-3.0F, -0.5F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.75F))
				.texOffs(46, 11).addBox(-2.5F, 1.75F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.75F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition left_boot = partdefinition.addOrReplaceChild("left_boot", CubeListBuilder.create().texOffs(24, 53).mirror().addBox(0.15F, -10.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offset(-1.9F, 15.0F, 0.0F));

		PartDefinition leg = partdefinition.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.65F, 3.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg_r1 = leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(16, 41).mirror().addBox(-3.35F, 0.75F, -2.5F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offsetAndRotation(2.85F, 0.75F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition right_boot = partdefinition.addOrReplaceChild("right_boot", CubeListBuilder.create().texOffs(24, 53).addBox(-4.05F, -10.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(1.9F, 15.0F, 0.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 41).addBox(-2.35F, 3.0F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_leg_r1 = leg2.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(16, 41).addBox(0.35F, 0.75F, -2.5F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.75F)), PartPose.offsetAndRotation(-2.85F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0436F));

		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offsetAndRotation(-0, -0, -0, 0, 0.0F, 0.0F));

		return meshdefinition;
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}