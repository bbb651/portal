package io.github.bbb651.portal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

@Environment(EnvType.CLIENT)
public class PortalEntityModel extends EntityModel<PortalEntity> {

    private final ModelPart base;

    public PortalEntityModel() {
        this.textureWidth = 16;
        this.textureHeight = 32;
        base = new ModelPart(this, 0, 0);
        base.addCuboid(-8, -16, 0, 16, 32, 1);
    }

    @Override
    public void setAngles(PortalEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0, 1.125, 0);
        base.render(matrices, vertices, light, overlay);
    }
}
