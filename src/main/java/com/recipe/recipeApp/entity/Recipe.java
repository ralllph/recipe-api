package com.recipe.recipeApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "recipe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "images")
    private List<String> images;

    @Column(name = "difficulty_level")
    private int difficultyLevel;

    @Column(name = "quality_level")
    private int qualityLevel;

    @Column(name = "time")
    private String timeRequired;


    @JsonIgnore
    @OneToMany(mappedBy = "recipe")
    private List<Steps>  procedure;
}

