package com.bored.morefuelsmod.item;

import com.bored.morefuelsmod.MoreFuelsMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase cokeItem = new ItemBase("coke_item").setCreativeTab(MoreFuelsMod.creativeTab);
	
	public static void register (IForgeRegistry<Item> registry) {
		registry.registerAll(
				cokeItem
	);
	}
	
	public static void registerModels() {
		cokeItem.registerItemModel();
	}
}
