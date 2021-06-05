package me.python;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public class JSMPlugin extends JavaPlugin {
    public void onEnable() {
        System.setSecurityManager(new JSMManager());
    }

    public void onDisable() {}
}
