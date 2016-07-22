package com.bored.morefuelsmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import com.bored.morefuelsmod.Main;

public class BlockBase extends Block {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);

		this.name = name;

		func_149663_c(name);
		setRegistryName(name);
		func_149647_a(Main.creativeTab);
	}

	public void registerItemModel(ItemBlock itemBlock) {
		Main.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	@Override
	public BlockBase func_149647_a(CreativeTabs tab) {
		super.func_149647_a(tab);
		return this;
	}

}
