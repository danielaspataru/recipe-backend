package dao;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Recipe {

    String description;
    String imagePath;
    Ingredient[] ingredients;
    String name;

    @JsonCreator
    public Recipe(@JsonProperty("description") String description , @JsonProperty("imagePath") String imagePath ,@JsonProperty("ingredients") Ingredient[] ingredients , @JsonProperty("name") String name){
        this.description = description;
        this.imagePath = imagePath;
        this.ingredients = ingredients;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }
}
