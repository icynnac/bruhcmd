package me.icynnac.bruhcmd.gui;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Events implements Listener {
    @EventHandler
    public void clickyclicky(InventoryClickEvent e) {
        CommandsUI commands = new CommandsUI();
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "BruhCMD")) {
            switch(e.getCurrentItem().getType()) {
                case DIAMOND_PICKAXE:
                    p.closeInventory();
                    if (Bukkit.getVersion().contains("1.12.2")) {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &9If you need support, click this link: &bhttps://github.com/icynnac/bruhcmd/issues"));
                    } else {
                        TextComponent message = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &9If you need support, click this message!"));
                        message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/icynnac/bruhcmd/issues"));
                        message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(ChatColor.AQUA + "This goes to the BruhCMD GitHub, specifically the support page. (its actually called the issues page but shut.)")));
                        p.spigot().sendMessage(message);
                        break;
                    }
                case ANVIL:
                    p.closeInventory();
                    p.openInventory(commands.getCommandsInventory());
                    e.setCancelled(true);
                    break;
                case PAINTING:
                    p.closeInventory();
                    if (Bukkit.getVersion().contains("1.12.2")) {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&m>----------&r&b&lBruhCMD&9&m----------<"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bMade by: &fIcynnac"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bBruhCMD Version: 1.5.1"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBruhCMD has minor changes on, due to your server version."));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', ""));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7GitHub: https://github.com/icynnac/bruhcmd"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Spigot: https://www.spigotmc.org/resources/bruhcmd.85804/"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&m>----------------------------<"));
                    } else {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&m>----------&r&b&lBruhCMD&9&m----------<"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bMade by: &fIcynnac"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bBruhCMD Version: 1.5.1"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', ""));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7GitHub: https://github.com/icynnac/bruhcmd"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6Spigot: https://www.spigotmc.org/resources/bruhcmd.85804/"));
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9&m>----------------------------<"));
                    }
            }
            e.setCancelled(true);
        }
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&bBruhCMD &8>> &6Commands"))) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.BARRIER) {
                p.closeInventory();
            }
            e.setCancelled(true);
        }
    }
}
