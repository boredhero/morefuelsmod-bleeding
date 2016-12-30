//This class is a fix for double tall grass and other doubly tall plants and flowers.
//Not 100% Sure its necessary, but its a failsafe.
package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class DoublePlant implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150398_cm)){
			return 200;
		}
		if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150329_H)){
			return 200;
		}
		return 0;
	}
}
