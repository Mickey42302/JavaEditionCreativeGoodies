package com.mickey42302.creative;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fabricmc.loader.impl.FabricLoaderImpl.MOD_ID;

public class CreativeInit implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        LOGGER.info("Loading the Creative Goodies mod...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(content -> content.add(Items.KNOWLEDGE_BOOK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.add(Items.PETRIFIED_OAK_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> {
            content.add(Items.ENDER_DRAGON_SPAWN_EGG);
            content.add(Items.WITHER_SPAWN_EGG);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> content.add(Items.WRITTEN_BOOK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> content.add(Items.ENCHANTED_BOOK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.add(Items.POTION);
            content.add(Items.SPLASH_POTION);
            content.add(Items.LINGERING_POTION);
            content.add(Items.TIPPED_ARROW);
            content.add(Items.SUSPICIOUS_STEW);
        });

    }
}