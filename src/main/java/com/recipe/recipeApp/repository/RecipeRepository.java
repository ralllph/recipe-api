package com.recipe.recipeApp.repository;

import com.recipe.recipeApp.entity.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository  extends CrudRepository<Recipe, Long> {
}
