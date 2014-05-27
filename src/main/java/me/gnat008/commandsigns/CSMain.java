package me.gnat008.commandsigns;

import me.gnat008.commandsigns.util.Printer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by Gnat008 on 5/27/2014.
 */
public class CSMain extends JavaPlugin {

    private static CSMain plugin;
    private static Logger log = Bukkit.getServer().getLogger();
    private static Printer printer;

    private PluginManager pm;

    public CSMain() {

    }

    @Override
    public void onEnable() {
        plugin = this;
        pm = getServer().getPluginManager();
        printer = new Printer(this);

        // Set the command executor

        // Set up and register listeners

        // Load the configuration
    }

    private void setupListeners() {
        // TODO: Register and instantiate all Listener classes
    }

    public static CSMain getInstance() {
        return plugin;
    }

    public Printer getPrinter() {
        return printer;
    }
}
