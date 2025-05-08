package net.munum.magicnrituals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MagicnRituals.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .add(ModBlocks.LUMINITITE_BLOCK.get())
                .add(ModBlocks.RAW_ROSE_QUARTZ_BLOCK.get())
                .add(ModBlocks.ROSE_QUARTZ_ORE.get())
                .add(ModBlocks.LUMINITITE_ORE.get())
                .add(ModBlocks.AETHERIUM_ORE.get())
                .add(ModBlocks.SOULSTEEL_ORE.get())
                .add(ModBlocks.ROSE_QUARTZ_DEEPSLATE_ORE.get())
                .add(ModBlocks.LUMINITITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.MOONSTONE_BLOCK.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.SOULSTEEL_BLOCK.get())
                .add(ModBlocks.AETHERIUM_BLOCK.get())
                .add(ModBlocks.ALTAR_BLOCK.get())
                .add(ModBlocks.RAW_RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_DEEPSLATE_ORE.get())
                .add(ModBlocks.AETHERIUM_DEEPSLATE_ORE.get())
                .add(ModBlocks.SOULSTEEL_DEEPSLATE_ORE.get())
                .add(ModBlocks.RUBY_ORE.get());


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE.get())
                .add(ModBlocks.AETHERIUM_DEEPSLATE_ORE.get())
                .add(ModBlocks.ROSE_QUARTZ_DEEPSLATE_ORE.get())
                .add(ModBlocks.SOULSTEEL_DEEPSLATE_ORE.get())
                .add(ModBlocks.LUMINITITE_DEEPSLATE_ORE.get());




        tag(BlockTags.FENCES).add(ModBlocks.RUBY_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.RUBY_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.RUBY_WALL.get());


        tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .add(ModBlocks.RAW_RUBY_BLOCK.get())
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_RUBY_TOOL);
    }
}