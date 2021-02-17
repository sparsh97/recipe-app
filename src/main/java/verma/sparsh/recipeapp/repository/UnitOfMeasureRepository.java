package verma.sparsh.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;
import verma.sparsh.recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByUom(String description);
}
