package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniDecorator extends AbstractPizzaDecorator {

    protected PepperoniDecorator(Pizza pizza) {
        super(pizza);
        this.getIngredients().add("pepperoni");
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getName() {
        return super.getName() + " Pepperoni";
    }

}
