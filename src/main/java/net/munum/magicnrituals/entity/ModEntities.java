package net.munum.magicnrituals.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.entity.custom.WispEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MagicnRituals.MOD_ID);

    public static final RegistryObject<EntityType<WispEntity>> WISP =
            ENTITY_TYPES.register("wisp", () -> EntityType.Builder.of(WispEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("wisp"));






    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
