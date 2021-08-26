package net.fabricmc.moretools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BedrockOre implements ModInitializer {

    public static final Block BEDROCK_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f, 5.0f));

    @Override
    public void onInitialize() {

    }
}
