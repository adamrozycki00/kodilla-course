package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraHamDecorator extends AbstractPizzaDecorator {

    protected ExtraHamDecorator(Pizza pizza) {
        super(pizza);
        pizza.getIngredients().add("ham");
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getName() {
        return super.getName() + " + extra ham";
    }

}
