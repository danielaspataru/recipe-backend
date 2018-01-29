package dao;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredient {

    final String name;
    final int amount;

    @JsonCreator
    public Ingredient(@JsonProperty("name") String name , @JsonProperty("amount") int amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
