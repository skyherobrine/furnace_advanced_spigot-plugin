package dev.skyherobrine.plugin.spigot.listener;

import dev.skyherobrine.plugin.spigot.FurnaceAdvanced;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

public class FurnaceInteractListener implements Listener {

    private FurnaceAdvanced plugin;

    public FurnaceInteractListener(FurnaceAdvanced plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockInteractListener(PlayerInteractEvent event) {
        if(event.getClickedBlock() == null) return;

        Material block = event.getClickedBlock().getType();
        if ((block.toString().equals("FURNACE") || block.toString().equals("BLAST_FURNACE")) && event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            // Open the inventory of that furnace to see the options for upgrading

        }
    }
}
