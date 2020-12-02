package me.Icynnac.bruhcmd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class Main extends JavaPlugin {

	@Override
	public void onEnable(){
		this.saveDefaultConfig();
    
	}
	
	@Override
	public void onDisable(){
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("bruh")) {
			if (args.length > 0) {
				if (args[0].equalsIgnoreCase("reload")) {
					if (sender.hasPermission("bruhcmd.reload")) {
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.reload-message")));
						this.reloadConfig();
						return true;
					} else {
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.no-permission-message")));
					}
				}
			}
			if (args.length == 0) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.bruh-message")));
				return true;
			}
			if (args.length > 0) {
				if (args[0].equalsIgnoreCase("about")) {
					if (sender.hasPermission("bruhcmd.about")) {
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b--------BruhCMD--------"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bVersion: &f1.2.5"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bDeveloper: &fIcynnac"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bCommands:"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b/bruh"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fMain Command of the plugin."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b/bruh reload"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cAdministrator Command"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fReloads the config.yml."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b/bruh about"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cAdministrator Command"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&fShows this menu :D"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b------------------------"));
						return true;
					} else {
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("configuration.messages.no-permission-message")));
					}
				}
			}
		}
		return false;
	}
}
