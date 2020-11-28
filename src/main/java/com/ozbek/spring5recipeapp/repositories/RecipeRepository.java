package com.ozbek.spring5recipeapp.repositories;

import com.ozbek.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * created by ozbek on 2020-11-28
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
