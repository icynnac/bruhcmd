package me.icynnac.bruhcmd;

import me.icynnac.bruhcmd.commands.*;
import me.icynnac.bruhcmd.events.BruhCMDEvents;
import me.icynnac.bruhcmd.events.CommandsEvents;
import me.icynnac.bruhcmd.events.CyberbunkEvents;
import me.icynnac.bruhcmd.events.UpdateEvents;
import me.icynnac.bruhcmd.guis.BruhCMDUI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    public static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new BruhCMDEvents(), this);
        getServer().getPluginManager().registerEvents(new CommandsEvents(), this);
        getServer().getPluginManager().registerEvents(new CyberbunkEvents(), this);
        getServer().getPluginManager().registerEvents(new UpdateEvents(), this);

        getCommand("bruh").setExecutor(new BruhCommands());
        getCommand("bruh reload").setExecutor(new BruhCommands());
        getCommand("sus").setExecutor(new SusCommand());
        getCommand("cutg").setExecutor(new CutG());
        getCommand("yeet").setExecutor(new YEET());
        getCommand("pop").setExecutor(new pop());
        getCommand("bruhcmd").setExecutor(new BruhCMDUI());
        getCommand("joe").setExecutor(new joe());
        getCommand("cyberpunk").setExecutor(new cyberbunk());
        getCommand("bomb").setExecutor(new bomb());
        getCommand("creeper").setExecutor(new creeper());

        Logger logger = this.getLogger();

        new UpdateChecker(this, 85804).getVersion(version -> {
            if (!this.getDescription().getVersion().equalsIgnoreCase(version)) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "BruhCMD >> " + ChatColor.GREEN + "Theres an update available! Head to the BruhCMD Spigot page to update.");
            }
        });
    }
}
