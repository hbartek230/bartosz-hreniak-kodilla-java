package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayValue(String operationName, double val){
        System.out.println(operationName + " result is: " + val);
    }
}
