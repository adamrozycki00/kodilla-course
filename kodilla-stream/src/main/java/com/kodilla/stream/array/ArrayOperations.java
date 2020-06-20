package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .forEach(System.out::println);
        OptionalDouble result = Arrays.stream(numbers)
                .average();
        return result.isPresent() ? result.getAsDouble() : 0;
    }

}
