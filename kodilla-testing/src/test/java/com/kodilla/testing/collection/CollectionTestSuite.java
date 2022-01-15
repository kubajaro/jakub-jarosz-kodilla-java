package com.kodilla.testing.collection;

import com.kodilla.testing.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeAll
    public static void beforeEach(){
        System.out.println("Test case: start");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Test case: end");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test suite: start");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test suite: end");
    }

    @DisplayName("When provided list is empty exterminate method should return empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> testedList = new ArrayList<>();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(testedList);

        //Then
        Assertions.assertEquals(result, testedList);
    }

    @DisplayName("When provided list includes integers tested method removes odd numbers and returns"+
    "new list with even numbers")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> testedList = new ArrayList<>();

       for(int i = 1; i <= 10; i++){
           testedList.add(i);
       }

        Integer numbers [] = new Integer[]{1,2,3,4,5,6,7,8,9,10};
       List<Integer> testedList2 = Arrays.asList(numbers);

        //when
        List<Integer> result = oddNumbersExterminator.exterminate(testedList);
        List<Integer> result2 = oddNumbersExterminator.exterminate(testedList2);

        //then
        Assertions.assertEquals(5, result.size());
        Assertions.assertEquals(5, result2.size());
    }
}