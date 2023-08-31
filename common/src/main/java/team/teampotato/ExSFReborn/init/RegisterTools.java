package team.teampotato.ExSFReborn.init;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.*;
import team.teampotato.ExSFReborn.items.ItemTab;
import team.teampotato.ExSFReborn.items.Materials.ToolsMaterials;

import static team.teampotato.ExSFReborn.init.RegisterFoods.ITEMS;

public class RegisterTools {

    public static RegistrySupplier<PickaxeItem> RegistryPickAxe(String ToolName, int Damage, float Speed, ToolsMaterials Tool_Material) {
        return ITEMS.register(ToolName, () ->
                new PickaxeItem(Tool_Material, Damage, Speed, new Item.Properties()
                        .tab(ItemTab.ExSFReborn_TOOL_TAB)));
    }

    public static RegistrySupplier<SwordItem> RegistrySword(String ToolName, int Damage, float Speed, ToolsMaterials Tool_Material) {
        return ITEMS.register(ToolName, () ->
                new SwordItem(Tool_Material, Damage, Speed, new Item.Properties()
                        .tab(ItemTab.ExSFReborn_TOOL_TAB)));
    }

    public static RegistrySupplier<AxeItem> RegistryAxe(String ToolName, int Damage, float Speed, ToolsMaterials Tool_Material) {
        return ITEMS.register(ToolName, () ->
                new AxeItem(Tool_Material, Damage, Speed, new Item.Properties()
                        .tab(ItemTab.ExSFReborn_TOOL_TAB)));
    }

    public static RegistrySupplier<ShovelItem> RegistryShovel(String ToolName, int Damage, float Speed, ToolsMaterials Tool_Material) {
        return ITEMS.register(ToolName, () ->
                new ShovelItem(Tool_Material, Damage, Speed, new Item.Properties()
                        .tab(ItemTab.ExSFReborn_TOOL_TAB)));
    }
}
