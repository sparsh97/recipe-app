package verma.sparsh.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import verma.sparsh.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
