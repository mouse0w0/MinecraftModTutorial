package com.github.mouse0w0.tutorial.common.init;

import com.github.mouse0w0.tutorial.common.block.FirstBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final Block FIRST_BLOCK = new FirstBlock(Material.ROCK).setRegistryName("first_block").setUnlocalizedName("firstBlock").setCreativeTab(ModCreativeTabs.MOD_CREATIVE_TAB);

}
