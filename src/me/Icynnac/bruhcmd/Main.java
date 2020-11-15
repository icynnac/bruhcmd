package me.Icynnac.bruhcmd;

import org.bukkit.plugin.java.JavaPlugin;
import me.Icynnac.bruhcmd.commands.BruhCommand;

public class Main extends JavaPlugin {

	@Override
	public void onEnable(){
		new BruhCommand(this);
	}
}
