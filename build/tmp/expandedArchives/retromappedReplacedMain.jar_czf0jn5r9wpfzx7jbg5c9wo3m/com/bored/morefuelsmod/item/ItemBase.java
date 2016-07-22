package com.bored.morefuelsmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.bored.morefuelsmod.Main;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		func_77655_b(name);
		setRegistryName(name);
		func_77637_a(Main.creativeTab);
	}

	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase func_77637_a(CreativeTabs tab) {
		super.func_77637_a(tab);
		return this;
	}

}
