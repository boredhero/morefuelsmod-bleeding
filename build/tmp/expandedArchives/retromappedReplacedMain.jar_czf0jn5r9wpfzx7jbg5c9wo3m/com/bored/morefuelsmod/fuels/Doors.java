//All the doors, one file, one config flag. Don't like? Too bad.
package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Doors implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if (fuel.func_77973_b() == Items.field_179570_aq){
			return 600;
		}
		if (fuel.func_77973_b() == Items.field_179572_au){
			return 600;
		}
		if (fuel.func_77973_b() == Items.field_179568_as){
			//you little birch!
			return 600;
		}
		if (fuel.func_77973_b() == Items.field_179571_av){
			return 600;
		}
		if (fuel.func_77973_b() == Items.field_179567_at){
			return 600;
		}
		if (fuel.func_77973_b() == Items.field_179569_ar){
			return 600;
		}
		return 0;
	}
}
