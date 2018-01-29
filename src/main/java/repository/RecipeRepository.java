package repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import dao.Recipe;

import java.util.List;

public interface RecipeRepository {

    void create(Recipe recipe) throws JsonProcessingException;
    List<Recipe> get();
    void delete();

}
