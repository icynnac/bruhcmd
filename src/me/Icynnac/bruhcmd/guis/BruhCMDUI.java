package me.icynnac.bruhcmd.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class BruhCMDUI implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory bruhabout = Bukkit.createInventory(p, 9, ChatColor.AQUA + "BruhCMD");
            ItemStack about = new ItemStack(Material.PAINTING);
            ItemStack commands = new ItemStack(Material.ANVIL);
            ItemStack support = new ItemStack(Material.DIAMOND_PICKAXE);
            ItemStack update = new ItemStack(Material.GOLD_INGOT);
            ItemStack server = new ItemStack(Material.BLAZE_POWDER);

            ItemMeta aboutM = about.getItemMeta();
            aboutM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lAbout"));
            ArrayList<String> aboutL = new ArrayList<>();
            aboutL.add(ChatColor.GREEN + "General Info about BruhCMD.");
            aboutM.setLore(aboutL);
            about.setItemMeta(aboutM);
            ItemMeta commandsM = commands.getItemMeta();
            commandsM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lCommands"));
            ArrayList<String> commandsL = new ArrayList<>();
            commandsL.add(ChatColor.GOLD + "Commands of BruhCMD and their permissions.");
            commandsM.setLore(commandsL);
            commands.setItemMeta(commandsM);

            ItemMeta supportM = support.getItemMeta();
            supportM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d&lSupport"));
            ArrayList<String> supportL = new ArrayList<>();
            supportL.add(ChatColor.LIGHT_PURPLE + "Get support for the plugin by clicking here.");
            supportM.setLore(supportL);
            support.setItemMeta(supportM);

            ItemMeta updateM = update.getItemMeta();
            updateM.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Update Logs");
            ArrayList<String> updateL = new ArrayList<>();
            updateL.add(ChatColor.GOLD + "View changes of BruhCMD Updates.");
            updateM.setLore(updateL);
            update.setItemMeta(updateM);

            bruhabout.setItem(1, about);
            bruhabout.setItem(3, commands);
            bruhabout.setItem(5, support);
            bruhabout.setItem(7, update);
            p.openInventory(bruhabout);
        } else {
            sender.sendMessage(ChatColor.RED + "BruhCMD >> Hey! You can't use this command in console.");
        }
        return false;
    }
}
