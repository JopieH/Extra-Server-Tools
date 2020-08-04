package me.jopieh.betterrealisticworld.Events;

import me.jopieh.betterrealisticworld.BetterRealisticWorld;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.plugin.Plugin;

public class BucketEmptyEvent implements Listener {
    Plugin plugin = BetterRealisticWorld.getPlugin(BetterRealisticWorld.class);

    private String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    @EventHandler
    public void onBucketEmptyEvent (PlayerBucketEmptyEvent event){
        Player player = event.getPlayer();
        player.sendMessage(colorize(plugin.getConfig().getString("BucketEmptyMsg").replaceAll("%player_name%", player.getName())));

    }



}
