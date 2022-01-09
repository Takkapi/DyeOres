package me.takkapi.dyeores;

import me.takkapi.dyeores.listener.OnBlockRightClick;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class DyeOres extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new OnBlockRightClick(this), this);
        this.getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
