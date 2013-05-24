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

public class stimulantlistener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onStimulantUse(final PlayerInteractEvent event){
		if (event.isCancelled()){
			return;
		}
			//Redstone
		if (event.getItem().getType() == Material.REDSTONE){
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60, 1));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 10, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 60, 1));
			new BukkitRunnable(){
			  @Override
			  public void run(){
				event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 0));
			    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));
			    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 20, 0));
			    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 10, 0));
			  }
			}.runTaskLater((Plugin) this, 1200L);
		}
		//Sugar
				if (event.getItem().getType() == Material.SUGAR){
					event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 120, 1));
					event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 30, 1));
					event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 60, 1));
					new BukkitRunnable(){
					  @Override
					  public void run(){
					    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 0));
					    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20, 1));
					    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 30, 1));
					    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 20, 1));
					  }
					}.runTaskLater((Plugin) this, 1800L);
				}
	}
}