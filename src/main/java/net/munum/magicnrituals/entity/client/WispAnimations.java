package net.munum.magicnrituals.entity.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class WispAnimations {
    public static final AnimationDefinition FLYING = AnimationDefinition.Builder.withLength(4.71311f)
            .addAnimation("bone",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 35f, -15f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.36612f, KeyframeAnimations.posVec(0f, 22.69f, 23.94f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(4.71311f, KeyframeAnimations.posVec(0f, 42f, 39f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("bone",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(4.71311f, KeyframeAnimations.scaleVec(1f, 1f, 0.8f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(15.8f).looping()
            .addAnimation("bone",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 39f, 15f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.55319f, KeyframeAnimations.posVec(0f, 48.73f, 18.45f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(8.51064f, KeyframeAnimations.posVec(0f, 51.98f, 22.46f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(11.91489f, KeyframeAnimations.posVec(0f, 51.98f, 28.46f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(13.61702f, KeyframeAnimations.posVec(0f, 45.98f, 28.46f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(14.04255f, KeyframeAnimations.posVec(0f, 45.98f, 31.46f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(15.31915f, KeyframeAnimations.posVec(0f, 36.98f, 24.46f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(15.74468f, KeyframeAnimations.posVec(0f, 38.98f, 15.46f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition ATTACK = AnimationDefinition.Builder.withLength(1.07323f)
            .addAnimation("bone",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 56f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.12626f, KeyframeAnimations.posVec(0f, 45f, 3.47f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.31566f, KeyframeAnimations.posVec(0f, 33.2f, 7.58f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.44192f, KeyframeAnimations.posVec(0f, 50f, 10.32f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.56818f, KeyframeAnimations.posVec(0f, 32.2f, 13.06f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.69444f, KeyframeAnimations.posVec(0f, 68.15f, 15.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.82071f, KeyframeAnimations.posVec(0f, 31.1f, 18.53f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.07323f, KeyframeAnimations.posVec(0f, 56f, 24f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
}

