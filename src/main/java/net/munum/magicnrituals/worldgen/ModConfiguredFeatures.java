package net.munum.magicnrituals.worldgen;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;

import java.util.List;

import static net.minecraft.data.worldgen.features.FeatureUtils.register;
import static net.munum.magicnrituals.worldgen.ModConfiguredFeatures.BlackthornLeavesBlock.registerKey;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LUMINITITE_ORE_KEY = registerKey("luminitite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AETHERIUM_ORE_KEY = registerKey("aetherium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SOULSTEEL_ORE_KEY = registerKey("soulsteel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ROSE_QUARTZ_ORE_KEY = registerKey("rose_quartz_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKTHORN_KEY = registerKey("blackthorn");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ROSE_QUARTZ_ORE_KEY = registerKey("nether_rose_quartz_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ROSE_QUARTZ_ORE_KEY = registerKey("end_rose_quartz_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SNOWBERRY_BUSH_KEY = registerKey("snowberry_bush");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldModOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.RUBY_DEEPSLATE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldRoseQuartzOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.ROSE_QUARTZ_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ROSE_QUARTZ_DEEPSLATE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldLuminititeOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.LUMINITITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.LUMINITITE_DEEPSLATE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldAetheriumOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.AETHERIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.AETHERIUM_DEEPSLATE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldSoulsteelOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.SOULSTEEL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.SOULSTEEL_DEEPSLATE_ORE.get().defaultBlockState()));


        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldModOres, 9));
        register(context, OVERWORLD_LUMINITITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLuminititeOres, 9));
        register(context, OVERWORLD_AETHERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAetheriumOres, 9));
        register(context, OVERWORLD_SOULSTEEL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSoulsteelOres, 9));
        register(context, OVERWORLD_ROSE_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRoseQuartzOres, 9));

        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.RUBY_NETHER_ORE.get().defaultBlockState(), 9));
        register(context, NETHER_ROSE_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.ROSE_QUARTZ_NETHER_ORE.get().defaultBlockState(), 9));

        register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.RUBY_END_ORE.get().defaultBlockState(), 9));
        register(context, END_ROSE_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.ROSE_QUARTZ_END_ORE.get().defaultBlockState(), 9));

        register(context, BLACKTHORN_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BLACKTHORN_LOG.get()),
                new FancyTrunkPlacer(4, 2, 3),

                BlockStateProvider.simple(ModBlocks.BLACKTHORN_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),

                new TwoLayersFeatureSize(1, 1, 1)).build());

        register(context, SNOWBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(ModBlocks.SNOWBERRY_BUSH.get()
                                        .defaultBlockState().setValue(SweetBerryBushBlock.AGE, Integer.valueOf(3)))
                        ), List.of(Blocks.GRASS_BLOCK)));


    }


    public static class BlackthornLeavesBlock extends LeavesBlock {

        public BlackthornLeavesBlock() {
            super(BlockBehaviour.Properties.of().strength(0.2F).randomTicks().noOcclusion());
        }


        public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
            return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, name));
        }

        private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                              ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
            context.register(key, new ConfiguredFeature<>(feature, configuration));
        }
    }
}