package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ExperimentalMushroomBlocks implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.BROWN_MUSHROOM_BLOCK)){
			return 200;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.RED_MUSHROOM_BLOCK)){
			return 200;
		}
		return 0;
	}
}