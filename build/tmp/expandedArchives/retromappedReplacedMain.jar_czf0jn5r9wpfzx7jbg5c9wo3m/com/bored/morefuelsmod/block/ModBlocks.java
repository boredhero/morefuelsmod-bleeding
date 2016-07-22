package com.bored.morefuelsmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static BlockBase pelletBlock;
	public static BlockBase concentratedPelletBlock;
	public static BlockBase cokeBlock;

	public static void init() {
		pelletBlock = register(new BlockBase(Material.field_151575_d, "pelletBlock"));
		concentratedPelletBlock = register(new BlockBase(Material.field_151575_d, "concentratedPelletBlock"));
		cokeBlock = register(new BlockBase(Material.field_151576_e, "cokeBlock"));
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}
