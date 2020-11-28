package com.ozbek.spring5recipeapp.services;

import com.ozbek.spring5recipeapp.domain.Recipe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * created by ozbek on 2020-11-28
 */
public class RecipeServiceImpl implements RecipeService {

    private Map<Long, Recipe> map = new HashMap<>();

    @Override
    public Set<Recipe> getRecipes() {
        return new HashSet<>(map.values());
    }

    @Override
    public Recipe findById(Long id) {
        return map.get(id);
    }

    @Override
    public Recipe save(Recipe object) {
        return map.put(object.getId(), object);
    }

    @Override
    public void delete(Recipe object) {
        map.remove(object.getId());
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }
}
