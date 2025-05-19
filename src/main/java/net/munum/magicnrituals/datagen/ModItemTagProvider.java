package net.munum.magicnrituals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.item.ModItems;
import net.munum.magicnrituals.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, MagicnRituals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.RUBY.get())
                .add(ModItems.RAW_RUBY.get())
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.COMPASS);

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET.get())
                .add(ModItems.RUBY_CHESTPLATE.get())
                .add(ModItems.RUBY_LEGGINGS.get())
                .add(ModItems.RUBY_BOOTS.get());

        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.BLACKTHORN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BLACKTHORN_LOG.get().asItem())
                .add(ModBlocks.BLACKTHORN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BLACKTHORN_WOOD.get().asItem());

        tag(ItemTags.PLANKS)
                .add(ModBlocks.BLACKTHORN_PLANKS.get().asItem());

    }
}
