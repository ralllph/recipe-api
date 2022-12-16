package com.recipe.recipeApp.service;

import com.recipe.recipeApp.converters.RecipeConverter;
import com.recipe.recipeApp.dtos.RecipeDto;
import com.recipe.recipeApp.entity.Recipe;
import com.recipe.recipeApp.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RecipeServiceImpl  implements  RecipeService{
    private RecipeRepository recipeRepo;
    private RecipeConverter recipeConverter;
    @Override
    public RecipeDto saveRecipe(RecipeDto recipeDto) {
        //convert dto  to entity
        Recipe recipeEntity = recipeConverter.recipeDtoToEntity(recipeDto) ;
        //save entity
        RecipeDto  savedRecipe = recipeConverter.recipeEntityToDto(recipeRepo.save(recipeEntity));

        return savedRecipe;
    }
}
