package net.munum.magicnrituals.event;


import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.entity.ModEntities;
import net.munum.magicnrituals.entity.client.WispModel;
import net.munum.magicnrituals.entity.custom.WispEntity;

@Mod.EventBusSubscriber(modid = MagicnRituals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WispModel.LAYER_LOCATION, WispModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.WISP.get(), WispEntity.createAttributes().build());

    }
}
