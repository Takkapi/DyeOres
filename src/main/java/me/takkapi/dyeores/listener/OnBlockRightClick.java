package me.takkapi.dyeores.listener;

import me.takkapi.dyeores.DyeOres;
import org.bukkit.ChatColor;
import org.bukkit.Material;
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

        try {
            if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if(event.getAction() == Action.RIGHT_CLICK_AIR) return;
                // Diamond
                if (event.getItem().getType() == Material.LIGHT_BLUE_DYE) {
                    if(event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE)
                        player.sendMessage(ChatColor.RED + "You cannot dye this ore");
                    if(event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.DIAMOND_ORE);
//                        player.getInventory().remove(Material.LIGHT_BLUE_DYE);
                    }
                    if(event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.DEEPSLATE_DIAMOND_ORE);
                        //player.getInventory().remove(Material.LIGHT_BLUE_DYE);
                    }
                }
                // Coal
                if(event.getItem().getType() == Material.BLACK_DYE) {
                    if(event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE)
                        player.sendMessage(ChatColor.RED + "You cannot dye this ore");
                    if(event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.COAL_ORE);
                    }
                    if(event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.DEEPSLATE_COAL_ORE);
                    }
                }
                // Iron
                if(event.getItem().getType() == Material.WHITE_DYE) {
                    if(event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE)
                        player.sendMessage(ChatColor.RED + "You cannot dye this ore");
                    if(event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.IRON_ORE);
                    }
                    if(event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.DEEPSLATE_IRON_ORE);
                    }
                }
                // Gold
                if(event.getItem().getType() == Material.YELLOW_DYE) {
                    if(event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE)
                        player.sendMessage(ChatColor.RED + "You cannot dye this ore");
                    if(event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.GOLD_ORE);
                    }
                    if(event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.DEEPSLATE_GOLD_ORE);
                    }
                }
                // Emerald
                if(event.getItem().getType() == Material.LIME_DYE) {
                    if (event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE)
                        player.sendMessage(ChatColor.RED + "You cannot dye this ore");
                    if (event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.EMERALD_ORE);
                    }
                    if (event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.DEEPSLATE_EMERALD_ORE);
                    }
                }
                // Redstone
                if(event.getItem().getType() == Material.RED_DYE) {
                    if (event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE)
                        player.sendMessage(ChatColor.RED + "You cannot dye this ore");
                    if (event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.REDSTONE_ORE);
                    }
                    if (event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.DEEPSLATE_REDSTONE_ORE);
                    }
                }
                // Copper
                if(event.getItem().getType() == Material.ORANGE_DYE) {
                    if (event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE)
                        player.sendMessage(ChatColor.RED + "You cannot dye this ore");
                    if (event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.COPPER_ORE);
                    }
                    if (event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.DEEPSLATE_COPPER_ORE);
                    }
                }
                // Lapis
                if(event.getItem().getType() == Material.BLUE_DYE) {
                    if (event.getClickedBlock().getType() == Material.LAPIS_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE)
                        player.sendMessage(ChatColor.RED + "You cannot dye this ore");
                    if (event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE) {
                        event.getClickedBlock().setType(Material.LAPIS_ORE);
                    }
                    if (event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE) {
                        event.getClickedBlock().setType(Material.DEEPSLATE_LAPIS_ORE);
                    }
                }
                // Ancient debris
                if(event.getItem().getType() == Material.BROWN_DYE) {
                    if(event.getClickedBlock().getType() == Material.ANCIENT_DEBRIS)
                        player.sendMessage(ChatColor.RED + "You cannot dye this ore");
                    if (event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE
                            || event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE
                            || event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&kk &r&a&lWAIT WTF!!!! HOW DID YOU FIND THAT??????? YOU ARE NOT SUPPOSED TO KNOW THIS"));
                        event.getClickedBlock().setType(Material.ANCIENT_DEBRIS);
                    }
                } else if(event.getItem().getType() == Material.BLUE_DYE || event.getItem().getType() == Material.ORANGE_DYE || event.getItem().getType() == Material.RED_DYE
                        || event.getItem().getType() == Material.LIME_DYE || event.getItem().getType() == Material.YELLOW_DYE || event.getItem().getType() == Material.WHITE_DYE
                         || event.getItem().getType() == Material.BLACK_DYE || event.getItem().getType() == Material.LIGHT_BLUE_DYE) {
                    player.sendMessage(ChatColor.RED + "What are you trying to do?");
                }
            }
        } catch(Exception e) {
            return;
        }
    }
}
