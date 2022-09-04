package com.github.maksimdenisov.menuplanner.dao;

import com.github.maksimdenisov.menuplanner.model.recipes.Recipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {

    public List<Recipe> getAll() {
        List<Recipe> list = new ArrayList<>();
        list.add(new Recipe("Beef steak"));
        list.add(new Recipe("Banana pancake"));
        return list;
    }
}
