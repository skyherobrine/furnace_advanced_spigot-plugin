package dev.skyherobrine.plugin.spigot.listener;

import dev.skyherobrine.plugin.spigot.FurnaceAdvanced;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.plugin.Plugin;

public class FurnaceCookListener implements Listener {

    private FurnaceAdvanced plugin;

    public FurnaceCookListener(FurnaceAdvanced plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onFurnaceBurnEvent(FurnaceBurnEvent event) {

    }

    @EventHandler
    public void onFurnaceSmeltEvent(FurnaceSmeltEvent event) {

    }
}
