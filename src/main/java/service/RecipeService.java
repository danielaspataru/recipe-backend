package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import dao.Recipe;

import java.util.List;

public interface RecipeService {

    void create(List<Recipe> recipe) throws JsonProcessingException;
    List<Recipe> get();

}
