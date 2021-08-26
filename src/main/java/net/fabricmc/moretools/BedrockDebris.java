package net.fabricmc.moretools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class BedrockDebris implements ModInitializer {

    public static final Item BEDROCK_DEBRIS = new Item(new FabricItemSettings().group(Main.MORE_TOOLS_GROUP));

    @Override
    public void onInitialize() {

    }
}
