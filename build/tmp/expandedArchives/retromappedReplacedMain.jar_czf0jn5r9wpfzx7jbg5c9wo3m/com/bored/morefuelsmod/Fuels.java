package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Fuels implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel){
		//Examples:
				//if(fuel.getItem() == Items.diamond) {
				//	return 5000;
				//}
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.deadbush)){
				//	return 50;
				//}
				//Note on timings, 20 = about 1 second in ticks.
		        //As of v1.4.0, no timings may exist under 100 for compatibility with the fuel pellet systems.
		        //All numbers will be rounded to the nearest 100 as well for compatibility with said system.
		        //Numbers 40 or above will be rounded up to the nearest 100.
				if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150330_I)){
					return 200;
				}
				if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150434_aF)){
					return 300;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150321_G)){
					return 200;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150442_at)){
					return 100;
				}
				//Fix for tall grass and all other doubly tall plants
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150398_cm)){
					return 200;
				}
				//This code SHOULD cover all flowers.
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150328_O)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150327_N)){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151160_bD){
					return 900;
				}
				if (fuel.func_77973_b() == Items.field_151104_aV){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_151159_an){
					return 1000;
				}
				if (fuel.func_77973_b() == Items.field_151155_ap){
					return 700;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150468_ap)){
					return 300;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150448_aq)) {
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150408_cc)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150319_E)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150318_D)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150331_J)){
					return 1000;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150320_F)){
					return 1100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150395_bd)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150392_bi)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150479_bC)){
					return 200;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150407_cf)){
					return 900;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150404_cg)){
					return 200;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150325_L)){
					return 200;
				}
				if (fuel.func_77973_b() == Items.field_151032_g){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151008_G){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151015_O){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151014_N){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151081_bc){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151080_bb){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_185163_cU){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150478_aa)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150429_aA)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150437_az)){
					return 100;
				}
				//Doors! Try the back one ;)
				if (fuel.func_77973_b() == Items.field_179570_aq){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179572_au){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179568_as){
					//you little birch!
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179571_av){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179567_at){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179569_ar){
					return 600;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150471_bO)){
					return 300;
				}
				if (fuel.func_77973_b() == Items.field_151054_z){
					return 300;
				}
				if (fuel.func_77973_b() == Items.field_151124_az){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185153_aK){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185151_aI){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185154_aL){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185152_aJ){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185150_aH){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_151120_aE){
					return 300;
				}
				if (fuel.func_77973_b() == Items.field_151121_aF){
					return 300;
				}
				if (fuel.func_77973_b() == Items.field_151122_aG) {
					return 1000;
				}
				if (fuel.func_77973_b() == Items.field_151099_bA){
					//unwritten writable book
					return 1100;
				}
				if (fuel.func_77973_b() == Items.field_151164_bB){
					//already written writable book
					return 1100;
				}
				if (fuel.func_77973_b() == Items.field_151108_aI){
				//Vanilla chest only burns for 300 Ticks.
					return 400;
				}
				if (fuel.func_77973_b() == Items.field_151148_bJ){
					return 2500;
				}
				if (fuel.func_77973_b() == Items.field_151098_aY){
					return 2500;
				}
				if (fuel.func_77973_b() == Items.field_151112_aM){
					return 300;
				}
				if (fuel.func_77973_b() == Items.field_151146_bM){
					return 300;
				}
				//This handles ferns, also redundant for some items like dead bush
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150329_H)){
					return 200;
				}
				//Mushroom time! Don't get high off the fumes from burning them...
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150338_P)){
					//This covers the brown mushroom inventory item
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150337_Q)){
					//This covers the red mushroom inventory item
					return 100;
				}
				//EXPERIMENTAL SHROOM COMPATIBILITY
				//Never actually bothered to get these items in inventory to test
				//Therefore I have no idea if this is just eating up space or if it works.
				//But someone might need it...so I'll be nice and accommodate them.
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150420_aW)){
					//This covers the giant brown mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150419_aX)){
					//This covers the giant red mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.func_77973_b() == Items.field_179565_cj){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_151059_bz){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_151154_bQ){
					return 3200;
				}
				if (fuel.func_77973_b() == Items.field_151152_bP){
					return 5100;
				}
				if (fuel.func_77973_b() == Items.field_151016_H){
					return 1600;
				}
				if (fuel.func_77973_b() == Items.field_151065_br){
					return 1200;
				}
				if (fuel.func_77973_b() == Items.field_151064_bs){
					return 2000;
				}
				if (fuel.func_77973_b() == Items.field_151073_bk){
					return 2000;
				}
				if (fuel.func_77973_b() == Items.field_151063_bx){
					return 5000;
				}
				if (fuel.func_77973_b() == Items.field_151170_bI){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151078_bh){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151070_bp){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151071_bq){
					return 200;
				}
				if (fuel.func_77973_b() == Items.field_179556_br){
					return 200;
				}
				if (fuel.func_77973_b() == Items.field_151116_aA){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151021_T){
					return 400;
				}
				if (fuel.func_77973_b() == Items.field_151027_R){
					return 800;
				}
				if (fuel.func_77973_b() == Items.field_151024_Q){
					return 500;
				}
				if (fuel.func_77973_b() == Items.field_151026_S){
					return 700;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_185765_cR)){
					return 600;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_185766_cS)){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_185159_cQ){
					return 1800;
				}
				if (fuel.func_77973_b() == Items.field_185157_bK){
					return 2100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150335_W)){
					return 8100;
				}
				if (fuel.func_77973_b() == Items.field_151142_bV){
					return 8200;
				}
				//MOD ITEMS BELOW THIS POINT
				if (fuel.func_77973_b() == ModItems.pelletsFuel){
					return 900;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(ModBlocks.pelletBlock)){
					return 8100; //9 times the value of fuel pellets
				}
				if (fuel.func_77973_b() == ModItems.concentratedPelletsFuel){
					return 32400; //4 times the value of pellet blocks
				}
				if (fuel.func_77973_b() == Item.func_150898_a(ModBlocks.concentratedPelletBlock)){
					return 291600; //9 times the value of concentrated pellet fuel
				}
				if (fuel.func_77973_b() == ModItems.coke){
					return 3200; //twice the value of coal.
				}
				if (fuel.func_77973_b() == Item.func_150898_a(ModBlocks.cokeBlock)){
					return 28800;
				}
				if (fuel.func_77973_b() == ModItems.bituminousCoal){
					return 1600; //Same as regular coal, it will function as this with the ability to make coke.
				}
				if (fuel.func_77973_b() == ModItems.canSlimoline){
					return 20000;
				}
				
				return 0;
	}
}
