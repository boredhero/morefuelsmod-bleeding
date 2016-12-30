//Covers both lit and unlit torches in one file!
package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class RedstoneTorch implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150429_aA)){
			return 100;
		}
		if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150437_az)){
			return 100;
		}
		return 0;
	}
}
