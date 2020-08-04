package me.jopieh.betterrealisticworld;

import me.jopieh.betterrealisticworld.Events.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BetterRealisticWorld extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Getting Plugin Ready...");
        getServer().getPluginManager().registerEvents(new bedleave(), this);
        getServer().getPluginManager().registerEvents(new BedEnter(), this);
        getServer().getPluginManager().registerEvents(new DeathMsg(), this);
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getServer().getPluginManager().registerEvents(new QuitEvent(), this);
        getServer().getPluginManager().registerEvents(new breakItemEvent(), this);
        getServer().getPluginManager().registerEvents(new BucketEmptyEvent(), this);
        getServer().getPluginManager().registerEvents(new BucketFillEvent(), this);
        Metrics metrics = new Metrics(this, 	[metrics code]);
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        System.out.println("PLUGIN: on");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Turning off.");
    }
}
