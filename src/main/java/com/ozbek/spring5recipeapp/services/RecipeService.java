package com.ozbek.spring5recipeapp.services;

import com.ozbek.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * created by ozbek on 2020-11-28
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
