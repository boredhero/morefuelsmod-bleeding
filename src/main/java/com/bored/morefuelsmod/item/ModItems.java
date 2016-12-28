package com.bored.morefuelsmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase pelletsfuel;
	public static ItemBase concentratedpelletsfuel;
	public static ItemBase coke;
	public static ItemBase bituminouscoal;
	public static ItemBase canslimoline;
	public static ItemBase dustcoal;
	public static ItemBase bitumen;

	public static void init() {
		pelletsfuel = register(new ItemBase("pelletsfuel"));
		concentratedpelletsfuel = register(new ItemBase("concentratedpelletsfuel"));
		coke = register(new ItemBase("coke"));
		bituminouscoal = register(new ItemBase("bituminouscoal"));
		canslimoline = register(new ItemBase("canslimoline"));
		dustcoal = register(new ItemBase("dustcoal"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}

		return item;
	}

}