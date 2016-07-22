package com.bored.morefuelsmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.bored.morefuelsmod.Main;
import com.bored.morefuelsmod.item.ModItems;

public class MoreFuelsTab extends CreativeTabs {

	public MoreFuelsTab() {
		super(Main.modid);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.coke;
	}

}