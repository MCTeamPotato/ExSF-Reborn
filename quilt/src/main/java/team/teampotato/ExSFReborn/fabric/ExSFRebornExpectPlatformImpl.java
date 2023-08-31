package team.teampotato.ExSFReborn.fabric;

import team.teampotato.ExSFReborn.ExSFRebornExpectPlatform;
import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class ExSFRebornExpectPlatformImpl {
    /**
     * This is our actual method to {@link ExSFRebornExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
