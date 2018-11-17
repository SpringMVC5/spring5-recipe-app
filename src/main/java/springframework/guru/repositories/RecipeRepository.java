package springframework.guru.repositories;

import org.springframework.data.repository.CrudRepository;

import springframework.guru.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
