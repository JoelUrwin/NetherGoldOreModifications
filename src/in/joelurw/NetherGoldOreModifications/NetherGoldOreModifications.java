package in.joelurw.NetherGoldOreModifications;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import in.joelurw.NetherGoldOreModifications.events.eventhandler;
import in.joelurw.NetherGoldOreModifications.ItemManagement.ItemManagement;
import org.bukkit.NamespacedKey;


public class NetherGoldOreModifications extends JavaPlugin {
    NamespacedKey flakekey;

    private static NetherGoldOreModifications instance;

    @Override
    public void onEnable() {
        flakekey = new NamespacedKey(this, "goldflake");
        ItemManagement.init();
        getServer().getPluginManager().registerEvents(new eventhandler(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Nether Gold Ore Modifications] : Enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Nether Gold Ore Modifications] : Disabled!");
    }




}
