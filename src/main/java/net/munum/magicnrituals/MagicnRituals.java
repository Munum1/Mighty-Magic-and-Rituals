package net.munum.magicnrituals;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.block.entity.ModBlockEntities;
import net.munum.magicnrituals.block.entity.renderer.PedestalBlockEntityRenderer;
import net.munum.magicnrituals.component.ModDataComponentTypes;
import net.munum.magicnrituals.effect.ModEffects;
import net.munum.magicnrituals.entity.ModEntities;
import net.munum.magicnrituals.entity.client.WispRenderer;
import net.munum.magicnrituals.fluid.ModFluidTypes;
import net.munum.magicnrituals.fluid.ModFluids;
import net.munum.magicnrituals.item.ModCreativeModeTabs;
import net.munum.magicnrituals.item.ModItems;
import net.munum.magicnrituals.potion.ModPotions;
import net.munum.magicnrituals.screen.ModMenuTypes;
import net.munum.magicnrituals.screen.custom.GrowthChamberScreen;
import net.munum.magicnrituals.screen.custom.PedestalScreen;
import net.munum.magicnrituals.sound.ModSounds;
import net.munum.magicnrituals.util.ModItemProperties;
import net.munum.magicnrituals.villager.ModVillagers;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MagicnRituals.MOD_ID)
public class MagicnRituals {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "magicnrituals";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public MagicnRituals(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);


        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register((modEventBus));

        ModDataComponentTypes.register(modEventBus);
        ModSounds.register(modEventBus);

        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);


        ModEntities.register(modEventBus);


        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        ModVillagers.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        ModMenuTypes.register(modEventBus);






        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC.get(), 0.4f);
            ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC_SEEDS.get(), 0.15f);
        });
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RAW_RUBY);
            event.accept(ModItems.RUBY);


            event.accept(ModItems.CHISEL.get());
            event.accept(ModItems.MOONSTONE.get());

            event.accept(ModItems.GARLIC.get());
            event.accept(ModItems.GARLIC_BREAD.get());
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.RAW_RUBY_BLOCK);
            event.accept(ModBlocks.RUBY_DEEPSLATE_ORE);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.ROSE_QUARTZ_ORE);
            event.accept(ModBlocks.ROSE_QUARTZ_DEEPSLATE_ORE);


        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ModItemProperties.addCustomItemProperties();

            EntityRenderers.register(ModEntities.WISP.get(), WispRenderer::new);

            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_LIQUID_MOONSTONE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_LIQUID_MOONSTONE.get(), RenderType.translucent());

            MenuScreens.register(ModMenuTypes.PEDESTAL_MENU.get(), PedestalScreen::new);
            MenuScreens.register(ModMenuTypes.GROWTH_CHAMBER_MENU.get(), GrowthChamberScreen::new);

        }

        @SubscribeEvent
        public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL_BE.get(), PedestalBlockEntityRenderer::new);
        }
    }
}
