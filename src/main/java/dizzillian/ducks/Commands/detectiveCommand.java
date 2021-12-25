package dizzillian.ducks.Commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class detectiveCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("duck")){
            if (sender instanceof Player){
                Player p = (Player) sender;

                for (int i = 0; i < 10; i++) {
                    System.out.println("Entity #"+i+" has spawned");
                    Entity entity = p.getWorld().spawnEntity(p.getLocation(),EntityType.CHICKEN);
                    entity.setCustomName("Lil Ducky");
                }
            }
        }



        return false;
    }
}
