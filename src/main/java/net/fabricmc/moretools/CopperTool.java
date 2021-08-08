package net.fabricmc.moretools;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;

public class CopperTool implements ToolMaterial {

    public static final CopperTool INSTANCE = new CopperTool();
    public static ToolItem COPPER_SHOVEL = new ShovelItem(CopperTool.INSTANCE, 2.5F, -3.0F, new Item.Settings().group(Main.MORE_TOOLS_GROUP));
    public static ToolItem COPPER_SWORD = new SwordItem(CopperTool.INSTANCE, 4, -1.0F, new Item.Settings().group(Main.MORE_TOOLS_GROUP));

    public static ToolItem COPPER_PICKAXE = new CopperPickaxe(CopperTool.INSTANCE, 3, -2.8F, new Item.Settings().group(Main.MORE_TOOLS_GROUP));
    public static ToolItem COPPER_AXE = new CopperAxe(CopperTool.INSTANCE, 6, -3.2F, new Item.Settings().group(Main.MORE_TOOLS_GROUP));
    public static ToolItem COPPER_HOE = new CopperHoe(CopperTool.INSTANCE, 2, -3.2F, new Item.Settings().group(Main.MORE_TOOLS_GROUP));


    @Override
    public int getDurability() {
        return 1060;//My Computer's GPU is NV1060Ti  :D
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4.5F;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 8;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.BEDROCK);
    }
}


