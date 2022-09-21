package your.packagename.pluginname.listeners;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		event.joinMessage(Component.text(ChatColor.translateAlternateColorCodes('&', "&a" + player.getName() + " &fhas joined the server!")));
	}

	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		event.quitMessage(Component.text(ChatColor.translateAlternateColorCodes('&', "&c" + player.getName() + " &fhas left the server!")));
	}
}
