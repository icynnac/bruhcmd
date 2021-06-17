package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.guis.CyberbunkUI;
import me.icynnac.bruhcmd.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

public class cyberbunk implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // for anyone looking in this code, i dont fricking know the plot of cyberpunk, i just know its buggy af lmao
        CyberbunkUI commands = new CyberbunkUI();
        if (sender instanceof Player) {
            if (Main.instance.getConfig().getString("enabled-commands.cyberpunk").equals("true")) {
                if (sender.hasPermission("bruhcmd.cyberpunk")) {
                    Player p = (Player) sender;
                    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Integer.MAX_VALUE, 5));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 5));
                    p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&a&kFortnite"), ChatColor.GREEN + "Hacking in progress...");
                    BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&aF&kortnite"), ChatColor.GREEN + "Hacking in progress", 0, 20, 0);
                    },20);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&aFo&krtnite"), ChatColor.GREEN + "Hacking in progress.", 0, 20, 0);
                    },40);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&aFor&ktnite"), ChatColor.GREEN + "Hacking in progress..", 0, 20, 0);
                    },60);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&aFort&knite"), ChatColor.GREEN + "Hacking in progress...", 0, 20, 0);
                    },80);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&aFortn&kite"), ChatColor.GREEN + "Hacking in progress", 0, 20, 0);
                    },100);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&aFortni&kte"), ChatColor.GREEN + "Hacking in progress.", 0, 20, 0);
                    },120);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&aFortnit&ke"), ChatColor.GREEN + "Hacking in progress..", 0, 20, 0);
                    },140);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&aFortnite"), ChatColor.GREEN + "Hacking done, you're in.");
                    },160);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.openInventory(commands.getCommandsInventory());
                        p.removePotionEffect(PotionEffectType.SLOW);
                        p.removePotionEffect(PotionEffectType.BLINDNESS);
                    },220);
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.noperm));
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.notenable));
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.consoleno));
        }
        return false;
    }
}
