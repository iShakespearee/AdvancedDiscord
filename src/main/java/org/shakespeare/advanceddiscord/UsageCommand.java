package org.shakespeare.advanceddiscord;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UsageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.sendMessage("§b§l§nUSAGE OF OUR PLUGIN!" +
                    "\n§3/ad, advanceddiscord, discord <server_name>" +
                    "\n§bGive you any discord server's link!" +
                    "\n\n\n§3/adabout, /advanceddiscordabout, /usage" +
                    "\n§bAll give you information about the plugin," +
                    "\n§band how to use it!");

        }


        return false;
    }
}
