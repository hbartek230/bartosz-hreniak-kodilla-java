package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {
    public void exterminate(ArrayList<Integer> numbers, int count) {
        if(count != 0) {
            for (int i = 0; i < count; i++) {
                numbers.add(new Random().nextInt(101));
            }
        } else {
            System.out.println("Count can`t be negative or equals 0");
        }
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        for(int x : oddNumbers){
            System.out.println("Odd numbers: " + x);
        }
    }
}
