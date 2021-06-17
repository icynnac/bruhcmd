package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.Main;
import org.bukkit.ChatColor;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Note;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class pop implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.consoleno));
        } else {
            if (Main.instance.getConfig().getString("enabled-commands.pop").equalsIgnoreCase("true")) {
                Player p = (Player) sender;
                Location loc = p.getLocation();
                p.playNote(loc, Instrument.BASS_DRUM, Note.natural(0, Note.Tone.G));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lBruhCMD &8&l>> &9pop."));
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.prefix + " " + Main.notenable));
            }
        }
        return false;
    }
}
