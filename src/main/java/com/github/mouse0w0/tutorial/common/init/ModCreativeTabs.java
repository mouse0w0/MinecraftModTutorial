package com.github.mouse0w0.tutorial.common.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {
	
	public static final CreativeTabs MOD_CREATIVE_TAB = new CreativeTabs("tutorial") {
		
		@Override	
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.FIRST_ITEM);
		}
	};

}
