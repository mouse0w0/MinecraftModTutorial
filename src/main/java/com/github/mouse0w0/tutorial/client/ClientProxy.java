package com.github.mouse0w0.tutorial.client;

import com.github.mouse0w0.tutorial.common.CommonProxy;
import com.github.mouse0w0.tutorial.common.init.ModBlocks;
import com.github.mouse0w0.tutorial.common.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {
	
	@SubscribeEvent
	public void registerItemModels(ModelRegistryEvent event) {
		// registerItemModel(Item.getItemFromBlock(ModBlocks.FIRST_BLOCK)); 这个太长了，可以缩短一些。
		// 注册方块的物品的模型
		registerItemModel(ModBlocks.FIRST_BLOCK);
		
		// 注册普通的物品的模型
		registerItemModel(ModItems.FIRST_ITEM);
	}
	
	// 注册方块的物品的模型
	public void registerItemModel(Block block) {
		registerItemModel(Item.getItemFromBlock(block));
	}
	
	// 注册普通的物品的模型
	public void registerItemModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
