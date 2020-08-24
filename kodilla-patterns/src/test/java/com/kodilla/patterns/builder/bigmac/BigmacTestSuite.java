package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigmacTestSuite {

    @Test
    public void shouldCreateBigmac() {
        //given & when
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("plain")
                .burger()
                .burger()
                .sauce("BBQ")
                .ingredient("tomato")
                .ingredient("lettuce")
                .ingredient("olives")
                .ingredient("olives")
                .ingredient("cucumber")
                .ingredient("mushrooms")
                .build();

        //then
        assertEquals(6, bigmac.getIngredients().size());
        assertEquals(2, bigmac.getBurgers());
    }

}
