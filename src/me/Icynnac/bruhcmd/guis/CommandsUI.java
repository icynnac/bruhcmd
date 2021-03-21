package me.icynnac.bruhcmd.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;

public class CommandsUI {
    public Inventory getCommandsInventory() {

        Inventory commands = Bukkit.createInventory(null, 45, ChatColor.translateAlternateColorCodes('&', "&bBruhCMD &8>> &eMeme Commands"));
        ItemStack bruh = new ItemStack(Material.DIAMOND);
        ItemStack bruhreload = new ItemStack(Material.REDSTONE);
        ItemStack bruhcmd = new ItemStack(Material.BEACON);
        ItemStack cutg = new ItemStack(Material.IRON_SWORD);
        ItemStack pop = new ItemStack(Material.NOTE_BLOCK);
        ItemStack yeet = new ItemStack(Material.FEATHER);
        ItemStack sus = new ItemStack(Material.LEATHER_HELMET);
        ItemStack joe = new ItemStack(Material.BOW);
        ItemStack creeper = new ItemStack(Material.SULPHUR);
        ItemStack boom = new ItemStack(Material.TNT);
        ItemStack cyberpunk = new ItemStack(Material.BREWING_STAND);
        ItemStack close = new ItemStack(Material.BARRIER);
        ItemStack back = new ItemStack(Material.PAPER);
        ItemStack about = new ItemStack(Material.BOOK);
        ItemStack filler = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)15);

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
        bruhreloadL.add(ChatColor.RED + "" + ChatColor.BOLD + "Requires Permission to run");
        bruhreloadM.setLore(bruhreloadL);
        bruhreload.setItemMeta(bruhreloadM);

        ItemMeta bruhcmdM = bruhcmd.getItemMeta();
        bruhcmdM.setDisplayName(ChatColor.GREEN + "/bruhcmd");
        ArrayList<String> bruhcmdL = new ArrayList<>();
        bruhcmdL.add(ChatColor.GREEN + "Shows the menu it took to get here!");
        bruhcmdL.add(ChatColor.RED + "" + ChatColor.BOLD + "Requires Permission to run");
        bruhcmdM.setLore(bruhcmdL);
        bruhcmd.setItemMeta(bruhcmdM);

        ItemMeta cutgM = cutg.getItemMeta();
        cutgM.setDisplayName(ChatColor.AQUA + "/cutg");
        ArrayList<String> cutgL = new ArrayList<>();
        cutgL.add(ChatColor.AQUA + "someone likes ya cut g");
        cutgL.add(ChatColor.RED + "" + ChatColor.BOLD + "Requires Permission to run");
        cutgM.setLore(cutgL);
        cutg.setItemMeta(cutgM);

        ItemMeta yeetM = yeet.getItemMeta();
        yeetM.setDisplayName(ChatColor.AQUA + "/yeet");
        ArrayList<String> yeetL = new ArrayList<>();
        yeetL.add(ChatColor.AQUA + "you can like, throw yourself in the air");
        yeetL.add(ChatColor.AQUA + "and other people too");
        yeetL.add(ChatColor.RED + "" + ChatColor.BOLD + "Requires Permission to run");
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
        susM.setColor(Color.RED);
        susM.setDisplayName(ChatColor.RED + "/sus");
        ArrayList<String> susL = new ArrayList<>();
        susL.add(ChatColor.RED + "when the impostor is sus >:D");
        susL.add(ChatColor.RED + "" + ChatColor.BOLD + "Requires Permission to run");
        susM.setLore(susL);
        sus.setItemMeta(susM);

        ItemMeta aboutM = about.getItemMeta();
        aboutM.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "About This Page");
        ArrayList<String> aboutL = new ArrayList<>();
        aboutL.add(ChatColor.GREEN + "This page shows commands. That's kinda it.");
        aboutL.add(ChatColor.GREEN + "You can also click on them. That does stuff too.");
        aboutM.setLore(aboutL);
        about.setItemMeta(aboutM);

        ItemMeta joeM = joe.getItemMeta();
        joeM.setDisplayName(ChatColor.YELLOW + "/joe " + ChatColor.GOLD + "" + ChatColor.BOLD + "[New]");
        ArrayList<String> joeL = new ArrayList<>();
        joeL.add(ChatColor.YELLOW + "JOE MAMA LMAO XD LOL i have brain damage");
        joeL.add(ChatColor.RED + "" + ChatColor.BOLD + "Requires Permission to run");
        joeM.setLore(joeL);
        joe.setItemMeta(joeM);

        ItemMeta cM = creeper.getItemMeta();
        cM.setDisplayName(ChatColor.GREEN + "/creeper? " + ChatColor.GOLD + "" + ChatColor.BOLD + "[New]");
        ArrayList<String> cL = new ArrayList<>();
        cL.add(ChatColor.GREEN + "Aww man...");
        cL.add(ChatColor.RED + "" + ChatColor.BOLD + "Requires Permission to run");
        cM.setLore(cL);
        creeper.setItemMeta(cM);

        ItemMeta cpM = cyberpunk.getItemMeta();
        cpM.setDisplayName(ChatColor.YELLOW + "/cyberpunk " + ChatColor.GOLD + "" + ChatColor.BOLD + "[New]");
        ArrayList<String> cpL = new ArrayList<>();
        cpL.add(ChatColor.AQUA + "wake the frick up human being.");
        cpL.add(ChatColor.AQUA + "we have a buggy game launch.");
        cpL.add(ChatColor.RED + "" + ChatColor.BOLD + "Requires Permission to run");
        cpM.setLore(cpL);
        cyberpunk.setItemMeta(cpM);

        ItemMeta boomM = boom.getItemMeta();
        boomM.setDisplayName(ChatColor.GOLD + "/boom" + ChatColor.GOLD + "" + ChatColor.BOLD + "[New]");
        ArrayList<String> boomL = new ArrayList<>();
        boomL.add(ChatColor.WHITE + "literally just an explosion");
        boomM.setLore(boomL);
        boom.setItemMeta(boomM);

        ItemMeta closeM = close.getItemMeta();
        closeM.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Close");
        close.setItemMeta(closeM);

        ItemMeta backM = back.getItemMeta();
        backM.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Back");
        back.setItemMeta(backM);

        ItemMeta fillerM = filler.getItemMeta();
        fillerM.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8"));
        filler.setItemMeta(fillerM);

        commands.setItem(3, bruh);
        commands.setItem(4, bruhreload);
        commands.setItem(5, bruhcmd);
        commands.setItem(12, cutg);
        commands.setItem(13, pop);
        commands.setItem(14, yeet);
        commands.setItem(21, sus);
        commands.setItem(22, boom);
        commands.setItem(1, joe);
        commands.setItem(10, creeper);
        commands.setItem(19, cyberpunk);
        commands.setItem(36, about);
        commands.setItem(43, back);
        commands.setItem(44, close);

        commands.setItem(35, filler);
        commands.setItem(34, filler);
        commands.setItem(33, filler);
        commands.setItem(32, filler);
        commands.setItem(31, filler);
        commands.setItem(30, filler);
        commands.setItem(29, filler);
        commands.setItem(28, filler);
        commands.setItem(27, filler);

        return commands;
    }
}
