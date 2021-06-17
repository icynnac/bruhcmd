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
        ItemStack u1 = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE);
        ItemStack u2 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemStack back = new ItemStack(Material.PAPER);

        ItemMeta u1M = u1.getItemMeta();
        u1M.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Version 1.6");
        ArrayList<String> u1L = new ArrayList<>();
        u1L.add(ChatColor.YELLOW + "This version is outdated.");
        u1L.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Click to see changelogs");
        u1M.setLore(u1L);
        u1.setItemMeta(u1M);

        ItemMeta u2M = u2.getItemMeta();
        u2M.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Version 1.7");
        ArrayList<String> u2L = new ArrayList<>();
        u2L.add(ChatColor.YELLOW + "You are using this version.");
        u2L.add(ChatColor.GREEN + "" + ChatColor.BOLD + "Click to see changelogs");
        u2M.setLore(u2L);
        u2.setItemMeta(u2M);

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
        updates.setItem(13, u2);
        updates.setItem(26, close);
        updates.setItem(25, back);
        return updates;
    }
}
