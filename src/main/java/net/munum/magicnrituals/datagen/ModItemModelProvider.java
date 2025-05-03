package net.munum.magicnrituals.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.item.ModItems;

import static net.minecraft.client.gui.components.ImageWidget.texture;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MagicnRituals.MOD_ID, existingFileHelper);

    }


    @Override
    protected void registerModels() {
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.ROSE_QUARTZ.get());
        basicItem(ModItems.RAW_ROSE_QUARTZ.get());
        basicItem(ModItems.RAW_RUBY.get());

        basicItem(ModItems.CHISEL.get());

        basicItem(ModItems.GARLIC.get());
        basicItem(ModItems.GARLIC_BREAD.get());

        basicItem(ModItems.MOONSTONE.get());

        buttonItem(ModBlocks.RUBY_BUTTON, ModBlocks.RUBY_BLOCK);
        fenceItem(ModBlocks.RUBY_FENCE, ModBlocks.RUBY_BLOCK);
        wallItem(ModBlocks.RUBY_WALL, ModBlocks.RUBY_BLOCK);

        simpleBlockItem(ModBlocks.RUBY_DOOR);

        handheldItem(ModItems.RUBY_SWORD);
        handheldItem(ModItems.RUBY_PICKAXE);
        handheldItem(ModItems.RUBY_SHOVEL);
        handheldItem(ModItems.RUBY_AXE);
        handheldItem(ModItems.RUBY_HOE);

    }


    private ItemModelBuilder handheldItem(RegistryObject<Item> Item) {
        return withExistingParent(Item.getId().getPath(),
            ResourceLocation.parse("item/handheld")).texture("layer0",
            ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "item/" + Item.getId().getPath()));
    }

    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID,"item/" + item.getId().getPath()));
    }
}
