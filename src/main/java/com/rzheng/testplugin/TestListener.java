package com.rzheng.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class TestListener implements Listener
{
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e)
	{
		if(e.getBlock().getType() == Material.DIAMOND_BLOCK)
		{
			Bukkit.getServer().broadcastMessage(ChatColor.DARK_RED + e.getPlayer().getName() + " is a bab theif!!");
		}
	}
}
