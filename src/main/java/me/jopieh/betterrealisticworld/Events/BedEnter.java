package me.jopieh.betterrealisticworld.Events;

import me.jopieh.betterrealisticworld.BetterRealisticWorld;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.Plugin;

public class BedEnter implements Listener {

        Plugin plugin = BetterRealisticWorld.getPlugin(BetterRealisticWorld.class);

        @EventHandler
        public void onEnterBed(PlayerBedEnterEvent event) {
            Player player = (Player) event.getPlayer();
            event.setCancelled(Boolean.parseBoolean(plugin.getConfig().getString("cancelsleep")));
            player.sendMessage(plugin.getConfig().getString("BedEnterMsg"));
        }


    }






