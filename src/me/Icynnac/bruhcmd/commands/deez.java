package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

public class deez implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("bruhcmd.dragon")) {
                if (Main.instance.getConfig().getString("enabled-commands.dragon").equalsIgnoreCase("true")) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Server has unbanned &4Dragon"));
                    BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> p.sendMessage("<" + p.getDisplayName() + "> Who tf is dragon???"),60);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.playSound(p.getLocation(), Sound.AMBIENT_CAVE, SoundCategory.AMBIENT, 3, 1);
                        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 10000,5));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10000,5));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 10000,5));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 10000,5));
                    },120);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> p.sendTitle(ChatColor.DARK_RED + "Dragon deez nuts.", ChatColor.RED + "across your face.", 20, 200, 20), 160);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.setHealth(0);
                        p.getWorld().strikeLightning(p.getLocation());
                    }, 400);
                } else {
                    sender.sendMessage(Main.prefix + " " + Main.notenable);
                }
            } else {
                sender.sendMessage(Main.prefix + " " + Main.noperm);
            }
        } else {
            sender.sendMessage(Main.prefix + " " + Main.consoleno);
        }
        return false;
    }
}
