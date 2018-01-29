package view;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import repository.RecipeRepository;
import repository.RecipeRepositoryImpl;
import service.RecipeService;
import service.RecipeServiceImpl;

import javax.sql.DataSource;

@Configuration
@EnableAutoConfiguration
public class AppConfig {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Bean
    public RecipeService recipeService() {
        return new RecipeServiceImpl(recipeRepository());
    }


    @Bean
    public RecipeRepository recipeRepository() {

        return new RecipeRepositoryImpl(jdbcTemplate);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/login").allowedOrigins("http://localhost:4200");
                registry.addMapping("/register").allowedOrigins("http://localhost:4200");
            }
        };
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/recipebook");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");

        return dataSource;
    }




    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }



}
