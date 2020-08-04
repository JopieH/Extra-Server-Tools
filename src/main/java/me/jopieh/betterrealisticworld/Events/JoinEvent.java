package me.jopieh.betterrealisticworld.Events;

import me.jopieh.betterrealisticworld.BetterRealisticWorld;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class JoinEvent implements Listener {

    Plugin plugin = BetterRealisticWorld.getPlugin(BetterRealisticWorld.class);


    private String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!(player.hasPlayedBefore())) {
            event.setJoinMessage(colorize(plugin.getConfig().getString("FirstJoinMessage").replaceAll("%player_name%", player.getName())));
            return;
        }
        event.setJoinMessage(colorize(plugin.getConfig().getString("JoinMessage").replaceAll("%player_name%", player.getName())));
    }

}
