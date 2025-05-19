package net.munum.magicnrituals.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.munum.magicnrituals.MagicnRituals;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_RUBY_ORE_KEY = registerKey("add_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_ROSE_QUARTZ_ORE_KEY = registerKey("add_rose_quartz_ore");
    public static final ResourceKey<BiomeModifier> ADD_LUMINITITE_ORE_KEY = registerKey("add_luminitite_ore");
    public static final ResourceKey<BiomeModifier> ADD_AETHERIUM_ORE_KEY = registerKey("add_aetherium_ore");
    public static final ResourceKey<BiomeModifier> ADD_SOULSTEEL_ORE_KEY = registerKey("add_soulsteel_ore");

    public static final ResourceKey<BiomeModifier> ADD_NETHER_RUBY_ORE_KEY = registerKey("add_nether_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ROSE_QUARTZ_ORE_KEY = registerKey("add_nether_rose_quartz_ore");

    public static final ResourceKey<BiomeModifier> ADD_END_RUBY_ORE_KEY = registerKey("add_end_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_ROSE_QUARTZ_ORE_KEY = registerKey("add_end_rose_quartz_ore");

    public static final ResourceKey<BiomeModifier> ADD_BLACKTHORN_TREE = registerKey("add_tree_blackthorn");

    public static final ResourceKey<BiomeModifier> ADD_SNOWBERRY_BUSH = registerKey("add_snowberry_bush");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeature = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_RUBY_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.RUBY_ORE_PLACED_KEY)),
                        GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LUMINITITE_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.LUMINITITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_AETHERIUM_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.AETHERIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_SOULSTEEL_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.SOULSTEEL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ROSE_QUARTZ_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.ROSE_QUARTZ_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_RUBY_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.NETHER_RUBY_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_ROSE_QUARTZ_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.NETHER_ROSE_QUARTZ_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_RUBY_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.END_RUBY_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_ROSE_QUARTZ_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.END_ROSE_QUARTZ_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLACKTHORN_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.FOREST),
                        biomes.getOrThrow(Biomes.FLOWER_FOREST)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.BLACKTHORN_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_SNOWBERRY_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_SLOPES), biomes.getOrThrow(Biomes.TAIGA),
                        biomes.getOrThrow(Biomes.SNOWY_TAIGA)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.SNOWBERRY_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));


    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, name));
    }
}
