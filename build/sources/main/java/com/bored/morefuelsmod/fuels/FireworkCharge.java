package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class FireworkCharge implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.FIREWORK_CHARGE){
			return 3200;
		}
		return 0;
	}
}