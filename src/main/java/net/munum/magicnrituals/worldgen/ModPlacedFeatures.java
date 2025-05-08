package net.munum.magicnrituals.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.munum.magicnrituals.MagicnRituals;

import java.util.List;


public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> LUMINITITE_ORE_PLACED_KEY = registerKey("luminitite_ore_placed");
    public static final ResourceKey<PlacedFeature> AETHERIUM_ORE_PLACED_KEY = registerKey("aetherium_ore_placed");
    public static final ResourceKey<PlacedFeature> SOULSTEEL_ORE_PLACED_KEY = registerKey("soulsteel_ore_placed");
    public static final ResourceKey<PlacedFeature> ROSE_QUARTZ_ORE_PLACED_KEY = registerKey("rose_quartz_ore_placed");

    public static final ResourceKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ROSE_QUARTZ_ORE_PLACED_KEY = registerKey("nether_rose_quartz_ore_placed");

    public static final ResourceKey<PlacedFeature> END_RUBY_ORE_PLACED_KEY = registerKey("end_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> END_ROSE_QUARTZ_ORE_PLACED_KEY = registerKey("end_rose_quartz_ore_placed");






    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk));
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80)))); // height range
        register(context, ROSE_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ROSE_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk));
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80)))); // height range
        register(context, LUMINITITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LUMINITITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk));
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80)))); // height range
        register(context, AETHERIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_AETHERIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk));
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80)))); // height range
        register(context, SOULSTEEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SOULSTEEL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk));
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80)))); // height range



        register(context, NETHER_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk));
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80)))); // height range
        register(context, NETHER_ROSE_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ROSE_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk));
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80)))); // height range


        register(context, END_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk));
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80)))); // height range
        register(context, END_ROSE_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_ROSE_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, // veins per chunk));
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80)))); // height range


    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
