package net.munum.magicnrituals.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicnRituals.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAGIC_AND_RITUALS_ITEMS_TAB = CREATIVE_MODE_TABS.register("magic_and_rituals_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_RUBY.get()))
                    .title(Component.translatable("creativetab.magicnrituals.magic_and_rituals_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_RUBY.get());
                        output.accept(ModItems.RAW_ROSE_QUARTZ.get());
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.ROSE_QUARTZ.get());
                        output.accept(ModItems.GARLIC_BREAD.get());
                        output.accept(ModItems.GARLIC.get());
                        output.accept(ModItems.CHISEL.get());
                        output.accept(ModItems.MOONSTONE.get());
                        output.accept(ModItems.LUMINITITE.get());
                        output.accept(ModItems.RAW_LUMINITITE.get());
                        output.accept(ModItems.AETHERIUM.get());
                        output.accept(ModItems.RAW_AETHERIUM.get());
                        output.accept(ModItems.SOULSTEEL.get());
                        output.accept(ModItems.RAW_SOULSTEEL.get());

                        output.accept(ModItems.RUBY_SWORD.get());
                        output.accept(ModItems.RUBY_PICKAXE.get());
                        output.accept(ModItems.RUBY_SHOVEL.get());
                        output.accept(ModItems.RUBY_AXE.get());
                        output.accept(ModItems.RUBY_HOE.get());

                        output.accept(ModItems.RUBY_HAMMER.get());

                        output.accept(ModItems.RUBY_HELMET.get());
                        output.accept(ModItems.RUBY_CHESTPLATE.get());
                        output.accept(ModItems.RUBY_LEGGINGS.get());
                        output.accept(ModItems.RUBY_BOOTS.get());

                        output.accept(ModItems.RUBY_HORSE_ARMOR.get());
                        output.accept(ModItems.MOONSTONE_BOW.get());

                        output.accept(ModItems.GARLIC_SEEDS.get());

                        output.accept(ModItems.SNOWBERRIES.get());
                        output.accept(ModItems.SLOE_FRUIT.get());
                        output.accept(ModItems.ARCANE_CIRCUIT.get());
                        output.accept(ModItems.MOONSTONE_DUST.get());

                        output.accept(ModItems.WISP_SPAWN_EGG.get());
                        output.accept(ModItems.LIQUID_MOONSTONE_BUCKET.get());


                        })
                            .build());

    public static final RegistryObject<CreativeModeTab> MAGIC_AND_RITUALS_BLOCKS_TAB = CREATIVE_MODE_TABS.register("magic_and_rituals_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK.get()))
                    .withTabsBefore(MAGIC_AND_RITUALS_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.magicnrituals.magic_and_rituals_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.AETHERIUM_BLOCK.get());
                        output.accept(ModBlocks.LUMINITITE_BLOCK.get());
                        output.accept(ModBlocks.SOULSTEEL_BLOCK.get());
                        output.accept(ModBlocks.ROSE_QUARTZ_BLOCK.get());
                        output.accept(ModBlocks.RAW_RUBY_BLOCK.get());
                        output.accept(ModBlocks.RAW_ROSE_QUARTZ_BLOCK.get());

                        output.accept(ModBlocks.ALTAR_BLOCK.get());
                        output.accept(ModBlocks.MOONSTONE_BLOCK.get());

                        output.accept(ModBlocks.RUBY_STAIRS.get());
                        output.accept(ModBlocks.RUBY_TRAPDOOR.get());

                        output.accept(ModBlocks.RUBY_DOOR.get());
                        output.accept(ModBlocks.RUBY_FENCE.get());

                        output.accept(ModBlocks.RUBY_FENCE_GATE.get());
                        output.accept(ModBlocks.RUBY_WALL.get());
                        output.accept(ModBlocks.RUBY_SLAB.get());

                        output.accept(ModBlocks.RUBY_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.RUBY_BUTTON.get());
                        output.accept(ModBlocks.RUBY_LAMP.get());

                        output.accept(ModBlocks.BLACKTHORN_LOG.get());
                        output.accept(ModBlocks.STRIPPED_BLACKTHORN_LOG.get());
                        output.accept(ModBlocks.BLACKTHORN_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_BLACKTHORN_WOOD.get());
                        output.accept(ModBlocks.BLACKTHORN_PLANKS.get());
                        output.accept(ModBlocks.BLACKTHORN_SAPLING.get());
                        output.accept(ModBlocks.PEDESTAL.get());
                        output.accept(ModBlocks.GROWTH_CHAMBER.get());

                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.RUBY_END_ORE.get());
                        output.accept(ModBlocks.RUBY_NETHER_ORE.get());
                        output.accept(ModBlocks.RUBY_DEEPSLATE_ORE.get());

                        output.accept(ModBlocks.ROSE_QUARTZ_ORE.get());
                        output.accept(ModBlocks.ROSE_QUARTZ_NETHER_ORE.get());
                        output.accept(ModBlocks.ROSE_QUARTZ_END_ORE.get());
                        output.accept(ModBlocks.ROSE_QUARTZ_DEEPSLATE_ORE.get());

                        output.accept(ModBlocks.LUMINITITE_ORE.get());
                        output.accept(ModBlocks.LUMINITITE_DEEPSLATE_ORE.get());

                        output.accept(ModBlocks.AETHERIUM_ORE.get());
                        output.accept(ModBlocks.AETHERIUM_DEEPSLATE_ORE.get());

                        output.accept(ModBlocks.SOULSTEEL_ORE.get());
                        output.accept(ModBlocks.SOULSTEEL_DEEPSLATE_ORE.get());



                        })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
