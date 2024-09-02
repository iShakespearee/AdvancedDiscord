package org.shakespeare.advanceddiscord;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdvancedDiscordAboutCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.sendMessage("§3§l§nDISCORD PLUGIN INFO:" +
                    "\n§bOur discord plugin is meant to provide a" +
                    "\n§bsimple and easy way to join any discord server" +
                    "\n§bthrough in-game commands!" +
                    "\n§3§lCREATORS:" +
                    "\n  §biShakespeare");

        }




        return false;
    }
}
