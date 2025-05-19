package net.munum.magicnrituals.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.entity.custom.WispEntity;

public class WispRenderer extends MobRenderer<WispEntity, WispModel<WispEntity>> {

    public WispRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new WispModel<>(pContext.bakeLayer(WispModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(WispEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(MagicnRituals.MOD_ID, "textures/entity/wisp/wisp.png");
    }
    @Override
    public void render(WispEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            pPoseStack.scale(1.0f, 1.0f, 1.0f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
