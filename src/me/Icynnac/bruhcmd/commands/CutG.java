package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

public class CutG implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("bruhcmd.cutg")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("configuration.messages.console-cannot-use")));
            } else {
                if (Main.instance.getConfig().getString("configuration.enabled-commands.cutg").equalsIgnoreCase("true")) {
                    sender.sendMessage(ChatColor.BLUE + "Ooh you playin " + ChatColor.GREEN + "Minecraft?");
                    BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        sender.sendMessage(ChatColor.RED + "I like ya cut G.");
                    }, 20*3);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        Player p = (Player) sender;
                        p.setHealth(0);
                        sender.sendMessage("<" + p.getDisplayName() + "> AAAAAAAAAAAAAAAAAAAAAAAA");
                    }, 20*5);
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("configuration.messages.not-enabled")));
                }
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("configuration.messages.no-permission-message")));
        }
        return false;
    }
}
