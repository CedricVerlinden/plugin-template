package your.packagename.pluginname.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TestCommand implements CommandExecutor, TabCompleter {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
		
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou can only use this command in-game."));
			return true;
		}

		Player player = (Player) sender;

		if (args.length == 0) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aThe test command is working!"));
			return true;
		}

		StringBuilder message = new StringBuilder();

		for (int index = 0; index < args.length; index++) {
			message.append(args[index]).append(" ").trimToSize();
		}

		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a" + message));

		return true;
	}

	@Override
	public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

		if (!(sender instanceof Player)) {
			return new ArrayList<>();
		}

		List<String> completions = new ArrayList<>();

		switch (args.length) {
			case 1 -> completions.add("This");
			case 2 -> completions.add("is");
			case 3 -> completions.add("a");
			case 4 -> completions.add("tab");
			case 5 -> completions.add("completed");
			case 6 -> completions.add("sentence.");
		}

		return completions;
	}
}
