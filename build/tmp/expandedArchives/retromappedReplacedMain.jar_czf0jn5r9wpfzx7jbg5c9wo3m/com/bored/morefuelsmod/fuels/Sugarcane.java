package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Sugarcane implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.func_77973_b() == Items.field_151120_aE){
			return 300;
		}
		return 0;
	}
}
