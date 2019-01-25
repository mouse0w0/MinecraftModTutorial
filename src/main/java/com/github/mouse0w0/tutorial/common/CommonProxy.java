package com.github.mouse0w0.tutorial.common;

import com.github.mouse0w0.tutorial.common.init.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonProxy {
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(ModItems.FIRST_ITEM);
	}

}
