package com.rzheng.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin 
{
	@Override
	public void onEnable() 
	{
		this.getLogger().info("My Plugin is Starting!");
		this.getCommand("hellob0ss").setExecutor(new TestCommand());
	}
	
	@Override
	public void onDisable()
	{
		this.getLogger().info("My Plugin is Shutting Down!");
	}
}
