package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import dao.Recipe;
import repository.RecipeRepository;

import java.util.List;

public class RecipeServiceImpl implements RecipeService {

    RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void create(List<Recipe> recipes) throws JsonProcessingException {
        recipeRepository.delete();
        for(Recipe recipe : recipes)
            recipeRepository.create(recipe);
    }

    @Override
    public List<Recipe> get() {
        return recipeRepository.get();
    }

}
