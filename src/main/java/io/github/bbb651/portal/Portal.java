package io.github.bbb651.portal;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Portal implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "portal";
    public static final String MOD_NAME = "Portal";

    public static final PortalGunItem PORTAL_GUN_ITEM = new PortalGunItem(new Item.Settings().group(ItemGroup.TOOLS));
    public static final EntityType<PortalEntity> PORTAL_ENTITY = Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "portal"), FabricEntityTypeBuilder.create(SpawnGroup.MISC, PortalEntity::new).dimensions(EntityDimensions.fixed(1f, 2f)).build());

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "portal_gun"), PORTAL_GUN_ITEM);
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}