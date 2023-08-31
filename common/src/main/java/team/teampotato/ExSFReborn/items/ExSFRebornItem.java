package team.teampotato.ExSFReborn.items;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import team.teampotato.ExSFReborn.init.RegisterArmors;
import team.teampotato.ExSFReborn.init.RegisterTools;
import team.teampotato.ExSFReborn.items.Materials.ArmorsMaterials;
import team.teampotato.ExSFReborn.items.Materials.ToolsMaterials;


import static team.teampotato.ExSFReborn.ExSFReborn.MOD_ID;
import static team.teampotato.ExSFReborn.init.RegisterFoods.*;

public class ExSFRebornItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);

    public static RegistrySupplier<Item> food_apotato = RegisterGoldFoods("food_apotato");
    public static RegistrySupplier<Item> food_goldbucket_of_axolotl = RegisterGoldFoods("food_goldbucket_of_axolotl");
    public static RegistrySupplier<Item> food_dragon060810 = RegisterGoldFoods("food_dragon060810");
    public static RegistrySupplier<Item> food_goldsteak = RegisterGoldFoods("food_goldsteak");
    public static RegistrySupplier<Item> food_goldcooked_rabbit = RegisterGoldFoods("food_goldcooked_rabbit");
    public static RegistrySupplier<Item> food_goldcooked_porkchop = RegisterGoldFoods("food_goldcooked_porkchop");
    public static RegistrySupplier<Item> food_goldcooked_mutton = RegisterGoldFoods("food_goldcooked_mutton");
    public static RegistrySupplier<Item> food_goldbeetroot_soup = RegisterGoldFoods("food_goldbeetroot_soup");
    public static RegistrySupplier<Item> food_goldmilk_bucket = RegisterGoldFoods("food_goldmilk_bucket");
    public static RegistrySupplier<Item> food_goldbread = RegisterGoldFoods("food_goldbread");
    public static RegistrySupplier<Item> food_goldpotato = RegisterGoldFoods("food_goldpotato");
    public static RegistrySupplier<Item> food_ironpotato = RegisterIronFoods("food_ironpotato");

    public static RegistrySupplier<Item> food_iron_milk_bucket = RegisterIronFoods("food_iron_milk_bucket");
    public static RegistrySupplier<Item> food_ironbread = RegisterIronFoods("food_ironbread");
    public static RegistrySupplier<Item> food_iron_bucket_of_axolotl = RegisterIronFoods("food_iron_bucket_of_axolotl");
    public static RegistrySupplier<Item> food_ironsteak = RegisterIronFoods("food_ironsteak");
    public static RegistrySupplier<Item> food_ironcooked_porkchop = RegisterIronFoods("food_ironcooked_porkchop");
    public static RegistrySupplier<Item> food_ironbeetroot_soup = RegisterIronFoods("food_ironbeetroot_soup");
    public static RegistrySupplier<Item> food_ironcooked_rabbit = RegisterIronFoods("food_ironcooked_rabbit");
    public static RegistrySupplier<Item> food_ironcooked_mutton = RegisterIronFoods("food_ironcooked_mutton");
    public static RegistrySupplier<Item> food_copper_and_iron = RegisterCopperFoods("food_copper_and_iron");
    public static RegistrySupplier<Item> food_copper_bucket_of_axolotl = RegisterCopperFoods("food_copper_bucket_of_axolotl");
    public static RegistrySupplier<Item> food_copperbeetroot_soup = RegisterCopperFoods("food_copperbeetroot_soup");
    public static RegistrySupplier<Item> food_copperbread = RegisterCopperFoods("food_copperbread");
    public static RegistrySupplier<Item> food_coppercooked_mutton = RegisterCopperFoods("food_coppercooked_mutton");
    public static RegistrySupplier<Item> food_coppercooked_porkchop = RegisterCopperFoods("food_coppercooked_porkchop");
    public static RegistrySupplier<Item> food_coppercooked_rabbit = RegisterCopperFoods("food_coppercooked_rabbit");
    public static RegistrySupplier<Item> food_coppermilk_bucke= RegisterCopperFoods("food_coppermilk_bucket");
    public static RegistrySupplier<Item> food_copperpotato = RegisterCopperFoods("food_copperpotato");
    public static RegistrySupplier<Item> food_coppersteak = RegisterCopperFoods("food_coppersteak");
    public static RegistrySupplier<Item> food_exsfsyncreti = RegisterNetherFoods("ingot_exsfsyncretic");
    public static RegistrySupplier<Item> food_coarsenetherite = RegisterNetherFoods("coarse_netherite");
    public static RegistrySupplier<Item> food_nether_stick = RegisterNetherFoods("stick_nether_stick");
    public static RegistrySupplier<Item> food_nether_torch = RegisterNetherFoods("food_nether_torch");
    //这里不是食物力
    //ExSF的工具
    public static RegistrySupplier<SwordItem> ExSFSword = RegisterTools.RegistrySword("tool_syncretic_sword",7,-1F, ToolsMaterials.ExSFItem);
    public static RegistrySupplier<PickaxeItem> ExSFPickaxe = RegisterTools.RegistryPickAxe("tool_syncretic_pickaxe",2,-1F, ToolsMaterials.ExSFItem);
    public static RegistrySupplier<AxeItem> ExSFAxe = RegisterTools.RegistryAxe("tool_syncretic_axe",5,-2F, ToolsMaterials.ExSFItem);
    public static RegistrySupplier<ShovelItem> ExSFShovel = RegisterTools.RegistryShovel("tool_syncretic_shovel",2,-1F,ToolsMaterials.ExSFItem);
    //紫水晶
    public static RegistrySupplier<SwordItem> AmethystSword = RegisterTools.RegistrySword("tool_amethystshard_sword",2,-2.4F,ToolsMaterials.AMETHYST);
    public static RegistrySupplier<PickaxeItem> AmethystPickaxe = RegisterTools.RegistryPickAxe("tool_amethystshard_pickaxe",0,-2.8F,ToolsMaterials.AMETHYST);
    public static RegistrySupplier<AxeItem> AmethystAxe = RegisterTools.RegistryAxe("tool_amethystshard_axe",5,-3.0F,ToolsMaterials.AMETHYST);
    public static RegistrySupplier<ShovelItem> AmethystShovel = RegisterTools.RegistryShovel("tool_amethystshard_shovel",0,-3F,ToolsMaterials.AMETHYST);
    //创建铜工具-默认
    public static RegistrySupplier<SwordItem> CopperSword = RegisterTools.RegistrySword("tool_copper_sword", 2, -2.4F,ToolsMaterials.COPPER);
    public static RegistrySupplier<PickaxeItem> CopperPickaxe = RegisterTools.RegistryPickAxe("tool_copper_pickaxe", 0, -2.8F, ToolsMaterials.COPPER);
    public static RegistrySupplier<AxeItem> CopperAxe = RegisterTools.RegistryAxe("tool_copper_axe", 5, -3.0F, ToolsMaterials.COPPER);
    public static RegistrySupplier<ShovelItem> copper_shovel = RegisterTools.RegistryShovel("tool_copper_shovel", 0, -3.0F, ToolsMaterials.COPPER);

    //创建铜护甲
    public static RegistrySupplier<ArmorItem> CopperHelmet = RegisterArmors.RegisterArmor("armor_copper_helmet",ArmorsMaterials.COPPER, EquipmentSlot.HEAD);
    public static RegistrySupplier<ArmorItem> CopperChest = RegisterArmors.RegisterArmor("armor_copper_chestplate",ArmorsMaterials.COPPER, EquipmentSlot.CHEST);
    public static RegistrySupplier<ArmorItem> CopperLeggings = RegisterArmors.RegisterArmor("armor_copper_leggings",ArmorsMaterials.COPPER, EquipmentSlot.LEGS);
    public static RegistrySupplier<ArmorItem> CopperBoots =RegisterArmors.RegisterArmor("armor_copper_boots",ArmorsMaterials.COPPER, EquipmentSlot.FEET);
    //创建紫水晶护甲
    public static RegistrySupplier<ArmorItem> AmethystHelmet = RegisterArmors.RegisterArmor("armor_amethystshard_helmet",ArmorsMaterials.AMETHYST, EquipmentSlot.HEAD);
    public static RegistrySupplier<ArmorItem> AmethystChest = RegisterArmors.RegisterArmor("armor_amethystshard_chestplate",ArmorsMaterials.AMETHYST, EquipmentSlot.CHEST);
    public static RegistrySupplier<ArmorItem> AmethystLeggings = RegisterArmors.RegisterArmor("armor_amethystshard_leggings",ArmorsMaterials.AMETHYST, EquipmentSlot.LEGS);
    public static RegistrySupplier<ArmorItem> AmethystBoots = RegisterArmors.RegisterArmor("armor_amethystshard_boots",ArmorsMaterials.AMETHYST, EquipmentSlot.FEET);


}
