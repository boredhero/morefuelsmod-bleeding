package com.bored.morefuelsmod.block;

import com.bored.morefuelsmod.MoreFuelsMod;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMoreFuelsFurnace extends BlockBase {
	
	public BlockMoreFuelsFurnace(String name){
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public BlockMoreFuelsFurnace setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(MoreFuelsMod.creativeTab);
		return this;
	}
}