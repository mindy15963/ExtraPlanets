package com.mjr.extraplanets.nei;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.lwjgl.opengl.GL11;

import codechicken.lib.gui.GuiDraw;
import codechicken.nei.NEIServerUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.TemplateRecipeHandler;
import micdoodle8.mods.galacticraft.planets.mars.MarsModule;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class RocketT9RecipeHandler extends TemplateRecipeHandler {
	private static final ResourceLocation rocketGuiTexture = new ResourceLocation(MarsModule.ASSET_PREFIX, "textures/gui/schematic_rocket_T2.png");

	public String getRecipeId() {
		return "extraplanets.rocketT9";
	}

	@Override
	public int recipiesPerPage() {
		return 1;
	}

	public Set<Entry<ArrayList<PositionedStack>, PositionedStack>> getRecipes() {
		return NEIExtraPlanetsConfig.getTier9RocketBenchRecipes();
	}

	@Override
	public void drawBackground(int i) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GuiDraw.changeTexture(RocketT9RecipeHandler.rocketGuiTexture);
		GuiDraw.drawTexturedModalRect(0, -8, 3, 4, 168, 140);
	}

	@Override
	public void drawExtras(int i) {
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
	}

	@Override
	public void loadTransferRects() {
	}

	@Override
	public void loadCraftingRecipes(String outputId, Object... results) {
		if (outputId.equals(this.getRecipeId())) {
			for (final Map.Entry<ArrayList<PositionedStack>, PositionedStack> irecipe : this.getRecipes()) {
				this.arecipes.add(new CachedRocketRecipe(irecipe));
			}
		} else {
			super.loadCraftingRecipes(outputId, results);
		}
	}

	@Override
	public void loadCraftingRecipes(ItemStack result) {
		for (final Map.Entry<ArrayList<PositionedStack>, PositionedStack> irecipe : this.getRecipes()) {
			if (NEIServerUtils.areStacksSameTypeCrafting(irecipe.getValue().item, result)) {
				this.arecipes.add(new CachedRocketRecipe(irecipe));
			}
		}
	}

	@Override
	public void loadUsageRecipes(ItemStack ingredient) {
		for (final Map.Entry<ArrayList<PositionedStack>, PositionedStack> irecipe : this.getRecipes()) {
			for (final PositionedStack pstack : irecipe.getKey()) {
				if (NEIServerUtils.areStacksSameTypeCrafting(ingredient, pstack.item)) {
					this.arecipes.add(new CachedRocketRecipe(irecipe));
					break;
				}
			}
		}
	}

	public class CachedRocketRecipe extends TemplateRecipeHandler.CachedRecipe {
		public ArrayList<PositionedStack> input;
		public PositionedStack output;

		@Override
		public ArrayList<PositionedStack> getIngredients() {
			return this.input;
		}

		@Override
		public PositionedStack getResult() {
			return this.output;
		}

		public CachedRocketRecipe(ArrayList<PositionedStack> pstack1, PositionedStack pstack2) {
			super();
			this.input = pstack1;
			this.output = pstack2;
		}

		public CachedRocketRecipe(Map.Entry<ArrayList<PositionedStack>, PositionedStack> recipe) {
			this(recipe.getKey(), recipe.getValue());
		}
	}

	@Override
	public String getRecipeName() {
		return "NASA Workbench";
	}

	@Override
	public String getGuiTexture() {
		return MarsModule.TEXTURE_PREFIX + "textures/gui/schematic_rocket_T2.png";
	}

	@Override
	public void drawForeground(int recipe) {
	}
}
