package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b){
        double val = a + b;
        display.displayValue("Adding", val);
        return val;
    }

    public double sub(double a, double b){
        double val = a - b;
        display.displayValue("Subtracting", val);
        return val;
    }

    public double mul(double a, double b){
        double val = a * b;
        display.displayValue("Multiplication", val);
        return val;
    }

    public double div(double a, double b){
        double val = a / b;
        display.displayValue("Division", val);
        return val;
    }
}
