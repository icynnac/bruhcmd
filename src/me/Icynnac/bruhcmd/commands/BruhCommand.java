package me.Icynnac.bruhcmd.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.Icynnac.bruhcmd.Main;

public class BruhCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public BruhCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("bruh").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("Only online players can run this command.");
			return true;
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("bruh.use")){
			
			p.sendMessage("§9§lBruhCMD §8§l>> §c§lB§9§lr§a§lu§e§lh");
			return true;
		} else{
			p.sendMessage("No permission to run this command, sorry!");
		}
		return false;
	}
	
}
