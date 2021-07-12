package SMFOS;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    Logger logger = getServer().getLogger();

    @Override
    public void onEnable() {
        logger.info("SMFOS is activated");

    }

    @Override
    public void onDisable() {
        logger.info("SMFOS is unactivated");

    }
}
