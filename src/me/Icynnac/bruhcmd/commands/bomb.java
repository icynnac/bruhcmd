package me.icynnac.bruhcmd.commands;

import me.icynnac.bruhcmd.Main;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class bomb implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (Main.instance.getConfig().getString("configuration.enabled-commands.bomb").equalsIgnoreCase("true")) {
                Player p = (Player) sender;
                World world = p.getWorld();
                world.createExplosion(p.getLocation(), 15, true);
            }
        }
        return false;
    }
}
