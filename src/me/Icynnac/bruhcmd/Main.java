package me.icynnac.bruhcmd;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.util.Vector;

import java.util.logging.Logger;

@SuppressWarnings("unused")
public final class Main extends JavaPlugin {

    private boolean update;

    @Override
    public void onEnable(){
        this.saveDefaultConfig();

        Logger logger = this.getLogger();

        new UpdateChecker(this, 85804).getVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "BruhCMD >> " + ChatColor.RED + "No updates available.");
            } else {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "BruhCMD >> " + ChatColor.GREEN + "Theres an update available! Head to the BruhCMD Spigot page to update.");
            }
        });
    }

    @Override
    public void onDisable(){

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("bruh")) {
            if (args.length > 0) {
                if (args[0].equalsIgnoreCase("reload")) {
                    if (sender.hasPermission("bruhcmd.reload")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.reload-message")));
                        this.reloadConfig();
                    } else {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.no-permission-message")));
                    }
                }
            }
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.bruh-message")));
                return true;
            }
            if (args.length > 0) {
                if (args[0].equalsIgnoreCase("about")) {
                    if (sender.hasPermission("bruhcmd.about")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b--------BruhCMD--------"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bVersion: &f1.4"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bDeveloper: &fIcynnac"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', ""));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b- /bruh"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b- /bruh reload"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cAdministrator Command"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b- /bruh about"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cAdministrator Command"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b- /cutg"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cAdministrator Command"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b- /pop"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b- /yeet"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cAdministrator Command"));
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b------------------------"));
                    } else {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.no-permission-message")));
                    }
                }
            }
        }

        if (label.equalsIgnoreCase("cutg")) {
            if (sender.hasPermission("bruhcmd.cutg")) {
                if (!(sender instanceof Player)) {
                    sender.sendMessage(ChatColor.RED + "BruhCMD >> Hey! You can't use this command in console.");
                } else {
                    sender.sendMessage(ChatColor.BLUE + "Ooh you playin " + ChatColor.GREEN + "Minecraft?");
                    BukkitScheduler scheduler = getServer().getScheduler();
                    scheduler.scheduleSyncDelayedTask(this, new Runnable() {
                        @Override
                        public void run() {
                            sender.sendMessage(ChatColor.RED + "I like ya cut G.");
                            Player p = (Player) sender;
                            p.setHealth(0);
                            sender.sendMessage("<" + p.getDisplayName() + "> AAAAAAAAAAAAAAAAAAAAAAAA");
                        }
                    }, 20*3);
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.no-permission-message")));
            }
        }

        if (label.equalsIgnoreCase("pop")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "BruhCMD >> Hey! You can't use this command in console.");
            } else {
                Player p = (Player) sender;
                Location loc = p.getLocation();
                p.playNote(loc, Instrument.BASS_DRUM, Note.natural(0, Note.Tone.G));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &9pop."));
            }
        }

        if (label.equalsIgnoreCase("yeet")) {
            if (sender.hasPermission("bruhcmd.yeet")) {
                if (!(sender instanceof Player)) {
                    sender.sendMessage(ChatColor.RED + "BruhCMD >> Hey! You can't use this command in console.");
                } else {
                    Player p = (Player) sender;
                    Location loc = p.getLocation();
                    Vector center = loc.toVector();
                    Vector toThrow = p.getLocation().toVector();

                    double x = toThrow.getX() - center.getX();
                    double z = toThrow.getZ() - center.getZ();

                    Vector v = new Vector (x, 1, z).normalize ().multiply (3.5);

                    p.setVelocity(v);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>>  &cYEET"));
                }
            }
        }
        return false;
    }
}
