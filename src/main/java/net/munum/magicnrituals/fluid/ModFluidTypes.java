package net.munum.magicnrituals.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = ResourceLocation.parse( "block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = ResourceLocation.parse( "block/water_flow");
    public static final ResourceLocation SOAP_OVERLAY_RL = ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "textures/misc/liquid_moonstone");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MagicnRituals.MOD_ID);

    public static final RegistryObject<FluidType> LIQUID_MOONSTONE_FLUID_TYPE = register("liquid_moonstone_fluid",
            FluidType.Properties.create().lightLevel(4).viscosity(10).density(20).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));


    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, SOAP_OVERLAY_RL,
                0xA1D9FDFF, new Vector3f(217f / 256f, 253f / 256f, 255f / 256f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}

