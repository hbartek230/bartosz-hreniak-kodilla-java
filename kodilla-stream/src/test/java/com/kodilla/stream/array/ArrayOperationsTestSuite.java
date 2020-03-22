package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    private int[] numbers = new int[20];

    @Before
    public void prepareNumbersArray(){
        numbers[0] = 4;
        numbers[1] = 5;
        numbers[2] = 4;
        numbers[3] = 3;
        numbers[4] = 3;
        numbers[5] = 3;
        numbers[6] = 4;
        numbers[7] = 4;
        numbers[8] = 5;
        numbers[9] = 5;
        numbers[10] = 2;
        numbers[11] = 1;
        numbers[12] = 3;
        numbers[13] = 3;
        numbers[14] = 4;
        numbers[15] = 5;
        numbers[16] = 5;
        numbers[17] = 4;
        numbers[18] = 5;
        numbers[19] = 3;

    }

    @Test
    public void testGetAverage(){
        // given

        // when
        double tested = ArrayOperations.getAverage(numbers);

        // then
        double expected = 3.75;
        Assert.assertEquals(expected, tested, 0.01);
    }
}
