package com.mjr.extraplanets.recipes;

import java.util.HashMap;
import java.util.List;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.recipe.CircuitFabricatorRecipes;
import micdoodle8.mods.galacticraft.api.recipe.CompressorRecipes;
import micdoodle8.mods.galacticraft.api.recipe.SpaceStationRecipe;
import micdoodle8.mods.galacticraft.api.world.SpaceStationType;
import micdoodle8.mods.galacticraft.core.GCBlocks;
import micdoodle8.mods.galacticraft.core.GCItems;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems;
import micdoodle8.mods.galacticraft.planets.mars.MarsModule;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import micdoodle8.mods.galacticraft.planets.venus.VenusModule;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.armor.ExtraPlanets_Armor;
import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.blocks.machines.ExtraPlanets_Machines;
import com.mjr.extraplanets.items.ExtraPlanets_Items;
import com.mjr.extraplanets.items.tools.ExtraPlanets_Tools;

public class ExtraPlanets_Recipes {
	public static void init() {
		registerRocketCraftingRecipes();
		registerFurnaceRecipes();
		registerCraftingRecipes();
		registerCompressorRecipes();
		registerCircuitFabricatorRecipes();
		registerSatellitesRecipes();
	}

	private static void registerRocketCraftingRecipes() {
		if (Config.mercury)
			Tier4RocketRecipes.registerRocketCraftingRecipe();
		if (Config.jupiter)
			Tier5RocketRecipes.registerRocketCraftingRecipe();
		if (Config.saturn)
			Tier6RocketRecipes.registerRocketCraftingRecipe();
		if (Config.uranus)
			Tier7RocketRecipes.registerRocketCraftingRecipe();
		if (Config.neptune)
			Tier8RocketRecipes.registerRocketCraftingRecipe();
		if (Config.pluto)
			Tier9RocketRecipes.registerRocketCraftingRecipe();
		if (Config.eris)
			Tier10RocketRecipes.registerRocketCraftingRecipe();
	}

	private static void registerFurnaceRecipes() {
		if (Config.mercury) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 6), new ItemStack(ExtraPlanets_Items.ingotMercury), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 10), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 0.0F);
		}
		if (Config.ceres) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 6), new ItemStack(ExtraPlanets_Items.ingotUranium, 1), 0.0F);
		}
		if (Config.jupiter) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 6), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 7), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 7), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 11), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 0.0F);
		}
		if (Config.saturn) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 6), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 0.0F);
		}
		if (Config.uranus) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 3), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 7), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 0.0F);
		}
		if (Config.neptune) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 6), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 10), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 0.0F);
		}
		if (Config.pluto) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 6), new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 0.0F);
		}
		if (Config.eris) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 6), new ItemStack(ExtraPlanets_Items.tier10Items, 1, 5), 0.0F);
		}
		if (Config.callisto) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.callistoBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.callistoBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.callistoBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.deimos) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.deimosBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.deimosBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.deimosBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.europa) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.europaBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.europaBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.europaBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.ganymede) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ganymedeBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ganymedeBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ganymedeBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.io) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ioBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ioBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.ioBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.phobos) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.phobosBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.phobosBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.phobosBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.triton) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.tritonBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.tritonBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.tritonBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.rhea) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.rheaBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.rheaBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.rheaBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.titan) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.titanBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.titanBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.titanBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.oberon) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.oberonBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.oberonBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.oberonBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.titania) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.titaniaBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.titaniaBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.titaniaBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.iapetus) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.iapetusBlocks, 1, 5), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.iapetusBlocks, 1, 4), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.iapetusBlocks, 1, 3), OreDictionary.getOres("ingotIron").get(0), 0.0F);
		}
		if (Config.kepler22b && Config.keplerSolarSystems) {
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 4), OreDictionary.getOres("ingotCopper").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 3), OreDictionary.getOres("ingotTin").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 2), OreDictionary.getOres("ingotIron").get(0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 12), new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 0, 1), 0.0F);

			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 5), new ItemStack(Blocks.coal_block, 1, 1), 0.0F);

			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 6), new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 7), new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 8), new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 9), new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3), 0.0F);
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 10), new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4), 0.0F);
		}
		if (Config.leadOreGeneration)
			GameRegistry.addSmelting(new ItemStack(ExtraPlanets_Blocks.oreLead, 1, 0), OreDictionary.getOres("ingotLead").get(0), 0.0F);
	}

	private static void registerCraftingRecipes() {
		if (Config.thermalPaddings) {
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 0), new Object[] { "XXX", "XYX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(MarsItems.marsItemBasic, 1, 5) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 1), new Object[] { "XXX", "XYX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 2), new Object[] { "XXX", "XYX", 'X', new ItemStack(AsteroidsItems.basicItem, 1, 7), 'Y', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4) });

			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3ThermalPadding, 1, 0), new Object[] { "XXX", "XYX", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 0), 'Y', new ItemStack(MarsItems.marsItemBasic, 1, 5) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3ThermalPadding, 1, 1), new Object[] { "XYX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 0), 'Y', new ItemStack(MarsItems.marsItemBasic, 1, 5) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3ThermalPadding, 1, 2), new Object[] { "XXX", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 0), 'Y', new ItemStack(MarsItems.marsItemBasic, 1, 5) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3ThermalPadding, 1, 3), new Object[] { "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 0), 'Y', new ItemStack(MarsItems.marsItemBasic, 1, 5) });

			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4ThermalPadding, 1, 0), new Object[] { "XXX", "XYX", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 1), 'Y', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4ThermalPadding, 1, 1), new Object[] { "XYX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 1), 'Y', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4ThermalPadding, 1, 2), new Object[] { "XXX", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 1), 'Y', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4ThermalPadding, 1, 3), new Object[] { "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 1), 'Y', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4) });

			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5ThermalPadding, 1, 0), new Object[] { "XXX", "XYX", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 2), 'Y', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5ThermalPadding, 1, 1), new Object[] { "XYX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 2), 'Y', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5ThermalPadding, 1, 2), new Object[] { "XXX", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 2), 'Y', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5ThermalPadding, 1, 3), new Object[] { "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.thermalCloth, 1, 2), 'Y', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4) });
		}
		if (Config.mercury) {
			// Battery
			if (Config.batteries)
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.mercuryBattery, 1, 0), new Object[] { " T ", "TRT", "TCT", 'T', new ItemStack(ExtraPlanets_Items.compressedMercury, 1, 0), 'R', Items.redstone, 'C', Items.coal });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 2) });

			// Block of Mercury
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0) });

			// Block to Mercury
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.ingotMercury, 9, 0), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 7) });

			if (Config.mercuryItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercuryPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercuryAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercuryHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercurySword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.mercuryShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.mercuryHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.mercuryChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.mercuryLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.mercuryBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0) });
			}

			// // Slab's & Stairs
			// if (Config.slabsAndStairs) {
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.mercuryStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.mercuryStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 2) });
			// }

			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier4, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), 'Y', new ItemStack(AsteroidsItems.basicItem, 1, 0) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3),
					'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X',
					new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 1), 'Z', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4) });

			// Block of Carbon
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 11), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });

			// Block to Carbon
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 9, 5), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 11) });

			if (Config.carbonItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.carbonShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.carbonHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.carbonChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.carbonLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.carbonBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });
			}

			// Slab's & Stairs
			// if (Config.slabsAndStairs) {
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.venusStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.venusBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.venusStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.venusBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.venusDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.veunsDungeonBrick });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.venusDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.veunsDungeonBrick });
			// }
		}
		if (Config.ceres) {
			// Nuclear Bomb
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.nuclearBomb), new Object[] { "GSG", "SUS", "GSG", 'G', Items.gunpowder, 'S', Blocks.sand, 'U', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, OreDictionary.WILDCARD_VALUE) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 2) });

			// Block of Uranium
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });

			// Block to Uranium
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.ingotUranium, 9, 0), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 7) });

			if (Config.uraniumItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.uraniumShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.uraniumHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.uraniumChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.uraniumLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.uraniumBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0) });
			}

			// Slab's & Stairs
			// if (Config.slabsAndStairs) {
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.ceresStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.ceresStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.ceresBlocks, 1, 2) });
			// }
		}
		if (Config.jupiter) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier5, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3),
					'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X',
					new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 11), 'Z', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 4, 9), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 2) });

			// Block of Palladium
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 8), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });

			// Block of Red Gem
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 12), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });

			// Block to Palladium
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 9, 5), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 8) });

			// Block to Red Gem
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 9, 8), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 12) });

			if (Config.palladiumItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.palladiumShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.palladiumHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.palladiumChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.palladiumLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.palladiumBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
			}

			if (Config.redGemItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redGemShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redGemHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redGemChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redGemLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redGemBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8) });
			}

			// Battery
			if (Config.batteries)
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.nickelBattery, 1, 0), new Object[] { " T ", "TRT", "TCT", 'T', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 6), 'R', Items.redstone, 'C', Items.coal });

			// Slab's & Stairs
			// if (Config.slabsAndStairs) {
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.jupiterStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.jupiterStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.jupiterDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.jupiterDungeonBrick });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.jupiterDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.jupiterDungeonBrick });
			// }
		}
		if (Config.saturn) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier6, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3),
					'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X',
					new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 5), 'Z', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 2) });

			// Block of Magnesium
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });

			// Block to Magnesium
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 9, 5), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 7) });

			if (Config.magnesiumItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.magnesiumShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.magnesiumHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.magnesiumChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.magnesiumLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.magnesiumBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
			}

			// Slab's & Stairs
			// if (Config.slabsAndStairs) {
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.saturnStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.saturnStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.saturnDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.saturnDungeonBrick });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.saturnDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.saturnDungeonBrick });
			// }
		}
		if (Config.uranus) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier7, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3),
					'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X',
					new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 2), 'Z', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 4, 5), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 2) });

			// Block of Crystal
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 4), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });

			// Block of White Gem
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 8), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });

			// Block to White Gem
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 9, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 8) });

			// Block to Crystal
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 9, 5), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 4) });

			if (Config.crystalItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.crystalShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.crystalHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.crystalChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.crystalLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.crystalBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5) });
			}

			if (Config.whiteGemItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.whiteGemShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.whiteGemHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.whiteGemChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.whiteGemLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.whiteGemBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7) });
			}

			// Slab's & Stairs
			// if (Config.slabsAndStairs) {
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.uranusStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.uranusStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.uranusDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.uranusDungeonBrick });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.uranusDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.uranusDungeonBrick });
			// }
		}
		if (Config.neptune) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier8, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3),
					'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X',
					new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 14), 'Z', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 2) });

			// Block of Zinc
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });

			// Block of Blue Gem
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 11), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });

			// Block to Blue Gem
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 9, 6), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 11) });

			// Block to Zinc
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 9, 5), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 7) });

			if (Config.blueGemItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueGemShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueGemHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueGemChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueGemLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueGemBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6) });
			}

			if (Config.zincItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.zincShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.zincHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.zincChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.zincLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.zincBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
			}

			// Battery
			if (Config.batteries)
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.zincBattery, 1, 0), new Object[] { " T ", "TRT", "TCT", 'T', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'R', Items.redstone, 'C', Items.coal });

			// Slab's & Stairs
			// if (Config.slabsAndStairs) {
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.neptuneStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.neptuneStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.neptuneDungeonBrickStoneBlockHalfSlab), new Object[] { "MMM", 'M', ExtraPlanets_Blocks.neptuneDungeonBrick });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.neptuneDungeonBrickStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', ExtraPlanets_Blocks.neptuneDungeonBrick });
			// }
		}
		if (Config.pluto) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier9, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3),
					'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X',
					new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 3), 'Z', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 2) });

			// Block of Tungsten
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });

			// Block to Tungsten
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 9, 5), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 7) });

			if (Config.tungstenItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.tungstenShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tungstenHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tungstenChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tungstenLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tungstenBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
			}

			// Slab's & Stairs
			// if (Config.slabsAndStairs) {
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.plutoStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.plutoStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.plutoBlocks, 1, 2) });
			// }
		}
		if (Config.eris) {
			// Rocket
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.noseConeTier10, 1), new Object[] { " Y ", " X ", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier10Items, 1, 3), 'Y', Blocks.redstone_torch });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier10Items, 1, 2), new Object[] { " Y ", "XYX", "X X", 'X', new ItemStack(ExtraPlanets_Items.tier10Items, 1, 3), 'Y', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier10Items, 1, 0), new Object[] { " YV", "XWX", "XZX", 'V', Blocks.stone_button, 'W', new ItemStack(GCItems.canister, 1, 0), 'X',
					new ItemStack(ExtraPlanets_Items.tier10Items, 1, 3), 'Y', Items.flint_and_steel, 'Z', GCItems.oxygenVent });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier10Items, 1, 1), new Object[] { "ZYZ", "ZWZ", "XVX", 'V', GCItems.oxygenVent, 'W', new ItemStack(GCItems.fuelCanister, 1, 1), 'X',
					new ItemStack(ExtraPlanets_Items.tier10Items, 1, 3), 'Y', new ItemStack(Blocks.wool, 1, 9), 'Z', new ItemStack(ExtraPlanets_Items.tier10Items, 1, 4) });

			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 4, 8), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 2) });

			// Block of Dark Iron
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 7), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Items.tier10Items, 1, 5) });

			// Block to Dark Iron
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier10Items, 9, 5), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 7) });

			// Slab's & Stairs
			// if (Config.slabsAndStairs) {
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.erisStoneBlockHalfSlab), new Object[] { "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 2) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_SlabsStairsBlocks.erisStoneStairs), new Object[] { "M  ", "MM ", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.erisBlocks, 1, 2) });
			// }
		}

		if (Config.kepler22b && Config.keplerSolarSystems) {
			// Stone Bricks
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 4, 11), new Object[] { "   ", "SS ", "SS ", 'S', new ItemStack(ExtraPlanets_Blocks.kepler22bBlocks, 1, 1) });

			// Maple Wooden Planks
			GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bMapleLog, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 4, 1), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bMapleLog, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 4, 2), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bMapleLog, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 4, 3), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bMapleLog, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 4, 4), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 4, 5), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bMapleLog2, 1, 1) });

			// Planks to Sticks(4 Sticks per 2 Planks)
			GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 0), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 1), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 2), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 3), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 4), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 5), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 5) });

			// Planks to Pressure Plates (4 Planks per 8 Pressure Plates)
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_pressure_plate, 8, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 0), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 0),
					new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 0), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_pressure_plate, 8, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 1), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 1),
					new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 1), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_pressure_plate, 8, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 2), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 2),
					new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 2), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_pressure_plate, 8, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 3), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 3),
					new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 3), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_pressure_plate, 8, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 4), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 4),
					new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 4), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_pressure_plate, 8, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 5), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 5),
					new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 5), new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 5) });

			// Planks to Buttons (2 Planks per 4 Buttons)
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 0) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button, 4, 0), new Object[] { new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 5) });

			// Planks to Doors (6 Planks per 4 Doors)
			GameRegistry.addRecipe(new ItemStack(Items.oak_door, 4, 0), new Object[] { "DD ", "DD ", "DD ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 0) });
			GameRegistry.addRecipe(new ItemStack(Items.oak_door, 4, 0), new Object[] { "DD ", "DD ", "DD ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 1) });
			GameRegistry.addRecipe(new ItemStack(Items.oak_door, 4, 0), new Object[] { "DD ", "DD ", "DD ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 2) });
			GameRegistry.addRecipe(new ItemStack(Items.oak_door, 4, 0), new Object[] { "DD ", "DD ", "DD ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 3) });
			GameRegistry.addRecipe(new ItemStack(Items.oak_door, 4, 0), new Object[] { "DD ", "DD ", "DD ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 4) });
			GameRegistry.addRecipe(new ItemStack(Items.oak_door, 4, 0), new Object[] { "DD ", "DD ", "DD ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 5) });

			// Planks to Signs (6 Planks per 6 Signs)
			GameRegistry.addRecipe(new ItemStack(Items.sign, 6, 0), new Object[] { "DDD", "DDD", " S ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 0), 'S', new ItemStack(Items.stick) });
			GameRegistry.addRecipe(new ItemStack(Items.sign, 6, 0), new Object[] { "DDD", "DDD", " S ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 1), 'S', new ItemStack(Items.stick) });
			GameRegistry.addRecipe(new ItemStack(Items.sign, 6, 0), new Object[] { "DDD", "DDD", " S ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 2), 'S', new ItemStack(Items.stick) });
			GameRegistry.addRecipe(new ItemStack(Items.sign, 6, 0), new Object[] { "DDD", "DDD", " S ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 3), 'S', new ItemStack(Items.stick) });
			GameRegistry.addRecipe(new ItemStack(Items.sign, 6, 0), new Object[] { "DDD", "DDD", " S ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 4), 'S', new ItemStack(Items.stick) });
			GameRegistry.addRecipe(new ItemStack(Items.sign, 6, 0), new Object[] { "DDD", "DDD", " S ", 'D', new ItemStack(ExtraPlanets_Blocks.kepler22bPlanks, 1, 5), 'S', new ItemStack(Items.stick) });

			if (Config.kepler22bItems) {
				// Tools
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueDiamondPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueDiamondAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueDiamondHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueDiamondSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.blueDiamondShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0), 'S', Items.stick });

				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redDiamondPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redDiamondAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redDiamondHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redDiamondSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.redDiamondShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1), 'S', Items.stick });

				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.purpleDiamondPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.purpleDiamondAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.purpleDiamondHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.purpleDiamondSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.purpleDiamondShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2), 'S', Items.stick });

				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.yellowDiamondPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.yellowDiamondAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.yellowDiamondHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.yellowDiamondSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.yellowDiamondShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3), 'S', Items.stick });

				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.greenDiamondPickaxe), new Object[] { "XXX", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.greenDiamondAxe), new Object[] { "XX ", "XS ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.greenDiamondHoe), new Object[] { "XX ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.greenDiamondSword), new Object[] { " X ", " X ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4), 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Tools.greenDiamondShovel), new Object[] { " X ", " S ", " S ", 'X', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4), 'S', Items.stick });

				// Armour
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueDiamondHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueDiamondChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueDiamondLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.blueDiamondBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0) });

				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redDiamondHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redDiamondChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redDiamondLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.redDiamondBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1) });

				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.purpleDiamondHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.purpleDiamondChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.purpleDiamondLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.purpleDiamondBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2) });

				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.yellowDiamondHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.yellowDiamondChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.yellowDiamondLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.yellowDiamondBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3) });

				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.greenDiamondHelmet), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.greenDiamondChest), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.greenDiamondLegings), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4) });
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.greenDiamondBoots), new Object[] { "   ", "M M", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4) });
			}
		}

		if (Config.customApples) {
			// Diamond Apples
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.diamondApple, 1, 0), new Object[] { "DDD", "DAD", "DDD", 'D', new ItemStack(Items.diamond, 1, 0), 'A', Items.apple });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.diamondApple, 1, 1), new Object[] { "DDD", "DAD", "DDD", 'D', new ItemStack(Blocks.diamond_block, 1, 0), 'A', Items.apple });

			// Iron Apples
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.ironApple, 1, 0), new Object[] { "DDD", "DAD", "DDD", 'D', new ItemStack(Items.iron_ingot, 1, 0), 'A', Items.apple });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.ironApple, 1, 1), new Object[] { "DDD", "DAD", "DDD", 'D', new ItemStack(Blocks.iron_block, 1, 0), 'A', Items.apple });
		}
		// Machines
		if (Config.advancedRefinery)
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.advancedRefinery), new Object[] { "ZYZ", "YZY", "ZYZ", 'Y', GCBlocks.refinery, 'Z', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
		if (Config.ultimateRefinery)
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.ultimateRefinery), new Object[] { "ZYZ", "YZY", "ZYZ", 'Y', ExtraPlanets_Machines.advancedRefinery, 'Z', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
		if (Config.solarPanels)
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.solarPanel, 1, 0), new Object[] { "ZYZ", "YZY", "ZYZ", 'Y', new ItemStack(GCBlocks.solarPanel, 1, 4), 'Z', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4) });
		if (Config.solarPanels)
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.solarPanel, 1, 4), new Object[] { "ZYZ", "YZY", "ZYZ", 'Y', new ItemStack(ExtraPlanets_Machines.solarPanel, 1, 0), 'Z', new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4) });
		if (Config.advancedCompressor) {
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.advancedOxygenCompressor, 1, 0),
					new Object[] { "ZYZ", "YZY", "ZYZ", 'Y', new ItemStack(GCBlocks.oxygenCompressor, 1, 0), 'Z', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.advancedOxygenCompressor, 1, 4),
					new Object[] { "ZYZ", "YZY", "ZYZ", 'Y', new ItemStack(GCBlocks.oxygenCompressor, 1, 4), 'Z', new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
		}
		if (Config.ultimateCompressor) {
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.ultimateOxygenCompressor, 1, 0), new Object[] { "ZYZ", "YZY", "ZYZ", 'Y', new ItemStack(ExtraPlanets_Machines.advancedOxygenCompressor, 1, 0), 'Z',
					new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.ultimateOxygenCompressor, 1, 4), new Object[] { "ZYZ", "YZY", "ZYZ", 'Y', new ItemStack(ExtraPlanets_Machines.advancedOxygenCompressor, 1, 4), 'Z',
					new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5) });
		}

		// Can of Food
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 0), new Object[] { new ItemStack(GCItems.canister, 1, 0), Items.cooked_porkchop, Items.cooked_porkchop });
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 1), new Object[] { new ItemStack(GCItems.canister, 1, 0), new ItemStack(Items.cooked_fish, 1, 0), new ItemStack(Items.cooked_fish, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 2), new Object[] { new ItemStack(GCItems.canister, 1, 0), new ItemStack(Items.cooked_fish, 1, 1), new ItemStack(Items.cooked_fish, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 3), new Object[] { new ItemStack(GCItems.canister, 1, 0), Items.cooked_chicken, Items.cooked_chicken });
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cannedFood, 1, 4), new Object[] { new ItemStack(GCItems.canister, 1, 0), Items.cooked_beef, Items.cooked_beef });

		// Advanced & Ultimate Battery
		if (Config.batteries) {
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.advancedBattery, 1, 0),
					new Object[] { " T ", "TRT", "TCT", 'T', new ItemStack(AsteroidsItems.basicItem, 0, 6), 'R', GCItems.battery, 'C', new ItemStack(MarsBlocks.marsBlock, 1, 8) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.ultimateBattery, 1, 0),
					new Object[] { "WRB", "CPM", "TAZ", 'W', new ItemStack(ExtraPlanets_Blocks.uranusBlocks, 1, 7), 'R', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 11), 'B', new ItemStack(ExtraPlanets_Blocks.neptuneBlocks, 1, 10), 'C',
							new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 11), 'P', new ItemStack(ExtraPlanets_Blocks.jupiterBlocks, 1, 8), 'M', new ItemStack(ExtraPlanets_Blocks.saturnBlocks, 1, 7), 'T',
							new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 'A', new ItemStack(ExtraPlanets_Items.advancedBattery, 1, 0), 'Z', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5) });
		}
		// Cloth
		GameRegistry.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.cloth, 8, 0), new Object[] { new ItemStack(Blocks.wool), new ItemStack(Blocks.wool), new ItemStack(Blocks.wool), new ItemStack(Blocks.wool) });

		// Gravity Controller
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.gravityController, 1, 0), new Object[] { "RTR", "TCT", "RTR", 'T', new ItemStack(GCItems.basicItem, 0, 14), 'R', GCItems.battery, 'C', new ItemStack(GCItems.itemBasicMoon, 1, 0) });

		// Decorative Blocks
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 1), new Object[] { "MMM", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 2), new Object[] { "MMM", "MMM", "MMM", 'M', new ItemStack(Blocks.snow) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 3), new Object[] { "MMM", "MMM", "MMM", 'M', new ItemStack(Blocks.ice) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 5), new Object[] { "BSW", "SBS", "BSW", 'S', new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 2), 'B', new ItemStack(Items.dye, 1, 0), 'W',
				new ItemStack(Items.dye, 1, 15) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 6), new Object[] { "   ", "FF ", "FF ", 'F', new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 7), new Object[] { " FF", " FF", "   ", 'F', new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 6) });
		if (Config.jupiter) {
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 4), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.volcanicRock), 'B', new ItemStack(ExtraPlanets_Items.magma_bucket) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 8), new Object[] { "   ", "CC ", "CC ", 'C', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5) });
		}
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 9), new Object[] { "   ", "FF ", "FF ", 'F', new ItemStack(ExtraPlanets_Blocks.frozenNitrogen) });
		if (Config.mercury) {
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 10), new Object[] { "MMM", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks.volcanicRock) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 11), new Object[] { "   ", "FF ", "FF ", 'F', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5) });
			// GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 15), new Object[] { "MMM", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Blocks) }); TODO Add Block
		}
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 12), new Object[] { "   ", "FF ", "FF ", 'F', new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 11) });
		if (Config.saturn)
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 13), new Object[] { "   ", "FF ", "FF ", 'F', new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5) });
		GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 14), new Object[] { "   ", "FF ", "FF ", 'F', new ItemStack(ExtraPlanets_Blocks.decorativeBlocks, 1, 13) });

		if (Config.pressure || Config.radiation) {
			// Tier 1 - 4 Radiation Layers
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier1RadiationLayer, 1, 0), new Object[] { "LCL", "LCL", "LCL", 'L', OreDictionary.getOres("ingotLead").get(0), 'C', ExtraPlanets_Items.cloth });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier2RadiationLayer, 1, 0), new Object[] { "LCL", "LRL", "LCL", 'L', OreDictionary.getOres("ingotLead").get(0), 'C', ExtraPlanets_Items.cloth, 'R',
					ExtraPlanets_Items.tier1RadiationLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3RadiationLayer, 1, 0), new Object[] { "LCL", "LRL", "LCL", 'L', OreDictionary.getOres("ingotLead").get(0), 'C', ExtraPlanets_Items.cloth, 'R',
					ExtraPlanets_Items.tier2RadiationLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4RadiationLayer, 1, 0), new Object[] { "LCL", "LRL", "LCL", 'L', OreDictionary.getOres("ingotLead").get(0), 'C', ExtraPlanets_Items.cloth, 'R',
					ExtraPlanets_Items.tier3RadiationLayer });

			// Tier 1 - 4 Pressure Layers
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier1PressureLayer, 1, 0), new Object[] { "CCC", "ORO", "CCC", 'O', GCItems.oxygenConcentrator, 'C', ExtraPlanets_Items.cloth });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier2PressureLayer, 1, 0), new Object[] { "CCC", "ORO", "CCC", 'O', GCItems.oxygenConcentrator, 'C', ExtraPlanets_Items.cloth, 'R', ExtraPlanets_Items.tier1PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3PressureLayer, 1, 0), new Object[] { "CCC", "ORO", "CCC", 'O', GCItems.oxygenConcentrator, 'C', ExtraPlanets_Items.cloth, 'R', ExtraPlanets_Items.tier2PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4PressureLayer, 1, 0), new Object[] { "CCC", "ORO", "CCC", 'O', GCItems.oxygenConcentrator, 'C', ExtraPlanets_Items.cloth, 'R', ExtraPlanets_Items.tier3PressureLayer });
			
			// Tier 1 - 4 UnPrepared Space Suits
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier1UnPreparedSpaceSuitHelmet, 1, 0), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(GCItems.basicItem, 1, 5) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier1UnPreparedSpaceSuitChest, 1, 0), new Object[] { "M M", "MMM", "MMM", 'M', new ItemStack(GCItems.basicItem, 1, 5) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier1UnPreparedSpaceSuitLegings, 1, 0), new Object[] { "MMM", "M M", "M M", 'M', new ItemStack(GCItems.basicItem, 1, 5) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier1UnPreparedSpaceSuitBoots, 1, 0), new Object[] { "   ", "MMM", "M M", 'M', new ItemStack(GCItems.basicItem, 1, 5) });

			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier2UnPreparedSpaceSuitHelmet, 1, 0),
					new Object[] { " R ", "MMM", "M M", 'M', new ItemStack(AsteroidsItems.basicItem, 1, 0), 'R', ExtraPlanets_Items.tier1UnPreparedSpaceSuitHelmet });
			GameRegistry
					.addRecipe(new ItemStack(ExtraPlanets_Items.tier2UnPreparedSpaceSuitChest, 1, 0), new Object[] { "MRM", "MMM", "MMM", 'M', new ItemStack(AsteroidsItems.basicItem, 1, 0), 'R', ExtraPlanets_Items.tier1UnPreparedSpaceSuitChest });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier2UnPreparedSpaceSuitLegings, 1, 0), new Object[] { "MMM", "MRM", "M M", 'M', new ItemStack(AsteroidsItems.basicItem, 1, 0), 'R',
					ExtraPlanets_Items.tier1UnPreparedSpaceSuitLegings });
			GameRegistry
					.addRecipe(new ItemStack(ExtraPlanets_Items.tier2UnPreparedSpaceSuitBoots, 1, 0), new Object[] { " R ", "MMM", "M M", 'M', new ItemStack(AsteroidsItems.basicItem, 1, 0), 'R', ExtraPlanets_Items.tier1UnPreparedSpaceSuitBoots });

			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3UnPreparedSpaceSuitHelmet, 1, 0), new Object[] { " R ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'R',
					ExtraPlanets_Items.tier2UnPreparedSpaceSuitHelmet });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3UnPreparedSpaceSuitChest, 1, 0), new Object[] { "MRM", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'R',
					ExtraPlanets_Items.tier2UnPreparedSpaceSuitChest });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3UnPreparedSpaceSuitLegings, 1, 0), new Object[] { "MMM", "MRM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'R',
					ExtraPlanets_Items.tier2UnPreparedSpaceSuitLegings });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier3UnPreparedSpaceSuitBoots, 1, 0), new Object[] { " R ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'R',
					ExtraPlanets_Items.tier2UnPreparedSpaceSuitBoots });

			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4UnPreparedSpaceSuitHelmet, 1, 0), new Object[] { " R ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'R',
					ExtraPlanets_Items.tier3UnPreparedSpaceSuitHelmet });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4UnPreparedSpaceSuitChest, 1, 0), new Object[] { "MRM", "MMM", "MMM", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'R',
					ExtraPlanets_Items.tier3UnPreparedSpaceSuitChest });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4UnPreparedSpaceSuitLegings, 1, 0), new Object[] { "MMM", "MRM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'R',
					ExtraPlanets_Items.tier3UnPreparedSpaceSuitLegings });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.tier4UnPreparedSpaceSuitBoots, 1, 0), new Object[] { " R ", "MMM", "M M", 'M', new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'R',
					ExtraPlanets_Items.tier3UnPreparedSpaceSuitBoots });

			// Tier 1 - 4 Prepared Space Suits
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier1SpaceSuitHelmet, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier1RadiationLayer, 'P', ExtraPlanets_Items.tier1UnPreparedSpaceSuitHelmet, 'C',
					ExtraPlanets_Items.tier1PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier1SpaceSuitChest, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier1RadiationLayer, 'P', ExtraPlanets_Items.tier1UnPreparedSpaceSuitChest, 'C',
					ExtraPlanets_Items.tier1PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier1SpaceSuitLegings, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier1RadiationLayer, 'P', ExtraPlanets_Items.tier1UnPreparedSpaceSuitLegings, 'C',
					ExtraPlanets_Items.tier1PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier1SpaceSuitBoots, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier1RadiationLayer, 'P', ExtraPlanets_Items.tier1UnPreparedSpaceSuitBoots, 'C',
					ExtraPlanets_Items.tier1PressureLayer });

			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier2SpaceSuitHelmet, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier2RadiationLayer, 'P', ExtraPlanets_Items.tier2UnPreparedSpaceSuitHelmet, 'C',
					ExtraPlanets_Items.tier2PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier2SpaceSuitChest, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier2RadiationLayer, 'P', ExtraPlanets_Items.tier2UnPreparedSpaceSuitChest, 'C',
					ExtraPlanets_Items.tier2PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier2SpaceSuitLegings, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier2RadiationLayer, 'P', ExtraPlanets_Items.tier2UnPreparedSpaceSuitLegings, 'C',
					ExtraPlanets_Items.tier2PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier2SpaceSuitBoots, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier2RadiationLayer, 'P', ExtraPlanets_Items.tier2UnPreparedSpaceSuitBoots, 'C',
					ExtraPlanets_Items.tier2PressureLayer });

			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier3SpaceSuitHelmet, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier3RadiationLayer, 'P', ExtraPlanets_Items.tier3UnPreparedSpaceSuitHelmet, 'C',
					ExtraPlanets_Items.tier3PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier3SpaceSuitChest, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier3RadiationLayer, 'P', ExtraPlanets_Items.tier3UnPreparedSpaceSuitChest, 'C',
					ExtraPlanets_Items.tier3PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier3SpaceSuitLegings, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier3RadiationLayer, 'P', ExtraPlanets_Items.tier3UnPreparedSpaceSuitLegings, 'C',
					ExtraPlanets_Items.tier3PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier3SpaceSuitBoots, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier3RadiationLayer, 'P', ExtraPlanets_Items.tier3UnPreparedSpaceSuitBoots, 'C',
					ExtraPlanets_Items.tier3PressureLayer });

			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier4SpaceSuitHelmet, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier4RadiationLayer, 'P', ExtraPlanets_Items.tier4UnPreparedSpaceSuitHelmet, 'C',
					ExtraPlanets_Items.tier4PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier4SpaceSuitChest, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier4RadiationLayer, 'P', ExtraPlanets_Items.tier4UnPreparedSpaceSuitChest, 'C',
					ExtraPlanets_Items.tier4PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier4SpaceSuitLegings, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier4RadiationLayer, 'P', ExtraPlanets_Items.tier4UnPreparedSpaceSuitLegings, 'C',
					ExtraPlanets_Items.tier4PressureLayer });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier4SpaceSuitBoots, 1, 0), new Object[] { "R C", "RPC", "R C", 'R', ExtraPlanets_Items.tier4RadiationLayer, 'P', ExtraPlanets_Items.tier4UnPreparedSpaceSuitBoots, 'C',
					ExtraPlanets_Items.tier4PressureLayer });

			// Tier 1 - 4 Gravity Boots
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier1SpaceSuitGravityBoots, 1, 0), new Object[] { " G ", "GRG", " G ", 'R', ExtraPlanets_Armor.tier1SpaceSuitBoots, 'G', new ItemStack(ExtraPlanets_Items.gravityController, 1) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier2SpaceSuitGravityBoots, 1, 0), new Object[] { " G ", "GRG", " G ", 'R', ExtraPlanets_Armor.tier2SpaceSuitBoots, 'G', new ItemStack(ExtraPlanets_Items.gravityController, 1) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier3SpaceSuitGravityBoots, 1, 0), new Object[] { " G ", "GRG", " G ", 'R', ExtraPlanets_Armor.tier3SpaceSuitBoots, 'G', new ItemStack(ExtraPlanets_Items.gravityController, 1) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Armor.tier4SpaceSuitGravityBoots, 1, 0), new Object[] { " G ", "GRG", " G ", 'R', ExtraPlanets_Armor.tier4SpaceSuitBoots, 'G', new ItemStack(ExtraPlanets_Items.gravityController, 1) });
		}
		if (Config.radiation) {
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.anti_radiation, 1, 0), new Object[] { "PPP", "WGW", "PPP", 'P', ExtraPlanets_Items.potassiumIodide, 'W', ExtraPlanets_Items.clean_water_bucket, 'G', Items.glass_bottle });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.clean_water_bucket, 1, 0), new Object[] { "SSS", "SBS", "SSS", 'S', ExtraPlanets_Items.iodideSalt, 'B', ExtraPlanets_Items.infected_water_bucket });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.infected_water_bucket, 1, 0), new Object[] { "SSS", "SBS", "SSS", 'S', ExtraPlanets_Items.iodideSalt, 'B', ExtraPlanets_Items.radioactive_bucket });
			if (Config.basicSolarEvaporationChamber)
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.basicSolarEvaporationChamber, 1, 0), new Object[] { "SBS", "MMM", "SBS", 'S', GCBlocks.solarPanel, 'M', ExtraPlanets_Items.compressedMercury, 'B',
						new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 7) });
			if (Config.basicCrystallizer)
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.basicCrystallizer, 1, 0), new Object[] { "SBS", "MMM", "SBS", 'S', Blocks.piston, 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4), 'B',
						new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 7) });
			if (Config.basicDecrystallizer)
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.basicDecrystallizer, 1, 0), new Object[] { "SBS", "MCM", "SBS", 'S', ExtraPlanets_Items.iodideSalt, 'M', new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4), 'B',
						new ItemStack(ExtraPlanets_Blocks.mercuryBlocks, 1, 11), 'C', ExtraPlanets_Machines.basicCrystallizer });
			if (Config.basicSmasher)
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.basicSmasher, 1, 0), new Object[] { "MAM", "PPP", "MAM", 'P', Blocks.piston, 'M', ExtraPlanets_Items.compressedMercury, 'A', Blocks.anvil });
			if (Config.basicChemicalInjector)
				GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Machines.basicChemicalInjector, 1, 0), new Object[] { "UUU", "PPP", "UUU", 'P', Blocks.piston, 'U', ExtraPlanets_Items.ingotUranium });
		}
		if (Config.oxygenTanks) {
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.oxygenTankVeryHeavy, 1, ExtraPlanets_Items.oxygenTankVeryHeavy.getMaxDamage()), new Object[] { "ZZZ", "XXX", "YYY", 'X', GCItems.oxTankHeavy, 'Y',
					new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 'Z', new ItemStack(Blocks.wool, 1, 11) });
			GameRegistry.addRecipe(new ItemStack(ExtraPlanets_Items.oxygenTankExtremelyHeavy, 1, ExtraPlanets_Items.oxygenTankExtremelyHeavy.getMaxDamage()), new Object[] { "ZZZ", "XXX", "YYY", 'X', ExtraPlanets_Items.oxygenTankVeryHeavy, 'Y',
					new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 'Z', new ItemStack(Blocks.wool, 1, 4) });
		}
	}

	private static void registerCompressorRecipes() {
		if (Config.mercury) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.compressedMercury, 1, 0), new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), new ItemStack(AsteroidsItems.basicItem, 1, 0), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 4));
		}
		if (Config.jupiter) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 6), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 7), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 7));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier4Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 4));
		}
		if (Config.saturn) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 4));
		}
		if (Config.uranus) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 6), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 4));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier6Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 6));
		}
		if (Config.neptune) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier7Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5));
		}
		if (Config.pluto) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier9Items, 1, 4));
		}
		if (Config.eris) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier10Items, 1, 4), new ItemStack(ExtraPlanets_Items.tier10Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier10Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier10Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier9Items, 1, 3), new ItemStack(ExtraPlanets_Items.tier10Items, 1, 4));
		}

		// Tier 1 - 4 Armour Layers
		if (Config.pressure || Config.radiation) {
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier1ArmorLayer, 1, 0), new ItemStack(GCItems.basicItem, 1, 5), new ItemStack(GCItems.basicItem, 1, 5), new ItemStack(GCItems.basicItem, 1, 5), new ItemStack(
					GCItems.basicItem, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier2ArmorLayer, 1, 0), new ItemStack(AsteroidsItems.basicItem, 1, 0), new ItemStack(AsteroidsItems.basicItem, 1, 0), new ItemStack(AsteroidsItems.basicItem, 1, 0),
					new ItemStack(AsteroidsItems.basicItem, 1, 0));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier3ArmorLayer, 1, 0), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), new ItemStack(
					ExtraPlanets_Items.tier5Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5));
			CompressorRecipes.addShapelessRecipe(new ItemStack(ExtraPlanets_Items.tier4ArmorLayer, 1, 0), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), new ItemStack(
					ExtraPlanets_Items.tier8Items, 1, 5), new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5));
		}
	}

	private static void registerCircuitFabricatorRecipes() {
		List<ItemStack> silicons = OreDictionary.getOres(ConfigManagerCore.otherModsSilicon);
		int siliconCount = silicons.size();
		for (int j = 0; j <= siliconCount; j++) {
			ItemStack silicon;
			if (j == 0)
				silicon = new ItemStack(GCItems.basicItem, 1, 2);
			else
				silicon = silicons.get(j - 1);
			CircuitFabricatorRecipes.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 0), new ItemStack[] { new ItemStack(Items.diamond), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Blocks.redstone_lamp) });
			if (Config.mercury)
				CircuitFabricatorRecipes.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 1),
						new ItemStack[] { new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Items.comparator) });
			CircuitFabricatorRecipes.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 2), new ItemStack[] { new ItemStack(AsteroidsItems.basicItem, 1, 0), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Blocks.redstone_torch) });
			if (Config.jupiter)
				CircuitFabricatorRecipes
						.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 3), new ItemStack[] { new ItemStack(ExtraPlanets_Items.tier5Items, 1, 8), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Items.repeater) });
			if (Config.neptune)
				CircuitFabricatorRecipes
						.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 4), new ItemStack[] { new ItemStack(ExtraPlanets_Items.tier8Items, 1, 6), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Items.repeater) });
			if (Config.uranus)
				CircuitFabricatorRecipes
						.addRecipe(new ItemStack(ExtraPlanets_Items.wafers, 3, 5), new ItemStack[] { new ItemStack(ExtraPlanets_Items.tier7Items, 1, 7), silicon, silicon, new ItemStack(Items.redstone), new ItemStack(Items.repeater) });
		}
	}

	private static void registerSatellitesRecipes() {
		HashMap<Object, Integer> inputMap;
		if (Config.mercurySpaceStation && Config.mercury) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(new ItemStack(ExtraPlanets_Items.ingotMercury, 1, 0), 24);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.mercurySpaceStationID, Config.mercuryID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.venusSpaceStation) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier4Items, 1, 5), 24);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.venusSpaceStationID, VenusModule.planetVenus.getDimensionID(), new SpaceStationRecipe(inputMap)));
		}
		if (Config.ceresSpaceStation && Config.ceres) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(new ItemStack(ExtraPlanets_Items.ingotUranium, 1, 0), 24);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.ceresSpaceStationID, Config.ceresID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.marsSpaceStation && MarsModule.planetMars != null) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.marsSpaceStationID, MarsModule.planetMars.getDimensionID(), new SpaceStationRecipe(inputMap)));
		}
		if (Config.jupiterSpaceStation && Config.jupiter) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier5Items, 1, 5), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.wafers, 1, 3), 3);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.jupiterSpaceStationID, Config.jupiterID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.saturnSpaceStation && Config.saturn) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier6Items, 1, 5), 24);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.saturnSpaceStationID, Config.saturnID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.uranusSpaceStation && Config.uranus) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier7Items, 1, 5), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.wafers, 1, 5), 3);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.uranusSpaceStationID, Config.uranusID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.neptuneSpaceStation && Config.neptune) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier8Items, 1, 5), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.wafers, 1, 4), 3);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.neptuneSpaceStationID, Config.neptuneID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.plutoSpaceStation && Config.pluto) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier9Items, 1, 5), 24);
			inputMap.put(Items.iron_ingot, 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.plutoSpaceStationID, Config.plutoID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.erisSpaceStation && Config.eris) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put("ingotTin", 32);
			inputMap.put("waferAdvanced", 1);
			inputMap.put(Items.iron_ingot, 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier10Items, 1, 5), 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.erisSpaceStationID, Config.erisID, new SpaceStationRecipe(inputMap)));
		}
		if (Config.kepler22bSpaceStation && Config.kepler22b && Config.keplerSolarSystems) {
			inputMap = new HashMap<Object, Integer>();
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier11Items, 1, 0), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier11Items, 1, 1), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier11Items, 1, 2), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier11Items, 1, 3), 24);
			inputMap.put(new ItemStack(ExtraPlanets_Items.tier11Items, 1, 4), 24);
			GalacticraftRegistry.registerSpaceStation(new SpaceStationType(Config.kepler22bSpaceStationID, Config.kepler22bID, new SpaceStationRecipe(inputMap)));
		}
	};
}
