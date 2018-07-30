package com.bored.morefuelsmod.block;

import com.bored.morefuelsmod.MoreFuelsMod;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFuelConverter extends BlockBase {
	
	public BlockFuelConverter(String name){
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public BlockFuelConverter setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(MoreFuelsMod.creativeTab);
		return this;
	}
}