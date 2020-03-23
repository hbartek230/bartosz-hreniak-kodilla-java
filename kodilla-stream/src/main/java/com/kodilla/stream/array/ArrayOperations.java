package com.kodilla.stream.array;

import java.util.stream.IntStream;

public final class ArrayOperations {

    private static int i = 1;

    public static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(n -> System.out.println("Mark " + i++ + " : " + n));

        return IntStream.range(0, numbers.length)
                .map(n-> numbers[n])
                .average().getAsDouble();
    }
}
