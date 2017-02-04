package com.bored.morefuelsmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.bored.morefuelsmod.block.BlockOre;

public class ModBlocks {

	public static BlockBase pelletBlock;
	public static BlockBase concentratedPelletBlock;
	public static BlockBase cokeBlock;
	public static BlockBase bituminousCoalBlock;
	public static BlockOre bituminousCoalOre;
	public static BlockLavaOre lavaOre;
	public static BlockBase creativeInfiniteFuel;

	public static void init() {
		pelletBlock = register(new BlockBase(Material.field_151576_e, "pelletBlock"));
		concentratedPelletBlock = register(new BlockBase(Material.field_151576_e, "concentratedPelletBlock"));
		cokeBlock = register(new BlockBase(Material.field_151576_e, "cokeBlock"));
		bituminousCoalOre = register(new BlockOre("bituminousCoalOre"));
		lavaOre = register(new BlockLavaOre("lavaOre"));
		creativeInfiniteFuel = register (new BlockBase(Material.field_151576_e, "creativeInfiniteFuel"));
		bituminousCoalBlock = register (new BlockBase(Material.field_151576_e, "bituminousCoalBlock"));
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
