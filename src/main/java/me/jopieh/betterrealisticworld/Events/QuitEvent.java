package me.jopieh.betterrealisticworld.Events;

import me.jopieh.betterrealisticworld.BetterRealisticWorld;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class QuitEvent implements Listener {

    Plugin plugin = BetterRealisticWorld.getPlugin(BetterRealisticWorld.class);

    private String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
    @EventHandler
    public void onPlayerleave(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(colorize(plugin.getConfig().getString("LeaveMessage").replaceAll("%player_name%", player.getName())));
    }
}
