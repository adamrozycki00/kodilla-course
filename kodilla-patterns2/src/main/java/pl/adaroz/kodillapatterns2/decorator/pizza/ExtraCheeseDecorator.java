package pl.adaroz.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class ExtraCheeseDecorator extends AbstractPizzaDecorator {

    protected ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
        pizza.getIngredients().add("cheese");
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getName() {
        return super.getName() + " + extra cheese";
    }

}
