package dizzillian.ducks;

import dizzillian.ducks.Commands.deathCommand;
import dizzillian.ducks.Commands.detectiveCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Ducks extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("duck").setExecutor(new detectiveCommand());
        getCommand("duckprsn").setExecutor(new deathCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
