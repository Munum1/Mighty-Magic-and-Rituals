package net.munum.magicnrituals.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.custom.*;
import net.munum.magicnrituals.fluid.ModFluids;
import net.munum.magicnrituals.item.ModItems;
import net.munum.magicnrituals.sound.ModSounds;
import net.munum.magicnrituals.worldgen.tree.ModTreeGrowers;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MagicnRituals.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> AETHERIUM_BLOCK = registerBlock("aetherium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> SOULSTEEL_BLOCK = registerBlock("soulsteel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> LUMINITITE_BLOCK = registerBlock("luminitite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));


    public static final RegistryObject<Block> RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_ROSE_QUARTZ_BLOCK = registerBlock("raw_rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROSE_QUARTZ_ORE = registerBlock("rose_quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AETHERIUM_ORE = registerBlock("aetherium_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SOULSTEEL_ORE = registerBlock("soulsteel_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LUMINITITE_ORE = registerBlock("luminitite_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RUBY_DEEPSLATE_ORE = registerBlock("ruby_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> LUMINITITE_DEEPSLATE_ORE = registerBlock("luminitite_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ROSE_QUARTZ_DEEPSLATE_ORE = registerBlock("rose_quartz_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> AETHERIUM_DEEPSLATE_ORE = registerBlock("aetherium_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SOULSTEEL_DEEPSLATE_ORE = registerBlock("soulsteel_deepslate_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> ROSE_QUARTZ_NETHER_ORE = registerBlock("rose_quartz_nether_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> RUBY_NETHER_ORE = registerBlock("ruby_nether_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> ROSE_QUARTZ_END_ORE = registerBlock("rose_quartz_end_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_END_ORE = registerBlock("ruby_end_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));







    public static final RegistryObject<Block> ALTAR_BLOCK = registerBlock("altar_block",
            () -> new AltarBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(ModSounds.ALTAR_BLOCK_SOUNDS)));

    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
            () -> new AltarBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.LARGE_AMETHYST_BUD)));

    public static final RegistryObject<StairBlock> RUBY_STAIRS = registerBlock("ruby_stairs",
            () -> new StairBlock(ModBlocks.RUBY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> RUBY_SLAB = registerBlock("ruby_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));


    public static final RegistryObject<PressurePlateBlock> RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<ButtonBlock> RUBY_BUTTON = registerBlock("ruby_button",
            () -> new ButtonBlock(BlockSetType.IRON,5, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceBlock> RUBY_FENCE = registerBlock("ruby_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<FenceGateBlock> RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock> RUBY_WALL = registerBlock("ruby_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> RUBY_DOOR = registerBlock("ruby_door",
            () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));


    public static final RegistryObject<Block> RUBY_LAMP = registerBlock("ruby_lamp",
            () -> new RubyLampBlock(BlockBehaviour.Properties.of().strength(3f).lightLevel(state -> state.getValue(RubyLampBlock.CLICKED) ? 15 : 0)));


    public static final RegistryObject<Block> GARLIC_CROP =BLOCKS.register("garlic_crop",
            () -> new GarlicCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));

    public static final RegistryObject<Block> SNOWBERRY_BUSH = BLOCKS.register("snow_berry_bush",
            () -> new SnowBerryBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<RotatedPillarBlock> BLACKTHORN_LOG = registerBlock("blackthorn_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> BLACKTHORN_WOOD = registerBlock("blackthorn_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BLACKTHORN_LOG = registerBlock("stripped_blackthorn_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BLACKTHORN_WOOD = registerBlock("stripped_blackthorn_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> BLACKTHORN_PLANKS = registerBlock("blackthorn_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> BLACKTHORN_LEAVES = registerBlock("blackthorn_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<SaplingBlock> BLACKTHORN_SAPLING = registerBlock("blackthorn_sapling",
            () -> new SaplingBlock(ModTreeGrowers.BLACKTHORN, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<LiquidBlock> LIQUID_MOONSTONE_BLOCK = BLOCKS.register("liquid_moonstone_block",
            () -> new LiquidBlock(ModFluids.SOURCE_LIQUID_MOONSTONE, BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));

    public static final RegistryObject<Block> PEDESTAL = registerBlock("pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final RegistryObject<Block> GROWTH_CHAMBER = registerBlock("growth_chamber",
            () -> new GrowthChamberBlock(BlockBehaviour.Properties.of()));







    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
