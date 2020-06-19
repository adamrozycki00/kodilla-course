package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        World world = new World();

        //when
        BigDecimal number = world.getPeopleQuantity();

        //then
        assertEquals(new BigDecimal(5_000_000_000L), number);
    }

}
