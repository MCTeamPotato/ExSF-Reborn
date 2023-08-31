package team.teampotato.ExSFReborn.items;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import team.teampotato.ExSFReborn.ExSFReborn;

public class ItemTab {
    //工具栏
    public static final CreativeModeTab ExSFReborn_TOOL_TAB = CreativeTabRegistry.create(new ResourceLocation(ExSFReborn.MOD_ID, "exstrangefoodreborntool"), () ->
            new ItemStack(ExSFRebornItem.ExSFSword.get().asItem()));
    //食物栏
    public static final CreativeModeTab ExSFReborn_FOOD_TAB = CreativeTabRegistry.create(new ResourceLocation(ExSFReborn.MOD_ID, "exstrangefoodrebornfood"), () ->
            new ItemStack(ExSFRebornItem.food_apotato.get().asItem()));
    //盔甲栏
    public static final CreativeModeTab ExSFReborn_ARMOR_TAB = CreativeTabRegistry.create(new ResourceLocation(ExSFReborn.MOD_ID, "exstrangefoodrebornarmor"), () ->
            new ItemStack(ExSFRebornItem.CopperChest.get().asItem()));

}
