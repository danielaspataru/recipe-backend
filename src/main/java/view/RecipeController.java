package view;

import com.fasterxml.jackson.core.JsonProcessingException;
import dao.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.RecipeService;

import java.util.List;

@CrossOrigin
@RestController
public class RecipeController {


    @Autowired
    RecipeService recipeService;

    @PutMapping("/recipes")
    public ResponseEntity<?> storeRecipes(@RequestBody List<Recipe> recipes) throws JsonProcessingException {
        System.out.println(recipes);
        recipeService.create(recipes);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/recipes")
    public ResponseEntity<List<Recipe>> getRecipe(){


        return new ResponseEntity<>(recipeService.get(),HttpStatus.OK);
    }





}
