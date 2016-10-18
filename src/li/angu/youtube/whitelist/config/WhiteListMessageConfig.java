package li.angu.youtube.whitelist.config;

import net.md_5.bungee.api.ChatColor;

import java.util.List;

/**
 * Created by finreinhard on 18.10.16.
 */
public class WhiteListMessageConfig {

    private static WhiteListMessageConfig instance;

    private String message;

    public WhiteListMessageConfig(List<String> lines) {
        instance = this;

        message = "";

        lines.forEach(line -> this.message += line + "\n");

        message = message.substring(0, message.length() - 1);
    }

    public static WhiteListMessageConfig getInstance() {
        return instance;
    }

    public String getMessage() {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

}
