package team.teampotato.ExSFReborn.quilt;

import team.teampotato.ExSFReborn.ExSFReborn;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ExSFRebornModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        ExSFReborn.init();
    }
}
