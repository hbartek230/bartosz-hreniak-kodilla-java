package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("\nAnother test: ");

        Calculator calculator = new Calculator();

        System.out.println("This is first calculator method: " + calculator.add(2, 4));
        System.out.println("This is second calculator method: " + calculator.substract(3, 1));
    }
}
