package repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import dao.Ingredient;
import dao.Recipe;
import org.json.JSONObject;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class RecipeRepositoryImpl implements  RecipeRepository {

    public JdbcTemplate jdbcTemplate;
    ObjectMapper objectMapper;
    public RecipeRepositoryImpl(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = Objects.requireNonNull(jdbcTemplate,
                "The given jdbcTemplate is not allowed to be null.");
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Override
    public void create(Recipe recipe) throws JsonProcessingException {



        String sql = "INSERT INTO recipes (description,imagepath, ingredients, name)"
                + " VALUES (?,?,?,?)";

        jdbcTemplate.update(sql,recipe.getDescription(), recipe.getImagePath() , objectMapper.writeValueAsString(recipe.getIngredients()) , recipe.getName());

    }

    @Override
    public List<Recipe> get() {
        String sql = "SELECT * FROM recipes";

        List<Recipe> recipes = jdbcTemplate.query(sql,
                new RowMapper<Recipe>()
                {

                    public Recipe mapRow(ResultSet rs, int rowNum)
                            throws SQLException
                    {
                        Recipe recipe = null;
                        try {
                            recipe = new Recipe(rs.getString("description"),
                                rs.getString("imagepath"),
                                    objectMapper.readValue(rs.getString("ingredients"), Ingredient[].class),
                                rs.getString("name"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                        return recipe;
                    }

                });

        return recipes;
    }

    @Override
    public void delete() {
        String sql = "DELETE FROM recipes ";
        jdbcTemplate.update(sql);
    }


}
