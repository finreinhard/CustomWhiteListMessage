package li.angu.youtube.whitelist.listener;

import li.angu.youtube.whitelist.config.WhiteListMessageConfig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * Created by finreinhard on 18.10.16.
 */
public class PlayerLoginListener implements Listener{

    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        if(event.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) {
            event.setKickMessage(WhiteListMessageConfig.getInstance().getMessage());
        }
    }

}
