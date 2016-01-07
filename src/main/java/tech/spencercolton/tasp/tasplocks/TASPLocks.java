package tech.spencercolton.tasp.tasplocks;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import tech.spencercolton.tasp.Util.Config;

public class TASPLocks extends JavaPlugin {

    @Override
    public void onEnable() {
        Plugin TASP = this.getServer().getPluginManager().getPlugin("TASP");

        if(TASP == null) {
            this.getLogger().severe(Config.err() + "Unable to load TASP Doors plugin because the TASP main plugin is missing!");
            this.getLogger().severe(Config.err() + "Install the TASP main plugin before trying again.");
            this.getServer().getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Disabling TASP Doors plugin...");
    }

}
