package net.munum.magicnrituals.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.worldgen.ModConfiguredFeatures;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower BLACKTHORN = new TreeGrower(MagicnRituals.MOD_ID + ":blackthorn",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLACKTHORN_KEY), Optional.empty());

}
