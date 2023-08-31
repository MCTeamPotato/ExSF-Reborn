package team.teampotato.ExSFReborn.fabric;

import team.teampotato.ExSFReborn.ExSFRebornExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class ExampleExpectPlatformImpl {
    /**
     * This is our actual method to {@link ExSFRebornExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
