package hoosk.relaxedchunks.commands;

import hoosk.relaxedchunks.RelaxedChunks;
import hoosk.relaxedchunks.handlers.PlayerLoadingChunks;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

public class Relax implements Listener, CommandExecutor {

    public Relax(RelaxedChunks plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(new PlayerLoadingChunks(this), plugin);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        return false;
    }
}
