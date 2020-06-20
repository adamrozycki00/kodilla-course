package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {

    @Test
    public void shouldReturnAverageOfGivenNumbers() {
        //given
        int[] intArr = {1, 3, -4, 24};

        //when
        double res = ArrayOperations.getAverage(intArr);

        //then
        assertEquals(6, res, .001);
    }

    @Test
    public void shouldReturnZero() {
        //given
        int[] intArr0 = {};

        //when
        double res0 = ArrayOperations.getAverage(intArr0);

        //then
        assertEquals(0, res0, 0);
    }

}
