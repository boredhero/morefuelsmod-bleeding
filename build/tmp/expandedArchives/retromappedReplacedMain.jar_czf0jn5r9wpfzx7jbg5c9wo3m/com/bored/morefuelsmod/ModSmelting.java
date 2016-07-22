package com.bored.morefuelsmod;

import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {
	public static void init(){
		GameRegistry.addSmelting(Items.field_151145_ak, new ItemStack(ModItems.bitumen), 0.5F);
		GameRegistry.addSmelting(ModItems.bituminousCoal, new ItemStack(ModItems.coke), 0.5F);
	}
}
