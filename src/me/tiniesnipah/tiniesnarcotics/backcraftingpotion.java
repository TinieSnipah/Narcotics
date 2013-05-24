package me.tiniesnipah.tiniesnarcotics;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class backcraftingpotion extends JavaPlugin {
	
	public void onEnable(){
		Server server = this.getServer();
		//Night Vision
		ShapelessRecipe nightvision = new ShapelessRecipe(new ItemStack(Material.GOLDEN_CARROT));
		nightvision.addIngredient(1, Material.POTION, 8198);
		server.addRecipe(nightvision);
		//Fire Resistance
		ShapelessRecipe fireresistance = new ShapelessRecipe(new ItemStack(Material.MAGMA_CREAM));
		fireresistance.addIngredient(1, Material.POTION, 8195);
		server.addRecipe(fireresistance);
		//Swiftness
		ShapelessRecipe swiftness = new ShapelessRecipe(new ItemStack(Material.SUGAR));
		swiftness.addIngredient(1, Material.POTION, 8194);
		server.addRecipe(swiftness);
		//Healing
		ShapelessRecipe healing = new ShapelessRecipe(new ItemStack(Material.SPECKLED_MELON));
		healing.addIngredient(1, Material.POTION, 8204);
		server.addRecipe(healing);
		//Poison
		ShapelessRecipe poison = new ShapelessRecipe(new ItemStack(Material.SPIDER_EYE));
		poison.addIngredient(1, Material.POTION, 8196);
		server.addRecipe(poison);
		//Regeneration
		ShapelessRecipe regeneration = new ShapelessRecipe(new ItemStack(Material.GHAST_TEAR));
		regeneration.addIngredient(1, Material.POTION, 8193);
		server.addRecipe(regeneration);
	}
	
	
}
