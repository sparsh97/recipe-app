package verma.sparsh.recipeapp.services;

import verma.sparsh.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
