package com.github.mouse0w0.tutorial;

import com.github.mouse0w0.tutorial.common.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = "tutorial")
public class Tutorial {

	@SidedProxy(serverSide = "com.github.mouse0w0.tutorial.common.CommonProxy", clientSide = "com.github.mouse0w0.tutorial.client.ClientProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(proxy);
	}
}
	