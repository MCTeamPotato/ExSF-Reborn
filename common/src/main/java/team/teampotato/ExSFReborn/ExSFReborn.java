package team.teampotato.ExSFReborn;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.Registries;
import team.teampotato.ExSFReborn.items.ExSFRebornItem;
import team.teampotato.ExSFReborn.init.RegisterFoods;

import java.util.function.Supplier;

public class ExSFReborn {
    public static final String MOD_ID = "exstrangefoodreborn";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    public static void init() {
        //ExSFRebornItemFood.ITEMS.register();
        RegisterFoods.ITEMS.register();
        ExSFRebornItem.ITEMS.register();//我也不知道为什么会注册上物品，还是写上去吧
        //System.out.println(ExSFRebornExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
