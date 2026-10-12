package dev.skyherobrine.plugin.spigot.listener;

import dev.skyherobrine.plugin.spigot.FurnaceAdvanced;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;

public class FurnaceSetListener implements Listener {

    private FurnaceAdvanced plugin;

    public FurnaceSetListener(FurnaceAdvanced plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockPlaceEvent(BlockPlaceEvent event) {
        Material block = event.getBlock().getType();
        if(block.toString().equals("FURNACE") || block.toString().equals("BLAST_FURNACE")) {
            // Saving the location of the furnace has been placed and the player do that action.

        }
    }

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        Material block = event.getBlock().getType();
        if(block.toString().equals("FURNACE") || block.toString().equals("BLAST_FURNACE")) {
            // Remove the information where the furnace is being placed and the player do that action.

        }
    }
}
