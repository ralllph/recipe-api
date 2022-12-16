package com.recipe.recipeApp.converters;

import com.recipe.recipeApp.dtos.RecipeDto;
import com.recipe.recipeApp.entity.Recipe;

public interface RecipeConverter {
    RecipeDto recipeEntityToDto(Recipe recipe);
    Recipe recipeDtoToEntity(RecipeDto recipeDto);
}
