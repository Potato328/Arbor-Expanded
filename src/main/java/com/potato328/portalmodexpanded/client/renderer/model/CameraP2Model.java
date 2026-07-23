package com.potato328.portalmodexpanded.client.renderer.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;

import java.util.List;

public class CameraP2Model extends Model {

    private final ModelRenderer cameraBody = (new ModelRenderer(32, 32, 0, 0)).addBox(-4.0F, -9.0F, -2.5F, 8.0F, 5.0F, 5.0F);
    private final ModelRenderer cameraBack = (new ModelRenderer(32, 32, 0, 11)).addBox(3.5F, -8.5F, -2.0F, 1.0F, 4.0F, 4.0F);
    private final ModelRenderer cameraLens = (new ModelRenderer(32, 32, 0, 22)).addBox(-4.25F, -9.0F, -2.5F, 1.0F, 5.0F, 5.0F);
    private final ModelRenderer cameraMount = (new ModelRenderer(32, 32, 10, 16)).addBox(0.0F, -7.5F, 2.5F, 2.0F, 2.0F, 1.0F);

    private final List<ModelRenderer> parts;

    public CameraP2Model() {
        super(RenderType::entityCutout);
        this.parts = ImmutableList.of(this.cameraBody, this.cameraBack, this.cameraLens);
    }

    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder vertexBuilder, int a, int b, float c, float d, float e, float f) {
        this.render(matrixStack, vertexBuilder, a, b, c, d, e, f);
    }

    public void render(MatrixStack matrixStack, IVertexBuilder vertexBuilder, int a, int b, float c, float d, float e, float f) {
        this.parts.forEach((part) -> {part.render(matrixStack, vertexBuilder, a, b, c, d, e, f);
        });
    }
}
