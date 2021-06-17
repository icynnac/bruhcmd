package me.icynnac.bruhcmd.events;

import me.icynnac.bruhcmd.Main;
import org.bukkit.*;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

public class CyberbunkEvents implements Listener {
    @EventHandler
    public void clickclack(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        World world = p.getLocation().getWorld();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.GREEN + "Fortnite Control Panel")) {
            switch(e.getCurrentItem().getType()) {
                case RED_WOOL:
                    p.closeInventory();
                    p.getActivePotionEffects().clear();
                    p.sendTitle(ChatColor.RED + "Deleting Fortnite...", ChatColor.RED + "Please wait...");
                    BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                p.sendMessage(ChatColor.RED + "Erasing Fortnite from existance (WARNING: Could cause 7 year olds to crank 90s irl, or explosions.)");
                            },100);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.createExplosion(p.getLocation(),10);
                            },180);
                    break;
                case PAINTING:
                    p.closeInventory();
                    p.getActivePotionEffects().clear();
                    p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&cObama &kCare"), ChatColor.RED + "Obama's Last Name is...");
                    scheduler = Bukkit.getServer().getScheduler();
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&cObama C&kare"), ChatColor.RED + "Obama's Last Name is.");
                    },40);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&cObama Ca&kre"), ChatColor.RED + "Obama's Last Name is..");
                    },80);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&cObama Car&ke"), ChatColor.RED + "Obama's Last Name is...");
                    },120);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&cDecrypting Interupted."), ChatColor.DARK_RED + "run.");
                    },160);
                    scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                        if (world.getDifficulty() == Difficulty.PEACEFUL) {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 5));
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },5);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },10);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },15);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },20);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },25);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },30);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },35);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },40);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },45);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },50);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },55);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },60);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },65);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },70);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },75);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },80);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },85);
                            scheduler.scheduleSyncDelayedTask(Main.instance, () -> {
                                world.strikeLightning(p.getLocation());
                            },90);
                            if (p.getHealth() == 0) {
                                Bukkit.broadcastMessage(p.getName() + "tried to get Obama's last name");
                            }
                        } else {
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 2));
                            Creeper c = (Creeper) world.spawnEntity(p.getLocation(), EntityType.CREEPER);
                            c.setPowered(true);
                            c.setCustomName(ChatColor.RED + "FBI");
                            Creeper c2 = (Creeper) world.spawnEntity(p.getLocation(), EntityType.CREEPER);
                            c2.setPowered(true);
                            c2.setCustomName(ChatColor.RED + "FBI");
                            Creeper c3 = (Creeper) world.spawnEntity(p.getLocation(), EntityType.CREEPER);
                            c3.setPowered(true);
                            c3.setCustomName(ChatColor.RED + "FBI");
                        }
                    },200);
                    break;
                case DIAMOND:
                    p.closeInventory();
                    p.getActivePotionEffects().clear();
                    p.sendTitle(ChatColor.AQUA + "You got a VBuck", ChatColor.AQUA + "why tho???");
                    ItemStack vbuck = new ItemStack(Material.DIAMOND);
                    ItemMeta vbuckM = vbuck.getItemMeta();
                    vbuckM.setDisplayName(ChatColor.AQUA + "Vbuck");
                    vbuck.setItemMeta(vbuckM);
                    p.getInventory().addItem(vbuck);
                    break;
                case POTION:
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "Aquire Water")) {
                        p.closeInventory();
                        p.getActivePotionEffects().clear();
                        p.sendTitle(ChatColor.RED + "Error: Water doesnt exist", ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "sounds like africa...");
                    }
            }
            e.setCancelled(true);
        }
    }
}
