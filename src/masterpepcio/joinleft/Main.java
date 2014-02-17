package masterpepcio.joinleft;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener { 

	
public void onEnable() {
	this.getServer().getPluginManager().registerEvents(this, this);}

@EventHandler
public void onPlayerJoin(PlayerJoinEvent gracz) {
	gracz.setJoinMessage(null);
}

@EventHandler
public void onPlayerLeft(PlayerQuitEvent gracz) {
	gracz.setQuitMessage(null);
}

}




