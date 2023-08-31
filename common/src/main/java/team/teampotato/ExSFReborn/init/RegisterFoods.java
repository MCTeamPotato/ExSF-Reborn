package team.teampotato.ExSFReborn.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import team.teampotato.ExSFReborn.items.ItemTab;
import static team.teampotato.ExSFReborn.ExSFReborn.MOD_ID;

public class RegisterFoods {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);

    private static class FoodItemInfo {
        String name;
        FoodProperties foodProperties;

        public FoodItemInfo(String name, FoodProperties foodProperties) {
            this.name = name;
            this.foodProperties = foodProperties;
        }
    }

    public static FoodItemInfo RegisterGoldFood(String foodName) {
        FoodProperties properties = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.6F)
                .build();
        return new FoodItemInfo(foodName, properties);
    }

    public static RegistrySupplier<Item> RegisterFood(FoodItemInfo Food, String name) {
        return ITEMS.register(name, () ->
                new Item(new Item.Properties()
                        .tab(ItemTab.ExSFReborn_FOOD_TAB)
                        .food(Food.foodProperties)));
    }

    public static RegistrySupplier<Item> RegisterGoldFoods(String name) {
        FoodItemInfo goldFoodInfo = RegisterGoldFood(name);
        return RegisterFood(goldFoodInfo, name);
    }
    public static FoodItemInfo RegisterIronFood(String foodName) {
        FoodProperties properties = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.6F)
                .build();
        return new FoodItemInfo(foodName, properties);
    }
    public static RegistrySupplier<Item> RegisterIronFoods(String name) {
        FoodItemInfo goldFoodInfo = RegisterIronFood(name);
        return RegisterFood(goldFoodInfo, name);
    }
    public static FoodItemInfo RegisterCopperFood(String foodName) {
        FoodProperties properties = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.6F)
                .build();
        return new FoodItemInfo(foodName, properties);
    }
    public static RegistrySupplier<Item> RegisterCopperFoods(String name) {
        FoodItemInfo goldFoodInfo = RegisterCopperFood(name);
        return RegisterFood(goldFoodInfo, name);
    }
    public static FoodItemInfo RegisterNetherFood(String foodName) {
        FoodProperties properties = new FoodProperties.Builder()
                .nutrition(10)
                .saturationMod(0.6F)
                .build();
        return new FoodItemInfo(foodName, properties);
    }
    public static RegistrySupplier<Item> RegisterNetherFoods(String name) {
        FoodItemInfo goldFoodInfo = RegisterNetherFood(name);
        return RegisterFood(goldFoodInfo, name);
    }

}
