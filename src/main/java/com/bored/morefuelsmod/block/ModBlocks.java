package com.bored.morefuelsmod.block;

import com.bored.morefuelsmod.MoreFuelsMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockOre oreBituminousCoal = new BlockOre("ore_bituminous_coal").setCreativeTab(MoreFuelsMod.creativeTab);
	public static BlockStone blockCoke = new BlockStone("block_coke").setCreativeTab(MoreFuelsMod.creativeTab);
	public static BlockStone blockBituminousCoal = new BlockStone("block_bituminous_coal").setCreativeTab(MoreFuelsMod.creativeTab);
	public static BlockStone blockCreativeInfiniteFuel = new BlockStone("block_creative_infinite_fuel").setCreativeTab(MoreFuelsMod.creativeTab);
	public static BlockLavaOre oreLava = new BlockLavaOre("ore_lava").setCreativeTab(MoreFuelsMod.creativeTab);
	public static BlockWood blockPelletFuel = new BlockWood("block_pellet_fuel").setCreativeTab(MoreFuelsMod.creativeTab);
	public static BlockWood blockCompressedPelletFuel = new BlockWood("block_compressed_pellet_fuel").setCreativeTab(MoreFuelsMod.creativeTab);
	public static BlockSlimerock blockSlimerock = new BlockSlimerock("block_slimerock").setCreativeTab(MoreFuelsMod.creativeTab);
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
					oreBituminousCoal,
					blockCoke,
					blockBituminousCoal,
					blockCreativeInfiniteFuel,
					oreLava,
					blockPelletFuel,
					blockCompressedPelletFuel,
					blockSlimerock
				);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
					oreBituminousCoal.createItemBlock(),
					blockCoke.createItemBlock(),
					blockBituminousCoal.createItemBlock(),
					blockCreativeInfiniteFuel.createItemBlock(),
					oreLava.createItemBlock(),
					blockPelletFuel.createItemBlock(),
					blockCompressedPelletFuel.createItemBlock(),
					blockSlimerock.createItemBlock()
				);
	}
	
	public static void registerModels() {
		oreBituminousCoal.registerItemModel(Item.getItemFromBlock(oreBituminousCoal));
		blockCoke.registerItemModel(Item.getItemFromBlock(blockCoke));
		blockBituminousCoal.registerItemModel(Item.getItemFromBlock(blockBituminousCoal));
		blockCreativeInfiniteFuel.registerItemModel(Item.getItemFromBlock(blockCreativeInfiniteFuel));
		oreLava.registerItemModel(Item.getItemFromBlock(oreLava));
		blockPelletFuel.registerItemModel(Item.getItemFromBlock(blockPelletFuel));
		blockCompressedPelletFuel.registerItemModel(Item.getItemFromBlock(blockCompressedPelletFuel));
		blockSlimerock.registerItemModel(Item.getItemFromBlock(blockSlimerock));
	}
}