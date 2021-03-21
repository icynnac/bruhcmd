package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.Main;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

public class SusCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (!(sender.hasPermission("bruhcmd.sus"))) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("configuration.messages.no-permission-message")));
            } else {
                if (Main.instance.getConfig().getString("configuration.enabled-commands.sus").equalsIgnoreCase("true")) {
                    Player p = (Player) sender;
                    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 5, 2));
                    p.sendTitle(ChatColor.RED + "Impostor", ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("configuration.messages.sus-subtitle")));
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
                    BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f<&9Blue&f> red sus"));
                        p.playNote(loc, Instrument.SNARE_DRUM, Note.natural(1, Note.Tone.A));
                    }, 140);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f<&c" + sender.getName() + "&f> " + Main.instance.getConfig().getString("configuration.messages.sus-player-message")));
                        // luckyblockjack has paid so he stays in this code
                        p.playNote(loc, Instrument.SNARE_DRUM, Note.natural(1, Note.Tone.A));
                    }, 180);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        Player p1 = (Player) sender;
                        p1.setHealth(0);
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c" + p1.getName() + "&f was the &cImpostor."));
                    }, 20 * 12);
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("configuration.messages.not-enabled")));
                }
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.instance.getConfig().getString("configuration.messages.console-cannot-use")));
        }
        return false;
    }
}
