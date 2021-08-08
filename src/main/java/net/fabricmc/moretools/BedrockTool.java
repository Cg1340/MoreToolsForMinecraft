package net.fabricmc.moretools;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;

public class BedrockTool implements ToolMaterial {

    public static final BedrockTool INSTANCE = new BedrockTool();
    public static ToolItem BEDROCK_SWORD = new SwordItem(BedrockTool.INSTANCE, 2147438646, 2044, new Item.Settings().group(Main.MORE_TOOLS_GROUP));


    @Override
    public int getDurability() {
        return 0x3f3f3f3f;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1024.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 2147438647;
    }

    @Override
    public int getEnchantability() {
        return 2147438647;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.BEDROCK);
    }
}
