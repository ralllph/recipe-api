package com.recipe.recipeApp.controller;

import com.recipe.recipeApp.dtos.RecipeDto;
import com.recipe.recipeApp.service.RecipeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {
    private RecipeService recipeService;

    public ResponseEntity<RecipeDto> saveNewRecipe(@Valid @RequestBody RecipeDto recipeDto){
        return new ResponseEntity<>(recipeService.saveRecipe(recipeDto), HttpStatus.OK);
    }
}
