package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionTestSuite {

    @Before
    public void before() throws Exception {
        System.out.println("Start test case");
    }

    @After
    public void after() throws Exception {
        System.out.println("End test case");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //when
        ArrayList<Integer> resultList = exterminator.exterminate(new ArrayList<>());

        //then
        assertEquals(0, resultList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //when
        ArrayList<Integer> resultList = exterminator.exterminate(
                new ArrayList<>(List.of(9, 1, 6, -8, 0, 6, -45, 1, 0)));

        //then
        assertEquals(new ArrayList<>(List.of(6, -8, 0, 6, 0)), resultList);
    }

}
