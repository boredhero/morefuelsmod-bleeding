package com.bored.morefuelsmod.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOre extends BlockBase {

	public BlockOre(String name) {
		super(Material.field_151576_e, name);

		func_149711_c(3f);
		func_149752_b(5f);
	}

	@Override
	public BlockOre func_149647_a(CreativeTabs tab) {
		super.func_149647_a(tab);
		return this;
	}

}
