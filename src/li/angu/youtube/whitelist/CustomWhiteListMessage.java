package li.angu.youtube.whitelist;

import li.angu.youtube.whitelist.config.WhiteListMessageConfig;
import li.angu.youtube.whitelist.listener.PlayerLoginListener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by finreinhard on 18.10.16.
 */
public class CustomWhiteListMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        loadConfig();
        loadListener();
    }

    private void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();

        new WhiteListMessageConfig(getConfig().getStringList("message"));
    }

    private void loadListener() {
        getServer().getPluginManager().registerEvents(new PlayerLoginListener(), this);
    }

}
