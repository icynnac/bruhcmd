package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class YEET implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("bruhcmd.yeet")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(Main.prefix + " " + Main.consoleno);
            } else {
                if (Main.instance.getConfig().getString("enabled-commands.yeet").equalsIgnoreCase("true")) {
                    if (args.length > 0) {
                        if (sender.hasPermission("bruhcmd.yeet-others")) {
                            if (Main.instance.getConfig().getString("enabled-commands.yeet-others").equalsIgnoreCase("true")) {
                                Player target = Bukkit.getPlayer(args[0]);
                                if (target != null) {
                                    Location loc = target.getLocation();
                                    Vector center = loc.toVector();
                                    Vector toThrow = target.getLocation().toVector();
                                    double x = toThrow.getX() - center.getX();
                                    double z = toThrow.getZ() - center.getZ();

                                    Vector v = new Vector (x,1,z).normalize().multiply(3.5);

                                    target.setVelocity(v);
                                    target.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " &cYEET"));
                                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " &aYou have yeeted &a&l" + target.getName()));
                                } else {
                                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("messages.player-not-found")));
                                }
                            } else {
                                sender.sendMessage(Main.prefix + " " + ChatColor.RED + "Yeeting others has been disabled by a server administrator.");
                            }
                        }
                    } else {
                        Player p = (Player) sender;
                        Location loc = p.getLocation();
                        Vector center = loc.toVector();
                        Vector toThrow = p.getLocation().toVector();

                        double x = toThrow.getX() - center.getX();
                        double z = toThrow.getZ() - center.getZ();

                        Vector v = new Vector (x,1,z).normalize().multiply(3.5);

                        p.setVelocity(v);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>>  &cYEET"));
                    }
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.notenable));
                }
            }
        } else {
            sender.sendMessage(Main.prefix + " " + Main.noperm);
        }
        return false;
    }
}
