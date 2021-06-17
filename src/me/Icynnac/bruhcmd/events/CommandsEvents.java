package me.icynnac.bruhcmd.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CommandsEvents implements Listener {
    @EventHandler
    public void commandclick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&bBruhCMD &8>> &eMeme Commands"))) {
            e.setCancelled(true);
            switch(e.getCurrentItem().getType()) {
                case BARRIER:
                    p.closeInventory();
                    break;
                case PAPER:
                    p.closeInventory();
                    p.performCommand("bruhcmd");
                    break;
                case DIAMOND:
                    p.performCommand("bruh");
                    break;
                case NOTE_BLOCK:
                    p.performCommand("pop");
                    break;
                case FEATHER:
                    p.closeInventory();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &cYou can't run this command in the GUI, it will most likely kill you."));
                    break;
                case IRON_SWORD:
                    p.closeInventory();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &cYou can't run this command in the GUI, it will most likely kill you."));
                    break;
                case LEATHER_HELMET:
                    p.closeInventory();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &cYou can't run this command in the GUI, it will most likely kill you."));
                    break;
                case TNT:
                    p.closeInventory();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &cYou can't run this command in the GUI, it will most likely kill you."));
                    break;
                case GUNPOWDER:
                    p.closeInventory();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &cYou can't run this command in the GUI, it will most likely kill you."));
                    break;
            }
        }
    }
}
