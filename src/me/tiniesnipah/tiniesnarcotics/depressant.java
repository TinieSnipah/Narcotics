package me.tiniesnipah.tiniesnarcotics;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class depressant extends JavaPlugin{
	

	@Override
	public void onDisable() {
		
	}
	
	@Override
	public void onEnable() {
		PluginManager manager = this.getServer().getPluginManager();
	
		manager.registerEvents(new depressantlistener(), this);
	}
	
}
