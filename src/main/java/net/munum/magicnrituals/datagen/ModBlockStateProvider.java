package net.munum.magicnrituals.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.block.custom.GarlicCropBlock;
import net.munum.magicnrituals.block.custom.RubyLampBlock;
import net.munum.magicnrituals.block.custom.SnowBerryBushBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output,ExistingFileHelper exFileHelper) {
        super(output,MagicnRituals.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.ROSE_QUARTZ_BLOCK);
        blockWithItem(ModBlocks.AETHERIUM_BLOCK);
        blockWithItem(ModBlocks.LUMINITITE_BLOCK);
        blockWithItem(ModBlocks.RAW_RUBY_BLOCK);
        blockWithItem(ModBlocks.RAW_ROSE_QUARTZ_BLOCK);
        blockWithItem(ModBlocks.SOULSTEEL_BLOCK);

        blockWithItem(ModBlocks.RUBY_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.LUMINITITE_ORE);
        blockWithItem(ModBlocks.SOULSTEEL_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.LUMINITITE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.ROSE_QUARTZ_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.SOULSTEEL_ORE);
        blockWithItem(ModBlocks.RUBY_NETHER_ORE);
        blockWithItem(ModBlocks.RUBY_END_ORE);
        blockWithItem(ModBlocks.ROSE_QUARTZ_ORE);
        blockWithItem(ModBlocks.ROSE_QUARTZ_NETHER_ORE);
        blockWithItem(ModBlocks.ROSE_QUARTZ_END_ORE);
        blockWithItem(ModBlocks.AETHERIUM_ORE);
        blockWithItem(ModBlocks.AETHERIUM_DEEPSLATE_ORE);


        blockWithItem(ModBlocks.ALTAR_BLOCK);

        blockWithItem(ModBlocks.MOONSTONE_BLOCK);

        stairsBlock(ModBlocks.RUBY_STAIRS.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        slabBlock(ModBlocks.RUBY_SLAB.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));

        buttonBlock(ModBlocks.RUBY_BUTTON.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        pressurePlateBlock(ModBlocks.RUBY_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));

        fenceBlock(ModBlocks.RUBY_FENCE.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        fenceGateBlock(ModBlocks.RUBY_FENCE_GATE.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        wallBlock(ModBlocks.RUBY_WALL.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));

        doorBlockWithRenderType(ModBlocks.RUBY_DOOR.get(), modLoc("block/ruby_door_bottom"), modLoc("block/ruby_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.RUBY_TRAPDOOR.get(), modLoc("block/ruby_trapdoor"), true, "cutout");

        blockItem(ModBlocks.RUBY_STAIRS);
        blockItem(ModBlocks.RUBY_SLAB);
        blockItem(ModBlocks.RUBY_PRESSURE_PLATE);
        blockItem(ModBlocks.RUBY_FENCE_GATE);
        blockItem(ModBlocks.RUBY_TRAPDOOR, "_bottom");


        customLamp();

        makeCrop(((CropBlock) ModBlocks.GARLIC_CROP.get()), "garlic_crop_stage", "garlic_crop_stage_");
        makeBush(((SweetBerryBushBlock) ModBlocks.SNOWBERRY_BUSH.get()), "snowberry_bush_stage", "snowberry_bush_stage");

        logBlock(ModBlocks.BLACKTHORN_LOG.get());
        axisBlock(ModBlocks.BLACKTHORN_WOOD.get(), blockTexture(ModBlocks.BLACKTHORN_LOG.get()), blockTexture(ModBlocks.BLACKTHORN_LOG.get()));
        logBlock(ModBlocks.STRIPPED_BLACKTHORN_LOG.get());
        axisBlock(ModBlocks.STRIPPED_BLACKTHORN_WOOD.get(), blockTexture(ModBlocks.STRIPPED_BLACKTHORN_LOG.get()), blockTexture(ModBlocks.STRIPPED_BLACKTHORN_LOG.get()));

        blockItem(ModBlocks.BLACKTHORN_LOG);
        blockItem(ModBlocks.BLACKTHORN_WOOD);
        blockItem(ModBlocks.STRIPPED_BLACKTHORN_LOG);
        blockItem(ModBlocks.STRIPPED_BLACKTHORN_WOOD);

        blockWithItem(ModBlocks.BLACKTHORN_PLANKS);
        blockWithItem(ModBlocks.GROWTH_CHAMBER);



        leavesBlock(ModBlocks.BLACKTHORN_LEAVES);
        saplingBlock(ModBlocks.BLACKTHORN_SAPLING);




    }


    private void saplingBlock(RegistryObject<SaplingBlock> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void makeBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(SnowBerryBushBlock.AGE),
                ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "block/" + textureName + state.getValue(SnowBerryBushBlock.AGE))).renderType("cutout"));

        return models;
    }




    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((GarlicCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "block/" + textureName + state.getValue(((GarlicCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;

    }




    private void customLamp() {
        getVariantBuilder(ModBlocks.RUBY_LAMP.get()).forAllStates(state -> {
            if (state.getValue(RubyLampBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("ruby_lamp_on",
                        ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "block/ruby_lamp_on")))};

            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("ruby_lamp_off",
                        ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "block/ruby_lamp_off")))};

            }

        });
        simpleBlockItem(ModBlocks.RUBY_LAMP.get(), models().cubeAll("ruby_lamp_on",
                ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "block/" + "ruby_lamp_on")));

    }


        private void blockWithItem (RegistryObject < Block > blockRegistryObject) {
            simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }


    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("magicnrituals:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("magicnrituals:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }





}

