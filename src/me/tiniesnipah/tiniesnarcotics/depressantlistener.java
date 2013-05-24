package me.tiniesnipah.tiniesnarcotics;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class depressantlistener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onDepressantUse(final PlayerInteractEvent event){
		if (event.isCancelled()){
			return;
		}
			//Fermented Spider Eye
		if (event.getItem().getType() == Material.FERMENTED_SPIDER_EYE){
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 180, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 180, 0));
			new BukkitRunnable(){
			  @Override
			  public void run(){
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 30, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20, 0));
			  }
			}.runTaskLater((Plugin) this, 3600L);
		}
	}
}