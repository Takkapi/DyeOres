package me.takkapi.dyeores;

import me.takkapi.dyeores.listener.OnBlockRightClick;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class DyeOres extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new OnBlockRightClick(this), this);
        this.getServer().getPluginManager().registerEvents(this, this);

        //Recipes
        ItemStack dOre = new ItemStack(Material.DIAMOND_ORE, 1);

        //Coal to Diamond
        ShapelessRecipe coalToDiamondOre = new ShapelessRecipe(dOre);
        coalToDiamondOre.addIngredient(Material.LIGHT_BLUE_DYE);
        coalToDiamondOre.addIngredient(Material.COAL_ORE);

        getServer().addRecipe(coalToDiamondOre);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
