package me.icynnac.bruhcmd.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class UpdateEvents implements Listener {
    @EventHandler
    public void clickclock(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&bBruhCMD &8>> &6Updates"))) {
            e.setCancelled(true);
            switch(e.getCurrentItem().getType()) {
                case BOOK:
                    p.closeInventory();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &6Versions List: https://www.spigotmc.org/resources/bruhcmd.85804/history"));
                case STAINED_GLASS_PANE:
                    if (e.getCurrentItem().getDurability() == 5) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Version 1.6")) {
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &6Changelog: &bhttps://github.com/icynnac/bruhcmd/wiki/Changelogs"));
                            p.closeInventory();
                        }
                    }
                case BARRIER:
                    p.closeInventory();
                    break;
                case PAPER:
                    p.closeInventory();
                    p.performCommand("bruhcmd");
                    break;
            }
        }
    }
}
