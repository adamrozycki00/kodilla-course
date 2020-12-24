package pl.adaroz.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class ProsciuttoEFunghiDecorator extends AbstractPizzaDecorator {

    protected ProsciuttoEFunghiDecorator(Pizza pizza) {
        super(pizza);
        this.getIngredients().add("ham");
        this.getIngredients().add("mushrooms");
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getName() {
        return super.getName() + " Prosciutto e funghi";
    }

}
