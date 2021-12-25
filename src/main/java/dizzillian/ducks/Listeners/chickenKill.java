package dizzillian.ducks.Listeners;

import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class chickenKill implements Listener {
    public void onDuckAttacked(EntityDamageByEntityEvent e){
        Entity entity = (org.bukkit.entity.Chicken) e.getEntity();
        Player player = (org.bukkit.entity.Player) e.getDamager();

        if(e.getDamager().getType() == EntityType.PLAYER){
            player.setHealth(0);
            player.sendMessage("Don't hurt the little babies!");
        }
    }
}
