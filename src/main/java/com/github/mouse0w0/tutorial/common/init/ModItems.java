package com.github.mouse0w0.tutorial.common.init;

import com.github.mouse0w0.tutorial.common.item.FirstItem;

import net.minecraft.item.Item;

public class ModItems {
	
	public static final Item FIRST_ITEM = new FirstItem().setRegistryName("first_item").setUnlocalizedName("firstItem").setCreativeTab(ModCreativeTabs.MOD_CREATIVE_TAB); // 这是我的第一个物品，名字是：tutorial:first_item 
	
}
