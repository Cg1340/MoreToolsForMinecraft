package net.fabricmc.moretools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final ItemGroup MORE_TOOLS_GROUP = FabricItemGroupBuilder.create(
					new Identifier("moretools", "more_tools_group"))
			.icon(() -> new ItemStack(Items.COPPER_INGOT)) // 这里将你创建的新的材料的模型用作图标，但是你也可以随时使用你喜欢的
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Thank you playing the MORETOOLS Mod!");
		Registry.register(Registry.ITEM, new Identifier("moretools", "copper_sword"), CopperTool.COPPER_SWORD);//铜剑
		Registry.register(Registry.ITEM, new Identifier("moretools", "copper_shovel"), CopperTool.COPPER_SHOVEL);//铜qiu

		Registry.register(Registry.ITEM, new Identifier("moretools", "copper_pickaxe"), CopperTool.COPPER_PICKAXE);//铜镐
		Registry.register(Registry.ITEM, new Identifier("moretools", "copper_axe"), CopperTool.COPPER_AXE);//铜斧
		Registry.register(Registry.ITEM, new Identifier("moretools", "copper_hoe"), CopperTool.COPPER_HOE);//铜锄


		Registry.register(Registry.ITEM, new Identifier("moretools", "bedrock_sword"), BedrockTool.BEDROCK_SWORD);//基岩剑


		Registry.register(Registry.ITEM, new Identifier("moretools", "bedrock_ore"), new BlockItem(BedrockOre.BEDROCK_ORE, new Item.Settings().group(Main.MORE_TOOLS_GROUP)));
		Registry.register(Registry.ITEM, new Identifier("moretools", "long_stick"), LongStick.LONG_STICK);
		Registry.register(Registry.ITEM, new Identifier("moretools", "copper_nugget"), CopperNugget.COPPER_NUGGET);

		CopperArmor.register();
	}
}
