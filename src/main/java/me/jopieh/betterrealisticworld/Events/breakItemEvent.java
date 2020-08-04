package me.jopieh.betterrealisticworld.Events;

import me.jopieh.betterrealisticworld.BetterRealisticWorld;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.plugin.Plugin;

public class breakItemEvent implements Listener {

    Plugin plugin = BetterRealisticWorld.getPlugin(BetterRealisticWorld.class);
    private String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }


    @EventHandler
    public void onPlayerBrokeItem (PlayerItemBreakEvent event){
        Player player = event.getPlayer();
        player.sendMessage(colorize(plugin.getConfig().getString("BreakItemPlayerMsg").replaceAll("%player_name%", player.getName())));
        System.out.println((colorize(plugin.getConfig().getString("BreakItemConsoleMsg").replaceAll("%player_name%", player.getName()))));

    }




}
