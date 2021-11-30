package day02;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String name;
    private List<String> ingredients = new ArrayList<>();
    private String description;

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngredient(String ingredient, String... ingredients) {
        if (ingredient != null && !ingredient.isBlank())
            this.ingredients.add(ingredient);
        for (String i : ingredients) {
            this.ingredients.add(i);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return List.copyOf(ingredients);
    }

    public String getDescription() {
        return description;
    }
}
