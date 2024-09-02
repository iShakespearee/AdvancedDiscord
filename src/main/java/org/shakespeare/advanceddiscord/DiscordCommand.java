package org.shakespeare.advanceddiscord;

import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (args.length == 0) {
                player.sendMessage("§c§lINVALID USAGE!");
                return false;
            }

            String serverName = args[0].toLowerCase();
            String advancedDiscordInfo = args[0].toLowerCase();
            String link = "discord.gg/";

            player.spawnParticle(Particle.HEART, player.getLocation(), 20);

            player.sendMessage("§b§lCLICK TO JOIN THIS DISCORD SERVER! §3" + link + serverName);

            return true;
        }
        return false;
    }
}