package dizzillian.ducks.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.lang.management.PlatformLoggingMXBean;

public class deathCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("duckprsn")) {

            if (sender instanceof Player) {
                Player p = (Player) sender;
                if (args.length == 0) {
                    p.sendMessage("Sorry, but you can't duck yourself.");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target instanceof Player) {
                        target.sendMessage("You've been ducked!");
                        p.sendMessage("You've just ducked" + target);
                        for (int i = 0; i < 20; i++) {
                            System.out.println("Entity #" + i + " has spawned");
                            Entity entity = target.getWorld().spawnEntity(target.getLocation(), EntityType.CHICKEN);
                            entity.setCustomName("Duck");
                        }
                    }
                }
            }
        }
        return false;
    }
}
