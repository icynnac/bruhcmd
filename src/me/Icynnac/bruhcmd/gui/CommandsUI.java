package me.icynnac.bruhcmd.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;

public class CommandsUI {

    public Inventory getCommandsInventory() {

        Inventory commands = Bukkit.createInventory(null, 9, ChatColor.translateAlternateColorCodes('&', "&bBruhCMD &8>> &6Commands"));
        ItemStack bruh = new ItemStack(Material.BOOK);
        ItemStack bruhreload = new ItemStack(Material.REDSTONE);
        ItemStack bruhcmd = new ItemStack(Material.PAPER);
        ItemStack cutg = new ItemStack(Material.IRON_SWORD);
        ItemStack pop = new ItemStack(Material.NOTE_BLOCK);
        ItemStack yeet = new ItemStack(Material.FEATHER);
        ItemStack sus = new ItemStack(Material.LEATHER_HELMET);
        ItemStack close = new ItemStack(Material.BARRIER);

        ItemMeta bruhM = bruh.getItemMeta();
        bruhM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b/bruh"));
        ArrayList<String> bruhL = new ArrayList<>();
        bruhL.add(ChatColor.AQUA + "legit just says bruh.");
        bruhM.setLore(bruhL);
        bruh.setItemMeta(bruhM);

        ItemMeta bruhreloadM = bruhreload.getItemMeta();
        bruhreloadM.setDisplayName(ChatColor.AQUA + "/bruh reload");
        ArrayList<String> bruhreloadL = new ArrayList<>();
        bruhreloadL.add(ChatColor.AQUA + "Reloads the config.yml file");
        bruhreloadM.setLore(bruhreloadL);
        bruhreload.setItemMeta(bruhreloadM);

        ItemMeta bruhcmdM = bruhcmd.getItemMeta();
        bruhcmdM.setDisplayName(ChatColor.AQUA + "/bruhcmd");
        ArrayList<String> bruhcmdL = new ArrayList<>();
        bruhcmdL.add(ChatColor.AQUA + "Shows the menu it took to get here!");
        bruhcmdM.setLore(bruhcmdL);
        bruhcmd.setItemMeta(bruhcmdM);

        ItemMeta cutgM = cutg.getItemMeta();
        cutgM.setDisplayName(ChatColor.AQUA + "/cutg");
        ArrayList<String> cutgL = new ArrayList<>();
        cutgL.add(ChatColor.AQUA + "someone likes ya cut g");
        cutgM.setLore(cutgL);
        cutg.setItemMeta(cutgM);

        ItemMeta yeetM = yeet.getItemMeta();
        yeetM.setDisplayName(ChatColor.AQUA + "/yeet");
        ArrayList<String> yeetL = new ArrayList<>();
        yeetL.add(ChatColor.AQUA + "you go flying, was gonna make a creative description,");
        yeetL.add(ChatColor.AQUA + "but its just not really worth it.");
        yeetM.setLore(yeetL);
        yeet.setItemMeta(yeetM);

        ItemMeta popM = pop.getItemMeta();
        popM.setDisplayName(ChatColor.AQUA + "/pop");
        ArrayList<String> popL = new ArrayList<>();
        popL.add(ChatColor.WHITE + "pop");
        popL.add(ChatColor.WHITE + "cat");
        popM.setLore(popL);
        pop.setItemMeta(popM);

        LeatherArmorMeta susM = (LeatherArmorMeta) sus.getItemMeta();
        susM.setDisplayName(ChatColor.RED + "/sus");
        ArrayList<String> susL = new ArrayList<>();
        susL.add(ChatColor.RED + "when the impostor is sus >:D");
        susM.setLore(susL);
        sus.setItemMeta(susM);

        ItemMeta closeM = close.getItemMeta();
        closeM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Close");
        close.setItemMeta(closeM);

        commands.setItem(0, bruh);
        commands.setItem(1, bruhreload);
        commands.setItem(2, bruhcmd);
        commands.setItem(3, cutg);
        commands.setItem(4, pop);
        commands.setItem(5, yeet);
        commands.setItem(6, sus);
        commands.setItem(8, close);
        return commands;
    }

}