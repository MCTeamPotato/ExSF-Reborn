package team.teampotato.ExSFReborn.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import team.teampotato.ExSFReborn.items.ItemTab;
import team.teampotato.ExSFReborn.items.Materials.ArmorsMaterials;

import static team.teampotato.ExSFReborn.init.RegisterFoods.ITEMS;

public class RegisterArmors {
    public static RegistrySupplier<ArmorItem> RegisterArmor(String Name, ArmorsMaterials ArmorMaterials, EquipmentSlot Equipment) {
        return ITEMS.register(Name, () ->
                new ArmorItem(ArmorMaterials, Equipment, new Item.Properties()
                        .tab(ItemTab.ExSFReborn_ARMOR_TAB)));
    }
}
