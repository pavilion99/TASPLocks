package tech.spencercolton.tasp.tasplocks;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class TASPLocks extends JavaPlugin {

    public void onEnable() {
        Plugin TASP = getServer().getPluginManager().getPlugin("TASP");

        if(TASP == null) {
            getLogger().severe(tech.spencercolton.tasp.Util.Config.err() + "Unable to load TASP Doors plugin because the TASP main plugin is missing!");
            getLogger().severe(tech.spencercolton.tasp.Util.Config.err() + "Install the TASP main plugin before trying again.");
            getServer().getPluginManager().disablePlugin(this);
        }
    }

    public void onDisable() {
        getLogger().info("Disabling TASP Doors plugin...");
    }

}
