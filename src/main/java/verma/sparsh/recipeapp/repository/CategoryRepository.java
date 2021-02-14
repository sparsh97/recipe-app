package verma.sparsh.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import verma.sparsh.recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
