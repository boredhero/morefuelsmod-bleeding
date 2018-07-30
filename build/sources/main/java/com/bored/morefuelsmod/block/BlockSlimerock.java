package com.bored.morefuelsmod.block;

import com.bored.morefuelsmod.MoreFuelsMod;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSlimerock extends BlockBase {
	
	public BlockSlimerock(String name){
		super(Material.ROCK, name);
		
		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public BlockSlimerock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(MoreFuelsMod.creativeTab);
		return this;
	}
	
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
		if (this == ModBlocks.blockSlimerock)
			return true;
		else
			return false;
	}
}