package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //given
        int[] intArr0 = {};
        int[] intArr = {1, 3, -4, 24};

        //when
        double res0 = ArrayOperations.getAverage(intArr0);
        double res = ArrayOperations.getAverage(intArr);

        //then
        assertEquals(0, res0, 0);
        assertEquals(6, res, .001);
    }

}
