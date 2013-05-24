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

public class performanceenhancerlistener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPerformanceEnhancerUse(final PlayerInteractEvent event){
		if (event.isCancelled()){
			return;
		}
		//Blaze Powder
		if (event.getItem().getType() == Material.BLAZE_POWDER){
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 60, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 15, 1));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 30, 0));
			new BukkitRunnable(){
			  @Override
			  public void run(){
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 30, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 1));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 15, 0));
			  }
			}.runTaskLater((Plugin) this, 1200L);
		}
		//Magma Cream
		if (event.getItem().getType() == Material.MAGMA_CREAM){
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 120, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 30, 1));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 60, 0));
			new BukkitRunnable(){
			  @Override
			  public void run(){
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 45, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 30, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 15, 1));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 30, 0));
			  }
			}.runTaskLater((Plugin) this, 2400L);
		}
		//Ghast Tear
				if (event.getItem().getType() == Material.GHAST_TEAR){
					event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 0));
					event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 45, 0));
					event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60, 1));
					event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 150, 0));
					new BukkitRunnable(){
					  @Override
					  public void run(){
						  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 0));
						  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 15, 0));
						  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 10, 0));
						  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 5, 1));
						  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 10, 0));
					  }
					}.runTaskLater((Plugin) this, 6000L);
				}
	}
}