package me.jopieh.betterrealisticworld.Events;

import me.jopieh.betterrealisticworld.BetterRealisticWorld;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class bedleave implements Listener {
    Plugin plugin = BetterRealisticWorld.getPlugin(BetterRealisticWorld.class);

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event) {
        Player player = (Player) event.getPlayer();
        player.sendMessage(plugin.getConfig().getString("BedLeaveMsg"));
        player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 140, 2));
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
    }


}
