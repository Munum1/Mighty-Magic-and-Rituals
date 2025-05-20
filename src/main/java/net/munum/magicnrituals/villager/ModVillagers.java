package net.munum.magicnrituals.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.sound.ModSounds;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, MagicnRituals.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, MagicnRituals.MOD_ID);


    public static final RegistryObject<PoiType> ASTROLOGER_POI = POI_TYPES.register("astrologer_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ROSE_QUARTZ_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> ASTROLOGER = VILLAGER_PROFESSIONS.register("astrologer",
            () -> new VillagerProfession("astrologer", holder -> holder.value() == ASTROLOGER_POI.get(),
                    holder -> holder.value() == ASTROLOGER_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    ModSounds.ALTAR_BLOCK_HIT.get()));





    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
