package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.client.MoreFuelsTab;
import com.bored.morefuelsmod.item.ModItems;
import com.bored.morefuelsmod.proxy.CommonProxy;

import com.bored.morefuelsmod.fuels.Deadbush;
import com.bored.morefuelsmod.fuels.Cactus;
import com.bored.morefuelsmod.fuels.Web;
import com.bored.morefuelsmod.fuels.Lever;
import com.bored.morefuelsmod.fuels.DoublePlant;
import com.bored.morefuelsmod.fuels.RedFlower;
import com.bored.morefuelsmod.fuels.YellowFlower;
import com.bored.morefuelsmod.fuels.ItemFrame;
import com.bored.morefuelsmod.fuels.Bed;
import com.bored.morefuelsmod.fuels.Painting;
import com.bored.morefuelsmod.fuels.Sign;
import com.bored.morefuelsmod.fuels.Ladder;
import com.bored.morefuelsmod.fuels.Rail;
import com.bored.morefuelsmod.fuels.ActivatorRail;
import com.bored.morefuelsmod.fuels.DetectorRail;
import com.bored.morefuelsmod.fuels.PoweredRail;
import com.bored.morefuelsmod.fuels.Piston;
import com.bored.morefuelsmod.fuels.StickyPiston;
import com.bored.morefuelsmod.fuels.Vine;
import com.bored.morefuelsmod.fuels.WaterLily;
import com.bored.morefuelsmod.fuels.TripwireHook;
import com.bored.morefuelsmod.fuels.HayBlock;
import com.bored.morefuelsmod.fuels.Carpet;
import com.bored.morefuelsmod.fuels.Wool;
import com.bored.morefuelsmod.fuels.Arrow;
import com.bored.morefuelsmod.fuels.Feather;
import com.bored.morefuelsmod.fuels.Wheat;
import com.bored.morefuelsmod.fuels.WheatSeeds;
import com.bored.morefuelsmod.fuels.MelonSeeds;
import com.bored.morefuelsmod.fuels.PumpkinSeeds;
import com.bored.morefuelsmod.fuels.BeetSeeds;
import com.bored.morefuelsmod.fuels.Torch;
import com.bored.morefuelsmod.fuels.RedstoneTorch;
import com.bored.morefuelsmod.fuels.Doors;
import com.bored.morefuelsmod.fuels.WoodenButton;
import com.bored.morefuelsmod.fuels.Bowl;
import com.bored.morefuelsmod.fuels.Sugarcane;
import com.bored.morefuelsmod.fuels.Paper;
import com.bored.morefuelsmod.fuels.Book;
import com.bored.morefuelsmod.fuels.WritableBook;
import com.bored.morefuelsmod.fuels.WrittenBook;
import com.bored.morefuelsmod.fuels.MinecartWithChest;
import com.bored.morefuelsmod.fuels.Maps;
import com.bored.morefuelsmod.fuels.FishingRod;
import com.bored.morefuelsmod.fuels.CarrotOnAStick;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.modid, name = Main.name, version = Main.version, acceptedMinecraftVersions = "[1.11, 1.11.2]")
public class Main {

	public static final String modid = "morefuelsmod-bleeding";
	public static final String name = "More Fuels Mod";
	public static final String version = "1.6.UFO";

	@Mod.Instance(modid)
	public static Main instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println(name + " is making smelting better for you!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
		if(enableRFtLrecipe)
			RFtL.init();
		config.addCustomCategoryComment(Configuration.CATEGORY_GENERAL, "TEST");
		boolean enableCustomFuels = config.get(Configuration.CATEGORY_GENERAL, "enableCustomFuels", true).getBoolean(true);
		if(enableCustomFuels)
			GameRegistry.registerFuelHandler(new Fuels());
		boolean enableDeadbush = config.get(Configuration.CATEGORY_GENERAL, "enableDeadbush", true).getBoolean(true);
		if(enableDeadbush)
			GameRegistry.registerFuelHandler(new Deadbush());
		boolean enableCactus = config.get(Configuration.CATEGORY_GENERAL, "enableCactus", true).getBoolean(true);
		if(enableCactus)
			GameRegistry.registerFuelHandler(new Cactus());
		boolean enableWeb = config.get(Configuration.CATEGORY_GENERAL, "enableWeb", true).getBoolean(true);
		if(enableWeb)
			GameRegistry.registerFuelHandler(new Web());
		boolean enableLever = config.get(Configuration.CATEGORY_GENERAL, "enableLever", true).getBoolean(true);
		if(enableLever)
			GameRegistry.registerFuelHandler(new Lever());
		boolean enableDoublePlant = config.get(Configuration.CATEGORY_GENERAL, "enableDoublePlant", true).getBoolean(true);
		if(enableDoublePlant)
			GameRegistry.registerFuelHandler(new DoublePlant());
		boolean enableRedFlower = config.get(Configuration.CATEGORY_GENERAL, "enableRedFlower", true).getBoolean(true);
		if(enableRedFlower)
			GameRegistry.registerFuelHandler(new RedFlower());
		boolean enableYellowFlower = config.get(Configuration.CATEGORY_GENERAL, "enableYellowFlower", true).getBoolean(true);
		if(enableYellowFlower)
			GameRegistry.registerFuelHandler(new YellowFlower());
		boolean enableItemFrame = config.get(Configuration.CATEGORY_GENERAL, "enableItemFrame", true).getBoolean(true);
		if(enableItemFrame)
			GameRegistry.registerFuelHandler(new ItemFrame());
		boolean enableBed = config.get(Configuration.CATEGORY_GENERAL, "enableBed", true).getBoolean(true);
		if(enableBed)
			GameRegistry.registerFuelHandler(new Bed());
		boolean enablePainting = config.get(Configuration.CATEGORY_GENERAL, "enablePainting", true).getBoolean(true);
		if(enablePainting)
			GameRegistry.registerFuelHandler(new Painting());
		boolean enableSign = config.get(Configuration.CATEGORY_GENERAL, "enableSign", true).getBoolean(true);
		if(enableSign)
			GameRegistry.registerFuelHandler(new Sign());
		boolean enableLadder = config.get(Configuration.CATEGORY_GENERAL, "enableLadder", true).getBoolean(true);
		if(enableLadder)
			GameRegistry.registerFuelHandler(new Ladder());
		boolean enableRail = config.get(Configuration.CATEGORY_GENERAL, "enableRail", true).getBoolean(true);
		if(enableRail)
			GameRegistry.registerFuelHandler(new Rail());
		boolean enableActivatorRail = config.get(Configuration.CATEGORY_GENERAL, "enableActivatorRail", true).getBoolean(true);
		if(enableActivatorRail)
			GameRegistry.registerFuelHandler(new ActivatorRail());
		boolean enableDetectorRail = config.get(Configuration.CATEGORY_GENERAL, "enableDetectorRail", true).getBoolean(true);
		if(enableDetectorRail)
			GameRegistry.registerFuelHandler(new DetectorRail());
		boolean enablePoweredRail = config.get(Configuration.CATEGORY_GENERAL, "enablePoweredRail", true).getBoolean(true);
		if(enablePoweredRail)
			GameRegistry.registerFuelHandler(new PoweredRail());
		boolean enablePiston = config.get(Configuration.CATEGORY_GENERAL, "enablePiston", true).getBoolean(true);
		if(enablePiston)
			GameRegistry.registerFuelHandler(new Piston());
		boolean enableStickyPiston = config.get(Configuration.CATEGORY_GENERAL, "enableStickyPiston", true).getBoolean(true);
		if(enableStickyPiston)
			GameRegistry.registerFuelHandler(new StickyPiston());
		boolean enableVine = config.get(Configuration.CATEGORY_GENERAL, "enableStickyPiston", true).getBoolean(true);
		if(enableVine)
			GameRegistry.registerFuelHandler(new Vine());
		boolean enableWaterLily = config.get(Configuration.CATEGORY_GENERAL, "enableWaterLily", true).getBoolean(true);
		if(enableWaterLily)
			GameRegistry.registerFuelHandler(new WaterLily());
		boolean enableTripwireHook = config.get(Configuration.CATEGORY_GENERAL, "enableTripwireHook", true).getBoolean(true);
		if(enableTripwireHook)
			GameRegistry.registerFuelHandler(new TripwireHook());
		boolean enableHayBlock = config.get(Configuration.CATEGORY_GENERAL, "enableHayBlock", true).getBoolean(true);
		if(enableHayBlock)
			GameRegistry.registerFuelHandler(new HayBlock());
		boolean enableCarpet = config.get(Configuration.CATEGORY_GENERAL, "enableCarpet", true).getBoolean(true);
		if(enableCarpet)
			GameRegistry.registerFuelHandler(new Carpet());
		boolean enableWool = config.get(Configuration.CATEGORY_GENERAL, "enableWool", true).getBoolean(true);
		if(enableWool)
			GameRegistry.registerFuelHandler(new Wool());
		boolean enableArrow = config.get(Configuration.CATEGORY_GENERAL, "enableArrow", true).getBoolean(true);
		if(enableArrow)
			GameRegistry.registerFuelHandler(new Arrow());
		boolean enableFeather = config.get(Configuration.CATEGORY_GENERAL, "enableFeather", true).getBoolean(true);
		if(enableFeather)
			GameRegistry.registerFuelHandler(new Feather());
		boolean enableWheat = config.get(Configuration.CATEGORY_GENERAL, "enableWheat", true).getBoolean(true);
		if(enableWheat)
			GameRegistry.registerFuelHandler(new Wheat());
		boolean enableWheatSeeds = config.get(Configuration.CATEGORY_GENERAL, "enableWheatSeeds", true).getBoolean(true);
		if(enableWheatSeeds)
			GameRegistry.registerFuelHandler(new WheatSeeds());
		boolean enableMelonSeeds = config.get(Configuration.CATEGORY_GENERAL, "enableMelonSeeds", true).getBoolean(true);
		if(enableMelonSeeds)
			GameRegistry.registerFuelHandler(new MelonSeeds());
		boolean enablePumpkinSeeds = config.get(Configuration.CATEGORY_GENERAL, "enablePumpkinSeeds", true).getBoolean(true);
		if(enablePumpkinSeeds)
			GameRegistry.registerFuelHandler(new PumpkinSeeds());
		boolean enableBeetSeeds = config.get(Configuration.CATEGORY_GENERAL, "enableBeetSeeds", true).getBoolean(true);
		if(enableBeetSeeds)
			GameRegistry.registerFuelHandler(new BeetSeeds());
		boolean enableTorch = config.get(Configuration.CATEGORY_GENERAL, "enableTorch", true).getBoolean(true);
		if(enableTorch)
			GameRegistry.registerFuelHandler(new Torch());
		boolean enableRedstoneTorch = config.get(Configuration.CATEGORY_GENERAL, "enableRedstoneTorch", true).getBoolean(true);
		if(enableRedstoneTorch)
			GameRegistry.registerFuelHandler(new RedstoneTorch());
		boolean enableDoors = config.get(Configuration.CATEGORY_GENERAL, "enableDoors", true).getBoolean(true);
		if(enableDoors)
			GameRegistry.registerFuelHandler(new Doors());
		boolean enableWoodenButton = config.get(Configuration.CATEGORY_GENERAL, "enableWoodenButton", true).getBoolean(true);
		if(enableWoodenButton)
			GameRegistry.registerFuelHandler(new WoodenButton());
		boolean enableBowl = config.get(Configuration.CATEGORY_GENERAL, "enableBowl", true).getBoolean(true);
		if(enableBowl)
			GameRegistry.registerFuelHandler(new Bowl());
		boolean enableSugarcane = config.get(Configuration.CATEGORY_GENERAL, "enableSugarcane", true).getBoolean(true);
		if(enableSugarcane)
			GameRegistry.registerFuelHandler(new Sugarcane());
		boolean enablePaper = config.get(Configuration.CATEGORY_GENERAL, "enablePaper", true).getBoolean(true);
		if(enablePaper)
			GameRegistry.registerFuelHandler(new Paper());
		boolean enableBook = config.get(Configuration.CATEGORY_GENERAL, "enableBook", true).getBoolean(true);
		if(enableBook)
			GameRegistry.registerFuelHandler(new Book());
		boolean enableWritableBook = config.get(Configuration.CATEGORY_GENERAL, "enableWritableBook", true).getBoolean(true);
		if(enableWritableBook)
			GameRegistry.registerFuelHandler(new WritableBook());
		boolean enableWrittenBook = config.get(Configuration.CATEGORY_GENERAL, "enableWrittenBook", true).getBoolean(true);
		if(enableWrittenBook)
			GameRegistry.registerFuelHandler(new WrittenBook());
		boolean enableMinecartWithChest = config.get(Configuration.CATEGORY_GENERAL, "enableMinecartWithChest", true).getBoolean(true);
		if(enableMinecartWithChest)
			GameRegistry.registerFuelHandler(new MinecartWithChest());
		boolean enableMaps = config.get(Configuration.CATEGORY_GENERAL, "enableMaps", true).getBoolean(true);
		if(enableMaps)
			GameRegistry.registerFuelHandler(new Maps());
		boolean enableFishingRod = config.get(Configuration.CATEGORY_GENERAL, "enableFishingRod", true).getBoolean(true);
		if(enableFishingRod)
			GameRegistry.registerFuelHandler(new FishingRod());
		boolean enableCarrotOnAStick = config.get(Configuration.CATEGORY_GENERAL, "enableCarrotOnAStick", true).getBoolean(true);
		if(enableCarrotOnAStick)
			GameRegistry.registerFuelHandler(new CarrotOnAStick());
		
		config.save();
		ModItems.init();
		ModBlocks.init();
		ModCrafting.init();
		ModSmelting.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
	
	@SidedProxy(clientSide = "com.bored.morefuelsmod.proxy.ClientProxy", serverSide = "com.bored.morefuelsmod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final MoreFuelsTab creativeTab = new MoreFuelsTab();

}