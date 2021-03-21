package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

public class creeper implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        World world = (World) p.getWorld();
        if (p.hasPermission("bruhcmd.creeper")) {
            if (Main.instance.getConfig().getString("configuration.enabled-commands.creeper").equalsIgnoreCase("true")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aCreeper? &cAw man."));
                BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 4));
                    Creeper c = (Creeper) world.spawnEntity(p.getLocation(), EntityType.CREEPER);
                    c.setPowered(true);
                    Creeper c2 = (Creeper) world.spawnEntity(p.getLocation(), EntityType.CREEPER);
                    c2.setPowered(true);
                    Creeper c3 = (Creeper) world.spawnEntity(p.getLocation(), EntityType.CREEPER);
                    c3.setPowered(true);
                    Creeper c4 = (Creeper) world.spawnEntity(p.getLocation(), EntityType.CREEPER);
                    c4.setPowered(true);
                }, 60);
            }
        }
        return false;
    }
}
