package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class TomatoSauceDecorator extends AbstractPizzaDecorator {

    protected TomatoSauceDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getName() {
        return super.getName() + " + tomato sauce";
    }

}
