package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.Main;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitScheduler;

public class joe implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (sender != null) {
            if (Main.instance.getConfig().getString("enabled-commands.joe").equalsIgnoreCase("true")) {
                if (sender.hasPermission("bruhcmd.joe")) {
                    if (args.length == 0) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "[Server] bruh joe robbed dat bank last week"));
                        p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(0, Note.Tone.E));
                        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                        scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + sender.getName() + "> who's joe"));
                        }, 60);
                        scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "[Server] &cJOE MAMA LOL XD"));
                            p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.G));
                        }, 120);
                        scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + sender.getName() + "> damn ok, but what comes before 47" ));
                        }, 180);
                        scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "[Server] dunno" ));
                            p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(0, Note.Tone.C));
                        }, 220);
                        scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + sender.getName() + "> &cAK." ));
                        }, 260);
                        scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                            p.sendMessage("[Server] was shot by " + p.getName() + "\n" + ChatColor.RED + "An unexpected error occured: [SERVER] died.");
                            p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_DEATH, SoundCategory.NEUTRAL, 10, 1);
                            p.giveExp(30);
                            p.getInventory().addItem(new ItemStack(Material.getMaterial(Main.instance.getConfig().getString("commands.reward-item").toUpperCase()), Main.instance.getConfig().getInt("commands.reward-amount")));
                        }, 280);
                    } else {
                        Player target = Bukkit.getPlayer(args[0]);
                        if (target == null) {
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("messages.player-not-found")));
                        } else {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + target.getName() + "> bruh joe robbed dat bank last week"));
                            target.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + target.getName() + "> bruh joe robbed dat bank last week"));
                            p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.A));
                            BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + sender.getName() + "> who's joe"));
                                target.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + sender.getName() + "> who's joe"));
                            }, 60);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + target.getName() + "> &cJOE MAMA LOL XD"));
                                target.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + target.getName() + "> &cJOE MAMA LOL XD"));
                                p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.A));
                            }, 120);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + sender.getName() + "> damn ok, but what comes before 47" ));
                                target.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + sender.getName() + "> damn ok, but what comes before 47"));
                            }, 180);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + target.getName() + "> dunno" ));
                                target.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + target.getName() + "> dunno"));
                                p.playNote(p.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.A));
                            }, 220);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + sender.getName() + "> &cAK." ));
                                target.sendMessage(ChatColor.translateAlternateColorCodes('&', "<" + sender.getName() + "> &cAK."));
                            }, 260);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                target.setHealth(0);
                                p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_AMBIENT, SoundCategory.NEUTRAL, 10, 1);
                                p.giveExp(30);
                                p.getInventory().addItem(new ItemStack(Material.getMaterial(Main.instance.getConfig().getString("commands.reward-item").toUpperCase()), Main.instance.getConfig().getInt("commands.reward-amount")));
                            }, 280);
                        }
                    }
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.noperm));
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.notenable));
            }
        } else {
            assert false;
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.consoleno));
        }
        return false;
    }
}
