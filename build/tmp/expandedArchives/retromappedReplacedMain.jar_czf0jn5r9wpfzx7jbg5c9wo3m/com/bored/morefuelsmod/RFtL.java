package com.bored.morefuelsmod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RFtL {
	public static void init(){
		GameRegistry.addSmelting(Items.field_151078_bh, new ItemStack(Items.field_151116_aA), 0.3F);
	}

}
