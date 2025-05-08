package net.munum.magicnrituals.datagen;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.block.custom.GarlicCropBlock;
import net.munum.magicnrituals.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);

    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.ROSE_QUARTZ_BLOCK.get());
        dropSelf(ModBlocks.RAW_RUBY_BLOCK.get());
        dropSelf(ModBlocks.RAW_ROSE_QUARTZ_BLOCK.get());
        dropSelf(ModBlocks.ALTAR_BLOCK.get());
        dropSelf(ModBlocks.MOONSTONE_BLOCK.get());
        dropSelf(ModBlocks.SOULSTEEL_BLOCK.get());
        dropSelf(ModBlocks.AETHERIUM_BLOCK.get());
        dropSelf(ModBlocks.LUMINITITE_BLOCK.get());


        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.LUMINITITE_ORE.get(),
                block -> createOreDrop(ModBlocks.LUMINITITE_ORE.get(), ModItems.RAW_LUMINITITE.get()));
        this.add(ModBlocks.SOULSTEEL_ORE.get(),
                block -> createOreDrop(ModBlocks.SOULSTEEL_ORE.get(), ModItems.RAW_SOULSTEEL.get()));
        this.add(ModBlocks.AETHERIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.AETHERIUM_ORE.get(), ModItems.RAW_AETHERIUM.get()));
        this.add(ModBlocks.RUBY_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBY_DEEPSLATE_ORE.get(), ModItems.RAW_RUBY.get(),1,1));
        this.add(ModBlocks.LUMINITITE_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.LUMINITITE_DEEPSLATE_ORE.get(), ModItems.RAW_LUMINITITE.get(),1,1));
        this.add(ModBlocks.SOULSTEEL_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SOULSTEEL_DEEPSLATE_ORE.get(), ModItems.RAW_SOULSTEEL.get(),1,1));
        this.add(ModBlocks.AETHERIUM_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.AETHERIUM_DEEPSLATE_ORE.get(), ModItems.RAW_AETHERIUM.get(),1,1));
        this.add(ModBlocks.ROSE_QUARTZ_ORE.get(),
                block -> createOreDrop(ModBlocks.ROSE_QUARTZ_ORE.get(), ModItems.RAW_ROSE_QUARTZ.get()));
        this.add(ModBlocks.ROSE_QUARTZ_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ROSE_QUARTZ_DEEPSLATE_ORE.get(), ModItems.RAW_ROSE_QUARTZ.get(),1,1));

        this.add(ModBlocks.RUBY_NETHER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBY_NETHER_ORE.get(), ModItems.RAW_RUBY.get(),1,1));
        this.add(ModBlocks.ROSE_QUARTZ_NETHER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ROSE_QUARTZ_NETHER_ORE.get(), ModItems.RAW_ROSE_QUARTZ.get(),1,1));

        this.add(ModBlocks.RUBY_END_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.RAW_RUBY.get(),1,2));
        this.add(ModBlocks.ROSE_QUARTZ_END_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ROSE_QUARTZ_END_ORE.get(), ModItems.RAW_ROSE_QUARTZ.get(),1,2));



        dropSelf(ModBlocks.RUBY_STAIRS.get());
        this.add(ModBlocks.RUBY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUBY_SLAB.get()));

        dropSelf(ModBlocks.RUBY_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.RUBY_BUTTON.get());
        dropSelf(ModBlocks.RUBY_FENCE.get());
        dropSelf(ModBlocks.RUBY_FENCE_GATE.get());
        dropSelf(ModBlocks.RUBY_WALL.get());
        dropSelf(ModBlocks.RUBY_TRAPDOOR.get());

        this.add(ModBlocks.RUBY_DOOR.get(),
                block -> createDoorTable(ModBlocks.RUBY_DOOR.get()));

        dropSelf(ModBlocks.RUBY_LAMP.get());

        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.GARLIC_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GarlicCropBlock.AGE, GarlicCropBlock.MAX_AGE));

        this.add(ModBlocks.GARLIC_CROP.get(), this.createCropDrops(ModBlocks.GARLIC_CROP.get(),
                ModItems.GARLIC.get(), ModItems.GARLIC_SEEDS.get(), lootItemConditionBuilder));

        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        this.add(ModBlocks.SNOWBERRY_BUSH.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.SNOWBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(ModItems.SNOWBERRIES.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.SNOWBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(ModItems.SNOWBERRIES.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )));



    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
