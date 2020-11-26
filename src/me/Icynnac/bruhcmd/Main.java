package me.Icynnac.bruhcmd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin {

	@Override
	public void onEnable(){
		this.saveDefaultConfig();
	}
	
	@Override
	public void onDisable(){
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("bruh")) {
			if (!sender.hasPermission("bruhcmd.reload")) {
				sender.sendMessage(ChatColor.RED + "You cannot run this command, sorry!");
				return true;
			}
			if (args.length == 0) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.bruh-message")));
				return true;
			}
			if (args.length > 0) {
				if (args[0].equalsIgnoreCase("reload")) {
					sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.reload-message")));
					this.reloadConfig();
					return true;
				}
			}
		}
		return false;
	}
}