package com.bored.morefuelsmod;

import java.util.Random;

import com.bored.morefuelsmod.block.ModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator{

 private WorldGenerator bituminousCoalOre;
 
 public ModWorldGen(){
  this.bituminousCoalOre = new WorldGenMinable(ModBlocks.bituminousCoalOre.func_176223_P(), 4);
  }
 
 private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
 
        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i ++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.func_180709_b(world, rand, new BlockPos(x, y, z));
        }
    }
 
 @Override
 public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
   IChunkProvider chunkProvider) {
  switch (world.field_73011_w.getDimension()){
  case 0://Over_World
   //this.runGenerator(generator, world, random, chunkX, chunkZ, chancesToSpawn, minHeight, maxHeight);//
   this.runGenerator(this.bituminousCoalOre, world, random, chunkX, chunkZ, 10, 0, 50);
     break;
  case -1://Nether
   
   break;
   
  case 1://End
   
   break;
  }
 }
}
