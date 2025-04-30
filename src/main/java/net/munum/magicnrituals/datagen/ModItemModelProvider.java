package net.munum.magicnrituals.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.munum.magicnrituals.MagicnRituals;
import net.munum.magicnrituals.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MagicnRituals.MOD_ID, existingFileHelper);

    }



    @Override
    protected void registerModels() {
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.RAW_RUBY.get());

        basicItem(ModItems.CHISEL.get());

        basicItem(ModItems.GARLIC.get());
        basicItem(ModItems.GARLIC_BREAD.get());

        basicItem(ModItems.MOONSTONE.get());

    }
}
