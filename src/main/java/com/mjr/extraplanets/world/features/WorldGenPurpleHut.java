package com.mjr.extraplanets.world.features;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ChestGenHooks;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.util.MessageUtilities;
import com.mjr.extraplanets.util.WorldGenHelper;

public class WorldGenPurpleHut extends WorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (WorldGenHelper.checkValidSpawn(world, x, y, z, 5) == false)
			return false;
		else {
			if (Config.debugMode)
				MessageUtilities.debugMessageToLog("Spawning Purple Hut at (x, y, z)" + x + " " + y + " " + z);
			generatreStructure(world, rand, x, y, z);
			fillChests(world, rand, x, y, z);
		}
		return true;
	}

	public boolean generatreStructure(World world, Random rand, int x, int y, int z) {
		world.setBlock(x + 0, y + 0, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 0, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 0, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 0, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 0, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 0, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 0, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 0, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 0, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 0, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 0, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 0, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 0, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 0, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 0, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 0, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 0, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 0, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 0, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 0, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 0, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 0, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 0, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 0, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 0, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 0, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 0, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 0, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 0, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 0, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 0, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 0, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 0, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 0, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 0, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 0, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 0, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 0, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 0, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 0, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 0, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 0, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 0, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 0, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 0, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 0, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 0, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 0, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 0, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 0, z + 8, Blocks.fence, 0, 3);
		world.setBlock(x + 3, y + 0, z + 8, Blocks.oak_stairs, 3, 3);
		world.setBlock(x + 4, y + 0, z + 8, Blocks.fence, 0, 3);
		world.setBlock(x + 5, y + 0, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 0, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 0, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 0, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 0, z + 9, Blocks.fence, 0, 3);
		world.setBlock(x + 3, y + 0, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 0, z + 9, Blocks.fence, 0, 3);
		world.setBlock(x + 5, y + 0, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 0, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 1, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 1, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 7, Blocks.fence, 0, 3);
		world.setBlock(x + 3, y + 1, z + 7, Blocks.oak_stairs, 3, 3);
		world.setBlock(x + 4, y + 1, z + 7, Blocks.fence, 0, 3);
		world.setBlock(x + 5, y + 1, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 8, Blocks.fence, 0, 3);
		world.setBlock(x + 3, y + 1, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 8, Blocks.fence, 0, 3);
		world.setBlock(x + 5, y + 1, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 1, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 1, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 1, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 1, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 1, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 1, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 1, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 2, z + 1, Blocks.oak_stairs, 6, 3);
		world.setBlock(x + 3, y + 2, z + 1, Blocks.oak_stairs, 6, 3);
		world.setBlock(x + 4, y + 2, z + 1, Blocks.oak_stairs, 6, 3);
		world.setBlock(x + 5, y + 2, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 2, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 2, Blocks.oak_stairs, 4, 3);
		world.setBlock(x + 2, y + 2, z + 2, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 3, y + 2, z + 2, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 4, y + 2, z + 2, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 5, y + 2, z + 2, Blocks.oak_stairs, 5, 3);
		world.setBlock(x + 6, y + 2, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 3, Blocks.oak_stairs, 4, 3);
		world.setBlock(x + 2, y + 2, z + 3, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 3, y + 2, z + 3, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 4, y + 2, z + 3, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 5, y + 2, z + 3, Blocks.oak_stairs, 5, 3);
		world.setBlock(x + 6, y + 2, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 4, Blocks.oak_stairs, 4, 3);
		world.setBlock(x + 2, y + 2, z + 4, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 3, y + 2, z + 4, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 4, y + 2, z + 4, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 5, y + 2, z + 4, Blocks.oak_stairs, 5, 3);
		world.setBlock(x + 6, y + 2, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 5, Blocks.oak_stairs, 4, 3);
		world.setBlock(x + 2, y + 2, z + 5, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 3, y + 2, z + 5, Blocks.double_wooden_slab, 0, 3);
		world.setBlock(x + 4, y + 2, z + 5, Blocks.wooden_slab, 8, 3);
		world.setBlock(x + 5, y + 2, z + 5, Blocks.oak_stairs, 5, 3);
		world.setBlock(x + 6, y + 2, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 2, z + 6, Blocks.fence, 0, 3);
		world.setBlock(x + 3, y + 2, z + 6, Blocks.oak_stairs, 3, 3);
		world.setBlock(x + 4, y + 2, z + 6, Blocks.fence, 0, 3);
		world.setBlock(x + 5, y + 2, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 2, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 7, Blocks.fence, 0, 3);
		world.setBlock(x + 3, y + 2, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 7, Blocks.fence, 0, 3);
		world.setBlock(x + 5, y + 2, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 2, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 2, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 2, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 2, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 2, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 2, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 2, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 3, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 3, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 3, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 3, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 3, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 3, z + 1, Blocks.fence, 0, 3);
		world.setBlock(x + 3, y + 3, z + 1, Blocks.fence, 0, 3);
		world.setBlock(x + 4, y + 3, z + 1, Blocks.fence, 0, 3);
		world.setBlock(x + 5, y + 3, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 3, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 2, Blocks.fence, 0, 3);
		world.setBlock(x + 2, y + 3, z + 2, Blocks.chest, 3, 3);
		world.setBlock(x + 3, y + 3, z + 2, Blocks.bed, 10, 3);
		world.setBlock(x + 4, y + 3, z + 2, Blocks.chest, 3, 3);
		world.setBlock(x + 5, y + 3, z + 2, Blocks.fence, 0, 3);
		world.setBlock(x + 6, y + 3, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 3, Blocks.fence, 0, 3);
		world.setBlock(x + 2, y + 3, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 3, z + 3, Blocks.bed, 2, 3);
		world.setBlock(x + 4, y + 3, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 3, z + 3, Blocks.fence, 0, 3);
		world.setBlock(x + 6, y + 3, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 4, Blocks.fence, 0, 3);
		world.setBlock(x + 2, y + 3, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 3, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 3, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 3, z + 4, Blocks.fence, 0, 3);
		world.setBlock(x + 6, y + 3, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 5, Blocks.fence, 0, 3);
		world.setBlock(x + 2, y + 3, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 3, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 3, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 3, z + 5, Blocks.fence, 0, 3);
		world.setBlock(x + 6, y + 3, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 3, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 3, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 3, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 3, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 3, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 3, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 3, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 3, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 3, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 3, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 3, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 3, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 3, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 3, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 3, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 3, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 3, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 3, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 3, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 3, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 3, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 3, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 4, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 4, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 4, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 4, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 4, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 4, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 4, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 4, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 4, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 4, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 4, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 4, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 4, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 4, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 4, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 4, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 4, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 4, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 5, z + 0, Blocks.oak_stairs, 2, 3);
		world.setBlock(x + 1, y + 5, z + 0, Blocks.oak_stairs, 2, 3);
		world.setBlock(x + 2, y + 5, z + 0, Blocks.oak_stairs, 2, 3);
		world.setBlock(x + 3, y + 5, z + 0, Blocks.oak_stairs, 2, 3);
		world.setBlock(x + 4, y + 5, z + 0, Blocks.oak_stairs, 2, 3);
		world.setBlock(x + 5, y + 5, z + 0, Blocks.oak_stairs, 2, 3);
		world.setBlock(x + 6, y + 5, z + 0, Blocks.oak_stairs, 1, 3);
		world.setBlock(x + 0, y + 5, z + 1, Blocks.oak_stairs, 0, 3);
		world.setBlock(x + 1, y + 5, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 5, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 5, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 5, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 5, z + 1, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 5, z + 1, Blocks.oak_stairs, 1, 3);
		world.setBlock(x + 0, y + 5, z + 2, Blocks.oak_stairs, 0, 3);
		world.setBlock(x + 1, y + 5, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 5, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 5, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 5, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 5, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 5, z + 2, Blocks.oak_stairs, 1, 3);
		world.setBlock(x + 0, y + 5, z + 3, Blocks.oak_stairs, 0, 3);
		world.setBlock(x + 1, y + 5, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 5, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 5, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 5, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 5, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 5, z + 3, Blocks.oak_stairs, 1, 3);
		world.setBlock(x + 0, y + 5, z + 4, Blocks.oak_stairs, 0, 3);
		world.setBlock(x + 1, y + 5, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 5, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 5, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 5, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 5, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 5, z + 4, Blocks.oak_stairs, 1, 3);
		world.setBlock(x + 0, y + 5, z + 5, Blocks.oak_stairs, 0, 3);
		world.setBlock(x + 1, y + 5, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 5, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 5, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 5, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 5, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 5, z + 5, Blocks.oak_stairs, 1, 3);
		world.setBlock(x + 0, y + 5, z + 6, Blocks.oak_stairs, 0, 3);
		world.setBlock(x + 1, y + 5, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 2, y + 5, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 5, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 5, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 5, z + 6, ExtraPlanets_Blocks.kepler22bMapleLog, 2, 3);
		world.setBlock(x + 6, y + 5, z + 6, Blocks.oak_stairs, 1, 3);
		world.setBlock(x + 0, y + 5, z + 7, Blocks.oak_stairs, 0, 3);
		world.setBlock(x + 1, y + 5, z + 7, Blocks.oak_stairs, 3, 3);
		world.setBlock(x + 2, y + 5, z + 7, Blocks.oak_stairs, 3, 3);
		world.setBlock(x + 3, y + 5, z + 7, Blocks.oak_stairs, 3, 3);
		world.setBlock(x + 4, y + 5, z + 7, Blocks.oak_stairs, 3, 3);
		world.setBlock(x + 5, y + 5, z + 7, Blocks.oak_stairs, 3, 3);
		world.setBlock(x + 6, y + 5, z + 7, Blocks.oak_stairs, 1, 3);
		world.setBlock(x + 0, y + 5, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 5, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 5, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 5, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 5, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 5, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 5, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 5, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 5, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 5, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 5, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 5, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 5, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 5, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 6, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 6, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 6, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 6, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 6, z + 0, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 1, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 2, y + 6, z + 1, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 3, y + 6, z + 1, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 4, y + 6, z + 1, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 5, y + 6, z + 1, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 6, y + 6, z + 1, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 2, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 2, y + 6, z + 2, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 3, y + 6, z + 2, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 4, y + 6, z + 2, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 5, y + 6, z + 2, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 6, y + 6, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 3, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 2, y + 6, z + 3, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 3, y + 6, z + 3, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 4, y + 6, z + 3, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 5, y + 6, z + 3, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 6, y + 6, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 4, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 2, y + 6, z + 4, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 3, y + 6, z + 4, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 4, y + 6, z + 4, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 5, y + 6, z + 4, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 6, y + 6, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 5, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 2, y + 6, z + 5, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 3, y + 6, z + 5, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 4, y + 6, z + 5, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 5, y + 6, z + 5, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 6, y + 6, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 6, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 2, y + 6, z + 6, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 3, y + 6, z + 6, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 4, y + 6, z + 6, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 5, y + 6, z + 6, Blocks.wooden_slab, 0, 3);
		world.setBlock(x + 6, y + 6, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 6, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 6, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 6, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 6, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 6, z + 7, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 6, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 6, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 6, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 6, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 6, z + 8, Blocks.air, 0, 3);
		world.setBlock(x + 0, y + 6, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 1, y + 6, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 2, y + 6, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 6, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 6, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 6, z + 9, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 6, z + 9, Blocks.air, 0, 3);
		return true;

	}

	public boolean fillChests(World world, Random rand, int x, int y, int z) {
		// Determined if loot should be generated using a 1/2 chance
		int random = rand.nextInt(10) + 1;
		if (random < 5) {
			TileEntityChest chest = (TileEntityChest) world.getTileEntity(x + 2, y + 3, z + 2);

			if (chest != null) {
				for (int i = 0; i < chest.getSizeInventory(); i++) {
					chest.setInventorySlotContents(i, null);
				}

				ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

				WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
			}

			chest = (TileEntityChest) world.getTileEntity(x + 4, y + 3, z + 2);

			if (chest != null) {
				for (int i = 0; i < chest.getSizeInventory(); i++) {
					chest.setInventorySlotContents(i, null);
				}

				ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

				WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
			}
		}
		return false;
	}
}