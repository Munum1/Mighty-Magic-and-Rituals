package net.munum.magicnrituals.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;

import java.util.Objects;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicnRituals.MOD_ID);

    public static final RegistryObject<Item> RED_RUBY = ITEMS.register("red_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RED_RUBY = ITEMS.register("raw_red_ruby",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
