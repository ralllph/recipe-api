package com.recipe.recipeApp.dtos;

import com.recipe.recipeApp.entity.Steps;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RecipeDto {

    @NotBlank(message = "name can't be blank")
    private String name;


    @NotBlank(message = "please add description")
    private String description;


    @NotBlank(message = "list of images can't be blank")
    private List<String> images;


    @NotBlank(message = "difficulty level cannot be empty")
    @NotNull(message = "difficulty level cannot be null")
    private int difficultyLevel;

    @NotNull(message = "quality level cannot be null")
    @NotBlank(message = "Quality level cannot be empty")
    private int qualityLevel;

    @NotBlank(message = "Time required can not be blank")
    private String timeRequired;

    @NotBlank(message = "procedure can not be blank")
    private List<Steps>  procedure;
}

