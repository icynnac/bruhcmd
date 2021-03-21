package me.icynnac.bruhcmd.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class UpdatesUI {
    public Inventory getUpdateInventory() {
        Inventory updates = Bukkit.createInventory(null,27, ChatColor.translateAlternateColorCodes('&', "&bBruhCMD &8>> &6Updates"));

        ItemStack ulist = new ItemStack(Material.BOOK);
        ItemStack u1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)5);
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemStack back = new ItemStack(Material.PAPER);

        ItemMeta u1M = u1.getItemMeta();
        u1M.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Version 1.6");
        ArrayList<String> u1L = new ArrayList<>();
        u1L.add(ChatColor.YELLOW + "You are currently using this version.");
        u1L.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Click to see changelogs");
        u1M.setLore(u1L);
        u1.setItemMeta(u1M);

        ItemMeta ulistM = ulist.getItemMeta();
        ulistM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&lVersion List"));
        ArrayList<String> ulistL = new ArrayList<>();
        ulistL.add(ChatColor.YELLOW + "Click here to get a link to all BruhCMD Versions");
        ulistM.setLore(ulistL);
        ulist.setItemMeta(ulistM);

        ItemMeta closeM = close.getItemMeta();
        closeM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Close");
        close.setItemMeta(closeM);

        ItemMeta backM = back.getItemMeta();
        backM.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Back");
        back.setItemMeta(backM);

        updates.setItem(10, ulist);
        updates.setItem(12, u1);
        updates.setItem(26, close);
        updates.setItem(25, back);
        return updates;
    }
}
