package me.gnat008.commandsigns.listeners;

import me.gnat008.commandsigns.CSMain;
import me.gnat008.commandsigns.util.Printer;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * Created by Gnat008 on 5/27/2014.
 * <p/>
 * Listener class to listen for a BlockPlaceEvent.
 * If the block placed is a sign with specific text, store the sign location and
 * command in memory.
 */
public class BlockPlaceListener implements Listener {

    private CSMain plugin;
    private Printer printer;

    public BlockPlaceListener(CSMain plugin) {
        this.plugin = plugin;
        this.printer = plugin.getPrinter();
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced() != null && event.getBlockPlaced() instanceof Sign) {
            Sign sign = (Sign) event.getBlockPlaced();
            String[] lines = sign.getLines();

            if (lines != null && lines[0].equalsIgnoreCase("[CommSign]")) {

            }
        }
    }
}
