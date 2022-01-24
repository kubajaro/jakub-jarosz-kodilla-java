package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayServices implements ArrayOperations{
    @Override
    public double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> n = numbers[n])
                .forEach(System.out::println);

        OptionalDouble result = IntStream.range(0, numbers.length)
                .map(n -> n = numbers[n])
                .average();

        return result.getAsDouble();
    }
}
