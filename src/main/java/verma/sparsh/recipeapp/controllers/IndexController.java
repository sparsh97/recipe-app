package verma.sparsh.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import verma.sparsh.recipeapp.domain.Category;
import verma.sparsh.recipeapp.domain.UnitOfMeasure;
import verma.sparsh.recipeapp.repository.CategoryRepository;
import verma.sparsh.recipeapp.repository.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private  CategoryRepository categoryRepository;
    private  UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        System.out.println("Hello Dev Tools");
        Optional<Category> optionalCategory= categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure= unitOfMeasureRepository.findByUom("Teaspoon");

        System.out.println("Category Id: "+ optionalCategory.get().getId());
        System.out.println("UOM Id: "+ optionalUnitOfMeasure.get().getId());
        return "index";
    }
}
