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

public class painkillerlistener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPainKillerUse(final PlayerInteractEvent event){
		if (event.isCancelled()){
			return;
		}
			//Glistening Melon
		if (event.getItem().getType() == Material.SPECKLED_MELON){
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 120, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 120, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 60, 0));
			new BukkitRunnable(){
			  @Override
			  public void run(){
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 15, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 30, 0));
			  }
			}.runTaskLater((Plugin) this, 2400L);
		}
			//Glowstone
		if (event.getItem().getType() == Material.GLOWSTONE_DUST){
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 240, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 120, 0));
			new BukkitRunnable(){
			  @Override
			  public void run(){
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 30, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 60, 0));
			  }
			}.runTaskLater((Plugin) this, 6000L);
		}
			//Gun Powder
		if (event.getItem().getType() == Material.SULPHUR){
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 150, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 120, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 60, 0));
			new BukkitRunnable(){
			  @Override
			  public void run(){
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 0));
				  event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 30, 0));
			  }
			}.runTaskLater((Plugin) this, 3000L);
		}
	}
}