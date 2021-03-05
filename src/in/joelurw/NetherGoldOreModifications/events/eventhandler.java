package in.joelurw.NetherGoldOreModifications.events;

import in.joelurw.NetherGoldOreModifications.ItemManagement.ItemManagement;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.Sound;



public class eventhandler implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Block b = e.getBlock();
        Player p = e.getPlayer();
        if(b.getType() == Material.NETHER_GOLD_ORE) {
            p.getInventory().addItem(ItemManagement.goldflake);
            p.getWorld().playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1f, 1f);
            e.setDropItems(false);
        }
    }
}

