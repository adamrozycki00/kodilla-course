package pl.adaroz.kodillapatterns2.decorator.pizza;

import pl.adaroz.kodillapatterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;
import java.util.List;

public abstract class AbstractPizzaDecorator implements Pizza {

    private final Pizza pizza;

    protected AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getCost() {
        return pizza.getCost();
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public List<String> getIngredients() {
        return pizza.getIngredients();
    }

}
