package me.icynnac.bruhcmd.gui;

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

public class NewBruhAbout implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory bruhabout = Bukkit.createInventory(p, 9, ChatColor.AQUA + "BruhCMD");
            ItemStack about = new ItemStack(Material.PAINTING);
            ItemStack commands = new ItemStack(Material.ANVIL);
            ItemStack support = new ItemStack(Material.DIAMOND_PICKAXE);

            ItemMeta aboutM = about.getItemMeta();
            aboutM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aAbout BruhCMD"));
            ArrayList<String> aboutL = new ArrayList<>();
            aboutL.add(ChatColor.GREEN + "General Info about BruhCMD.");
            aboutM.setLore(aboutL);
            about.setItemMeta(aboutM);

            ItemMeta commandsM = commands.getItemMeta();
            commandsM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6BruhCMD Commands"));
            ArrayList<String> commandsL = new ArrayList<>();
            commandsL.add(ChatColor.GOLD + "Commands of BruhCMD and their permissions.");
            commandsM.setLore(commandsL);
            commands.setItemMeta(commandsM);

            ItemMeta supportM = support.getItemMeta();
            supportM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&dBruhCMD Support"));
            ArrayList<String> supportL = new ArrayList<>();
            supportL.add(ChatColor.LIGHT_PURPLE + "Something break? Want to suggest something? Click this!");
            supportM.setLore(supportL);
            support.setItemMeta(supportM);

            bruhabout.setItem(2, about);
            bruhabout.setItem(4, commands);
            bruhabout.setItem(6, support);
            p.openInventory(bruhabout);
        } else {
            sender.sendMessage(ChatColor.RED + "BruhCMD >> Hey! You can't use this command in console.");
        }
        return false;
    }
}
