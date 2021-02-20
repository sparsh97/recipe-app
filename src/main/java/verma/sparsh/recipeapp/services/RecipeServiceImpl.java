package verma.sparsh.recipeapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import verma.sparsh.recipeapp.domain.Recipe;
import verma.sparsh.recipeapp.repository.RecipeRepository;

import java.util.HashSet;
import java.util.Set;
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("Im in Recipe Service Implementation........");
        Set<Recipe> recipeSet= new HashSet<>();
                recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
