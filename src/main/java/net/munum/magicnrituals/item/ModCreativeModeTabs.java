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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_RUBY.get()))
                    .title(Component.translatable("creativetab.magicnrituals.magic_and_rituals_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RED_RUBY.get());
                        output.accept(ModItems.RAW_RED_RUBY.get());


                        })
                            .build());

    public static final RegistryObject<CreativeModeTab> MAGIC_AND_RITUALS_BLOCKS_TAB = CREATIVE_MODE_TABS.register("magic_and_rituals_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RED_RUBY_BLOCK.get()))
                    .withTabsBefore(MAGIC_AND_RITUALS_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.magicnrituals.magic_and_rituals_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RED_RUBY_BLOCK.get());
                        output.accept(ModBlocks.RAW_RUBY_BLOCK.get());

                        })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
