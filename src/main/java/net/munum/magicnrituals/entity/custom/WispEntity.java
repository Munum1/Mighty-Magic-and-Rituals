package net.munum.magicnrituals.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.munum.magicnrituals.entity.ModEntities;
import net.munum.magicnrituals.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class WispEntity extends Animal {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;


    public WispEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));

        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.25, stack -> stack.is(ModItems.MOONSTONE.get()), false));

        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25));

        this.goalSelector.addGoal(5, new WaterAvoidingRandomFlyingGoal(this, 1.0));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));

    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 10D)
                .add(Attributes.FLYING_SPEED, 0.5D)
                .add(Attributes.FOLLOW_RANGE, 24D);
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(ModItems.MOONSTONE.get());
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return ModEntities.WISP.get().create(pLevel);

    }
        private void setupAnimationStates() {
            if(this.idleAnimationTimeout <= 0) {
                this.idleAnimationTimeout = 40;
                this.idleAnimationState.start(this.tickCount);
            } else {
                --this.idleAnimationTimeout;
            }
        }

        @Override
        public void tick() {
            super.tick();

            if(this.level().isClientSide()) {
                this.setupAnimationStates();
            }
        }
    }