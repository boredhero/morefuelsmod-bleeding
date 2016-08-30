package com.bored.morefuelsmod.block;

import com.bored.morefuelsmod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);

		this.name = name;

		func_149663_c(name);
		setRegistryName(name);
		func_149647_a(Main.creativeTab);
		func_149711_c(5f);
		func_149752_b(5f);
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
