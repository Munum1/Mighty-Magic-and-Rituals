package net.munum.magicnrituals.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.item.ModItems;
import net.munum.magicnrituals.item.custom.ModArmorItem;

import javax.swing.*;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, MagicnRituals.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_LIQUID_MOONSTONE = FLUIDS.register("liquid_moonstone_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_MOONSTONE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_MOONSTONE = FLUIDS.register("flowing_liquid_moonstone",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_MOONSTONE_PROPERTIES));


    public static final ForgeFlowingFluid.Properties LIQUID_MOONSTONE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.LIQUID_MOONSTONE_FLUID_TYPE, SOURCE_LIQUID_MOONSTONE, FLOWING_LIQUID_MOONSTONE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.LIQUID_MOONSTONE_BLOCK)
            .bucket(ModItems.LIQUID_MOONSTONE_BUCKET);






    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
