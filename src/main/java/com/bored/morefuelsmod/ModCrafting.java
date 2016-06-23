package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void init(){
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pelletBlock),"###","###","###",'#',ModItems.pelletsFuel);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.concentratedPelletBlock),"###","###","###",'#',ModItems.concentratedPelletsFuel);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bituminousCoal),new Object[]{Items.COAL,ModItems.bitumen});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.canSlimoline),new Object[]{Items.GUNPOWDER,ModItems.dustCoal,Items.SLIME_BALL});
	}
}
