package me.jopieh.betterrealisticworld.Events;

import me.jopieh.betterrealisticworld.BetterRealisticWorld;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.plugin.Plugin;

public class BucketFillEvent implements Listener {

    Plugin plugin = BetterRealisticWorld.getPlugin(BetterRealisticWorld.class);
    private String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    @EventHandler
    public void onBucketFillEvent (PlayerBucketFillEvent e){
        Player player = (Player) e.getPlayer();
        player.sendMessage(colorize(plugin.getConfig().getString("BucketFillMsg").replaceAll("%player_name%", player.getName())));

    }




}
