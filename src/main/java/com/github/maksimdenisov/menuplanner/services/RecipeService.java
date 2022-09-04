package com.github.maksimdenisov.menuplanner.services;

import com.github.maksimdenisov.menuplanner.dao.RecipeRepository;
import com.github.maksimdenisov.menuplanner.model.recipes.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    final RecipeRepository repository;

    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }

    public List<Recipe> getAll() {
        return repository.getAll();
    }
}
