package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class LeatherArmor implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.func_77973_b() == Items.field_151024_Q){
			return 500;
		}
		if(fuel.func_77973_b() == Items.field_151027_R){
			return 800;
		}
		if(fuel.func_77973_b() == Items.field_151026_S){
			return 700;
		}
		if(fuel.func_77973_b() == Items.field_151021_T){
			return 400;
		}
		return 0;
	}
}
