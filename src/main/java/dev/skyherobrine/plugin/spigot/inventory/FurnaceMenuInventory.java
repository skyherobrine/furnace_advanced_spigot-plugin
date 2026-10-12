package dev.skyherobrine.plugin.spigot.inventory;

import dev.skyherobrine.plugin.spigot.FurnaceAdvanced;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class FurnaceMenuInventory {

    private FurnaceAdvanced plugin;
    private static Inventory inventory;

    public FurnaceMenuInventory(FurnaceAdvanced plugin) {
        this.plugin = plugin;
        this.inventory = Bukkit.createInventory(null, 9, "Furnace Upgrade Menu");
        addItem();
    }

    private void addItem() {

    }

    public FurnaceAdvanced getPlugin() {
        return plugin;
    }

    public static Inventory getInventory() {
        return inventory;
    }
}
