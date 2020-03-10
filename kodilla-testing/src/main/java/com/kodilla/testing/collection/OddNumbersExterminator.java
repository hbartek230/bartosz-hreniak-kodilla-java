package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> oddNumbers;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        if (numbers.size() != 0) {
            oddNumbers = new ArrayList<Integer>();
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    oddNumbers.add(numbers.get(i));
                }
            }
        } return oddNumbers;
    }
}
