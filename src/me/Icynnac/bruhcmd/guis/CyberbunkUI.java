package me.icynnac.bruhcmd.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

public class CyberbunkUI {
    public Inventory getCommandsInventory() {
        Inventory inv = Bukkit.createInventory(null, 27, ChatColor.GREEN + "Fortnite Control Panel");

        ItemStack obamna = new ItemStack(Material.PAINTING);
        ItemStack deletefortnite = new ItemStack(Material.RED_WOOL);
        ItemStack vbuck = new ItemStack(Material.DIAMOND);
        ItemStack water = new ItemStack(Material.POTION);

        ItemMeta dfM = deletefortnite.getItemMeta();
        ItemMeta obamnaM = obamna.getItemMeta();
        ItemMeta vbuckM = vbuck.getItemMeta();
        ItemMeta waterM = water.getItemMeta();

        dfM.setDisplayName(ChatColor.RED + "Delete Fortnite");
        obamnaM.setDisplayName(ChatColor.YELLOW + "Get Obama's Last Name");
        vbuckM.setDisplayName(ChatColor.AQUA + "Get One VBuck");
        waterM.setDisplayName(ChatColor.BLUE + "Aquire Water");

        PotionMeta wPM = (PotionMeta) waterM;
        PotionData wPD = new PotionData(PotionType.WATER);
        wPM.setBasePotionData(wPD);

        obamna.setItemMeta(obamnaM);
        deletefortnite.setItemMeta(dfM);
        vbuck.setItemMeta(vbuckM);
        water.setItemMeta(waterM);

        inv.setItem(10, obamna);
        inv.setItem(16, deletefortnite);
        inv.setItem(12, vbuck);
        inv.setItem(14, water);
        return inv;
    }
}
