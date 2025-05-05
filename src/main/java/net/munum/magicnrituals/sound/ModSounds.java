package net.munum.magicnrituals.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MagicnRituals.MOD_ID);

    public static final RegistryObject<SoundEvent> CHISEL_USE = registerSoundEvent("chisel_use");

    public static final RegistryObject<SoundEvent> ALTAR_BLOCK_BREAK = registerSoundEvent("altar_block_break");
    public static final RegistryObject<SoundEvent> ALTAR_BLOCK_STEP = registerSoundEvent("altar_block_step");
    public static final RegistryObject<SoundEvent> ALTAR_BLOCK_PLACE = registerSoundEvent("altar_block_place");
    public static final RegistryObject<SoundEvent> ALTAR_BLOCK_HIT = registerSoundEvent("altar_block_hit");
    public static final RegistryObject<SoundEvent> ALTAR_BLOCK_FALL = registerSoundEvent("altar_block_fall");

    public static final ForgeSoundType ALTAR_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.ALTAR_BLOCK_BREAK, ModSounds.ALTAR_BLOCK_STEP, ModSounds.ALTAR_BLOCK_PLACE,
            ModSounds.ALTAR_BLOCK_HIT, ModSounds.ALTAR_BLOCK_FALL);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
