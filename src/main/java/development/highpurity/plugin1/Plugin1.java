package development.highpurity.plugin1;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin1 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.print("Playermessages is initiating...");
        System.out.print("Playermessages has Successfully initiated!");

        getServer().getPluginManager().registerEvents(this, this);
    }


    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event){

        String player1 = event.getPlayer().getName();
        event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', "&eThanks for playing, &f" + player1 + "&e!"));
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        System.out.print("A player has joined the server!");
        String player1 = event.getPlayer().getName();
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&eWelcome to the server &f" + player1 + "&e!"));





    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.print("Playermessages is deactivating...");
        System.out.print("Playermessages has Successfully deactivated!");


    }
}
