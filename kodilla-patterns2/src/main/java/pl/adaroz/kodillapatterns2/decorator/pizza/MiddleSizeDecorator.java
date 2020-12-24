package pl.adaroz.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class MiddleSizeDecorator extends AbstractPizzaDecorator {

    protected MiddleSizeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getName() {
        return super.getName() + ", middle size";
    }

}
