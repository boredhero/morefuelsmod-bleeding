//This class should cover ~50% of flowers, that includes of course, the Poppy especially.
package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class RedFlower implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150328_O)){
			return 100;
		}
		return 0;
	}
}
