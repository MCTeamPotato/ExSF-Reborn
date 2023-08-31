package team.teampotato.ExSFReborn.forge.DataGen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import team.teampotato.ExSFReborn.ExSFReborn;

public class DataGenItemModelForge extends ItemModelProvider {
    public DataGenItemModelForge(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExSFReborn.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /*
        generateItemModel("example_item");
        generateItemModel("another_item");
        // Add more item models here for other items

         */
    }

    public void DataGenItemModel(String itemName) {
        withExistingParent(itemName, modLoc("item/generated"))
                .texture("layer0", "item/" + itemName);
    }
}
