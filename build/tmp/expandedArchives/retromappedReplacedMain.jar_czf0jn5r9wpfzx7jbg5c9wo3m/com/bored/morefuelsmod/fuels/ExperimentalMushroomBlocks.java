package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ExperimentalMushroomBlocks implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150420_aW)){
			return 200;
		}
		if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150419_aX)){
			return 200;
		}
		return 0;
	}
}
