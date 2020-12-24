package pl.adaroz.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LittleMargherita implements Pizza {

    private List<String> ingredients = new ArrayList<>();

    public LittleMargherita() {
        ingredients.add("tomatoes");
        ingredients.add("cheese");
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(20);
    }

    @Override
    public String getName() {
        return "Pizza";
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

}
