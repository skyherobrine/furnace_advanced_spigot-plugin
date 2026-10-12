package dev.skyherobrine.plugin.spigot.listener.inventory;

import dev.skyherobrine.plugin.spigot.FurnaceAdvanced;
import dev.skyherobrine.plugin.spigot.inventory.ListFurnaceMenuInventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ListFurnaceMenuListener implements Listener {

    private FurnaceAdvanced plugin;

    public ListFurnaceMenuListener(FurnaceAdvanced plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        if(event.getInventory().equals(ListFurnaceMenuInventory.getInventory())) {

        }
    }
}
