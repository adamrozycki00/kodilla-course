package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public interface Pizza {

    BigDecimal getCost();

    String getName();

    List<String> getIngredients();

}
