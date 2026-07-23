package com.potato328.portalmodexpanded.client.renderer.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CameraHeadP2Model extends EntityModel<Entity> {
	private final ModelRenderer bone2;

	public CameraHeadP2Model() {
		texWidth = 32;
		texHeight = 32;

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, 24.0F, 0.0F);
		bone2.texOffs(0, 0).addBox(-4.0F, -9.0F, -2.5F, 8.0F, 5.0F, 5.0F, 0.0F, false);
		bone2.texOffs(0, 11).addBox(3.5F, -8.5F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		bone2.texOffs(0, 22).addBox(-4.25F, -9.0F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);
		bone2.texOffs(10, 16).addBox(0.0F, -7.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}