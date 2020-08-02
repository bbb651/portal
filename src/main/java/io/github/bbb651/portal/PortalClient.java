package io.github.bbb651.portal;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class PortalClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.INSTANCE.register(Portal.PORTAL_ENTITY, ((dispatcher, context) -> {
            return new PortalEntityRenderer(dispatcher);
        }));
    }
}
