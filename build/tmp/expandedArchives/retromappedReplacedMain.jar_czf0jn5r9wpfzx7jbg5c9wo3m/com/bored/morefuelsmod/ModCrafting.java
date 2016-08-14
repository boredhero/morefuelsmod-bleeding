package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void init(){
		
		//Mod Blocks and Items Recipes
		
		//Pellet Fuel to Pellet Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pelletBlock),"###","###","###",'#',ModItems.pelletsFuel);
		//Pellet Block to Pellet Fuel
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pelletsFuel, 9),new Object[]{ModBlocks.pelletBlock});
		//Pellet Block to Concentrated Pellet Fuel
		GameRegistry.addRecipe(new ItemStack(ModItems.concentratedPelletsFuel),"##","##",'#',ModBlocks.pelletBlock);
		//Concentrated Pellet Fuel to Pellet Block
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.pelletBlock, 4),new Object[]{ModItems.concentratedPelletsFuel});
		//Concentrated Pellet Fuel to Concentrated Pellet Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.concentratedPelletBlock),"###","###","###",'#',ModItems.concentratedPelletsFuel);
		//Concentrated Pellet Block to Concentrated Pellet Fuel
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.concentratedPelletsFuel, 9),new Object[]{ModBlocks.concentratedPelletBlock});
		//Coal and Bitumen to Bituminous Coal
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bituminousCoal),new Object[]{Items.field_151044_h,ModItems.bitumen});
		//Gunpowder, Coal Dust, and Slime Ball to Can of Slimoline
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.canSlimoline),new Object[]{Items.field_151016_H,ModItems.dustCoal,Items.field_151123_aH});
		//Coal and Stone Block to Coal Dust
	    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustCoal),new Object[]{Items.field_151044_h,Blocks.field_150348_b});
		
		//Mod Fuels to Fuel Pellets Recipes
		
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.func_150898_a(Blocks.field_150330_I));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Item.func_150898_a(Blocks.field_150434_aF));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.func_150898_a(Blocks.field_150321_G));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150442_at));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.func_150898_a(Blocks.field_150398_cm));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150328_O));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150327_N));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',Items.field_151160_bD);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.field_151104_aV);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 10),"###","###","###",'#',Items.field_151159_an);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 7),"###","###","###",'#',Items.field_151155_ap);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Item.func_150898_a(Blocks.field_150468_ap));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150448_aq));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150408_cc));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150319_E));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150318_D));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 10),"###","###","###",'#',Item.func_150898_a(Blocks.field_150331_J));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',Item.func_150898_a(Blocks.field_150320_F));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150395_bd));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150392_bi));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.func_150898_a(Blocks.field_150479_bC));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',Item.func_150898_a(Blocks.field_150407_cf));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.func_150898_a(Blocks.field_150404_cg));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.func_150898_a(Blocks.field_150325_L));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_151032_g);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_151008_G);
		//GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.WHEAT);
		//Supposed to handle wheat, but this causes an override of 9 wheat = 1 hay block. Just gunna leave hay blocks in
		//And comment this for now. Might work out a solution later, might not. 
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_151014_N);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_151081_bc);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_151080_bb);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_185163_cU);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150478_aa));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150429_aA));
		//GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.UNLIT_REDSTONE_TORCH));
		//Causes a crash because of unknown reasons
		//Do not uncomment
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.field_179570_aq);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.field_179572_au);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.field_179568_as);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.field_179571_av);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.field_179567_at);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.field_179569_ar);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Item.func_150898_a(Blocks.field_150471_bO));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.field_151054_z);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.field_151124_az);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.field_185153_aK);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.field_185151_aI);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.field_185154_aL);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.field_185152_aJ);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.field_185150_aH);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.field_151120_aE);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.field_151121_aF);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 10),"###","###","###",'#',Items.field_151122_aG);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 11),"###","###","###",'#',Items.field_151099_bA);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 11),"###","###","###",'#',Items.field_151164_bB);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 4),"###","###","###",'#',Items.field_151108_aI);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 25),"###","###","###",'#',Items.field_151148_bJ);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 25),"###","###","###",'#',Items.field_151098_aY);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.field_151112_aM);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.field_151146_bM);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.func_150898_a(Blocks.field_150329_H));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150338_P));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.func_150898_a(Blocks.field_150337_Q));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.func_150898_a(Blocks.field_150420_aW));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.func_150898_a(Blocks.field_150420_aW));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.field_179565_cj);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.field_151059_bz);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 32),"###","###","###",'#',Items.field_151154_bQ);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 51),"###","###","###",'#',Items.field_151152_bP);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 16),"###","###","###",'#',Items.field_151016_H);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 12),"###","###","###",'#',Items.field_151065_br);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 20),"###","###","###",'#',Items.field_151064_bs);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 20),"###","###","###",'#',Items.field_151073_bk);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 50),"###","###","###",'#',Items.field_151063_bx);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_151170_bI);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_151078_bh);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_151070_bp);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Items.field_151071_bq);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Items.field_179556_br);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.field_151116_aA);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 4),"###","###","###",'#',Items.field_151021_T);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 8),"###","###","###",'#',Items.field_151027_R);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 5),"###","###","###",'#',Items.field_151024_Q);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 7),"###","###","###",'#',Items.field_151026_S);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Item.func_150898_a(Blocks.field_185765_cR));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Item.func_150898_a(Blocks.field_185766_cS));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 18),"###","###","###",'#',Items.field_185159_cQ);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 21),"###","###","###",'#',Items.field_185157_bK);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 81),"###","###","###",'#',Item.func_150898_a(Blocks.field_150335_W));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 82),"###","###","###",'#',Items.field_151142_bV);
	}
}

