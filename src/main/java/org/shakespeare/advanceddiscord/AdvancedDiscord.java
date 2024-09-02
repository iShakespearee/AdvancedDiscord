package org.shakespeare.advanceddiscord;

import org.bukkit.plugin.java.JavaPlugin;

public final class AdvancedDiscord extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("advanceddiscord").setExecutor(new DiscordCommand());
        getCommand("ad").setExecutor(new DiscordCommand());

        getCommand("advanceddiscordabout").setExecutor(new AdvancedDiscordAboutCommand());
        getCommand("adabout").setExecutor(new AdvancedDiscordAboutCommand());

    }
}