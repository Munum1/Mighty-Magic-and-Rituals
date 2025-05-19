package net.munum.magicnrituals.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.item.ModItems;

import java.util.LinkedHashMap;
import java.util.Locale;


public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MagicnRituals.MOD_ID, existingFileHelper);
    }


        @Override
        protected void registerModels() {
            basicItem(ModItems.RUBY.get());
            basicItem(ModItems.AETHERIUM.get());
            basicItem(ModItems.ROSE_QUARTZ.get());
            basicItem(ModItems.SOULSTEEL.get());
            basicItem(ModItems.LUMINITITE.get());
            basicItem(ModItems.RAW_ROSE_QUARTZ.get());
            basicItem(ModItems.RAW_RUBY.get());
            basicItem(ModItems.RAW_AETHERIUM.get());
            basicItem(ModItems.RAW_SOULSTEEL.get());
            basicItem(ModItems.RAW_LUMINITITE.get());

            //basicItem(ModItems.CHISEL.get());

            basicItem(ModItems.GARLIC.get());
            basicItem(ModItems.GARLIC_BREAD.get());

            basicItem(ModItems.MOONSTONE.get());
            basicItem(ModItems.ARCANE_CIRCUIT.get());
            basicItem(ModItems.MOONSTONE_DUST.get());

            buttonItem(ModBlocks.RUBY_BUTTON, ModBlocks.RUBY_BLOCK);
            fenceItem(ModBlocks.RUBY_FENCE, ModBlocks.RUBY_BLOCK);
            wallItem(ModBlocks.RUBY_WALL, ModBlocks.RUBY_BLOCK);

            simpleBlockItem(ModBlocks.RUBY_DOOR);

            handheldItem(ModItems.RUBY_SWORD);
            handheldItem(ModItems.RUBY_PICKAXE);
            handheldItem(ModItems.RUBY_SHOVEL);
            handheldItem(ModItems.RUBY_AXE);
            handheldItem(ModItems.RUBY_HOE);
            handheldItem(ModItems.RUBY_HAMMER);

            trimmedArmorItem(ModItems.RUBY_HELMET);
            trimmedArmorItem(ModItems.RUBY_CHESTPLATE);
            trimmedArmorItem(ModItems.RUBY_LEGGINGS);
            trimmedArmorItem(ModItems.RUBY_BOOTS);

            basicItem(ModItems.RUBY_HORSE_ARMOR.get());

            basicItem(ModItems.GARLIC_SEEDS.get());
            basicItem(ModItems.SNOWBERRIES.get());
            basicItem(ModItems.SLOE_FRUIT.get());

            saplingItem(ModBlocks.BLACKTHORN_SAPLING);

            withExistingParent(ModItems.WISP_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));


        }


private ItemModelBuilder saplingItem(RegistryObject<SaplingBlock> item) {
    return withExistingParent(item.getId().getPath(),
        ResourceLocation.parse("item/generated")).texture("layer0",
        ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID,"block/" + item.getId().getPath()));
    }


private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = MagicnRituals.MOD_ID; // Change this to your mod id

        if (itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                    String armorType = switch (armorItem.getEquipmentSlot()) {
                        case HEAD -> "helmet";
                        case CHEST -> "chestplate";
                        case LEGS -> "leggings";
                        case FEET -> "boots";
                        default -> "";
                    };

                    String armorItemPath = armorItem.toString();
                    String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                    String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                    ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                    ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                    ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                    // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                    // avoid an IllegalArgumentException
                    existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                    // Trimmed armorItem files
                    getBuilder(currentTrimName)
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                            .texture("layer1", trimResLoc);

                    // Non-trimmed armorItem file (normal variant)
                    this.withExistingParent(itemRegistryObject.getId().getPath(),
                                    mcLoc("item/generated"))
                            .override()
                            .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace() + ":item/" + trimNameResLoc.getPath()))
                            .predicate(mcLoc("trim_type"), trimValue).end()
                            .texture("layer0",
                                    ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                            "item/" + itemRegistryObject.getId().getPath()));
                });
            }
        }


        private ItemModelBuilder handheldItem(RegistryObject<Item> Item) {
            return withExistingParent(Item.getId().getPath(),
                    ResourceLocation.parse("item/handheld")).texture("layer0",
                    ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "item/" + Item.getId().getPath()));
        }

        public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
            this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                    .texture("texture", ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID,
                            "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
        }

        public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
            this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                    .texture("texture", ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID,
                            "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
        }

        public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
            this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                    .texture("wall", ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID,
                            "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
        }

        private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
            return withExistingParent(item.getId().getPath(),
                    ResourceLocation.parse("item/generated")).texture("layer0",
                    ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "item/" + item.getId().getPath()));
        }
    }
