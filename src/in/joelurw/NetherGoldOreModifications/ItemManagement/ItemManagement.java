package in.joelurw.NetherGoldOreModifications.ItemManagement;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.ArrayList;
import java.util.List;

public class ItemManagement {
    public static ItemStack goldflake;


    public static void init(){
        CreateGoldFlake();

    }

    private static void CreateGoldFlake(){
        ItemStack item = new ItemStack(Material.YELLOW_DYE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6Gold Flake");
        List<String> lore = new ArrayList<>();
        lore.add("§dA Tiny Fragment of Gold.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        goldflake = item;

        //Shaped Recipe

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("flaketonug"), new ItemStack(Material.GOLD_NUGGET));
        sr.shape("XXX"
                ,"XXX",
                 "XXX");
        sr.setIngredient('X', new RecipeChoice.ExactChoice(item));
        Bukkit.getServer().addRecipe(sr);
    }
}
