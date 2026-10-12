package dev.skyherobrine.plugin.spigot;

import dev.skyherobrine.plugin.spigot.command.MenuCommand;
import dev.skyherobrine.plugin.spigot.listener.*;
import dev.skyherobrine.plugin.spigot.listener.inventory.FurnaceMenuListener;
import dev.skyherobrine.plugin.spigot.listener.inventory.ListFurnaceMenuListener;
import dev.skyherobrine.plugin.spigot.listener.inventory.OverviewMenuListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class FurnaceAdvanced extends JavaPlugin {

    @Override
    public void onEnable() {
        // Load configuration file
        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();

        // Plugin startup logic
        registerListeners();
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerListeners() {
        this.getServer().getPluginManager().registerEvents(new FurnaceCookListener(this), this);
        this.getServer().getPluginManager().registerEvents(new FurnaceSetListener(this), this);
        this.getServer().getPluginManager().registerEvents(new FurnaceInteractListener(this), this);
        this.getServer().getPluginManager().registerEvents(new OverviewMenuListener(this), this);
        this.getServer().getPluginManager().registerEvents(new ListFurnaceMenuListener(this), this);
        this.getServer().getPluginManager().registerEvents(new FurnaceMenuListener(this), this);
    }

    private void registerCommands() {
        this.getCommand("fa").setExecutor(new MenuCommand(this));
    }

    public static Plugin getPlugin() {
        return Bukkit.getPluginManager().getPlugin("FurnaceAdvanced");
    }
}
