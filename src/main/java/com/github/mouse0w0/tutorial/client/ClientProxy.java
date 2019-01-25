package com.github.mouse0w0.tutorial.client;

import com.github.mouse0w0.tutorial.common.CommonProxy;
import com.github.mouse0w0.tutorial.common.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {
	
	@SubscribeEvent
	public void registerItemModels(ModelRegistryEvent event) {
		registerItemModel(ModItems.FIRST_ITEM);
	}
	
	public void registerItemModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
