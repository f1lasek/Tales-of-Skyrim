package com.ombremoon.talesofskyrim.client.renderer.armor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.ombremoon.talesofskyrim.CommonClass;
import com.ombremoon.talesofskyrim.client.model.armor.SteelArmorModel;
import com.ombremoon.talesofskyrim.common.init.item.ArmorMaterialsInit;
import com.ombremoon.talesofskyrim.common.object.item.ModdedArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SteelArmorLayer<T extends LivingEntity, M extends HumanoidModel<T>> extends RenderLayer<T, M> {
    private static final ResourceLocation STEEL_LOCATION = CommonClass.customLocation("textures/entity/armor/steel_armor.png");
    private final SteelArmorModel<T> armorModel;

    public SteelArmorLayer(RenderLayerParent<T, M> pRenderer) {
        super(pRenderer);
        this.armorModel = new SteelArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(SteelArmorModel.LAYER_LOCATION));
    }

    @Override
    public void render(PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, T pLivingEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
        this.renderArmorPiece(pPoseStack, pBuffer, pLivingEntity, EquipmentSlot.HEAD, pPackedLight);
        this.renderArmorPiece(pPoseStack, pBuffer, pLivingEntity, EquipmentSlot.CHEST, pPackedLight);
        this.renderArmorPiece(pPoseStack, pBuffer, pLivingEntity, EquipmentSlot.LEGS, pPackedLight);
        this.renderArmorPiece(pPoseStack, pBuffer, pLivingEntity, EquipmentSlot.FEET, pPackedLight);
    }

    private void renderArmorPiece(PoseStack poseStack, MultiBufferSource bufferSource, T livingEntity, EquipmentSlot equipmentSlot, int packedLight) {
        ItemStack itemStack = livingEntity.getItemBySlot(equipmentSlot);
        Item item = itemStack.getItem();
        if (item instanceof ModdedArmor moddedArmor && moddedArmor.getArmorMaterial() == ArmorMaterialsInit.STEEL) {
            this.getParentModel().copyPropertiesTo(this.armorModel);
            this.setPartVisibility(this.armorModel, equipmentSlot);
            this.renderArmorModel(poseStack, bufferSource, livingEntity, packedLight, itemStack);
        }
    }

    private void renderArmorModel(PoseStack poseStack, MultiBufferSource bufferSource, T livingEntity, int packedLight, ItemStack itemStack) {
        poseStack.pushPose();
        this.copyPropertiesToModel(this.armorModel);
        this.armorModel.setupAnim(livingEntity, packedLight, packedLight, packedLight, packedLight, packedLight);
        VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(bufferSource, RenderType.armorCutoutNoCull(getArmorLocation()), false, itemStack.hasFoil());
        this.armorModel.renderToBuffer(poseStack, vertexconsumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        poseStack.popPose();
    }

    private void copyPropertiesToModel(SteelArmorModel<T> armorModel) {
        this.getParentModel().copyPropertiesTo(armorModel);
//        M playerModel = this.getParentModel();
//        armorModel.leftArmPose = playerModel.leftArmPose;
//        armorModel.rightArmPose = playerModel.rightArmPose;
//        armorModel.crouching = playerModel.crouching;
//        armorModel.helmet.copyFrom(playerModel.head);
//        armorModel.armor_body.copyFrom(playerModel.body);
//        armorModel.right_arm.copyFrom(playerModel.rightArm);
//        armorModel.left_arm.copyFrom(playerModel.leftArm);
//        armorModel.right_leg.copyFrom(playerModel.rightLeg);
//        armorModel.left_leg.copyFrom(playerModel.leftLeg);
//        this.armorModel.right_boot.copyFrom(this.armorModel.right_leg);
//        this.armorModel.left_boot.copyFrom(this.armorModel.left_leg);
    }

    protected void setPartVisibility(SteelArmorModel<T> pModel, EquipmentSlot pSlot) {
        pModel.setAllVisible(false);
        switch (pSlot) {
            case HEAD -> pModel.head.visible = true;
            case CHEST -> {
                pModel.body.visible = true;
                pModel.right_arm.visible = true;
                pModel.left_arm.visible = true;
            }
            case LEGS -> {
                pModel.leg.visible = true;
                pModel.leg2.visible = true;
            }
            case FEET -> {
                pModel.right_boot.visible = true;
                pModel.left_boot.visible = true;
            }
        }
    }

    public ResourceLocation getArmorLocation() {
        return STEEL_LOCATION;
    }
}