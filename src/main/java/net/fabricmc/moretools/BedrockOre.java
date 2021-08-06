package net.fabricmc.moretools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BedrockOre implements ModInitializer {
    public static final Block BEDROCK_ORE = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0F));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("moretools", "bedrock_ore"), BEDROCK_ORE);
    }
}
