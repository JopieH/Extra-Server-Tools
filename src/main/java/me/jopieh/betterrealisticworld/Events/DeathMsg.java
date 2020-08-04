package me.jopieh.betterrealisticworld.Events;

import me.jopieh.betterrealisticworld.BetterRealisticWorld;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.Plugin;

public class DeathMsg implements Listener {
    Plugin plugin = BetterRealisticWorld.getPlugin(BetterRealisticWorld.class);

    private String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
            Player player = (Player) event.getEntity();
            event.setDeathMessage(colorize(plugin.getConfig().getString("DeathMessage").replaceAll("%player_name%", player.getName())));
        }

    }






