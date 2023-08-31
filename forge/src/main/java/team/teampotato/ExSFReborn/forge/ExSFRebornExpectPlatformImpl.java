package team.teampotato.ExSFReborn.forge;

import team.teampotato.ExSFReborn.ExSFRebornExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ExSFRebornExpectPlatformImpl {
    /**
     * This is our actual method to {@link ExSFRebornExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
