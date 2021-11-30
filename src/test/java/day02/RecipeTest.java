package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecipeTest {

    String name = "kakaós kalács";
    String description = "A Finom kakaós kalács elkészítési ideje: 40 perc.";

    @Test
    void createTest() {

        Recipe recipe = new Recipe(name);
        assertEquals(name, recipe.getName());

        recipe = new Recipe(name, description);
        assertEquals(description, recipe.getDescription());

    }

    @Test
    void addIngredient() {

        Recipe recipe = new Recipe(name, description);

        recipe.addIngredient(
                "60 dkg finomliszt",
                "3 db tojássárgája",
                "4 dl tej",
                "6 dkg cukor",
                "2 ek napraforgó olaj",
                "5 dkg élesztő");
        assertEquals(6, recipe.getIngredients().size());

        recipe.addIngredient("1 csipet só");
        assertEquals(7, recipe.getIngredients().size());

    }
}