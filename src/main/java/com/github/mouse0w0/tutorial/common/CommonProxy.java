package com.github.mouse0w0.tutorial.common;

import com.github.mouse0w0.tutorial.common.init.ModBlocks;
import com.github.mouse0w0.tutorial.common.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonProxy { // 通用代理
	
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		// 注册方块
		event.getRegistry().register(ModBlocks.FIRST_BLOCK);
	}
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		// event.getRegistry().register(new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(ModBlocks.FIRST_BLOCK.getRegistryName()));
		// 上面的代码太长了,我们简化一下,下面的代码就短了很多
		// 注册方块的物品形式
		registerItemBlock(ModBlocks.FIRST_BLOCK, event);
		
		// 注册普通的物品
		event.getRegistry().register(ModItems.FIRST_ITEM);
	}
	
	// 注册一个方块的物品形式
	public void registerItemBlock(Block block, RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
}
