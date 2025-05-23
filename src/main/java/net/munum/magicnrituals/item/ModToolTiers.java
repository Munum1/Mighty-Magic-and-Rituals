package net.munum.magicnrituals.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.munum.magicnrituals.util.ModTags;

public class ModToolTiers {
    public static final Tier RUBY = new ForgeTier(1400,5,3,20,
            ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get()),
            ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL);
}
