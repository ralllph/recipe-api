package com.recipe.recipeApp.service;


import com.recipe.recipeApp.dtos.RecipeDto;
import com.recipe.recipeApp.entity.Recipe;

public interface RecipeService {
    RecipeDto saveRecipe(RecipeDto recipeDto);
}
