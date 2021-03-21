package me.icynnac.bruhcmd.events;

import me.icynnac.bruhcmd.guis.CommandsUI;
import me.icynnac.bruhcmd.guis.UpdatesUI;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class BruhCMDEvents implements Listener {
    @EventHandler
    public void clickyclicky(InventoryClickEvent e) {
        CommandsUI commands = new CommandsUI();
        UpdatesUI updates = new UpdatesUI();
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "BruhCMD")) {
            switch(e.getCurrentItem().getType()) {
                case DIAMOND_PICKAXE:
                    p.closeInventory();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &9If you need support, click this link: &bhttps://github.com/icynnac/bruhcmd/issues"));
                    break;
                case ANVIL:
                    p.closeInventory();
                    p.openInventory(commands.getCommandsInventory());
                    e.setCancelled(true);
                    break;
                case PAINTING:
                    p.closeInventory();
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&m>----------&r&b&lBruhCMD&9&m----------<"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bMade by: &fIcynnac"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bVersion: 1.6"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', ""));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7GitHub: https://github.com/icynnac/bruhcmd"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Spigot: https://www.spigotmc.org/resources/bruhcmd.85804/"));
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&m>----------------------------<"));
                    break;
                case GOLD_INGOT:
                    p.closeInventory();
                    p.openInventory(updates.getUpdateInventory());
                    e.setCancelled(true);
                    break;
            }
            e.setCancelled(true);
        }
    }
}
