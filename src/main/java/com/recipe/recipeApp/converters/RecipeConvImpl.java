package com.recipe.recipeApp.converters;

import com.recipe.recipeApp.dtos.RecipeDto;
import com.recipe.recipeApp.entity.Recipe;
import org.springframework.stereotype.Component;

@Component
public class RecipeConvImpl  implements RecipeConverter{
    @Override
    public RecipeDto recipeEntityToDto(Recipe recipe) {
        RecipeDto recipeDto = new RecipeDto();
        recipeDto.setName(recipe.getName());
        recipeDto.setDescription(recipe.getDescription());
        recipeDto.setImages(recipe.getImages());
        recipeDto.setQualityLevel(recipe.getQualityLevel());
        recipeDto.setDifficultyLevel(recipeDto.getDifficultyLevel());
        recipeDto.setTimeRequired(recipe.getTimeRequired());
        recipeDto.setProcedure(recipe.getProcedure());
        return recipeDto;
    }

    @Override
    public Recipe recipeDtoToEntity(RecipeDto recipeDto) {
        Recipe recipe = new Recipe();
        recipe.setName(recipeDto.getName());
        recipe.setDescription(recipeDto.getDescription());
        recipe.setImages(recipeDto.getImages());
        recipe.setQualityLevel(recipeDto.getQualityLevel());
        recipe.setDifficultyLevel(recipeDto.getDifficultyLevel());
        recipe.setTimeRequired(recipeDto.getTimeRequired());
        recipe.setProcedure(recipeDto.getProcedure());
        return recipe;
    }
}
