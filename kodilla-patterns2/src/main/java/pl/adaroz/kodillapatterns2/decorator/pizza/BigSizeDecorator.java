package pl.adaroz.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class BigSizeDecorator extends AbstractPizzaDecorator {

    protected BigSizeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getName() {
        return super.getName() + ", big size";
    }

    @Override
    public List<String> getIngredients() {
        return super.getIngredients();
    }
}
