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
                if (event.getItem().getType() == Material.LIGHT_BLUE_DYE) {
                    //Normal ore
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
                        event.getClickedBlock().setType(Material.DIAMOND_ORE);
                        //player.getInventory().remove(Material.LIGHT_BLUE_DYE);
                    }
                    //Deepslate ore
                    if(event.getClickedBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a deepslate diamond ore into a deepslate diamond ore dummy!");
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
                } else if(event.getItem().getType() == Material.BLACK_DYE) {
                    //Normal ore
                    if(event.getClickedBlock().getType() == Material.COAL_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a coal ore into a coal ore dummy!");
                    }
                    if(event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.COAL_ORE);
                    }
                    //Deepslate
                    if(event.getClickedBlock().getType() == Material.DEEPSLATE_COAL_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a deepslate coal ore into a deepslate coal ore dummy!");
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
                } else if(event.getItem().getType() == Material.WHITE_DYE) {
                    //Normal ore
                    if(event.getClickedBlock().getType() == Material.IRON_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a iron ore into a iron ore dummy!");
                    }
                    if(event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.IRON_ORE);
                    }
                    //Deepslate
                    if(event.getClickedBlock().getType() == Material.DEEPSLATE_IRON_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a deepslate iron ore into a deepslate iron ore dummy!");
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
                } else if(event.getItem().getType() == Material.YELLOW_DYE) {
                    //Normal ore
                    if(event.getClickedBlock().getType() == Material.GOLD_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a gold ore into a gold ore dummy!");
                    }
                    if(event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.GOLD_ORE);
                    }
                    //Deepslate ore
                    if(event.getClickedBlock().getType() == Material.DEEPSLATE_GOLD_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a deepslate gold ore into a deepslate gold ore dummy!");
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
                } else if(event.getItem().getType() == Material.LIME_DYE) {
                    //Normal ore
                    if (event.getClickedBlock().getType() == Material.EMERALD_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a emerald ore into a emerald ore dummy!");
                    }
                    if (event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.EMERALD_ORE);
                    }
                    //Deepslate ore
                    if (event.getClickedBlock().getType() == Material.DEEPSLATE_EMERALD_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a deepslate emerald ore into a deepslate emerald ore dummy!");
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
                } else if(event.getItem().getType() == Material.RED_DYE) {
                    //Normal ore
                    if (event.getClickedBlock().getType() == Material.REDSTONE_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a redstone ore into a redstone ore dummy!");
                    }
                    if (event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.REDSTONE_ORE);
                    }
                    //Deepslate ore
                    if (event.getClickedBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a deepslate redstone ore into a deepslate redstone ore dummy!");
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
                } else if(event.getItem().getType() == Material.ORANGE_DYE) {
                    //Normal ore
                    if (event.getClickedBlock().getType() == Material.COPPER_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a copper ore into a copper ore dummy!");
                    }
                    if (event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        event.getClickedBlock().setType(Material.COPPER_ORE);
                    }
                    //Deepslate
                    if (event.getClickedBlock().getType() == Material.DEEPSLATE_COPPER_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a deepslate copper ore into a deepslate copper ore dummy!");
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
                } else if(event.getItem().getType() == Material.BLUE_DYE) {
                    //Normal ore
                    if (event.getClickedBlock().getType() == Material.LAPIS_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a lapis ore into a lapis ore dummy!");
                    }
                    if (event.getClickedBlock().getType() == Material.DIAMOND_ORE
                            || event.getClickedBlock().getType() == Material.COAL_ORE
                            || event.getClickedBlock().getType() == Material.GOLD_ORE
                            || event.getClickedBlock().getType() == Material.IRON_ORE
                            || event.getClickedBlock().getType() == Material.EMERALD_ORE
                            || event.getClickedBlock().getType() == Material.REDSTONE_ORE
                            || event.getClickedBlock().getType() == Material.COPPER_ORE) {
                        event.getClickedBlock().setType(Material.LAPIS_ORE);
                    }
                    //Deepslate
                    if (event.getClickedBlock().getType() == Material.DEEPSLATE_LAPIS_ORE) {
                        player.sendMessage(ChatColor.GREEN + "You cannot dye a deepslate lapis ore into a deepslate lapis ore dummy!");
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
                    //Secret block :)))))))))))))))))))))))))))))
                } else if(event.getItem().getType() == Material.BROWN_DYE) {
                    if(event.getClickedBlock().getType() == Material.ANCIENT_DEBRIS) {
                        player.sendMessage(ChatColor.RED + "Wait what are you trying to do?");
                    }
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
