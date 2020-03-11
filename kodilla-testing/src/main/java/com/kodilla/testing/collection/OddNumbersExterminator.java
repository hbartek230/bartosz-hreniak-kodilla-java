package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> oddNumbers;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        oddNumbers = new ArrayList<Integer>();
        for (int x : numbers) {
            if (numbers.get(x-1) % 2 == 0) {
                oddNumbers.add(numbers.get(x-1));
            }
        }
        return oddNumbers;
    }
}
