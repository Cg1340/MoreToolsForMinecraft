package net.fabricmc.moretools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

//铜粒
public class CopperNugget implements ModInitializer {

    public static final Item COPPER_NUGGET = new Item(new FabricItemSettings().group(Main.MORE_TOOLS_GROUP));
    @Override
    public void onInitialize() {

    }
}
