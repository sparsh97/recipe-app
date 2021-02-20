package verma.sparsh.recipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import verma.sparsh.recipeapp.domain.Category;
import verma.sparsh.recipeapp.domain.UnitOfMeasure;
import verma.sparsh.recipeapp.repository.CategoryRepository;
import verma.sparsh.recipeapp.repository.UnitOfMeasureRepository;
import verma.sparsh.recipeapp.services.RecipeService;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {

    private  CategoryRepository categoryRepository;
    private  UnitOfMeasureRepository unitOfMeasureRepository;
    private final RecipeService recipeService;
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, RecipeService recipeService) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index Page...........");
        System.out.println("Hello Dev Tools");
        Optional<Category> optionalCategory= categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure= unitOfMeasureRepository.findByUom("Teaspoon");

        System.out.println("Category Id: "+ optionalCategory.get().getId());
        System.out.println("UOM Id: "+ optionalUnitOfMeasure.get().getId());
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
