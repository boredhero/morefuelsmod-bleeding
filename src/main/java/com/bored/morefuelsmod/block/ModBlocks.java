package com.bored.morefuelsmod.block;

import com.bored.morefuelsmod.MoreFuelsMod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockOre oreBituminousCoal = new BlockOre("ore_bituminous_coal").setCreativeTab(MoreFuelsMod.creativeTab);
	public static BlockStone blockCoke = new BlockStone("block_coke").setCreativeTab(MoreFuelsMod.creativeTab);
	public static BlockStone blockBituminousCoal = new BlockStone("block_bituminous_coal").setCreativeTab(MoreFuelsMod.creativeTab);
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
					oreBituminousCoal,
					blockCoke,
					blockBituminousCoal
				);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
					oreBituminousCoal.createItemBlock(),
					blockCoke.createItemBlock(),
					blockBituminousCoal.createItemBlock()
				);
	}
	
	public static void registerModels() {
		oreBituminousCoal.registerItemModel(Item.getItemFromBlock(oreBituminousCoal));
		blockCoke.registerItemModel(Item.getItemFromBlock(blockCoke));
		blockBituminousCoal.registerItemModel(Item.getItemFromBlock(blockBituminousCoal));
	}
}