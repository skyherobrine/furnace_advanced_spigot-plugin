package dev.skyherobrine.plugin.spigot.command;

import dev.skyherobrine.plugin.spigot.FurnaceAdvanced;
import dev.skyherobrine.plugin.spigot.inventory.OverviewMenuInventory;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

public class MenuCommand implements CommandExecutor {

    private FurnaceAdvanced plugin;

    public MenuCommand(FurnaceAdvanced plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 0) {
                showListCommands(player);
            } else if(args.length == 1) {
                switch(args[0]) {
                    case "help": {
                        showListCommands(player);
                        break;
                    }
                    case "menu": {
                        Inventory overviewMenuInventory = new OverviewMenuInventory(plugin).getInventory();
                        player.openInventory(overviewMenuInventory);
                    }
                }
            }

            return true;
        } else {
            sender.sendMessage("You must be a player to execute this command");
            return false;
        }
    }

    private void showListCommands(Player player) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("plugin-prefix") + " Furnace Advanced Help"));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "A plugin has been made by @skyherobrine"));
        plugin.getConfig().getStringList("overview-menu.list-command.lore").forEach(message -> {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        });
    }
}
