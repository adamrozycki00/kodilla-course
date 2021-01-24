package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTestSuite {

    @Test
    public void testMargheritaGetCost() {
        //given
        Pizza pizza = new LittleMargherita();

        //when & then
        assertEquals(new BigDecimal(20), pizza.getCost());
    }

    @Test
    public void testExtraDecorators() {
        //given
        Pizza pizza = new LittleMargherita();

        //when
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraHamDecorator(pizza);
        String ingredients = String.join(", ", pizza.getIngredients());

        //then
        assertEquals("tomatoes, cheese, cheese, ham", ingredients);
        assertEquals("Pizza + extra cheese + extra ham", pizza.getName());

    }


    @Test
    public void testSizeDecorator() {
        //given
        Pizza pizza = new LittleMargherita();

        //when
        pizza = new BigSizeDecorator(pizza);

        //then
        assertEquals("Pizza, big size", pizza.getName());

    }

@Test
    public void testMiddlePepperoniWithExtraCheeseAndSauce() {
    //given
    Pizza pizza = new LittleMargherita();

    //when
    pizza = new PepperoniDecorator(pizza);
    pizza = new ExtraCheeseDecorator(pizza);
    pizza = new TomatoSauceDecorator(pizza);
    pizza = new MiddleSizeDecorator(pizza);
    String ingredients = String.join(", ", pizza.getIngredients());

    //then
    assertEquals("tomatoes, cheese, pepperoni, cheese", ingredients);
    assertEquals("Pizza Pepperoni + extra cheese + tomato sauce, middle size", pizza.getName());
    assertEquals(new BigDecimal(37), pizza.getCost());
}

}
