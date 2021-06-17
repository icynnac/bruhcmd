package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BruhCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("bruh")) {
            if (args.length == 0) {
                // TBLMidnyte was put in this class because 1: they paid invadedlands survival money, pog 2: yeah
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.instance.getConfig().getString("messages.bruh-message")));
            } else if (args.length > 0) {
                if (args[0].equalsIgnoreCase("reload")) {
                    if (sender.hasPermission("bruhcmd.reload")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.instance.getConfig().getString("messages.reload-message")));
                        Main.instance.reloadConfig();
                    } else {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("messages.no-permission-message")));
                    }
                }
            }
        }
        return false;
    }
}
