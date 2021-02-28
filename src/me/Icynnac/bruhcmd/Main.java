package me.icynnac.bruhcmd;

import me.icynnac.bruhcmd.gui.NewBruhAbout;
import me.icynnac.bruhcmd.gui.Events;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.util.Vector;

import java.io.File;
import java.util.logging.Logger;

@SuppressWarnings("unused")
public final class Main extends JavaPlugin {

    private boolean update;

    @Override
    public void onEnable(){
        getCommand("bruhcmd").setExecutor(new NewBruhAbout());
        getServer().getPluginManager().registerEvents(new Events(), this);
        if (Bukkit.getVersion().contains("1.12.2")) {
            BukkitScheduler scheduler = getServer().getScheduler();
            scheduler.scheduleSyncDelayedTask(this, new Runnable() {
                @Override
                public void run() {
                    Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "BruhCMD >> " + ChatColor.RED + "You're running an older version of spigot, some things in BruhCMD");
                    Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "BruhCMD >> " + ChatColor.RED + "may be changed/broken. Submit any bug reports to my GitHub issues page:");
                    Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "BruhCMD >> " + ChatColor.AQUA + "https://github.com/icynnac/bruhcmd/issues");
                }
            }, 20*10);
        }

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
                        }
                    }, 20*3);
                    scheduler.scheduleSyncDelayedTask(this, new Runnable() {
                        @Override
                        public void run() {
                            Player p = (Player) sender;
                            p.setHealth(0);
                            sender.sendMessage("<" + p.getDisplayName() + "> AAAAAAAAAAAAAAAAAAAAAAAA");
                        }
                    }, 20*5);
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
        if (label.equalsIgnoreCase("sus")) {
            if (sender.hasPermission("bruhcmd.sus")) {
                if (!(sender instanceof Player)) {
                    sender.sendMessage(ChatColor.RED + "BruhCMD >> Hey! You can't use this command in console.");
                } else {
                    Player p = (Player) sender;
                    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,20*5, 2));
                    p.sendTitle(ChatColor.RED + "Impostor", "");
                    Location loc = p.getLocation();
                    p.playNote(loc, Instrument.PIANO, Note.natural(1, Note.Tone.E));
                    ItemStack sushat = new ItemStack(Material.LEATHER_HELMET);
                    ItemStack susshirt = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemStack suspant = new ItemStack(Material.LEATHER_LEGGINGS);
                    ItemStack susshoe = new ItemStack(Material.LEATHER_BOOTS);

                    LeatherArmorMeta hatmeta = (LeatherArmorMeta) sushat.getItemMeta();
                    hatmeta.setColor(Color.RED);
                    sushat.setItemMeta(hatmeta);

                    LeatherArmorMeta shirtmeta = (LeatherArmorMeta) susshirt.getItemMeta();
                    shirtmeta.setColor(Color.RED);
                    susshirt.setItemMeta(shirtmeta);

                    LeatherArmorMeta pantmeta = (LeatherArmorMeta) suspant.getItemMeta();
                    pantmeta.setColor(Color.RED);
                    suspant.setItemMeta(pantmeta);

                    LeatherArmorMeta shoemeta = (LeatherArmorMeta) susshoe.getItemMeta();
                    shoemeta.setColor(Color.RED);
                    susshoe.setItemMeta(shoemeta);

                    p.getEquipment().setHelmet(sushat);
                    p.getEquipment().setChestplate(susshirt);
                    p.getEquipment().setLeggings(suspant);
                    p.getEquipment().setBoots(susshoe);
                    BukkitScheduler scheduler = getServer().getScheduler();
                    scheduler.scheduleSyncDelayedTask(this, new Runnable() {
                        @Override
                        public void run() {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f<&9Blue&f> red sus"));
                            p.playNote(loc, Instrument.SNARE_DRUM, Note.natural(1, Note.Tone.A));
                        }
                    }, 20*7);
                    scheduler.scheduleSyncDelayedTask(this, new Runnable() {
                        @Override
                        public void run() {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f<&c" + sender.getName() + "&f> no"));
                            p.playNote(loc, Instrument.SNARE_DRUM, Note.natural(1, Note.Tone.A));
                        }
                    }, 20*9);
                    scheduler.scheduleSyncDelayedTask(this, new Runnable() {
                        @Override
                        public void run() {
                            Player p = (Player) sender;
                            p.setHealth(0);
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c" + p.getName() + "&f was the &cImpostor."));
                        }
                    }, 20*12);
                }
            }
        }
        return false;
    }
}
