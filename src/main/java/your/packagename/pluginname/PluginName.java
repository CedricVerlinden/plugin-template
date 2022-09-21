package your.packagename.pluginname;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import your.packagename.pluginname.commands.TestCommand;
import your.packagename.pluginname.listeners.PlayerListener;

public class PluginName extends JavaPlugin {

	@Override
	public void onEnable() {

		Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "Loading commands..."));
		this.loadCommands();

		Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "Loading listeners..."));
		this.loadListeners();

		Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aThe template plugin has successfully loaded!"));
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cThe template plugin is being shut down!"));
	}

	private void loadCommands() {
		getCommand("test").setExecutor(new TestCommand());
	}

	private void loadListeners() {
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
	}
}
