package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Fuels implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel){
				//This handles ferns, also redundant for some items like dead bush
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TALLGRASS)){ //ADDED TO DOUBLEPLANT
					return 200;
				}
				//Mushroom time! Don't get high off the fumes from burning them...
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.BROWN_MUSHROOM)){
					//This covers the brown mushroom inventory item
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RED_MUSHROOM)){
					//This covers the red mushroom inventory item
					return 100;
				}
				//EXPERIMENTAL SHROOM COMPATIBILITY
				//Never actually bothered to get these items in inventory to test
				//Therefore I have no idea if this is just eating up space or if it works.
				//But someone might need it...so I'll be nice and accommodate them.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.BROWN_MUSHROOM_BLOCK)){
					//This covers the giant brown mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RED_MUSHROOM_BLOCK)){
					//This covers the giant red mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.getItem() == Items.ARMOR_STAND){
					return 600;
				}
				if (fuel.getItem() == Items.FIRE_CHARGE){
					return 1500;
				}
				if (fuel.getItem() == Items.FIREWORK_CHARGE){
					return 3200;
				}
				if (fuel.getItem() == Items.FIREWORKS){
					return 5100;
				}
				if (fuel.getItem() == Items.GUNPOWDER){
					return 1600;
				}
				if (fuel.getItem() == Items.BLAZE_POWDER){
					return 1200;
				}
				if (fuel.getItem() == Items.MAGMA_CREAM){
					return 2000;
				}
				if (fuel.getItem() == Items.GHAST_TEAR){
					return 2000;
				}
				if (fuel.getItem() == Items.SPAWN_EGG){
					return 5000;
				}
				if (fuel.getItem() == Items.POISONOUS_POTATO){
					return 100;
				}
				if (fuel.getItem() == Items.ROTTEN_FLESH){
					return 100;
				}
				if (fuel.getItem() == Items.SPIDER_EYE){
					return 100;
				}
				if (fuel.getItem() == Items.FERMENTED_SPIDER_EYE){
					return 200;
				}
				if (fuel.getItem() == Items.RABBIT_FOOT){
					return 200;
				}
				if (fuel.getItem() == Items.LEATHER){
					return 100;
				}
				if (fuel.getItem() == Items.LEATHER_BOOTS){
					return 400;
				}
				if (fuel.getItem() == Items.LEATHER_CHESTPLATE){
					return 800;
				}
				if (fuel.getItem() == Items.LEATHER_HELMET){
					return 500;
				}
				if (fuel.getItem() == Items.LEATHER_LEGGINGS){
					return 700;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.CHORUS_PLANT)){
					return 600;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.CHORUS_FLOWER)){
					return 600;
				}
				if (fuel.getItem() == Items.SHIELD){
					return 1800;
				}
				if (fuel.getItem() == Items.DRAGON_BREATH){
					return 2100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TNT)){
					return 8100;
				}
				if (fuel.getItem() == Items.TNT_MINECART){
					return 8200;
				}
				//MOD ITEMS BELOW THIS POINT
				if (fuel.getItem() == ModItems.pelletsFuel){
					return 900;
				}
				if (fuel.getItem() == Item.getItemFromBlock(ModBlocks.pelletBlock)){
					return 8100; //9 times the value of fuel pellets
				}
				if (fuel.getItem() == ModItems.concentratedPelletsFuel){
					return 32400; //4 times the value of pellet blocks
				}
				if (fuel.getItem() == Item.getItemFromBlock(ModBlocks.concentratedPelletBlock)){
					return 291600; //9 times the value of concentrated pellet fuel
				}
				if (fuel.getItem() == ModItems.coke){
					return 3200; //twice the value of coal.
				}
				if (fuel.getItem() == Item.getItemFromBlock(ModBlocks.cokeBlock)){
					return 28800;
				}
				if (fuel.getItem() == ModItems.bituminousCoal){
					return 1600; //Same as regular coal, it will function as this with the ability to make coke.
				}
				if (fuel.getItem() == ModItems.canSlimoline){
					return 20000;
				}
				
				return 0;
	}
}