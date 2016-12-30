package com.bored.morefuelsmod.fuels.modfuels;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ConcentratedPelletBlock implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.func_77973_b() == Item.func_150898_a(ModBlocks.concentratedPelletBlock)){
			return 291600;
		}
		return 0;
	}
}
