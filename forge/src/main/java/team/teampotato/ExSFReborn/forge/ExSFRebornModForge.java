package team.teampotato.ExSFReborn.forge;

import dev.architectury.platform.forge.EventBuses;
import team.teampotato.ExSFReborn.ExSFReborn;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import team.teampotato.ExSFReborn.forge.DataGen.DataGenItemModelForge;

@Mod(ExSFReborn.MOD_ID)
public class ExSFRebornModForge {
    public ExSFRebornModForge() {
        // Submit our event bus to let architectury register our content on the right time

        EventBuses.registerModEventBus(ExSFReborn.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ExSFReborn.init();
    }
}
