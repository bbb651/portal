package io.github.bbb651.portal;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class PortalEntityRenderer extends EntityRenderer<PortalEntity> {


    protected PortalEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    public Identifier getTexture(PortalEntity entity) {
        return new Identifier(Portal.MOD_ID, "textures/entity/portal/portal.png");
    }
}
