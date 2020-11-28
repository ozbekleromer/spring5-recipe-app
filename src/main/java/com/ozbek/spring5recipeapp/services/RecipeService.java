package com.ozbek.spring5recipeapp.services;

import com.ozbek.spring5recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by ozbek on 2020-11-28
 */
@Service
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    Recipe save(Recipe object);

    void delete(Recipe object);

    void deleteById(Long id);
}
