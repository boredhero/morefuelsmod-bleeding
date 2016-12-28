package com.bored.morefuelsmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.bored.morefuelsmod.block.BlockOre;

public class ModBlocks {

	public static BlockBase pelletblock;
	public static BlockBase concentratedpelletblock;
	public static BlockBase cokeblock;
	public static BlockBase bituminouscoalblock;
	public static BlockOre bituminouscoalore;

	public static void init() {
		pelletblock = register(new BlockBase(Material.field_151576_e, "pelletblock"));
		concentratedpelletblock = register(new BlockBase(Material.field_151576_e, "concentratedpelletblock"));
		cokeblock = register(new BlockBase(Material.field_151576_e, "cokeblock"));
		bituminouscoalore = register(new BlockOre("bituminouscoalore"));
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
