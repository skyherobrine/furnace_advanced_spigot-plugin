package dev.skyherobrine.plugin.spigot.listener.inventory;

import dev.skyherobrine.plugin.spigot.FurnaceAdvanced;
import dev.skyherobrine.plugin.spigot.inventory.FurnaceMenuInventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class FurnaceMenuListener implements Listener {

    private FurnaceAdvanced plugin;

    public FurnaceMenuListener(FurnaceAdvanced plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        if(event.getInventory().equals(FurnaceMenuInventory.getInventory())) {

        }
    }
}
