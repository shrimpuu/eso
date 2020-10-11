package me.eso.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        Bukkit.getServer().getLogger().info("esoPlugin is now firing on all cylinders.");
    }

    public void onDisable() {
        Bukkit.getServer().getLogger().info("esoPlugin is gone. Fuck you, pussy nigga.");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("esotalk")) {
            Bukkit.getServer().broadcastMessage(ChatColor.GREEN + ChatColor.BOLD.toString() + sender.getName() + " wants you to join esotalk.net! Join us today!");
        }

        return true;
    }

}
