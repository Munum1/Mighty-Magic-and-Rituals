package net.munum.magicnrituals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY.get(),
                ModBlocks.RUBY_ORE.get(), ModBlocks.RUBY_DEEPSLATE_ORE.get(),
                ModBlocks.RUBY_NETHER_ORE.get(), ModBlocks.RUBY_END_ORE.get());

        List<ItemLike> ROSE_QUARTZ_SMELTABLES = List.of(ModItems.RAW_ROSE_QUARTZ.get(),
                ModBlocks.ROSE_QUARTZ_ORE.get(), ModBlocks.ROSE_QUARTZ_DEEPSLATE_ORE.get(),
                ModBlocks.ROSE_QUARTZ_NETHER_ORE.get(), ModBlocks.ROSE_QUARTZ_END_ORE.get());

        List<ItemLike> AETHERIUM_SMELTABLES = List.of(ModItems.RAW_AETHERIUM.get(),
                ModBlocks.AETHERIUM_ORE.get(), ModBlocks.AETHERIUM_DEEPSLATE_ORE.get());

        List<ItemLike> SOULSTEEL_SMELTABLES = List.of(ModItems.RAW_SOULSTEEL.get(),
                ModBlocks.SOULSTEEL_ORE.get(), ModBlocks.SOULSTEEL_DEEPSLATE_ORE.get());

        List<ItemLike> LUMINITITE_SMELTABLES = List.of(ModItems.RAW_LUMINITITE.get(),
                ModBlocks.LUMINITITE_ORE.get(), ModBlocks.LUMINITITE_DEEPSLATE_ORE.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A' , ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AETHERIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A' , ModItems.AETHERIUM.get())
                .unlockedBy(getHasName(ModItems.AETHERIUM.get()), has(ModItems.AETHERIUM.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOULSTEEL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A' , ModItems.SOULSTEEL.get())
                .unlockedBy(getHasName(ModItems.SOULSTEEL.get()), has(ModItems.SOULSTEEL.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LUMINITITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A' , ModItems.LUMINITITE.get())
                .unlockedBy(getHasName(ModItems.LUMINITITE.get()), has(ModItems.LUMINITITE.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A' , ModItems.RUBY.get())
                .define('B' , Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_PICKAXE.get())
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A' , ModItems.RUBY.get())
                .define('B' , Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_SHOVEL.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A' , ModItems.RUBY.get())
                .define('B' , Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_AXE.get())
                .pattern("AA ")
                .pattern("AB ")
                .pattern(" B ")
                .define('A' , ModItems.RUBY.get())
                .define('B' , Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_HOE.get())
                .pattern("AA ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A' , ModItems.RUBY.get())
                .define('B' , Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_HAMMER.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" B ")
                .define('A' , ModItems.RUBY.get())
                .define('B' , Items.STICK)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput );


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A' , ModItems.RAW_RUBY.get())
                .unlockedBy(getHasName(ModItems.RAW_RUBY.get()), has(ModItems.RAW_RUBY.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ROSE_QUARTZ_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A' , ModItems.RAW_ROSE_QUARTZ.get())
                .unlockedBy(getHasName(ModItems.RAW_ROSE_QUARTZ.get()), has(ModItems.RAW_ROSE_QUARTZ.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOONSTONE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A' , ModItems.MOONSTONE.get())
                .unlockedBy(getHasName(ModItems.MOONSTONE.get()), has(ModItems.MOONSTONE.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A' , ModItems.ROSE_QUARTZ.get())
                .unlockedBy(getHasName(ModItems.ROSE_QUARTZ.get()), has(ModItems.ROSE_QUARTZ.get())).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_LAMP.get())
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A' , Items.REDSTONE)
                .define('B', ModBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()), has(Items.REDSTONE)).save(pRecipeOutput );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALTAR_BLOCK.get())
                .pattern(" B ")
                .pattern("ACA")
                .pattern("ADA")
                .define('A', Items.STONE)
                .define('B', ModItems.RUBY.get())
                .define('C', ModItems.ROSE_QUARTZ.get())
                .define('D', Items.LAPIS_LAZULI)
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_BOW.get())
                .pattern(" BA")
                .pattern("BCA")
                .pattern(" BA")
                .define('A', Items.STRING)
                .define('B', Items.STICK)
                .define('C', ModBlocks.MOONSTONE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.MOONSTONE.get()), has(ModItems.MOONSTONE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARCANE_CIRCUIT.get())
                .pattern("AAC")
                .pattern("ABC")
                .pattern("AAC")
                .define('A', ModItems.SOULSTEEL.get())
                .define('B', Items.REDSTONE)
                .define('C', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(ModItems.SOULSTEEL.get()), has(ModItems.SOULSTEEL.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GROWTH_CHAMBER.get())
                .pattern("DED")
                .pattern("BCB")
                .pattern("AAA")
                .define('A', ModItems.SOULSTEEL.get())
                .define('B', Items.GLASS)
                .define('C', ModItems.ARCANE_CIRCUIT.get())
                .define('D', Items.SMOOTH_STONE)
                .define('E', ModItems.MOONSTONE_DUST.get())
                .unlockedBy(getHasName(ModItems.SOULSTEEL.get()), has(ModItems.SOULSTEEL.get())).save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()),has(ModBlocks.RUBY_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.AETHERIUM.get(), 9)
                .requires(ModBlocks.AETHERIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AETHERIUM_BLOCK.get()),has(ModBlocks.AETHERIUM_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.GARLIC_BREAD.get(), 1)
                .requires(ModItems.GARLIC.get())
                .requires(Items.BREAD)
                .unlockedBy(getHasName(ModItems.GARLIC_BREAD.get()),has(ModItems.GARLIC_BREAD.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHISEL.get(), 1)
                        .requires(ModItems.RUBY.get())
                        .requires(Items.STICK)
                        .unlockedBy(getHasName(ModItems.CHISEL.get()), has(ModItems.CHISEL.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACKTHORN_PLANKS.get(), 4)
                .requires(ModBlocks.BLACKTHORN_LOG.get())
                .unlockedBy(getHasName(ModBlocks.BLACKTHORN_LOG.get()), has(ModBlocks.BLACKTHORN_LOG.get())).save(pRecipeOutput);


        oreSmelting(pRecipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(),0.25f,200,"ruby");
        oreSmelting(pRecipeOutput, SOULSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.SOULSTEEL.get(),0.25f,200,"soulsteel");
        oreSmelting(pRecipeOutput, ROSE_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.ROSE_QUARTZ.get(),0.25f,200,"rose_quartz");
        oreSmelting(pRecipeOutput, AETHERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.AETHERIUM.get(),0.25f,200,"aetherium");
        oreSmelting(pRecipeOutput, LUMINITITE_SMELTABLES, RecipeCategory.MISC, ModItems.LUMINITITE.get(),0.25f,200,"luminitite");
        oreBlasting(pRecipeOutput, SOULSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.SOULSTEEL.get(),0.25f,100,"soulsteel");
        oreBlasting(pRecipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(),0.25f,100,"ruby");
        oreBlasting(pRecipeOutput, AETHERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.AETHERIUM.get(),0.25f,100,"aetherium");
        oreBlasting(pRecipeOutput, ROSE_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.ROSE_QUARTZ.get(),0.25f,100,"rose_quartz");
        oreBlasting(pRecipeOutput, LUMINITITE_SMELTABLES, RecipeCategory.MISC, ModItems.LUMINITITE.get(),0.25f,100,"luminitite");

        stairBuilder(ModBlocks.RUBY_STAIRS.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);

        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_SLAB.get(), ModItems.RUBY.get());

        buttonBuilder(ModBlocks.RUBY_BUTTON.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.RUBY_PRESSURE_PLATE.get(), ModItems.RUBY.get());

        fenceBuilder(ModBlocks.RUBY_FENCE.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.RUBY_FENCE_GATE.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_WALL.get(), ModItems.RUBY.get());

        doorBuilder(ModBlocks.RUBY_DOOR.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.RUBY_TRAPDOOR.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);






    }
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MagicnRituals.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

