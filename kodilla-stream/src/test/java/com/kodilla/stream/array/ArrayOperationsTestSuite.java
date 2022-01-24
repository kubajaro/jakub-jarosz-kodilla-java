package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //given
        ArrayOperations arrayServices = new ArrayServices();
        int [] arrayToTest = {1,2,3,4,5,6,7,8,9,10};

        //when
        double result = arrayServices.getAverage(arrayToTest);

        //then
        assertEquals(5.5, result);
    }
}
