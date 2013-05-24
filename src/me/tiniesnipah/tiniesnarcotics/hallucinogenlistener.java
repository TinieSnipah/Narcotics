package me.tiniesnipah.tiniesnarcotics;

//import org.bukkit.Color;
//import org.bukkit.Effect.Type;
//import org.bukkit.FireworkEffect;
import org.bukkit.Material;
//import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
//import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class hallucinogenlistener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onHallucinogenUse(final PlayerInteractEvent event){
		if (event.isCancelled()){
			return;
		}
			//Golden Carrot
		if (event.getItem().getType() == Material.GOLDEN_CARROT){
			//Firework firework = event.getPlayer().getWorld().spawn(location, Firework.class);
			//FireworkMeta data = (FireworkMeta) firework.getFireworkMeta();
			//data.addEffects(FireworkEffect.builder().withColor(Color.GREEN).with(Type.BALL_LARGE).build());
			//data.setPower(2);
			//firework.setFireworkMeta(data);
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 60, 0));
			event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 30, 0));
			new BukkitRunnable(){
			  @Override
			  public void run(){
			    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 5, 0));
			    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20, 0));
			  }
			}
			.runTaskLater((Plugin) this, 1200L);
		}
		//Nether Wart
				if (event.getItem().getType() == Material.NETHER_STALK){
					event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 90, 0));
					event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20, 0));
					new BukkitRunnable(){
					  @Override
					  public void run(){
					    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 10, 0));
					    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 40, 0));
					  }
					}.runTaskLater((Plugin) this, 1800L);
				}
	}
}