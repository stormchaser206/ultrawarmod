package net.ultrawarmod.mod.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.ultrawarmod.mod.UltraWarMod;
import cpw.mods.fml.common.IWorldGenerator;

public class UWMWorldGen implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case 0:
			//Generate surface world
			generateSurface(world, random, chunkX*16, chunkZ*16);
			
		case -1:
			//Generate nether
			generateNether(world, random, chunkX*16, chunkZ*16);
			
		case 1:
			//Generate end
			generateEnd(world, random, chunkX*16, chunkZ*16);
		}
	}
	
	private void generateSurface(World world, Random random, int x, int z) 
	{
		//this.addOreSpawn(UltraWarMod.oreWhateverOre, world, random, x=blockXPosition, z=blockZPosition, maxX, maxZ, maxVeinSize, chanceToSpawn, minimumZ, maximumZ);
		this.addOreSpawn(UltraWarMod.oreUraniumOre, world, random, x, z, 16, 16, 1+random.nextInt(3), 12, 10, 29);
		this.addOreSpawn(UltraWarMod.oreCopperOre, world, random, x, z, 16, 16, 2+random.nextInt(5), 30, 30, 55);
		this.addOreSpawn(UltraWarMod.oreTinOre, world, random, x, z, 16, 16, 1+random.nextInt(3), 25, 25, 35);
		this.addOreSpawn(UltraWarMod.oreSapphireOre, world, random, x, z, 16, 16, 1+random.nextInt(3), 20, 17, 27);
		this.addOreSpawn(UltraWarMod.oreLeadOre, world, random, x, z, 16, 16, 1+random.nextInt(3), 27, 13, 26);
		this.addOreSpawn(UltraWarMod.oreBauxiteOre, world, random, x, z, 16, 16, 1+random.nextInt(3), 16, 13, 23);
		this.addOreSpawn(UltraWarMod.oreZincOre, world, random, x, z, 16, 16, 1+random.nextInt(3), 14, 8, 27);
		this.addOreSpawn(UltraWarMod.oreTitaniumOre, world, random, x, z, 16, 16, 1+random.nextInt(3), 12, 14, 31);
		this.addOreSpawn(UltraWarMod.oreGraphiteOre, world, random, x, z, 16, 16, 1+random.nextInt(3), 18, 24, 36);
		
	}
	

	private void generateNether(World world, Random random, int x, int z)
	{
		
	}
	

	private void generateEnd(World world, Random random, int x, int z)
	{
		
	}
	
	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) 
	{
		for(int i=0; i < chanceToSpawn; i++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
	
}
