package com.bored.morefuelsmod.block;

import java.util.Random;

import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockOre extends BlockBase {

	public BlockOre(String name) {
		super(Material.field_151576_e, name);
		func_149711_c(5f);
		func_149752_b(5f);
	}

	@Override
	public BlockOre func_149647_a(CreativeTabs tab) {
		super.func_149647_a(tab);
		return this;
	}
	
	public Item func_180660_a(IBlockState state, Random rand, int fortune){
		return ModItems.bituminousCoal;
		}


}
