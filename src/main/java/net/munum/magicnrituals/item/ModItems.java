package net.munum.magicnrituals.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.block.ModBlocks;
import net.munum.magicnrituals.item.custom.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicnRituals.MOD_ID);

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ROSE_QUARTZ = ITEMS.register("raw_rose_quartz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GARLIC)));

  public static final RegistryObject<Item> GARLIC_BREAD = ITEMS.register("garlic_bread",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GARLIC_BREAD)));

  public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new FuelItem(new Item.Properties(),1200));

  public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
          () -> new SwordItem(ModToolTiers.RUBY, new Item.Properties()
                  .attributes(SwordItem.createAttributes(ModToolTiers.RUBY, 3, -2.4f))));
  public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
          () -> new PickaxeItem(ModToolTiers.RUBY, new Item.Properties()
                  .attributes(PickaxeItem.createAttributes(ModToolTiers.RUBY, 1, -2.8f))));
  public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
          () -> new ShovelItem(ModToolTiers.RUBY, new Item.Properties()
                  .attributes(ShovelItem.createAttributes(ModToolTiers.RUBY, 1.5f, -3.0f))));
  public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
          () -> new AxeItem(ModToolTiers.RUBY, new Item.Properties()
                  .attributes(AxeItem.createAttributes(ModToolTiers.RUBY, 6, -3.2f))));
  public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
          () -> new HoeItem(ModToolTiers.RUBY, new Item.Properties()
                  .attributes(HoeItem.createAttributes(ModToolTiers.RUBY, 0, -3.0f))));

  public static final RegistryObject<Item> RUBY_HAMMER = ITEMS.register("ruby_hammer",
          () -> new HammerItem(ModToolTiers.RUBY, new Item.Properties()
                  .attributes(PickaxeItem.createAttributes(ModToolTiers.RUBY, 7, -3.5f))));

  public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
          () -> new ModArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                  new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
  public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
          () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                  new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
  public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
          () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                  new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
  public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
          () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                  new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

  public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor",
          () -> new AnimalArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                  false, new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> MOONSTONE_BOW = ITEMS.register("moonstone_bow",
          () -> new BowItem(new Item.Properties().durability(500)));

  public static final RegistryObject<Item> GARLIC_SEEDS = ITEMS.register("garlic_seeds",
          () -> new ItemNameBlockItem(ModBlocks.GARLIC_CROP.get(), new Item.Properties()));

  public static final RegistryObject<Item> SNOWBERRIES = ITEMS.register("snowberries",
          () -> new ItemNameBlockItem(ModBlocks.SNOWBERRY_BUSH.get(), new Item.Properties().food(ModFoodProperties.SNOWBERRIES)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
