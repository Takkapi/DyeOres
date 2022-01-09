package me.takkapi.dyeores.listener;

import me.takkapi.dyeores.DyeOres;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class OnBlockRightClick implements Listener {
    public OnBlockRightClick(DyeOres dyeOres) {
    }

    @EventHandler
    private void onPlayerRightClick(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        //Block block = player.getTargetBlock(null, 3);
        //Block block = event.getClickedBlock();
        //Location blockLoc = block.getLocation();

        try {
            if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if(event.getAction() == Action.RIGHT_CLICK_AIR) return;
                if (event.getItem().getType() == Material.LIGHT_BLUE_DYE) {
                    if(event.getClickedBlock().getType() == Material.DIAMOND_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a diamond ore into a diamond ore dummy!");
                    }
                    if(event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        player.sendMessage("*dying into a diamond block*");
                    }
                    //player.sendMessage("You clicked a block");
                }
            }
        } catch(Exception e) {
            return;
        }
    }
}
